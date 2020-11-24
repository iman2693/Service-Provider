import java.util.*;


public class Company  {
    private static final long serialVersionUID = 1;
    static ArrayList<Client> _clients_list= new ArrayList();
    static ArrayList<Force> _forces_list= new ArrayList();
    static ArrayList<Craft> _crafts_list = new ArrayList();
    static ArrayList <Take> _takes_list = new ArrayList();
    private String _name;
    private String _Manager;
    private String _Phone;
    private String _Address;
    public static void SortForces(){
        long temp;
        for(int i=0 ; i< _forces_list.size()-1;i++){
            for(int j = i+1 ; j < _forces_list.size() ;  j++){
                  if(Company._forces_list.get(i).GetPoint() < Company._forces_list.get(j).GetPoint()){
                      temp = Company._forces_list.get(i).GetPoint();
                      Company._forces_list.get(i).SetPoint(Company._forces_list.get(j).GetPoint());
                      Company._forces_list.get(j).SetPoint(temp);
                  }    
            }
        }
    } 
    public static long forcef(String name,long from ,long to){
        long inc=0;
        for(int i=0;i<_takes_list.size();i++)
            if(_takes_list.get(i).GetTime() >= from & _takes_list.get(i).GetTime()<=to ){	
                                    if(_takes_list.get(i).GetForce().GetName().equals(name)){
				inc+=_takes_list.get(i).GetCraft().GetCost();}
            }
        return inc;
    }
    public static long clientr(String name,long from,long to){
        long x=0;
        for(int i=0;i<_takes_list.size();i++)
                            if(_takes_list.get(i).GetTime()>=from & _takes_list.get(i).GetTime()<=to)
                                    if(_takes_list.get(i).GetClient().GetName().equals(name))
                                    	x+= (_takes_list.get(i).GetCraft().GetIncome());
        return x;

    }
public static long craftu(String name,long from,long to){
        int x=0;
        long y=1;
        for(int i=0;i<_takes_list.size();i++)
            if(_takes_list.get(i).GetTime()>=from & _takes_list.get(i).GetTime()<=to)
                                if(_takes_list.get(i).GetCraft().GetName().equals(name)){
                                            x++;
                                            y=(_takes_list.get(i).GetCraft().GetIncome() )-( _takes_list.get(i).GetCraft().GetCost() );
                                }
        return (long)x*y;
    }

    public static long companyin(long from,long to){
        long x=0;
        for(int i=0;i<_takes_list.size();i++)
            if(_takes_list.get(i).GetTime()>=from & _takes_list.get(i).GetTime()<=to )
                x=x+(  (_takes_list.get(i).GetCraft().GetIncome()) - (_takes_list.get(i).GetCraft().GetCost()) );
        return x;
    }
    public static Client FindClient(String name){
        for(int i =0 ; i<Company._clients_list.size();i++){
            if(Company._clients_list.get(i).GetName().equals(name))
                return Company._clients_list.get(i);
        }
        return null;
    }
    public void AddClients(Client c) {
        _clients_list.add(c);
    }
    public void RemoveClients(int x){
        _clients_list.remove(x);
    }
    public static void AddForces (Force f){
        _forces_list.add(_forces_list.size(), f);
        _forces_list.get(_forces_list.size()-1).SetPoint(0);
        for(int i= 0 ; i<_forces_list.size()-1 ; i++){
            _forces_list.get(i).SetPoint(_forces_list.get(i).GetPoint() +1);
        }
    }
    public  void RemoveForces(String n){
        _forces_list.remove(this.findforce(n));
    }
    public static Craft FindCraft(String n){
        for(int i= 0 ; i< Company._crafts_list.size() ;i++)
            if(Company._crafts_list.get(i).GetName().equals(n))
                return Company._crafts_list.get(i);
        return null;
    }
    public void AddCraft(Craft x){ _crafts_list.add(x); }
    public void RemoveCraft(int x){ _crafts_list.remove(x); }

    /**
     *
     * @param x
     */
    public  void AddTake(Take x){ _takes_list.add(x); }
    public void RemoveTake(int x){ _takes_list.remove(x); }
    public static void Print(){
        System.out.println("the Clients are : ");
        for(int i=0;i<_clients_list.size();i++){
		System.out.println(_clients_list.get(i).GetName() +"\t " + _clients_list.get(i).GetSubNumber());
		}
		
        System.out.println("Forces : ");
        for(int i=0;i<_forces_list.size();i++){
            System.out.print(_forces_list.get(i).GetName() +"\t" + _forces_list.get(i).GetPoint()+"does :  ");
			for(int j=0;j<_forces_list.get(i)._crafts.size();j++)
				System.out.print("\t "+_forces_list.get(i)._crafts.get(j));
			System.out.println("");
		}	
        System.out.println("Takes : ");
        for(int i=0;i<_takes_list.size();i++)
            System.out.println(_takes_list.get(i).GetClient().GetName() + " With " + _takes_list.get(i).GetForce().GetName());
        System.out.println("the Crafts are : ");
        for(int i=0;i<_crafts_list.size();i++){
		System.out.println(_crafts_list.get(i).GetName()+"\t  with point"+_crafts_list.get(i).GetPoint());
		}

        System.out.println(companyin(970406,970406));
    }
   /* public void print(){
        System.out.println("Forces : ");
        for(int i=0;i<_forces_list.size();i++){
            System.out.print(_forces_list.get(i).GetName()+" does ");
            for(int j=0;j<_forces_list.get(i)._crafts.size();j++)
                System.out.print(_forces_list.get(i)._crafts.get(j).GetName());
        }
    }*/
	/*public void print(){
		System.out.println(companyin(970405,970413));
		System.out.println(craftu("fixing",970406,970413));
		System.out.println(clientr("Arman",970406,970413));
		System.out.println(forcef("Dehghan",970406,970413));
		
		
	} */
    public static int findforce(String name){
        int a = -1;
    for(int i=0;i<_forces_list.size();i++)
        if(_forces_list.get(i).GetName().equals(name))
            a=i;
        return a;
    }
    public static Force findforcecraft(Craft cr){
    for(int i=0;i<Company._forces_list.size();i++){
            for(int j=0;j<Company._forces_list.get(i)._crafts.size() ;j++){
                if( Company._forces_list.get(i)._crafts.get(j).GetName().equals(cr.GetName())){
                    return Company._forces_list.get(i);
                }
            }
        }
        System.out.println("This Craft not found...");
        return null;
    }
 /*   public long _findclient(long id){
        long a=-1;
    for(int i=0;i<_clients_list.size();i++)
        if(_clients_list.get(i).GetSubNumber()==id)
            a=i-1;
    return a;
    } */
 
    static Client findSub(int Sub){ // Enter a SubNumber of Clients List and Print the Name of the Client
        return  Company._clients_list.get(Sub-1);
    }
    // constructor
    Company(String n,String m,String ph,String a){
        _Address=a;
        _Manager=m;
        _name=n;
        _Phone=ph;
    }
    
}


//every forces can have top 6 crafts



import java.util.*;
public final class Force {
    private String _name;
    private String _phone;
    private long _point;
    public ArrayList <Craft> _crafts = new ArrayList();
    public void SetName(String name){
        this._name = name;
    }
    public void SetPhone(String phone){
        this._phone = phone;
    }
    public void SetPoint(long point){
        this._point = point;
    }
   
    public String GetName(){
        return this._name;
    }
    public String GetPhone(){
        return this._phone;
    }
    public long GetPoint(){
        return this._point;
    }


    public void AddCraft(Craft c){
        _crafts.add(c);
    }
    public void RemoveCraft(String s){
        if(FindCraft(s) == -1)
            System.out.println(_name +" Doesn't do" +  s);
        else{
        _crafts.remove(FindCraft(s));
        }
    }
    public  int FindCraft(String c){
         for (int i =0 ; i< _crafts.size() ; i++){
             if(_crafts.get(i).GetName()== c){
                 return i;
             }
         }
         return -1;
    }
    
    Force(String name,Craft c ,String phone ){
        _crafts.add(c);
        SetName(name);
        SetPhone(phone);
        SetPoint(0);
    }
     Force(String name,Craft c ,Craft d,String phone ){
        _crafts.add(c);
        _crafts.add(d);
        SetName(name);
        SetPhone(phone);
        SetPoint(0);
    }
      Force(String name,Craft c,Craft d ,Craft e,String phone){
        _crafts.add(c);
        _crafts.add(d);
        _crafts.add(e);
        SetName(name);
        SetPhone(phone);
        SetPoint(0);
    }
       Force(String name,Craft c,Craft d,Craft e,Craft f ,String phone ){
        _crafts.add(c);
        _crafts.add(d);
        _crafts.add(e);
        _crafts.add(f);
        SetName(name);
        SetPhone(phone);
        SetPoint(0);
    }
        Force(String name,Craft c,Craft d,Craft e,Craft f,Craft g,String phone){
        _crafts.add(c);
        _crafts.add(d);
        _crafts.add(e);
        _crafts.add(f);            
        _crafts.add(g);
        SetName(name);
        SetPhone(phone);
        SetPoint(0);
    }
         Force(String name,Craft c,Craft d,Craft e,Craft f,Craft g,Craft h,String phone  ){
        _crafts.add(c);
        _crafts.add(d);
        _crafts.add(e);
        _crafts.add(f);            
        _crafts.add(g);
        _crafts.add(h);
        SetName(name);
        SetPhone(phone);
        SetPoint(0);
    }
}
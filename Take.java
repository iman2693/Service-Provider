public class Take {
    private Client _client;
    private Craft _craft;
    private Force _force;
    private long _Time;
    public void SetClient(Client c){
        this._client=c;
    }
    public void SetCraft(Craft cr){
        this._craft=cr;
    }
    public void SetForces(Force f){
        this._force=f;
    }
    public void SetTime(long T){
        this._Time=T;
    }
    public long GetTime(){
        return this._Time;
    }
    public Client GetClient(){
        return this._client;
    }
    public Craft GetCraft(){
        return this._craft;
    }
    public Force GetForce(){
        return this._force;
    }
   /* static void takes(Client c , Craft cr , long T){
        Take(c , cr , T);
    } */
    //Constructors
    Take(Client c , Craft cr ,long T){
        SetClient(c);
        SetCraft(cr);
        Company.SortForces();
        if(Company.findforcecraft(cr)!= null){
           SetForces(Company.findforcecraft(cr));
             long temp =this._force.GetPoint();
            this._force.SetPoint(temp+this._craft.GetPoint());
        }
        SetTime(T);
    }
    //try catch

}

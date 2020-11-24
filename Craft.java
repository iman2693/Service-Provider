
public class Craft {
    private long _cost;
    private long _income;
    private long _point;
    private String _name;

    public void SetCost(long cost){
        this._cost=cost;
    }
     public void SetPoint(long point){
        this._point=point;
    }
    public void SetIncome(long income){
        this._income=income;
    }
    public void SetName(String name){
        this._name=name;
    }

    public long GetCost(){
        return this._cost;
    }
    public long GetPoint(){
        return this._point;
    }
    public long GetIncome(){
        return this._income;
    }
    public String GetName(){
        return this._name;
    }
    Craft(String name ,long point ,long cost , long income ){
        SetCost(cost);
        SetIncome(income);
        SetName(name);
        SetPoint(point);
    }
}

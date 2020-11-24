
public class Client {
    private String _name;
    private String _phone;
    private int _subnumber;
    private static int size=0;
    private String _address;
    public void SetName(String name){
        this._name = name;
    }
    public void SetPhone(String phone){
        this._phone = phone;
    }
    public void SetSubNumber(int subnumber){
        this._subnumber = subnumber;
    }
    public void SetAddress(String address){
        this._address = address;
    }
    public String GetName(){
        return this._name;
    }
    public String GetPhone(){
        return this._phone;
    }
    public int GetSubNumber(){
       return this._subnumber;
    }
    public String GetAddress(){
        return this._address;
    }
    
    Client(String name , String phone , String address){
        SetName(name);
        SetPhone(phone);
        SetSubNumber(++size);
        SetAddress(address);
    }
}

public class Instructor {
    private String name;
    private String surname;
    private String code;

    public Instructor(String name,String surname, String code){
        this.name=name;
        this.surname=surname;
        this.code=code;

    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurName(String surname){
        this.surname=surname;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code=code;
    }
    
}

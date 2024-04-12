class Father{
    String Phone;
    Son son[];
    int count;
    public void CallSon(int i){
        System.out.println("给"+son[i].phone+"打电话");
    }
    Father(String phone,int count,String phones[]){
        Phone=phone;
        this.count=count;
        son [] = new Son[count];
        for(int i=0;i<count;i++){
            son[i]=new Son(phones[i]);
        }
    }
    class Son{
        String phone;
        public Son(String phone){
            this.phone=phone;
        }
        void CallFather(){
            System.out.println(phone+"给"+Phone+"打电话");
        }
    }
}
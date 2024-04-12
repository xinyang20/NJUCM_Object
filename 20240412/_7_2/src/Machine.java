public class Machine {
    public void checkBag(Goods goods)throws DangerException{
        if(goods.isDanger()){
            DangerException danger=new DangerException();
            throw danger;//代码1
        }else{
            System.out.println(goods.getName()+"不是危险品！");
        }
    }
}

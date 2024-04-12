public class CheckBin {
    public void check(String bin)throws BinException{
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)!='0'&&bin.charAt(i)!='1'){
                BinException binException=new BinException(bin);
                throw binException;
            }
        }
    }
}
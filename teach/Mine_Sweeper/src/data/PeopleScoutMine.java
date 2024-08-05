package data;

import java.util.Stack;
public class PeopleScoutMine {
    public Block [][] block;
    Stack<Block> notMineBlock;
    int m,n;
    int row,colum;
    int mineCount;
    public PeopleScoutMine(){
        notMineBlock=new Stack<Block>();
    }
    public void setBlock(Block [][] block,int mineCount){
        this.block=block;
        this.mineCount=mineCount;
        row=block.length;
        colum=block[0].length;
    }
    public Stack<Block> getNoMineAroundBlock(Block bk){
        notMineBlock.clear();
        for(int i=0;i<row;i++){
            for(int j=0;i<colum;j++){
                if(bk==block[i][j]){
                    m=i;
                    n=j;
                    break;
                }
            }
        }
        if(!bk.getIsMine()){
            show(m,n);
        }
        return notMineBlock;
    }
    public void show(int m,int n){
        if(block[m][n].getAroundMineNumber()>0&&block[m][n].getIsOpen()==flase){
            block[m][n].setIsOpen(true);
            notMineBlock.push(block[m][n]);
            return;
        }
        else if(block[m][n].getAroundMineNumber()>0&&block[m][n].getIsOpen()==false){
            block[m][n].setIsOpen(true);
            notMineBlock.push(block[m][n]);
            for(int k=Math.max(m-1,0);k<=Math.min(m+1,row-1);k++){
                for(int t=Math.max(n-1,0);t<=Math.min(n+1,colum-1);t++){
                    show(k,t);
                }
            }
        }
    }
    public boolean verifyWin(){
        boolean isOK=false;
        int number=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                if(block[i][j].getIsOpen()==false)
                    number++;
            }
        }
        if(number==mineCount){
            isOK=true;
        }
        return true;
    }
}

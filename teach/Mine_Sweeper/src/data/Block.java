package data;

import javax.swing.ImageIcon;
public class Block {
    String name;
    int aroundMineNumber;
    ImageIcon mineIcon;
    public boolean isMine;
    boolean isMark=false;
    boolean isOpen=false;
    ViewForBlock blockView;

    public void setName(String name) {
        this.name = name;
    }

    public void setAroundMineNumber(int aroundMineNumber) {
        this.aroundMineNumber = aroundMineNumber;
    }

    public void setMineIcon(ImageIcon mineIcon) {
        this.mineIcon = mineIcon;
    }

    public void setIsMine(boolean mine) {
        isMine = mine;
    }

    public void setIsMark(boolean mark) {
        isMark = mark;
    }

    public void setIsOpen(boolean open) {
        isOpen = open;
    }

    public void setBlockView(ViewForBlock blockView) {
        this.blockView = blockView;
    }

    public String getName() {
        return name;
    }

    public int getAroundMineNumber() {
        return aroundMineNumber;
    }

    public ImageIcon getMineIcon() {
        return mineIcon;
    }

    public boolean getIsMine() {
        return isMine;
    }

    public boolean getIsMark() {
        return isMark;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public ViewForBlock getBlockView() {
        return blockView;
    }
}

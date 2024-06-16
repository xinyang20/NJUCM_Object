package data;

public interface ViewForBlock {
    public void acceptBlock(Block block);
    public void setDataOnView();
    public void seeBlockNameOrIcon();
    public void seeBlockCover();
    public Object getBlockCover();
}

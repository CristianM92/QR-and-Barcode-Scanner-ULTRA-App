package qrcodescanner.masterteam.com.masterandroid.helpers.itemtouch;


public interface ItemTouchHelperAdapter {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);
}

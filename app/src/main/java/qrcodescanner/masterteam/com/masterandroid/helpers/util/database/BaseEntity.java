package qrcodescanner.masterteam.com.masterandroid.helpers.util.database;

import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

import qrcodescanner.masterteam.com.masterandroid.helpers.constant.ColumnNames;

public abstract class BaseEntity implements Parcelable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ColumnNames.ID)
    @NonNull
    public long mId;

    public long getId() {
        return mId;
    }
}

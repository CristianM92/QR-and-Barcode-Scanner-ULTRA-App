package qrcodescanner.masterteam.com.masterandroid.helpers.util.database;


import java.util.List;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;
import io.reactivex.Completable;

public interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insert(T... entity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insert(T entity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insertBulk(List<T> entity);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    int update(T... entity);

    @Delete
    void delete(T... entity);

    @Delete
    int delete(T entity);
}

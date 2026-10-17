package org.connecttag.core.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

@Dao
public interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public suspend fun insert(data: T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public suspend fun insert(data: List<T>)

    @Update
    public suspend fun update(data: T)

    @Delete
    public suspend fun delete(data: T)
}

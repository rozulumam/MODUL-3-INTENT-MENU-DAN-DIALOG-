package com.example.myhome.data.dao




import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myhome.data.entity.User
@Dao

interface UserDao {

    // Mengambil semua data
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    // Mengambil data berdasarkan ID
    @Query("SELECT * FROM user WHERE id IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)

}
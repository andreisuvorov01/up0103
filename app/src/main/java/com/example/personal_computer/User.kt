package com.example.personal_computer

import android.os.Parcelable
import android.os.Parcel
import android.provider.ContactsContract.CommonDataKinds.Identity

class User() : Parcelable {
    private var Identity: Int = 0

    constructor(parcel: Parcel) : this() {
        Identity = parcel.readInt().toInt()
    }
    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }
        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
    constructor(_Identity: Int,) : this() {
        Identity = _Identity
    }
    fun setId(_Identity: Int){
        Identity = _Identity
    }
    fun getName(): Int {
        return Identity
    }

    override fun describeContents(): Int {
        return 0
    }
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeInt(Identity)
    }

}
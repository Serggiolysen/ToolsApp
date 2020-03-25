package com.lysenko.toolsapp.remote.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class MachineToolApi(

    @SerializedName("id") val id : Int,
    @SerializedName("model") val model : String,
    @SerializedName("productid") val productid : Int,
    @SerializedName("type") val type : String,
    @SerializedName("typeru") val typeru : String,
    @SerializedName("typeurl") val typeurl : String,
    @SerializedName("modelurl") val modelurl : String,
    @SerializedName("manufacturer") val manufacturer : String,
    @SerializedName("country") val country : String,
    @SerializedName("countryru") val countryru : String,
    @SerializedName("cncsystem") val cncsystem : String,
    @SerializedName("cncsystemfull") val cncsystemfull : String,
    @SerializedName("year1") val year1 : Int,
    @SerializedName("machinecondition") val machinecondition : String,
    @SerializedName("machineconditionru") val machineconditionru : String,
    @SerializedName("machinelocation") val machinelocation : String,
    @SerializedName("machinelocationru") val machinelocationru : String,
    @SerializedName("axiscount") val axiscount : String,
    @SerializedName("x") val x : Int,
    @SerializedName("y") val y : Int,
    @SerializedName("z") val z : Int,
    @SerializedName("tablerectangleload") val tablerectangleload : Int,
    @SerializedName("tableroundsize") val tableroundsize : Int,
    @SerializedName("tableroundload") val tableroundload : Int,
    @SerializedName("spindlenose") val spindlenose : String,
    @SerializedName("spindlespeed") val spindlespeed : Int,
    @SerializedName("spindlepower") val spindlepower : Int,
    @SerializedName("toolcount") val toolcount : Int,
    @SerializedName("toolmaxdiameter") val toolmaxdiameter : Int,
    @SerializedName("toolmaxweight") val toolmaxweight : Int,
    @SerializedName("toolmaxlength") val toolmaxlength : Int,
    @SerializedName("toolchangingtooltotool") val toolchangingtooltotool : Int,
    @SerializedName("toolchangingchiptochip") val toolchangingchiptochip : Int,
    @SerializedName("positioningaccuracy") val positioningaccuracy : String,
    @SerializedName("spindleruntime") val spindleruntime : Int,
    @SerializedName("machineruntime") val machineruntime : Int,
    @SerializedName("price") val price : Int,
    @SerializedName("photoVmcList") val photoVmcList : List<String>,
    @SerializedName("video1") val video1 : String,
    @SerializedName("video2") val video2 : String,
    @SerializedName("info1en") val info1en : String,
    @SerializedName("info2ru") val info2ru : String,
    @SerializedName("sold") val sold : String,
    @SerializedName("photo") val photo : String,
    @SerializedName("xtable") val xtable : Int,
    @SerializedName("ytable") val ytable : Int,
    @SerializedName("year") val year : Int
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.createStringArrayList()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(model)
        parcel.writeInt(productid)
        parcel.writeString(type)
        parcel.writeString(typeru)
        parcel.writeString(typeurl)
        parcel.writeString(modelurl)
        parcel.writeString(manufacturer)
        parcel.writeString(country)
        parcel.writeString(countryru)
        parcel.writeString(cncsystem)
        parcel.writeString(cncsystemfull)
        parcel.writeInt(year1)
        parcel.writeString(machinecondition)
        parcel.writeString(machineconditionru)
        parcel.writeString(machinelocation)
        parcel.writeString(machinelocationru)
        parcel.writeString(axiscount)
        parcel.writeInt(x)
        parcel.writeInt(y)
        parcel.writeInt(z)
        parcel.writeInt(tablerectangleload)
        parcel.writeInt(tableroundsize)
        parcel.writeInt(tableroundload)
        parcel.writeString(spindlenose)
        parcel.writeInt(spindlespeed)
        parcel.writeInt(spindlepower)
        parcel.writeInt(toolcount)
        parcel.writeInt(toolmaxdiameter)
        parcel.writeInt(toolmaxweight)
        parcel.writeInt(toolmaxlength)
        parcel.writeInt(toolchangingtooltotool)
        parcel.writeInt(toolchangingchiptochip)
        parcel.writeString(positioningaccuracy)
        parcel.writeInt(spindleruntime)
        parcel.writeInt(machineruntime)
        parcel.writeInt(price)
        parcel.writeStringList(photoVmcList)
        parcel.writeString(video1)
        parcel.writeString(video2)
        parcel.writeString(info1en)
        parcel.writeString(info2ru)
        parcel.writeString(sold)
        parcel.writeString(photo)
        parcel.writeInt(xtable)
        parcel.writeInt(ytable)
        parcel.writeInt(year)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MachineToolApi> {
        override fun createFromParcel(parcel: Parcel): MachineToolApi {
            return MachineToolApi(parcel)
        }

        override fun newArray(size: Int): Array<MachineToolApi?> {
            return arrayOfNulls(size)
        }
    }
}
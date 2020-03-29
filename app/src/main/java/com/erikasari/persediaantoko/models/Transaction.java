package com.erikasari.persediaantoko.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Transaction implements Parcelable {
    public enum Type {
        EMPTY,
        KOSONG,
        TERSEDIA
    }

    private String description;
    private int amount;
    private String stock;
    private Type type;

    public Transaction() {
    }

    public Transaction(String description, int amount, String stok, Type type) {
        this.description = description;
        this.amount = amount;
        this.stock = stok;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.description);
        dest.writeInt(this.amount);
        dest.writeString(this.stock);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
    }

    protected Transaction(Parcel in) {
        this.description = in.readString();
        this.amount = in.readInt();
        this.stock = in.readString();
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : Type.values()[tmpType];
    }

    public static final Creator<Transaction> CREATOR = new Creator<Transaction>() {
        @Override
        public Transaction createFromParcel(Parcel source) {
            return new Transaction(source);
        }

        @Override
        public Transaction[] newArray(int size) {
            return new Transaction[size];
        }
    };
}

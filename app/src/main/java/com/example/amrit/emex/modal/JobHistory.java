package com.example.amrit.emex.modal;

/**
 * Created by amrit on 14/4/17.
 */

import android.os.Parcel;
import android.os.Parcelable;

/**
 *  details modal class
 */
public class JobHistory implements Parcelable {


    public static final Creator<JobHistory> CREATOR = new Creator<JobHistory>() {
        @Override
        public JobHistory createFromParcel(final Parcel in) {
            return new JobHistory(in);
        }

        @Override
        public JobHistory[] newArray(final int size) {
            return new JobHistory[size];
        }
    };

    private String name;
    private String pickuploc;
    private String date;
    private String km;
    private String duration;
    private String fare;
    private String destination;

    /**
     * @param name      driver name
     * @param pickuploc pick up address
     * @param date      date
     * @param km        distance
     */
    public JobHistory(final String name, final String pickuploc, final String date, final String km) {
        this.name = name;
        this.pickuploc = pickuploc;
        this.date = date;
        this.km = km;
    }

    /**
     * @param km          distance
     * @param destination destination address
     * @param fare        price
     * @param duration    ride time
     * @param name      driver name
     * @param pickuploc pick up address
     * @param date      date
     */
    public JobHistory(final String name, final String pickuploc, final String date, final String km,
                      final String destination, final String fare, final String duration) {
        this.name = name;
        this.pickuploc = pickuploc;
        this.date = date;
        this.km = km;
        this.destination = destination;
        this.fare = fare;
        this.duration = duration;
    }


    /**
     * @param in asd
     */
    protected JobHistory(final Parcel in) {
        name = in.readString();
        pickuploc = in.readString();
        date = in.readString();
        km = in.readString();
        destination = in.readString();
        duration = in.readString();
        fare = in.readString();
    }

    /**
     * @return getting ride time
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration setting ride time
     */
    public void setDuration(final String duration) {
        this.duration = duration;
    }


    /**
     * @return getting ammount
     */
    public String getFare() {
        return fare;
    }

    /**
     * @param fare setting ride fare
     */
    public void setFare(final String fare) {
        this.fare = fare;
    }


    /**
     * @return getting destination address
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination setting destination loc
     */
    public void setDestination(final String destination) {
        this.destination = destination;
    }

    /**
     * @return getting driver name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name setting name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return getting pick up address
     */
    public String getPickuploc() {
        return pickuploc;
    }

    /**
     * @param pickuploc setting address
     */
    public void setPickuploc(final String pickuploc) {
        this.pickuploc = pickuploc;
    }

    /**
     * @return getting date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date setting date
     */
    public void setDate(final String date) {
        this.date = date;
    }

    /**
     * @return getting distance
     */
    public String getKm() {
        return km;
    }

    /**
     * @param km setting distance
     */
    public void setKm(final String km) {
        this.km = km;
    }

    /**
     * @return creater constructor
     */
    public static Creator<JobHistory> getCREATOR() {
        return CREATOR;
    }

    /**
     * @param dest  asd
     * @param flags asd
     */
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(name);
        dest.writeString(pickuploc);
        dest.writeString(date);
        dest.writeString(km);
        dest.writeString(destination);
        dest.writeString(fare);
        dest.writeString(duration);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}



package cn.com.gps169.db.model;

import java.util.Date;

public class Trip {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_trip.trip_id
     *
     * @mbggenerated
     */
    private Integer tripId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_trip.vehicle_id
     *
     * @mbggenerated
     */
    private Integer vehicleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_trip.recDay
     *
     * @mbggenerated
     */
    private Integer recday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_trip.created
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_trip.gps
     *
     * @mbggenerated
     */
    private String gps;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_trip.trip_id
     *
     * @return the value of gps_trip.trip_id
     *
     * @mbggenerated
     */
    public Integer getTripId() {
        return tripId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_trip.trip_id
     *
     * @param tripId the value for gps_trip.trip_id
     *
     * @mbggenerated
     */
    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_trip.vehicle_id
     *
     * @return the value of gps_trip.vehicle_id
     *
     * @mbggenerated
     */
    public Integer getVehicleId() {
        return vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_trip.vehicle_id
     *
     * @param vehicleId the value for gps_trip.vehicle_id
     *
     * @mbggenerated
     */
    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_trip.recDay
     *
     * @return the value of gps_trip.recDay
     *
     * @mbggenerated
     */
    public Integer getRecday() {
        return recday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_trip.recDay
     *
     * @param recday the value for gps_trip.recDay
     *
     * @mbggenerated
     */
    public void setRecday(Integer recday) {
        this.recday = recday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_trip.created
     *
     * @return the value of gps_trip.created
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_trip.created
     *
     * @param created the value for gps_trip.created
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_trip.gps
     *
     * @return the value of gps_trip.gps
     *
     * @mbggenerated
     */
    public String getGps() {
        return gps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_trip.gps
     *
     * @param gps the value for gps_trip.gps
     *
     * @mbggenerated
     */
    public void setGps(String gps) {
        this.gps = gps == null ? null : gps.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_trip
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Trip other = (Trip) that;
        return (this.getTripId() == null ? other.getTripId() == null : this.getTripId().equals(other.getTripId()))
            && (this.getVehicleId() == null ? other.getVehicleId() == null : this.getVehicleId().equals(other.getVehicleId()))
            && (this.getRecday() == null ? other.getRecday() == null : this.getRecday().equals(other.getRecday()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getGps() == null ? other.getGps() == null : this.getGps().equals(other.getGps()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_trip
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTripId() == null) ? 0 : getTripId().hashCode());
        result = prime * result + ((getVehicleId() == null) ? 0 : getVehicleId().hashCode());
        result = prime * result + ((getRecday() == null) ? 0 : getRecday().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getGps() == null) ? 0 : getGps().hashCode());
        return result;
    }
}
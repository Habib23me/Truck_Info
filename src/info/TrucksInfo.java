/*
 * Copyright (c) 2019. Written By Fitsum Ayalew.
 * Class for manipulating csv files as Databases.
 * Connects to a Folder as a Database and  csv files in the Folder as Tables.
 */

package info;
import helper.GPSPosition;

public class TrucksInfo {
    private int id;
    private String driverName;
    private String licensePlate;
    private double weightLimit;
    private int currentDeliveryId;
    private int companyId;
    private String phone;
    private GPSPosition currentPosition;


}
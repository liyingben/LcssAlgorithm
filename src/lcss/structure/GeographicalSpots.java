/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lcss.structure;

/**
 *
 * @author bob
 */
public class GeographicalSpots {
    
    private final Double latitude ;
    private final Double longitude ;
    
    
    public GeographicalSpots(){
        this.latitude = new Double("0.0");
        this.longitude = new Double("0.0");
    }
    
    public GeographicalSpots(double latitude, double longitude ){
        
        this.latitude = new Double(latitude);
        this.longitude = new Double(longitude);
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!(obj instanceof GeographicalSpots))
            return false;

        GeographicalSpots geoSpots = (GeographicalSpots) obj;
        return this.latitude.equals(geoSpots.latitude) && 
                this.longitude.equals(geoSpots.longitude);
     }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.latitude) ^ (Double.doubleToLongBits(this.latitude) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.longitude) ^ (Double.doubleToLongBits(this.longitude) >>> 32));
        return hash;
    }
    
    @Override
    public String toString(){
        return "GeographicalSpots --> latitude: " + this.latitude + " and longitude: " + this.longitude;
    }

    /**
     *
     * @return the Double Latitude of Geographical Spot
     */
    public Double getLatitude(){
        return this.latitude;
    }
    
    
    /**
     * 
     * @return the Double Longitude of Geographical Spot
     */
    public Double getLongitude(){
        return this.longitude;
    }
    
}

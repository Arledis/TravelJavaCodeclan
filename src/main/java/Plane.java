public class Plane {
    private PlaneType planetype;

    public Plane(PlaneType plane) {
        this.planetype = plane;
    }

    public PlaneType getPlane() {
        return planetype;
    }

   public int getCapacityFromEnum(){
        return this.planetype.getCapacity();
   }

   public int getTotalWeightFromEnum(){
        return this.planetype.getTotalWeight();
   }
}

public enum PlaneType {

    AIRBUSA380800 (525, 277000),
    BOEING7478 (700, 140000),
    BOEING747400 (416, 412769),
    BOEING777300 (550, 244490),
    AIRBUSA340500(372, 368000),
    AIRBUSA340300(267, 260000);


    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }


}

public enum Airport {

    ALICANTE("ALI"),
    ALMERIA("LEI"),
    AMSTERDAM("AMS"),
    ATHENS("ATH"),
    BARCELONA("BCN"),
    BASEL("BSL"),
    BEIJING("PEK"),
    BELFAST("BSF"),
    BERLIN( "TXL"),
    BILBAO("BIO"),
    BIRMINGHAM("BHX"),
    BODRUM("BJV"),
    BOSTON("BOS"),
    BRISTOL("BRS"),
    BRUSSELS("BRU"),
    BUDAPES("BUD"),
    CHICAGO("ORD"),
    CORFU("CFU"),
    BUBAI("DXB"),
    DUBLIN("DUB"),
    LONDON("LGW"),
    MADRID("MAD"),
    MAJORCA("PMI"),
    MALAGA("AGP"),
    MANCHESTER("MAN"),
    MENORCA("MAH"),
    MILAN("MXP"),
    MUNICH("MUC"),
    PARIS("CDG"),
    PRAGUE("PRG"),
    TENERIFE("TFS"),
    TORONTO("YYZ"),
    VENICE("VCE"),
    VERONA("VRN"),
    VIENNA("VIE"),
    WASHINGTON("IAD"),
    ZURICH("ZRH");

    private final String airportCity;

    Airport(String airportCity){
        this.airportCity = airportCity;
    }

    public String getAirportCity(){
        return airportCity;
    }

}

package be.vdab.atbean.woord;

public class WoordService {
    public boolean isPalindroom(String woord){
        var woordOrigin = new StringBuilder(woord);
        var woordReversed = woordOrigin.reverse().toString();
        return woord.equalsIgnoreCase(woordReversed);
    }
}

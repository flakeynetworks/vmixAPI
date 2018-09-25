package uk.co.flakeynetworks.vmix.status;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict=false)
public class Transition implements Comparable<Transition> {

    @Attribute
    private int number;

    @Attribute
    private String effect;

    @Attribute
    private int duration;


    public boolean equals(Transition compareTo) {

        return number == compareTo.number;
    } // end of equals


    public void update(Transition newTransition) {

        if(newTransition == null) return;
        if(!equals(newTransition)) return;

        effect = newTransition.effect;
        duration = newTransition.duration;
    } // end of update


    @Override
    public int compareTo(Transition o) {

        return number - o.number;
    } // end of compareTo


    public int getNumber() {

        return number;
    } // end of getNumber
} // end of Transition

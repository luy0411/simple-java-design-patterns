package com.simple.patterns.structural.adapter;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LegacyDateImpl implements LegacyDateAdapter {

    @Override
    public LocalDate getDate() {
        final GregorianCalendar gregorianCalendar = (GregorianCalendar) new OldProjectClass().getDate();
        final Date input = gregorianCalendar.getTime();
        gregorianCalendar.setTime(input);
        final ZonedDateTime zonedDateTime = gregorianCalendar.toZonedDateTime();
        return zonedDateTime.toLocalDate();
    }

}

class OldProjectClass {

    public Calendar getDate(){
        return Calendar.getInstance();
    }

}

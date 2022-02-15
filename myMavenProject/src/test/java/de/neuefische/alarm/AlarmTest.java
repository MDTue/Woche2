package de.neuefische.alarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlarmTest {

    @Test
    void testThatNumberOfPeopleIsNotYetReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(15, Alarmlevel.YELLOW));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(30, Alarmlevel.YELLOW));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_yellow() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(31, Alarmlevel.YELLOW));
    }

    @Test
    void testThatNumberOfPeopleIsNotYetReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(45, Alarmlevel.GREEN));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(60, Alarmlevel.GREEN));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_green() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(61, Alarmlevel.GREEN));
    }

    @Test
    void testThatNoOneIsAllowedWhenAlarmLevelIsRed() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(1, Alarmlevel.RED));
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(0, Alarmlevel.RED));
    }



}
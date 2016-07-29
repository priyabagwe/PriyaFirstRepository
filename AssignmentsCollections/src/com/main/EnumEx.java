package com.main;

public class EnumEx {
    Month month;

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
            }
    
public EnumEx(Month month) {
    this.month = month;
}
public void MonthNames() {
    switch (month) {
        case JANUARY:
            System.out.println("January");
            break;
        case FEBRUARY:
            System.out.println("February");
            break;
        case MARCH:
            System.out.println("March");
            break;
        case APRIL:
            System.out.println("April");
            break;
        case MAY:
            System.out.println("May");
            break;
        case JUNE:
            System.out.println("June");
            break;
        case JULY:
            System.out.println("July");
            break;
        case AUGUST:
            System.out.println("August");
            break;
        case SEPTEMBER:
            System.out.println("September");
            break;
        case OCTOBER:
            System.out.println("October");
            break;
        case NOVEMBER:
            System.out.println("November");
            break;
        case DECEMBER:
            System.out.println("December");
            break;
                         
          
    }
}


public static void main(String[] args) {
	EnumEx firstMonth = new EnumEx(Month.JANUARY);
    firstMonth.MonthNames();
	EnumEx secondMonth = new EnumEx(Month.FEBRUARY);
    secondMonth.MonthNames();
    EnumEx ThirdMonth = new EnumEx(Month.MARCH);
    ThirdMonth.MonthNames();
    EnumEx FourthMonth = new EnumEx(Month.APRIL);
    FourthMonth.MonthNames();
    EnumEx fifthMonth = new EnumEx(Month.MAY);
    fifthMonth.MonthNames();
    EnumEx SixthMonth = new EnumEx(Month.JUNE);
    SixthMonth.MonthNames();
    EnumEx SeventhMonth = new EnumEx(Month.JULY);
    SeventhMonth.MonthNames();
    EnumEx EightMonth = new EnumEx(Month.AUGUST);
    EightMonth.MonthNames();
    EnumEx NinthMonth = new EnumEx(Month.SEPTEMBER);
    NinthMonth.MonthNames();
    EnumEx TenthMonth = new EnumEx(Month.OCTOBER);
    TenthMonth.MonthNames();
    EnumEx EleventhMonth = new EnumEx(Month.NOVEMBER);
    EleventhMonth.MonthNames();
    EnumEx LastMonth = new EnumEx(Month.DECEMBER);
    LastMonth.MonthNames();
  
}}
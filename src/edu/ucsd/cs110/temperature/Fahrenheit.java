package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }
    public String toString()
    {
        // TODO: Complete this method
        return "" + value + " F";
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(value);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((value - 32) * 5 / 9);
    }
}
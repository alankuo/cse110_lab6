package edu.ucsd.cs110.temperature;

/**
 * Created by AK on 15/02/2017.
 */
public class Celsius extends Temperature{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float v = this.getValue();
        Celsius t2 = new Celsius(v);
        return t2;
    }

    @Override
    public Temperature toFahrenheit() {
        float v = this.getValue();
        float v2 = v * 9/5 + 32;
        Celsius t2 = new Celsius(v2);
        return t2;
    }


    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}

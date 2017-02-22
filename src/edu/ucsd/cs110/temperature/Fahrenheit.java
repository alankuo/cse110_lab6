package edu.ucsd.cs110.temperature;

/**
 * Created by AK on 15/02/2017.
 */
public class Fahrenheit extends Temperature{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float v = this.getValue();
        float v2 = (v-32)*5/9;
        Fahrenheit t2 = new Fahrenheit(v2);
        return t2;
    }

    @Override
    public Temperature toFahrenheit() {
        float v = this.getValue();
        Fahrenheit t2 = new Fahrenheit(v);
        return t2;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }

}

class CurrentConditionsDisplay : Listener, DisplayElement {
    var weatherData: Subject
    var temperature: Float = -1000F
    var humidity: Float = -1000F

    constructor(weatherData: Subject) {
        this.weatherData = weatherData
        weatherData.registerListener(this)
    }

    override fun display() {
        println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity.")
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }
}

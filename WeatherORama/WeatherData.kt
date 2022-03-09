class WeatherData:Subject {
    private val listeners=ArrayList<Listener>()
    private var temperature:Float=-1000F
    private var humidity:Float=-1000F
    private var pressure:Float=-1000F
    private var changed:Boolean=false

    override fun registerListener(l: Listener) {
        listeners.add(l)
    }

    override fun removeListener(l: Listener) {
        listeners.remove(l)
    }

    override fun notifyListeners() {
        for (listener in listeners){
            listener.update(temperature,humidity,pressure)
        }
        changed=false
    }

    override fun setChanged() {
        changed=true
    }

    fun measurementsChanged(){
        setChanged()
        notifyListeners()
    }

    fun setMeasurements(temperature:Float,humidity:Float,pressure:Float){
        this.temperature=temperature
        this.humidity=humidity
        this.pressure=pressure
        measurementsChanged()
    }

    fun getTemperature():Float{
        return temperature
    }
    fun getHumidity():Float{
        return humidity
    }
    fun getPressure():Float{
        return pressure
    }
}
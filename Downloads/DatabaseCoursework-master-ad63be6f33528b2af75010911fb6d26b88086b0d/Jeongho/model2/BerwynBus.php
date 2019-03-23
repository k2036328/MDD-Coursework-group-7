<?php
class BerwynBus implements JsonSerializable {
    private $vehicleRegistrationNo;
    private $manufacturer;
    private $model;
    private $dateOfRegistration;
    private $colour;
    private $hourlyRate;
    private $requiredLicense;
    private $capacity;

    function __get($name) {
        return $this->$name;
    }

    function __set($name,$value) {
        $this->$name = $value;
    }

    public function jsonSerialize()
    {
        return get_object_vars($this);
    }

    function getFullBuses() {
        /*return ["$this->vehicleRegistrationNo, $this->Manufacturer,
        $this->Model, $this->DateOfRegistration, $this->Colour,
        $this->HourlyRate, $this->RequiredLicense, $this->Capacity"];*/

        return "$this->vehicleRegistrationNo, $this->manufacturer,
        $this->model, $this->dateOfRegistration, $this->colour,
        $this->hourlyRate, $this->requiredLicense, $this->capacity";
    }
}
?>
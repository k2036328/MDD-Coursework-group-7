<?php
class BookingData implements JsonSerializable {
    private $bookingId;
    private $bus;
    private $destination;
    private $departDate;
    private $arriveDate;
    private $requiredDate;
    private $requiredLicense;
    private $totalPrice;

    private static $instance = null;

    function __get($name) {
        return $this->$name;
    }

    function __set($name,$value) {
        $this->$name = $value;
    }
/*
    function getFullBookingDetails() {
        return "$this->bookingId, $this->bus, $this->destination, $this->departDate, 
        $this->arriveDate, $this->requiredDate, $this->requiredLicense, 
        $this->totalPrice";
    }
*/

    function &__getPostFieldValue($name2) {
        $this->name2 = $name2;
    }

    public function jsonSerialize()
    {
        return get_object_vars($this);
    }

    public static function getInstance()
{
    if(!self::$instance)
    {
        self::$instance = new dataAccess2();
    }
}
}
?>
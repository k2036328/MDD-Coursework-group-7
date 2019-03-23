<?php
class Customer {
    private $id;
    private $company_name;
    private $contact_name;
    private $address;
    private $email_address;
    private $contact_no;

    function __get($name) {
        return $this->$name;
    }

    function __set($name,$value) {
        $this->$name = $value;
    }

    function getFullCustomerDetails() {
        return "$this->company_name, $this->contact_name, $this->address, 
        $this->email_address, $this->contact_no";
    }
}
?>
<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

class DemoClass extends Model {
    protected $_name = [
        'someString' => 'some_string',
        'someDate' => 'some_date',
        'someBoolean' => 'some_boolean',
        'someInt' => 'some_int',
        'someList' => 'some_list',
    ];
    public function validate() {
        Model::validateRequired('someString', $this->someString, true);
        Model::validateRequired('someDate', $this->someDate, true);
        Model::validateRequired('someBoolean', $this->someBoolean, true);
        Model::validateRequired('someInt', $this->someInt, true);
        Model::validateRequired('someList', $this->someList, true);
        Model::validatePattern('someDate', $this->someDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->someString) {
            $res['some_string'] = $this->someString;
        }
        if (null !== $this->someDate) {
            $res['some_date'] = $this->someDate;
        }
        if (null !== $this->someBoolean) {
            $res['some_boolean'] = $this->someBoolean;
        }
        if (null !== $this->someInt) {
            $res['some_int'] = $this->someInt;
        }
        if (null !== $this->someList) {
            $res['some_list'] = $this->someList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DemoClass
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['some_string'])){
            $model->someString = $map['some_string'];
        }
        if(isset($map['some_date'])){
            $model->someDate = $map['some_date'];
        }
        if(isset($map['some_boolean'])){
            $model->someBoolean = $map['some_boolean'];
        }
        if(isset($map['some_int'])){
            $model->someInt = $map['some_int'];
        }
        if(isset($map['some_list'])){
            if(!empty($map['some_list'])){
                $model->someList = $map['some_list'];
            }
        }
        return $model;
    }
    // some_string
    /**
     * @example some_string
     * @var string
     */
    public $someString;

    // some_date
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $someDate;

    // some_boolean
    /**
     * @example true
     * @var bool
     */
    public $someBoolean;

    // some_int
    /**
     * @example 1
     * @var int
     */
    public $someInt;

    // some_list
    /**
     * @example some_list
     * @var string[]
     */
    public $someList;

}

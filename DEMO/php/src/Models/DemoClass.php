<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class DemoClass extends Model {
    protected $_name = [
        'someString' => 'someString',
        'someDate' => 'someDate',
        'someBoolean' => 'someBoolean',
        'someInt' => 'someInt',
        'someList' => 'someList',
    ];
    public function validate() {
        Model::validatePattern('someDate', $this->someDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->someString) {
            $res['someString'] = $this->someString;
        }
        if (null !== $this->someDate) {
            $res['someDate'] = $this->someDate;
        }
        if (null !== $this->someBoolean) {
            $res['someBoolean'] = $this->someBoolean;
        }
        if (null !== $this->someInt) {
            $res['someInt'] = $this->someInt;
        }
        if (null !== $this->someList) {
            $res['someList'] = $this->someList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DemoClass
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['someString'])){
            $model->someString = $map['someString'];
        }
        if(isset($map['someDate'])){
            $model->someDate = $map['someDate'];
        }
        if(isset($map['someBoolean'])){
            $model->someBoolean = $map['someBoolean'];
        }
        if(isset($map['someInt'])){
            $model->someInt = $map['someInt'];
        }
        if(isset($map['someList'])){
            if(!empty($map['someList'])){
                $model->someList = $map['someList'];
            }
        }
        return $model;
    }
    // 字符串测试
    /**
     * @example some string
     * @var string
     */
    public $someString;

    // 日期测试
    /**
     * @example 3
     * @var string
     */
    public $someDate;

    // Boolean测试
    /**
     * @example true
     * @var bool
     */
    public $someBoolean;

    // 整数测试
    /**
     * @example 3
     * @var int
     */
    public $someInt;

    // 列表测试
    /**
     * @example 
     * @var string[]
     */
    public $someList;

}

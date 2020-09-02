<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DOG\Models;

use AlibabaCloud\Tea\Model;

class Dog extends Model {
    protected $_name = [
        'adoptedDate' => 'adopted_date',
        'age' => 'age',
        'isAdopted' => 'is_adopted',
        'marks' => 'marks',
        'name' => 'name',
    ];
    public function validate() {
        Model::validatePattern('adoptedDate', $this->adoptedDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validateMaximum('age', $this->age, '100');
        Model::validateMinimum('age', $this->age, '0');
        Model::validateMaxLength('name', $this->name, 32);
        Model::validateMinLength('name', $this->name, 2);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->adoptedDate) {
            $res['adopted_date'] = $this->adoptedDate;
        }
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }
        if (null !== $this->isAdopted) {
            $res['is_adopted'] = $this->isAdopted;
        }
        if (null !== $this->marks) {
            $res['marks'] = $this->marks;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Dog
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['adopted_date'])){
            $model->adoptedDate = $map['adopted_date'];
        }
        if(isset($map['age'])){
            $model->age = $map['age'];
        }
        if(isset($map['is_adopted'])){
            $model->isAdopted = $map['is_adopted'];
        }
        if(isset($map['marks'])){
            if(!empty($map['marks'])){
                $model->marks = $map['marks'];
            }
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        return $model;
    }
    // 领养时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $adoptedDate;

    // 年龄
    /**
     * @example 8
     * @var int
     */
    public $age;

    // 是否已领养
    /**
     * @example true, false
     * @var bool
     */
    public $isAdopted;

    // 标记
    /**
     * @example 
     * @var string[]
     */
    public $marks;

    // 名字
    /**
     * @example Puppy
     * @var string
     */
    public $name;

}

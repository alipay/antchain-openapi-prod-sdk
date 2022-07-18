<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DOG\Models;

use AlibabaCloud\Tea\Model;

class Dog extends Model
{
    // 名字
    /**
     * @example Puppy
     *
     * @var string
     */
    public $name;

    // 年龄
    /**
     * @example 8
     *
     * @var int
     */
    public $age;

    // 是否已领养
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isAdopted;

    // 领养时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $adoptedDate;

    // 标记
    /**
     * @example
     *
     * @var string[]
     */
    public $marks;
    protected $_name = [
        'name'        => 'name',
        'age'         => 'age',
        'isAdopted'   => 'is_adopted',
        'adoptedDate' => 'adopted_date',
        'marks'       => 'marks',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('age', $this->age, true);
        Model::validateRequired('isAdopted', $this->isAdopted, true);
        Model::validateMaxLength('name', $this->name, 32);
        Model::validateMinLength('name', $this->name, 2);
        Model::validateMaximum('age', $this->age, 100);
        Model::validateMinimum('age', $this->age, 0);
        Model::validatePattern('adoptedDate', $this->adoptedDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }
        if (null !== $this->isAdopted) {
            $res['is_adopted'] = $this->isAdopted;
        }
        if (null !== $this->adoptedDate) {
            $res['adopted_date'] = $this->adoptedDate;
        }
        if (null !== $this->marks) {
            $res['marks'] = $this->marks;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Dog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['age'])) {
            $model->age = $map['age'];
        }
        if (isset($map['is_adopted'])) {
            $model->isAdopted = $map['is_adopted'];
        }
        if (isset($map['adopted_date'])) {
            $model->adoptedDate = $map['adopted_date'];
        }
        if (isset($map['marks'])) {
            if (!empty($map['marks'])) {
                $model->marks = $map['marks'];
            }
        }

        return $model;
    }
}

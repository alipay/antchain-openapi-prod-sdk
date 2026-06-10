<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDKT\Models;

use AlibabaCloud\Tea\Model;

class ResultTests extends Model
{
    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 年龄
    /**
     * @example 18
     *
     * @var string
     */
    public $age;
    protected $_name = [
        'name' => 'name',
        'age'  => 'age',
    ];

    public function validate()
    {
        Model::validateRequired('age', $this->age, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultTests
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

        return $model;
    }
}

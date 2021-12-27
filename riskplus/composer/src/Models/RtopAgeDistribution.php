<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopAgeDistribution extends Model
{
    // 年龄
    /**
     * @example above20
     *
     * @var string
     */
    public $age;

    // 统计值
    /**
     * @example 10
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'age'   => 'age',
        'count' => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('age', $this->age, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopAgeDistribution
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['age'])) {
            $model->age = $map['age'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}

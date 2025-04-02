<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopGenderDistribution extends Model
{
    // 统计值
    /**
     * @example 10
     *
     * @var int
     */
    public $count;

    // 性别
    /**
     * @example MALE
     *
     * @var string
     */
    public $gender;
    protected $_name = [
        'count'  => 'count',
        'gender' => 'gender',
    ];

    public function validate()
    {
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('gender', $this->gender, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->gender) {
            $res['gender'] = $this->gender;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopGenderDistribution
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['gender'])) {
            $model->gender = $map['gender'];
        }

        return $model;
    }
}

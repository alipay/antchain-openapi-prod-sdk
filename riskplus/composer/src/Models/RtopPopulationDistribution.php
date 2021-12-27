<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopPopulationDistribution extends Model
{
    // 市
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $city;

    // 统计值
    /**
     * @example 10
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'city'  => 'city',
        'count' => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('city', $this->city, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopPopulationDistribution
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopRegionalDistribution extends Model
{
    // 统计值
    /**
     * @example 10
     *
     * @var int
     */
    public $count;

    // 地区
    /**
     * @example 西湖区
     *
     * @var string
     */
    public $place;

    // 当前地区的涉众风险类型分布，即非法集资有多少企业，传销有多少企业
    /**
     * @example
     *
     * @var RtopTypeDistribution[]
     */
    public $typeDistribution;
    protected $_name = [
        'count'            => 'count',
        'place'            => 'place',
        'typeDistribution' => 'type_distribution',
    ];

    public function validate()
    {
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('place', $this->place, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->place) {
            $res['place'] = $this->place;
        }
        if (null !== $this->typeDistribution) {
            $res['type_distribution'] = [];
            if (null !== $this->typeDistribution && \is_array($this->typeDistribution)) {
                $n = 0;
                foreach ($this->typeDistribution as $item) {
                    $res['type_distribution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopRegionalDistribution
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['place'])) {
            $model->place = $map['place'];
        }
        if (isset($map['type_distribution'])) {
            if (!empty($map['type_distribution'])) {
                $model->typeDistribution = [];
                $n                       = 0;
                foreach ($map['type_distribution'] as $item) {
                    $model->typeDistribution[$n++] = null !== $item ? RtopTypeDistribution::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

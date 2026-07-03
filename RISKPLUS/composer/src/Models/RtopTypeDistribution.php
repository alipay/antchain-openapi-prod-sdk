<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopTypeDistribution extends Model
{
    // 统计值
    /**
     * @example 10
     *
     * @var int
     */
    public $count;

    // 当前类型下的等级分布
    /**
     * @example undefined
     *
     * @var RtopLevelDistribution[]
     */
    public $levelDistribution;

    // 类型
    /**
     * @example MLM
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'count'             => 'count',
        'levelDistribution' => 'levelDistribution',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('levelDistribution', $this->levelDistribution, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->levelDistribution) {
            $res['levelDistribution'] = [];
            if (null !== $this->levelDistribution && \is_array($this->levelDistribution)) {
                $n = 0;
                foreach ($this->levelDistribution as $item) {
                    $res['levelDistribution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopTypeDistribution
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['levelDistribution'])) {
            if (!empty($map['levelDistribution'])) {
                $model->levelDistribution = [];
                $n                        = 0;
                foreach ($map['levelDistribution'] as $item) {
                    $model->levelDistribution[$n++] = null !== $item ? RtopLevelDistribution::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}

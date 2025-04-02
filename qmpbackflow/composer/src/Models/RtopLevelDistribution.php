<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopLevelDistribution extends Model
{
    // 统计值
    /**
     * @example 10
     *
     * @var int
     */
    public $count;

    // 等级
    /**
     * @example EX_HIGH_RISK
     *
     * @var string
     */
    public $level;
    protected $_name = [
        'count' => 'count',
        'level' => 'level',
    ];

    public function validate()
    {
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('level', $this->level, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopLevelDistribution
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }

        return $model;
    }
}

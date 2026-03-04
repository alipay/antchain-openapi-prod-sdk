<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class RiskFactorDetail extends Model
{
    // 风险评估因子类型
    /**
     * @example BLACKLIST
     *
     * @var string
     */
    public $factorType;

    // 分数
    /**
     * @example 85
     *
     * @var int
     */
    public $score;

    // 风险事件
    /**
     * @example ["关联账户被冻结", "高频异常交易"]
     *
     * @var string[]
     */
    public $evidence;
    protected $_name = [
        'factorType' => 'factor_type',
        'score'      => 'score',
        'evidence'   => 'evidence',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->factorType) {
            $res['factor_type'] = $this->factorType;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->evidence) {
            $res['evidence'] = $this->evidence;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskFactorDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['factor_type'])) {
            $model->factorType = $map['factor_type'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }
        if (isset($map['evidence'])) {
            if (!empty($map['evidence'])) {
                $model->evidence = $map['evidence'];
            }
        }

        return $model;
    }
}

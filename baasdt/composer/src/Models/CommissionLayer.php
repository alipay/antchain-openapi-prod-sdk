<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CommissionLayer extends Model
{
    // 阶梯起始值，无结束值
    /**
     * @example 2
     *
     * @var string
     */
    public $startNum;

    // 手续费费率
    /**
     * @example 0.0001
     *
     * @var string
     */
    public $deductRatio;

    // 固定的商品费率值
    /**
     * @example 10
     *
     * @var string
     */
    public $deductToken;
    protected $_name = [
        'startNum'    => 'start_num',
        'deductRatio' => 'deduct_ratio',
        'deductToken' => 'deduct_token',
    ];

    public function validate()
    {
        Model::validateRequired('startNum', $this->startNum, true);
        Model::validateRequired('deductRatio', $this->deductRatio, true);
        Model::validateRequired('deductToken', $this->deductToken, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->startNum) {
            $res['start_num'] = $this->startNum;
        }
        if (null !== $this->deductRatio) {
            $res['deduct_ratio'] = $this->deductRatio;
        }
        if (null !== $this->deductToken) {
            $res['deduct_token'] = $this->deductToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommissionLayer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['start_num'])) {
            $model->startNum = $map['start_num'];
        }
        if (isset($map['deduct_ratio'])) {
            $model->deductRatio = $map['deduct_ratio'];
        }
        if (isset($map['deduct_token'])) {
            $model->deductToken = $map['deduct_token'];
        }

        return $model;
    }
}

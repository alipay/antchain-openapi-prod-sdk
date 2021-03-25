<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPSettleRule extends Model
{
    // 结算类型， 1-表示结算到银行卡；2-表示结算到支付宝账号
    /**
     * @example 1
     *
     * @var int
     */
    public $settleType;

    // 结算目标 如果settle_type = 1, 这里填写银行卡卡号; 如果settle_type = 2, 这里填写支付宝账号登录号, 且要求与商户名称name同名
    /**
     * @example myalipay@alipay.com
     *
     * @var string
     */
    public $settleTarget;
    protected $_name = [
        'settleType'   => 'settle_type',
        'settleTarget' => 'settle_target',
    ];

    public function validate()
    {
        Model::validateRequired('settleType', $this->settleType, true);
        Model::validateRequired('settleTarget', $this->settleTarget, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->settleType) {
            $res['settle_type'] = $this->settleType;
        }
        if (null !== $this->settleTarget) {
            $res['settle_target'] = $this->settleTarget;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPSettleRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['settle_type'])) {
            $model->settleType = $map['settle_type'];
        }
        if (isset($map['settle_target'])) {
            $model->settleTarget = $map['settle_target'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class SettleRule extends Model
{
    // 结算类型， bankCard-表示结算到银行卡；alipayAccount-表示结算到支付宝账号
    /**
     * @example bankCard
     *
     * @var string
     */
    public $defaultSettleType;

    // 结算目标
    // 如果settle_type = bankCard, 这里填写银行卡卡号;
    // 如果settle_type = alipayAccount, 这里填写支付宝账号登录号, 且要求与商户名称name同名
    /**
     * @example myalipay@alipay.com
     *
     * @var string
     */
    public $defaultSettleTarget;
    protected $_name = [
        'defaultSettleType'   => 'default_settle_type',
        'defaultSettleTarget' => 'default_settle_target',
    ];

    public function validate()
    {
        Model::validateRequired('defaultSettleType', $this->defaultSettleType, true);
        Model::validateRequired('defaultSettleTarget', $this->defaultSettleTarget, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->defaultSettleType) {
            $res['default_settle_type'] = $this->defaultSettleType;
        }
        if (null !== $this->defaultSettleTarget) {
            $res['default_settle_target'] = $this->defaultSettleTarget;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SettleRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['default_settle_type'])) {
            $model->defaultSettleType = $map['default_settle_type'];
        }
        if (isset($map['default_settle_target'])) {
            $model->defaultSettleTarget = $map['default_settle_target'];
        }

        return $model;
    }
}

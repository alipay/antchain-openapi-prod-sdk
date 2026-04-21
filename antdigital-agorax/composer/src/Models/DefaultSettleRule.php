<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class DefaultSettleRule extends Model
{
    // 默认结算类型，结算到银行卡: bankCard，结算到支付宝账号: alipayAccount
    /**
     * @example alipayAccount
     *
     * @var string
     */
    public $defaultSettleType;

    // 默认结算目标	bankCard 时填银行卡号，alipayAccount 时填支付宝登录号
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
     * @return DefaultSettleRule
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

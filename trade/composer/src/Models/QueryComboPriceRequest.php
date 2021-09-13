<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class QueryComboPriceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 套餐编码
    /**
     * @var string
     */
    public $comboCode;

    // 租户ID，和租户名二选一必填
    /**
     * @var string
     */
    public $tenantId;

    // 8位租户名，和租户ID二选一必填
    /**
     * @var string
     */
    public $tenantName;

    // 订单类型，新购：NEW，不填则默认NEW
    /**
     * @var string
     */
    public $orderType;

    // 优惠券ID
    /**
     * @var string
     */
    public $couponId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'comboCode'  => 'combo_code',
        'tenantId'   => 'tenant_id',
        'tenantName' => 'tenant_name',
        'orderType'  => 'order_type',
        'couponId'   => 'coupon_id',
    ];

    public function validate()
    {
        Model::validateRequired('comboCode', $this->comboCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->comboCode) {
            $res['combo_code'] = $this->comboCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->couponId) {
            $res['coupon_id'] = $this->couponId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryComboPriceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['combo_code'])) {
            $model->comboCode = $map['combo_code'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['coupon_id'])) {
            $model->couponId = $map['coupon_id'];
        }

        return $model;
    }
}

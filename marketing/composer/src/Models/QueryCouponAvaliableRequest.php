<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class QueryCouponAvaliableRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 商品code
    /**
     * @var string[]
     */
    public $productCodes;

    // 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
    /**
     * @var string
     */
    public $couponType;

    // 业务发生时间
    /**
     * @var string
     */
    public $bizTime;

    // 交易币种 CNY 人民币 USD美元
    /**
     * @var string
     */
    public $currency;
    protected $_name = [
        'authToken'    => 'auth_token',
        'tenantId'     => 'tenant_id',
        'productCodes' => 'product_codes',
        'couponType'   => 'coupon_type',
        'bizTime'      => 'biz_time',
        'currency'     => 'currency',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productCodes', $this->productCodes, true);
        Model::validateRequired('bizTime', $this->bizTime, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validatePattern('bizTime', $this->bizTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productCodes) {
            $res['product_codes'] = $this->productCodes;
        }
        if (null !== $this->couponType) {
            $res['coupon_type'] = $this->couponType;
        }
        if (null !== $this->bizTime) {
            $res['biz_time'] = $this->bizTime;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCouponAvaliableRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['product_codes'])) {
            if (!empty($map['product_codes'])) {
                $model->productCodes = $map['product_codes'];
            }
        }
        if (isset($map['coupon_type'])) {
            $model->couponType = $map['coupon_type'];
        }
        if (isset($map['biz_time'])) {
            $model->bizTime = $map['biz_time'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }

        return $model;
    }
}

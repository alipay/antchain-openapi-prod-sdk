<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SignMerchantLeaseConfig extends Model
{
    // 商户商品spuId
    /**
     * @example s123123123
     *
     * @var string
     */
    public $merchantProductId;

    // 商户品牌
    /**
     * @example 品牌
     *
     * @var string
     */
    public $merchantBrand;

    // logo
    /**
     * @example filekey
     *
     * @var string
     */
    public $merchantLogo;

    // logo
    /**
     * @example http
     *
     * @var string
     */
    public $largeMerchantLogo;

    // 是否置灰
    /**
     * @example true, false
     *
     * @var bool
     */
    public $grayed;

    // 租赁方案
    /**
     * @example
     *
     * @var string[]
     */
    public $rentalPlan;

    // 租赁方案说明
    /**
     * @example 说明
     *
     * @var string
     */
    public $rentalPlanIntro;

    // 租赁周期
    /**
     * @example
     *
     * @var int[]
     */
    public $rentalPeriod;

    // 可续租
    /**
     * @example true, false
     *
     * @var bool
     */
    public $supportRenew;

    // 可买断
    /**
     * @example true, false
     *
     * @var bool
     */
    public $supportBuyout;

    // 租赁价格方案列表
    /**
     * @example
     *
     * @var LeasePricePlan[]
     */
    public $leasePricePlanList;

    // 寄出是否包邮
    /**
     * @example true, false
     *
     * @var bool
     */
    public $freeShippingOut;

    // 寄回是否包邮
    /**
     * @example true, false
     *
     * @var bool
     */
    public $freeShippingBack;

    // 发货时效
    /**
     * @example 24
     *
     * @var string
     */
    public $shippingDurationType;

    // 增值服务介绍
    /**
     * @example 介绍
     *
     * @var string
     */
    public $valueAddedServiceIntro;

    // 详情页介绍
    /**
     * @example 123
     *
     * @var string
     */
    public $detailPageIntro;

    // 服务承诺
    /**
     * @example
     *
     * @var string[]
     */
    public $servicePromiseIntro;
    protected $_name = [
        'merchantProductId'      => 'merchant_product_id',
        'merchantBrand'          => 'merchant_brand',
        'merchantLogo'           => 'merchant_logo',
        'largeMerchantLogo'      => 'large_merchant_logo',
        'grayed'                 => 'grayed',
        'rentalPlan'             => 'rental_plan',
        'rentalPlanIntro'        => 'rental_plan_intro',
        'rentalPeriod'           => 'rental_period',
        'supportRenew'           => 'support_renew',
        'supportBuyout'          => 'support_buyout',
        'leasePricePlanList'     => 'lease_price_plan_list',
        'freeShippingOut'        => 'free_shipping_out',
        'freeShippingBack'       => 'free_shipping_back',
        'shippingDurationType'   => 'shipping_duration_type',
        'valueAddedServiceIntro' => 'value_added_service_intro',
        'detailPageIntro'        => 'detail_page_intro',
        'servicePromiseIntro'    => 'service_promise_intro',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->merchantProductId) {
            $res['merchant_product_id'] = $this->merchantProductId;
        }
        if (null !== $this->merchantBrand) {
            $res['merchant_brand'] = $this->merchantBrand;
        }
        if (null !== $this->merchantLogo) {
            $res['merchant_logo'] = $this->merchantLogo;
        }
        if (null !== $this->largeMerchantLogo) {
            $res['large_merchant_logo'] = $this->largeMerchantLogo;
        }
        if (null !== $this->grayed) {
            $res['grayed'] = $this->grayed;
        }
        if (null !== $this->rentalPlan) {
            $res['rental_plan'] = $this->rentalPlan;
        }
        if (null !== $this->rentalPlanIntro) {
            $res['rental_plan_intro'] = $this->rentalPlanIntro;
        }
        if (null !== $this->rentalPeriod) {
            $res['rental_period'] = $this->rentalPeriod;
        }
        if (null !== $this->supportRenew) {
            $res['support_renew'] = $this->supportRenew;
        }
        if (null !== $this->supportBuyout) {
            $res['support_buyout'] = $this->supportBuyout;
        }
        if (null !== $this->leasePricePlanList) {
            $res['lease_price_plan_list'] = [];
            if (null !== $this->leasePricePlanList && \is_array($this->leasePricePlanList)) {
                $n = 0;
                foreach ($this->leasePricePlanList as $item) {
                    $res['lease_price_plan_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->freeShippingOut) {
            $res['free_shipping_out'] = $this->freeShippingOut;
        }
        if (null !== $this->freeShippingBack) {
            $res['free_shipping_back'] = $this->freeShippingBack;
        }
        if (null !== $this->shippingDurationType) {
            $res['shipping_duration_type'] = $this->shippingDurationType;
        }
        if (null !== $this->valueAddedServiceIntro) {
            $res['value_added_service_intro'] = $this->valueAddedServiceIntro;
        }
        if (null !== $this->detailPageIntro) {
            $res['detail_page_intro'] = $this->detailPageIntro;
        }
        if (null !== $this->servicePromiseIntro) {
            $res['service_promise_intro'] = $this->servicePromiseIntro;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignMerchantLeaseConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['merchant_product_id'])) {
            $model->merchantProductId = $map['merchant_product_id'];
        }
        if (isset($map['merchant_brand'])) {
            $model->merchantBrand = $map['merchant_brand'];
        }
        if (isset($map['merchant_logo'])) {
            $model->merchantLogo = $map['merchant_logo'];
        }
        if (isset($map['large_merchant_logo'])) {
            $model->largeMerchantLogo = $map['large_merchant_logo'];
        }
        if (isset($map['grayed'])) {
            $model->grayed = $map['grayed'];
        }
        if (isset($map['rental_plan'])) {
            if (!empty($map['rental_plan'])) {
                $model->rentalPlan = $map['rental_plan'];
            }
        }
        if (isset($map['rental_plan_intro'])) {
            $model->rentalPlanIntro = $map['rental_plan_intro'];
        }
        if (isset($map['rental_period'])) {
            if (!empty($map['rental_period'])) {
                $model->rentalPeriod = $map['rental_period'];
            }
        }
        if (isset($map['support_renew'])) {
            $model->supportRenew = $map['support_renew'];
        }
        if (isset($map['support_buyout'])) {
            $model->supportBuyout = $map['support_buyout'];
        }
        if (isset($map['lease_price_plan_list'])) {
            if (!empty($map['lease_price_plan_list'])) {
                $model->leasePricePlanList = [];
                $n                         = 0;
                foreach ($map['lease_price_plan_list'] as $item) {
                    $model->leasePricePlanList[$n++] = null !== $item ? LeasePricePlan::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['free_shipping_out'])) {
            $model->freeShippingOut = $map['free_shipping_out'];
        }
        if (isset($map['free_shipping_back'])) {
            $model->freeShippingBack = $map['free_shipping_back'];
        }
        if (isset($map['shipping_duration_type'])) {
            $model->shippingDurationType = $map['shipping_duration_type'];
        }
        if (isset($map['value_added_service_intro'])) {
            $model->valueAddedServiceIntro = $map['value_added_service_intro'];
        }
        if (isset($map['detail_page_intro'])) {
            $model->detailPageIntro = $map['detail_page_intro'];
        }
        if (isset($map['service_promise_intro'])) {
            if (!empty($map['service_promise_intro'])) {
                $model->servicePromiseIntro = $map['service_promise_intro'];
            }
        }

        return $model;
    }
}

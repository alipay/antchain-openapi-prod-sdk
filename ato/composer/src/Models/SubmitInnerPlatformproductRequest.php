<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SubmitInnerPlatformproductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 操作类型：edit/submit
    /**
     * @var string
     */
    public $operateType;

    // 平台商品Id
    /**
     * @var string
     */
    public $platformProductId;

    // 商户商品spuId
    /**
     * @var string
     */
    public $merchantProductId;

    // 租赁方案
    /**
     * @var string[]
     */
    public $rentalPlan;

    // 租赁周期
    /**
     * @var int[]
     */
    public $rentalPeriod;

    // 可续租
    /**
     * @var bool
     */
    public $supportRenew;

    // 可买断
    /**
     * @var bool
     */
    public $supportBuyout;

    // 租赁价格方案列表
    /**
     * @var LeasePricePlan[]
     */
    public $leasePricePlanList;

    // 寄出是否包邮
    /**
     * @var bool
     */
    public $freeShippingOut;

    // 寄回是否包邮
    /**
     * @var bool
     */
    public $freeShippingBack;

    // 发货时效
    /**
     * @var string
     */
    public $shippingDurationType;

    // 增值服务介绍
    /**
     * @var string
     */
    public $valueAddedServiceIntro;

    // 详情页介绍
    /**
     * @var string
     */
    public $detailPageIntro;

    // 服务承诺
    /**
     * @var string[]
     */
    public $servicePromiseIntro;

    // 租赁方案说明
    /**
     * @var string
     */
    public $rentalPlanIntro;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'tenantId'               => 'tenant_id',
        'operateType'            => 'operate_type',
        'platformProductId'      => 'platform_product_id',
        'merchantProductId'      => 'merchant_product_id',
        'rentalPlan'             => 'rental_plan',
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
        'rentalPlanIntro'        => 'rental_plan_intro',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->platformProductId) {
            $res['platform_product_id'] = $this->platformProductId;
        }
        if (null !== $this->merchantProductId) {
            $res['merchant_product_id'] = $this->merchantProductId;
        }
        if (null !== $this->rentalPlan) {
            $res['rental_plan'] = $this->rentalPlan;
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
        if (null !== $this->rentalPlanIntro) {
            $res['rental_plan_intro'] = $this->rentalPlanIntro;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitInnerPlatformproductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['platform_product_id'])) {
            $model->platformProductId = $map['platform_product_id'];
        }
        if (isset($map['merchant_product_id'])) {
            $model->merchantProductId = $map['merchant_product_id'];
        }
        if (isset($map['rental_plan'])) {
            if (!empty($map['rental_plan'])) {
                $model->rentalPlan = $map['rental_plan'];
            }
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
        if (isset($map['rental_plan_intro'])) {
            $model->rentalPlanIntro = $map['rental_plan_intro'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerPlatformproductResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 平台商品ID
    /**
     * @var string
     */
    public $platformProductId;

    // 商户商品ID
    /**
     * @var string
     */
    public $merchantProductId;

    // 一级分类
    /**
     * @var string
     */
    public $primaryCategory;

    // 二级分类
    /**
     * @var string
     */
    public $secondaryCategory;

    // 商品名称
    /**
     * @var string
     */
    public $productName;

    // 商品成色
    /**
     * @var string
     */
    public $productCondition;

    // 商品描述
    /**
     * @var string
     */
    public $productDescription;

    // 商品封面图
    /**
     * @var string[]
     */
    public $coverImageUrlList;

    // 商品封面图-完整链接
    /**
     * @var string[]
     */
    public $largeCoverImageUrlList;

    // 商品详情图
    /**
     * @var string[]
     */
    public $detailImageUrlList;

    // 商品详情图-完整链接
    /**
     * @var string[]
     */
    public $largeDetailImageUrlList;

    // 商品规格
    /**
     * @var ProductSpecConfig[]
     */
    public $specConfigList;

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

    // 平台配置的字段key列表（仅包含租赁销售属性/其他属性中的字段
    /**
     * @var string[]
     */
    public $platformConfigParamList;

    // 允许的租户列表
    /**
     * @var string[]
     */
    public $allowApplyTenantIdList;

    // 提报状态
    /**
     * @var string
     */
    public $applyStatus;

    // 审核理由
    /**
     * @var string
     */
    public $refuseReason;

    // 租赁方案说明
    /**
     * @var string
     */
    public $rentalPlanIntro;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'platformProductId'       => 'platform_product_id',
        'merchantProductId'       => 'merchant_product_id',
        'primaryCategory'         => 'primary_category',
        'secondaryCategory'       => 'secondary_category',
        'productName'             => 'product_name',
        'productCondition'        => 'product_condition',
        'productDescription'      => 'product_description',
        'coverImageUrlList'       => 'cover_image_url_list',
        'largeCoverImageUrlList'  => 'large_cover_image_url_list',
        'detailImageUrlList'      => 'detail_image_url_list',
        'largeDetailImageUrlList' => 'large_detail_image_url_list',
        'specConfigList'          => 'spec_config_list',
        'rentalPlan'              => 'rental_plan',
        'rentalPeriod'            => 'rental_period',
        'supportRenew'            => 'support_renew',
        'supportBuyout'           => 'support_buyout',
        'leasePricePlanList'      => 'lease_price_plan_list',
        'freeShippingOut'         => 'free_shipping_out',
        'freeShippingBack'        => 'free_shipping_back',
        'shippingDurationType'    => 'shipping_duration_type',
        'valueAddedServiceIntro'  => 'value_added_service_intro',
        'detailPageIntro'         => 'detail_page_intro',
        'servicePromiseIntro'     => 'service_promise_intro',
        'platformConfigParamList' => 'platform_config_param_list',
        'allowApplyTenantIdList'  => 'allow_apply_tenant_id_list',
        'applyStatus'             => 'apply_status',
        'refuseReason'            => 'refuse_reason',
        'rentalPlanIntro'         => 'rental_plan_intro',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->platformProductId) {
            $res['platform_product_id'] = $this->platformProductId;
        }
        if (null !== $this->merchantProductId) {
            $res['merchant_product_id'] = $this->merchantProductId;
        }
        if (null !== $this->primaryCategory) {
            $res['primary_category'] = $this->primaryCategory;
        }
        if (null !== $this->secondaryCategory) {
            $res['secondary_category'] = $this->secondaryCategory;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productCondition) {
            $res['product_condition'] = $this->productCondition;
        }
        if (null !== $this->productDescription) {
            $res['product_description'] = $this->productDescription;
        }
        if (null !== $this->coverImageUrlList) {
            $res['cover_image_url_list'] = $this->coverImageUrlList;
        }
        if (null !== $this->largeCoverImageUrlList) {
            $res['large_cover_image_url_list'] = $this->largeCoverImageUrlList;
        }
        if (null !== $this->detailImageUrlList) {
            $res['detail_image_url_list'] = $this->detailImageUrlList;
        }
        if (null !== $this->largeDetailImageUrlList) {
            $res['large_detail_image_url_list'] = $this->largeDetailImageUrlList;
        }
        if (null !== $this->specConfigList) {
            $res['spec_config_list'] = [];
            if (null !== $this->specConfigList && \is_array($this->specConfigList)) {
                $n = 0;
                foreach ($this->specConfigList as $item) {
                    $res['spec_config_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->platformConfigParamList) {
            $res['platform_config_param_list'] = $this->platformConfigParamList;
        }
        if (null !== $this->allowApplyTenantIdList) {
            $res['allow_apply_tenant_id_list'] = $this->allowApplyTenantIdList;
        }
        if (null !== $this->applyStatus) {
            $res['apply_status'] = $this->applyStatus;
        }
        if (null !== $this->refuseReason) {
            $res['refuse_reason'] = $this->refuseReason;
        }
        if (null !== $this->rentalPlanIntro) {
            $res['rental_plan_intro'] = $this->rentalPlanIntro;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInnerPlatformproductResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['platform_product_id'])) {
            $model->platformProductId = $map['platform_product_id'];
        }
        if (isset($map['merchant_product_id'])) {
            $model->merchantProductId = $map['merchant_product_id'];
        }
        if (isset($map['primary_category'])) {
            $model->primaryCategory = $map['primary_category'];
        }
        if (isset($map['secondary_category'])) {
            $model->secondaryCategory = $map['secondary_category'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_condition'])) {
            $model->productCondition = $map['product_condition'];
        }
        if (isset($map['product_description'])) {
            $model->productDescription = $map['product_description'];
        }
        if (isset($map['cover_image_url_list'])) {
            if (!empty($map['cover_image_url_list'])) {
                $model->coverImageUrlList = $map['cover_image_url_list'];
            }
        }
        if (isset($map['large_cover_image_url_list'])) {
            if (!empty($map['large_cover_image_url_list'])) {
                $model->largeCoverImageUrlList = $map['large_cover_image_url_list'];
            }
        }
        if (isset($map['detail_image_url_list'])) {
            if (!empty($map['detail_image_url_list'])) {
                $model->detailImageUrlList = $map['detail_image_url_list'];
            }
        }
        if (isset($map['large_detail_image_url_list'])) {
            if (!empty($map['large_detail_image_url_list'])) {
                $model->largeDetailImageUrlList = $map['large_detail_image_url_list'];
            }
        }
        if (isset($map['spec_config_list'])) {
            if (!empty($map['spec_config_list'])) {
                $model->specConfigList = [];
                $n                     = 0;
                foreach ($map['spec_config_list'] as $item) {
                    $model->specConfigList[$n++] = null !== $item ? ProductSpecConfig::fromMap($item) : $item;
                }
            }
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
        if (isset($map['platform_config_param_list'])) {
            if (!empty($map['platform_config_param_list'])) {
                $model->platformConfigParamList = $map['platform_config_param_list'];
            }
        }
        if (isset($map['allow_apply_tenant_id_list'])) {
            if (!empty($map['allow_apply_tenant_id_list'])) {
                $model->allowApplyTenantIdList = $map['allow_apply_tenant_id_list'];
            }
        }
        if (isset($map['apply_status'])) {
            $model->applyStatus = $map['apply_status'];
        }
        if (isset($map['refuse_reason'])) {
            $model->refuseReason = $map['refuse_reason'];
        }
        if (isset($map['rental_plan_intro'])) {
            $model->rentalPlanIntro = $map['rental_plan_intro'];
        }

        return $model;
    }
}

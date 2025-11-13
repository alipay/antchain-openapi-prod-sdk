<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SetInnerPlatformproductRequest extends Model
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

    // skuId
    /**
     * @var string
     */
    public $merchantSkuId;

    // 商品规格列表
    /**
     * @var ProductSpecOption[]
     */
    public $productSpecOptionList;

    // 规格图片
    /**
     * @var string
     */
    public $specImageFileKey;

    // 原订单总金额（单位分）
    /**
     * @var int
     */
    public $originTotalRentMoney;

    // 现订单总金额（单位分）
    /**
     * @var int
     */
    public $totalRentMoney;

    // 原日租金（单位分）
    /**
     * @var int
     */
    public $originDailyRentMoney;

    // 现日租金（单位分）
    /**
     * @var int
     */
    public $dailyRentMoney;

    // 库存
    /**
     * @var int
     */
    public $stockQuantity;

    // 续租价（单位分）
    /**
     * @var int
     */
    public $renewPrice;

    // 买断价（单位分）
    /**
     * @var int
     */
    public $buyoutPrice;

    // 是否可售卖
    /**
     * @var bool
     */
    public $forSale;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'tenantId'              => 'tenant_id',
        'merchantSkuId'         => 'merchant_sku_id',
        'productSpecOptionList' => 'product_spec_option_list',
        'specImageFileKey'      => 'spec_image_file_key',
        'originTotalRentMoney'  => 'origin_total_rent_money',
        'totalRentMoney'        => 'total_rent_money',
        'originDailyRentMoney'  => 'origin_daily_rent_money',
        'dailyRentMoney'        => 'daily_rent_money',
        'stockQuantity'         => 'stock_quantity',
        'renewPrice'            => 'renew_price',
        'buyoutPrice'           => 'buyout_price',
        'forSale'               => 'for_sale',
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
        if (null !== $this->merchantSkuId) {
            $res['merchant_sku_id'] = $this->merchantSkuId;
        }
        if (null !== $this->productSpecOptionList) {
            $res['product_spec_option_list'] = [];
            if (null !== $this->productSpecOptionList && \is_array($this->productSpecOptionList)) {
                $n = 0;
                foreach ($this->productSpecOptionList as $item) {
                    $res['product_spec_option_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->specImageFileKey) {
            $res['spec_image_file_key'] = $this->specImageFileKey;
        }
        if (null !== $this->originTotalRentMoney) {
            $res['origin_total_rent_money'] = $this->originTotalRentMoney;
        }
        if (null !== $this->totalRentMoney) {
            $res['total_rent_money'] = $this->totalRentMoney;
        }
        if (null !== $this->originDailyRentMoney) {
            $res['origin_daily_rent_money'] = $this->originDailyRentMoney;
        }
        if (null !== $this->dailyRentMoney) {
            $res['daily_rent_money'] = $this->dailyRentMoney;
        }
        if (null !== $this->stockQuantity) {
            $res['stock_quantity'] = $this->stockQuantity;
        }
        if (null !== $this->renewPrice) {
            $res['renew_price'] = $this->renewPrice;
        }
        if (null !== $this->buyoutPrice) {
            $res['buyout_price'] = $this->buyoutPrice;
        }
        if (null !== $this->forSale) {
            $res['for_sale'] = $this->forSale;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetInnerPlatformproductRequest
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
        if (isset($map['merchant_sku_id'])) {
            $model->merchantSkuId = $map['merchant_sku_id'];
        }
        if (isset($map['product_spec_option_list'])) {
            if (!empty($map['product_spec_option_list'])) {
                $model->productSpecOptionList = [];
                $n                            = 0;
                foreach ($map['product_spec_option_list'] as $item) {
                    $model->productSpecOptionList[$n++] = null !== $item ? ProductSpecOption::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['spec_image_file_key'])) {
            $model->specImageFileKey = $map['spec_image_file_key'];
        }
        if (isset($map['origin_total_rent_money'])) {
            $model->originTotalRentMoney = $map['origin_total_rent_money'];
        }
        if (isset($map['total_rent_money'])) {
            $model->totalRentMoney = $map['total_rent_money'];
        }
        if (isset($map['origin_daily_rent_money'])) {
            $model->originDailyRentMoney = $map['origin_daily_rent_money'];
        }
        if (isset($map['daily_rent_money'])) {
            $model->dailyRentMoney = $map['daily_rent_money'];
        }
        if (isset($map['stock_quantity'])) {
            $model->stockQuantity = $map['stock_quantity'];
        }
        if (isset($map['renew_price'])) {
            $model->renewPrice = $map['renew_price'];
        }
        if (isset($map['buyout_price'])) {
            $model->buyoutPrice = $map['buyout_price'];
        }
        if (isset($map['for_sale'])) {
            $model->forSale = $map['for_sale'];
        }

        return $model;
    }
}

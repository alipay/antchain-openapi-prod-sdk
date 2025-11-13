<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class LeasePriceProp extends Model
{
    // 商户商品skuId
    /**
     * @example 20240505151148001384
     *
     * @var string
     */
    public $merchantSkuId;

    // 商品规格列表
    /**
     * @example
     *
     * @var ProductSpecOption[]
     */
    public $productSpecOptionList;

    // 规格图片
    /**
     * @example ["fileKey"]
     *
     * @var string
     */
    public $specImageFileKey;

    // 规格图片
    /**
     * @example ["fileKey"]
     *
     * @var string
     */
    public $largeSpecImageFileKey;

    // 原订单总金额（单位分）
    /**
     * @example 2
     *
     * @var int
     */
    public $originTotalRentMoney;

    // 现订单总金额（单位分）
    /**
     * @example 1
     *
     * @var int
     */
    public $totalRentMoney;

    // 原日租金（单位分）
    /**
     * @example
     *
     * @var int
     */
    public $originDailyRentMoney;

    // 现日租金（单位分）
    /**
     * @example
     *
     * @var int
     */
    public $dailyRentMoney;

    // 库存
    /**
     * @example
     *
     * @var int
     */
    public $stockQuantity;

    // 续租价（单位分）
    /**
     * @example 1
     *
     * @var int
     */
    public $renewPrice;

    // 买断价（单位分）
    /**
     * @example 2
     *
     * @var int
     */
    public $buyoutPrice;

    // 是否可售卖
    /**
     * @example true, false
     *
     * @var bool
     */
    public $forSale;
    protected $_name = [
        'merchantSkuId'         => 'merchant_sku_id',
        'productSpecOptionList' => 'product_spec_option_list',
        'specImageFileKey'      => 'spec_image_file_key',
        'largeSpecImageFileKey' => 'large_spec_image_file_key',
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
        if (null !== $this->largeSpecImageFileKey) {
            $res['large_spec_image_file_key'] = $this->largeSpecImageFileKey;
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
     * @return LeasePriceProp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['large_spec_image_file_key'])) {
            $model->largeSpecImageFileKey = $map['large_spec_image_file_key'];
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

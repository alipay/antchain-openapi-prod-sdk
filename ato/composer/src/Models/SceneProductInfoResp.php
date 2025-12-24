<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SceneProductInfoResp extends Model
{
    // 平台商品id
    /**
     * @example s123123123123
     *
     * @var string
     */
    public $platformProductId;

    // 商品名称
    /**
     * @example 名称
     *
     * @var string
     */
    public $productName;

    // 封面首图url链接
    /**
     * @example filekey
     *
     * @var string
     */
    public $firstCoverImageUrl;

    // 封面首图url链接
    /**
     * @example http
     *
     * @var string
     */
    public $largeFirstCoverImageUrl;

    // 产品规格列表
    /**
     * @example
     *
     * @var ProductSpecConfig[]
     */
    public $specConfigList;

    // 租赁方案
    /**
     * @example
     *
     * @var string[]
     */
    public $rentalPlan;

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

    // 最低日租金
    /**
     * @example 1
     *
     * @var int
     */
    public $lowestDailyRentMoney;

    // 最低日租金
    /**
     * @example 1
     *
     * @var string
     */
    public $lowestDailyRentMoneyYuan;

    // 最高日租金
    /**
     * @example 1
     *
     * @var int
     */
    public $highestDailyRentMoney;

    // 最高日租金
    /**
     * @example 1
     *
     * @var string
     */
    public $highestDailyRentMoneyYuan;

    // 添加标志
    /**
     * @example true, false
     *
     * @var bool
     */
    public $addedFlag;

    // 报名商家列表
    /**
     * @example
     *
     * @var SignProductMerchant[]
     */
    public $signProductMerchantList;

    // 报名商家数量
    /**
     * @example 1
     *
     * @var int
     */
    public $signProductMerchantCount;

    // 适用商家列表
    /**
     * @example 1
     *
     * @var SignProductMerchant[]
     */
    public $applyProductMerchantList;

    // 适用商家数量
    /**
     * @example 1
     *
     * @var int
     */
    public $applyProductMerchantCount;

    // 场景商品上下架状态
    /**
     * @example ONLINE
     *
     * @var string
     */
    public $displayStatus;

    // 推广方式
    /**
     * @example PARALLEL
     *
     * @var string
     */
    public $deliveryMode;
    protected $_name = [
        'platformProductId'         => 'platform_product_id',
        'productName'               => 'product_name',
        'firstCoverImageUrl'        => 'first_cover_image_url',
        'largeFirstCoverImageUrl'   => 'large_first_cover_image_url',
        'specConfigList'            => 'spec_config_list',
        'rentalPlan'                => 'rental_plan',
        'rentalPeriod'              => 'rental_period',
        'supportRenew'              => 'support_renew',
        'supportBuyout'             => 'support_buyout',
        'lowestDailyRentMoney'      => 'lowest_daily_rent_money',
        'lowestDailyRentMoneyYuan'  => 'lowest_daily_rent_money_yuan',
        'highestDailyRentMoney'     => 'highest_daily_rent_money',
        'highestDailyRentMoneyYuan' => 'highest_daily_rent_money_yuan',
        'addedFlag'                 => 'added_flag',
        'signProductMerchantList'   => 'sign_product_merchant_list',
        'signProductMerchantCount'  => 'sign_product_merchant_count',
        'applyProductMerchantList'  => 'apply_product_merchant_list',
        'applyProductMerchantCount' => 'apply_product_merchant_count',
        'displayStatus'             => 'display_status',
        'deliveryMode'              => 'delivery_mode',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->platformProductId) {
            $res['platform_product_id'] = $this->platformProductId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->firstCoverImageUrl) {
            $res['first_cover_image_url'] = $this->firstCoverImageUrl;
        }
        if (null !== $this->largeFirstCoverImageUrl) {
            $res['large_first_cover_image_url'] = $this->largeFirstCoverImageUrl;
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
        if (null !== $this->lowestDailyRentMoney) {
            $res['lowest_daily_rent_money'] = $this->lowestDailyRentMoney;
        }
        if (null !== $this->lowestDailyRentMoneyYuan) {
            $res['lowest_daily_rent_money_yuan'] = $this->lowestDailyRentMoneyYuan;
        }
        if (null !== $this->highestDailyRentMoney) {
            $res['highest_daily_rent_money'] = $this->highestDailyRentMoney;
        }
        if (null !== $this->highestDailyRentMoneyYuan) {
            $res['highest_daily_rent_money_yuan'] = $this->highestDailyRentMoneyYuan;
        }
        if (null !== $this->addedFlag) {
            $res['added_flag'] = $this->addedFlag;
        }
        if (null !== $this->signProductMerchantList) {
            $res['sign_product_merchant_list'] = [];
            if (null !== $this->signProductMerchantList && \is_array($this->signProductMerchantList)) {
                $n = 0;
                foreach ($this->signProductMerchantList as $item) {
                    $res['sign_product_merchant_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signProductMerchantCount) {
            $res['sign_product_merchant_count'] = $this->signProductMerchantCount;
        }
        if (null !== $this->applyProductMerchantList) {
            $res['apply_product_merchant_list'] = [];
            if (null !== $this->applyProductMerchantList && \is_array($this->applyProductMerchantList)) {
                $n = 0;
                foreach ($this->applyProductMerchantList as $item) {
                    $res['apply_product_merchant_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->applyProductMerchantCount) {
            $res['apply_product_merchant_count'] = $this->applyProductMerchantCount;
        }
        if (null !== $this->displayStatus) {
            $res['display_status'] = $this->displayStatus;
        }
        if (null !== $this->deliveryMode) {
            $res['delivery_mode'] = $this->deliveryMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SceneProductInfoResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['platform_product_id'])) {
            $model->platformProductId = $map['platform_product_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['first_cover_image_url'])) {
            $model->firstCoverImageUrl = $map['first_cover_image_url'];
        }
        if (isset($map['large_first_cover_image_url'])) {
            $model->largeFirstCoverImageUrl = $map['large_first_cover_image_url'];
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
        if (isset($map['lowest_daily_rent_money'])) {
            $model->lowestDailyRentMoney = $map['lowest_daily_rent_money'];
        }
        if (isset($map['lowest_daily_rent_money_yuan'])) {
            $model->lowestDailyRentMoneyYuan = $map['lowest_daily_rent_money_yuan'];
        }
        if (isset($map['highest_daily_rent_money'])) {
            $model->highestDailyRentMoney = $map['highest_daily_rent_money'];
        }
        if (isset($map['highest_daily_rent_money_yuan'])) {
            $model->highestDailyRentMoneyYuan = $map['highest_daily_rent_money_yuan'];
        }
        if (isset($map['added_flag'])) {
            $model->addedFlag = $map['added_flag'];
        }
        if (isset($map['sign_product_merchant_list'])) {
            if (!empty($map['sign_product_merchant_list'])) {
                $model->signProductMerchantList = [];
                $n                              = 0;
                foreach ($map['sign_product_merchant_list'] as $item) {
                    $model->signProductMerchantList[$n++] = null !== $item ? SignProductMerchant::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign_product_merchant_count'])) {
            $model->signProductMerchantCount = $map['sign_product_merchant_count'];
        }
        if (isset($map['apply_product_merchant_list'])) {
            if (!empty($map['apply_product_merchant_list'])) {
                $model->applyProductMerchantList = [];
                $n                               = 0;
                foreach ($map['apply_product_merchant_list'] as $item) {
                    $model->applyProductMerchantList[$n++] = null !== $item ? SignProductMerchant::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['apply_product_merchant_count'])) {
            $model->applyProductMerchantCount = $map['apply_product_merchant_count'];
        }
        if (isset($map['display_status'])) {
            $model->displayStatus = $map['display_status'];
        }
        if (isset($map['delivery_mode'])) {
            $model->deliveryMode = $map['delivery_mode'];
        }

        return $model;
    }
}

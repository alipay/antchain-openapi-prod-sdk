<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class WxStockData extends Model
{
    // 【批次号】 微信为每个代金券批次分配的唯一id。
    /**
     * @example 9836588
     *
     * @var string
     */
    public $stockId;

    // 【批次创建方商户号】 微信为创建方商户分配的商户号
    /**
     * @example 123456
     *
     * @var string
     */
    public $stockCreatorMchid;

    // 【批次名称】 批次名称
    /**
     * @example 微信支付批次
     *
     * @var string
     */
    public $stockName;

    // 【批次状态】 批次状态，枚举值：
    // unactivated：未激活
    // audit：审核中
    // running：运行中
    // stoped：已停止
    // paused：暂停发放
    /**
     * @example paused
     *
     * @var string
     */
    public $status;

    // 【创建时间】 批次创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
    /**
     * @example 2015-05-20T13:29:35.120+08:00
     *
     * @var string
     */
    public $createTime;

    // 【使用说明】 批次描述信息
    /**
     * @example 微信支付营销
     *
     * @var string
     */
    public $description;

    // 【满减券/消费金批次使用规则】 满减券或消费金批次特定信息。
    /**
     * @example {         "max_coupons" : 100,         "max_amount" : 5000,         "max_amount_by_day" : 400,         "fixed_normal_coupon" : {           "coupon_amount" : 100,           "transaction_minimum" : 100         }
     *
     * @var StockUseRule
     */
    public $stockUseRule;

    // 【可用开始时间】 可用开始时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
    /**
     * @example 2015-05-20T13:29:35.120+08:00
     *
     * @var string
     */
    public $availableBeginTime;

    // 【可用结束时间】 可用结束时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
    /**
     * @example 2015-05-20T13:29:35.120+08:00
     *
     * @var string
     */
    public $availableEndTime;

    // 【已发券或消费金数量】 已发券或消费金数量
    /**
     * @example 100
     *
     * @var int
     */
    public $distributedCoupons;

    // 【是否无资金流】 是否无资金流。枚举值：
    // true：是
    // false：否
    /**
     * @example true
     *
     * @var bool
     */
    public $noCash;

    // 【激活批次的时间】 批次激活开启时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
    /**
     * @example 2015-05-20T13:29:35.120+08:00
     *
     * @var string
     */
    public $startTime;

    // 【终止批次的时间】 批次永久停止时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
    /**
     * @example 2015-05-20T13:29:35.120+08:00
     *
     * @var string
     */
    public $stopTime;

    // 【减至批次特定信息】 单品优惠特定信息
    /**
     * @example {         "single_price_max" : 100,         "cut_to_price" : 80       }
     *
     * @var CutToMessage
     */
    public $cutToMessage;

    // 【是否单品优惠】 枚举值：
    // true：是
    // false：否
    /**
     * @example true
     *
     * @var bool
     */
    public $singleitem;

    // 【批次类型】 批次类型
    // 枚举值：
    // NORMAL：代金券批次
    // DISCOUNT_CUT：立减与折扣
    // OTHER：其他
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $stockType;

    // 【卡包ID】 微信卡包ID
    /**
     * @example pX2-vjoeC94Nn-r2g5GjDwkfFH7E
     *
     * @var string
     */
    public $cardId;

    // 【业务类型】 细分业务类型，仅有当business_type=MULTIUSE时，才会返回，枚举值：
    // MULTIUSE：消费金
    // 可选取值
    // MULTIUSE:  消费金类型
    /**
     * @example MULTIUSE
     *
     * @var string
     */
    public $businessType;

    // 消费金可用地域列表，仅有当business_type=MULTIUSE时，才会返回
    /**
     * @example [         {           "type" : "PROVINCE",           "province" : "广东省",           "city" : "深圳市",           "district" : "南山区",           "country" : "中国大陆"         }       ]
     *
     * @var AvailableRegion[]
     */
    public $availableRegionList;

    // 【消费金可用行业】 消费金可用行业列表，仅有当business_type=MULTIUSE时，才会返回
    /**
     * @example [         "餐饮"       ]
     *
     * @var string[]
     */
    public $availableIndustryList;
    protected $_name = [
        'stockId'               => 'stock_id',
        'stockCreatorMchid'     => 'stock_creator_mchid',
        'stockName'             => 'stock_name',
        'status'                => 'status',
        'createTime'            => 'create_time',
        'description'           => 'description',
        'stockUseRule'          => 'stock_use_rule',
        'availableBeginTime'    => 'available_begin_time',
        'availableEndTime'      => 'available_end_time',
        'distributedCoupons'    => 'distributed_coupons',
        'noCash'                => 'no_cash',
        'startTime'             => 'start_time',
        'stopTime'              => 'stop_time',
        'cutToMessage'          => 'cut_to_message',
        'singleitem'            => 'singleitem',
        'stockType'             => 'stock_type',
        'cardId'                => 'card_id',
        'businessType'          => 'business_type',
        'availableRegionList'   => 'available_region_list',
        'availableIndustryList' => 'available_industry_list',
    ];

    public function validate()
    {
        Model::validateRequired('stockId', $this->stockId, true);
        Model::validateRequired('stockCreatorMchid', $this->stockCreatorMchid, true);
        Model::validateRequired('stockName', $this->stockName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('availableBeginTime', $this->availableBeginTime, true);
        Model::validateRequired('availableEndTime', $this->availableEndTime, true);
        Model::validateRequired('distributedCoupons', $this->distributedCoupons, true);
        Model::validateRequired('noCash', $this->noCash, true);
        Model::validateRequired('singleitem', $this->singleitem, true);
        Model::validateRequired('stockType', $this->stockType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->stockId) {
            $res['stock_id'] = $this->stockId;
        }
        if (null !== $this->stockCreatorMchid) {
            $res['stock_creator_mchid'] = $this->stockCreatorMchid;
        }
        if (null !== $this->stockName) {
            $res['stock_name'] = $this->stockName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->stockUseRule) {
            $res['stock_use_rule'] = null !== $this->stockUseRule ? $this->stockUseRule->toMap() : null;
        }
        if (null !== $this->availableBeginTime) {
            $res['available_begin_time'] = $this->availableBeginTime;
        }
        if (null !== $this->availableEndTime) {
            $res['available_end_time'] = $this->availableEndTime;
        }
        if (null !== $this->distributedCoupons) {
            $res['distributed_coupons'] = $this->distributedCoupons;
        }
        if (null !== $this->noCash) {
            $res['no_cash'] = $this->noCash;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->stopTime) {
            $res['stop_time'] = $this->stopTime;
        }
        if (null !== $this->cutToMessage) {
            $res['cut_to_message'] = null !== $this->cutToMessage ? $this->cutToMessage->toMap() : null;
        }
        if (null !== $this->singleitem) {
            $res['singleitem'] = $this->singleitem;
        }
        if (null !== $this->stockType) {
            $res['stock_type'] = $this->stockType;
        }
        if (null !== $this->cardId) {
            $res['card_id'] = $this->cardId;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }
        if (null !== $this->availableRegionList) {
            $res['available_region_list'] = [];
            if (null !== $this->availableRegionList && \is_array($this->availableRegionList)) {
                $n = 0;
                foreach ($this->availableRegionList as $item) {
                    $res['available_region_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->availableIndustryList) {
            $res['available_industry_list'] = $this->availableIndustryList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WxStockData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['stock_id'])) {
            $model->stockId = $map['stock_id'];
        }
        if (isset($map['stock_creator_mchid'])) {
            $model->stockCreatorMchid = $map['stock_creator_mchid'];
        }
        if (isset($map['stock_name'])) {
            $model->stockName = $map['stock_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['stock_use_rule'])) {
            $model->stockUseRule = StockUseRule::fromMap($map['stock_use_rule']);
        }
        if (isset($map['available_begin_time'])) {
            $model->availableBeginTime = $map['available_begin_time'];
        }
        if (isset($map['available_end_time'])) {
            $model->availableEndTime = $map['available_end_time'];
        }
        if (isset($map['distributed_coupons'])) {
            $model->distributedCoupons = $map['distributed_coupons'];
        }
        if (isset($map['no_cash'])) {
            $model->noCash = $map['no_cash'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['stop_time'])) {
            $model->stopTime = $map['stop_time'];
        }
        if (isset($map['cut_to_message'])) {
            $model->cutToMessage = CutToMessage::fromMap($map['cut_to_message']);
        }
        if (isset($map['singleitem'])) {
            $model->singleitem = $map['singleitem'];
        }
        if (isset($map['stock_type'])) {
            $model->stockType = $map['stock_type'];
        }
        if (isset($map['card_id'])) {
            $model->cardId = $map['card_id'];
        }
        if (isset($map['business_type'])) {
            $model->businessType = $map['business_type'];
        }
        if (isset($map['available_region_list'])) {
            if (!empty($map['available_region_list'])) {
                $model->availableRegionList = [];
                $n                          = 0;
                foreach ($map['available_region_list'] as $item) {
                    $model->availableRegionList[$n++] = null !== $item ? AvailableRegion::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['available_industry_list'])) {
            if (!empty($map['available_industry_list'])) {
                $model->availableIndustryList = $map['available_industry_list'];
            }
        }

        return $model;
    }
}

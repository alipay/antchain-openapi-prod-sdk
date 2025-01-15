<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class Coupon extends Model
{
    // 优惠券ID
    /**
     * @example 1231313
     *
     * @var int
     */
    public $id;

    // 优惠券名称,前端展示
    /**
     * @example XX优惠券
     *
     * @var string
     */
    public $displayName;

    // 优惠券模板名称
    /**
     * @example XXXX
     *
     * @var string
     */
    public $name;

    // 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
    /**
     * @example VOUCHER
     *
     * @var string
     */
    public $type;

    // 优惠券总金额，单位（分）。可使用优惠金额为amount-used_amount
    /**
     * @example 10000
     *
     * @var string
     */
    public $amount;

    // 已使用金额，单位（分）。
    /**
     * @example 10000
     *
     * @var string
     */
    public $usedAmount;

    // 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
    /**
     * @example AVAILABLE
     *
     * @var string
     */
    public $status;

    // 有效期开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 有效期结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 模板id
    /**
     * @example 111
     *
     * @var int
     */
    public $youhuiTemplateId;

    // 优惠券=折扣券时使用，如0.75
    /**
     * @example 0.75
     *
     * @var string
     */
    public $discountRate;

    // 优惠券类型=满减券时使用，如满2000元
    /**
     * @example 2000.00
     *
     * @var string
     */
    public $fullAmount;

    // 可以使用的总次数
    /**
     * @example 5
     *
     * @var int
     */
    public $usageCount;

    // 已使用次数（冻结次数）
    /**
     * @example 5
     *
     * @var int
     */
    public $usedCount;

    // 适用产品：通用/ECS/RDS
    /**
     * @example 通用
     *
     * @var string
     */
    public $productList;

    // 适用订单类型
    /**
     * @example BUY
     *
     * @var string
     */
    public $orderTypeList;

    // 币种CurrencyCode CNY 代表人民币 USD代表美元
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;

    // 高精度总金额，单位元。可用金额 high_precision_available_amount = 总金额 high_precision_amount - 已使用金额 high_precision_used_amount
    /**
     * @example 100.00
     *
     * @var string
     */
    public $highPrecisionAmount;

    // 单位元
    /**
     * @example 0.001
     *
     * @var string
     */
    public $highPrecisionUsedAmount;

    // 单位元
    /**
     * @example 100.001
     *
     * @var string
     */
    public $highPrecisionAvailableAmount;
    protected $_name = [
        'id'                           => 'id',
        'displayName'                  => 'display_name',
        'name'                         => 'name',
        'type'                         => 'type',
        'amount'                       => 'amount',
        'usedAmount'                   => 'used_amount',
        'status'                       => 'status',
        'startTime'                    => 'start_time',
        'endTime'                      => 'end_time',
        'youhuiTemplateId'             => 'youhui_template_id',
        'discountRate'                 => 'discount_rate',
        'fullAmount'                   => 'full_amount',
        'usageCount'                   => 'usage_count',
        'usedCount'                    => 'used_count',
        'productList'                  => 'product_list',
        'orderTypeList'                => 'order_type_list',
        'currency'                     => 'currency',
        'highPrecisionAmount'          => 'high_precision_amount',
        'highPrecisionUsedAmount'      => 'high_precision_used_amount',
        'highPrecisionAvailableAmount' => 'high_precision_available_amount',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('youhuiTemplateId', $this->youhuiTemplateId, true);
        Model::validateRequired('usageCount', $this->usageCount, true);
        Model::validateRequired('usedCount', $this->usedCount, true);
        Model::validateRequired('productList', $this->productList, true);
        Model::validateRequired('orderTypeList', $this->orderTypeList, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('highPrecisionAmount', $this->highPrecisionAmount, true);
        Model::validateRequired('highPrecisionUsedAmount', $this->highPrecisionUsedAmount, true);
        Model::validateRequired('highPrecisionAvailableAmount', $this->highPrecisionAvailableAmount, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->usedAmount) {
            $res['used_amount'] = $this->usedAmount;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->youhuiTemplateId) {
            $res['youhui_template_id'] = $this->youhuiTemplateId;
        }
        if (null !== $this->discountRate) {
            $res['discount_rate'] = $this->discountRate;
        }
        if (null !== $this->fullAmount) {
            $res['full_amount'] = $this->fullAmount;
        }
        if (null !== $this->usageCount) {
            $res['usage_count'] = $this->usageCount;
        }
        if (null !== $this->usedCount) {
            $res['used_count'] = $this->usedCount;
        }
        if (null !== $this->productList) {
            $res['product_list'] = $this->productList;
        }
        if (null !== $this->orderTypeList) {
            $res['order_type_list'] = $this->orderTypeList;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->highPrecisionAmount) {
            $res['high_precision_amount'] = $this->highPrecisionAmount;
        }
        if (null !== $this->highPrecisionUsedAmount) {
            $res['high_precision_used_amount'] = $this->highPrecisionUsedAmount;
        }
        if (null !== $this->highPrecisionAvailableAmount) {
            $res['high_precision_available_amount'] = $this->highPrecisionAvailableAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Coupon
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['used_amount'])) {
            $model->usedAmount = $map['used_amount'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['youhui_template_id'])) {
            $model->youhuiTemplateId = $map['youhui_template_id'];
        }
        if (isset($map['discount_rate'])) {
            $model->discountRate = $map['discount_rate'];
        }
        if (isset($map['full_amount'])) {
            $model->fullAmount = $map['full_amount'];
        }
        if (isset($map['usage_count'])) {
            $model->usageCount = $map['usage_count'];
        }
        if (isset($map['used_count'])) {
            $model->usedCount = $map['used_count'];
        }
        if (isset($map['product_list'])) {
            $model->productList = $map['product_list'];
        }
        if (isset($map['order_type_list'])) {
            $model->orderTypeList = $map['order_type_list'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['high_precision_amount'])) {
            $model->highPrecisionAmount = $map['high_precision_amount'];
        }
        if (isset($map['high_precision_used_amount'])) {
            $model->highPrecisionUsedAmount = $map['high_precision_used_amount'];
        }
        if (isset($map['high_precision_available_amount'])) {
            $model->highPrecisionAvailableAmount = $map['high_precision_available_amount'];
        }

        return $model;
    }
}

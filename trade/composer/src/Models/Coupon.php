<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class Coupon extends Model
{
    // 优惠券ID
    //
    /**
     * @example 1231313
     *
     * @var int
     */
    public $id;

    // 优惠券名称,前端展示
    //
    /**
     * @example XX优惠券
     *
     * @var string
     */
    public $displayName;

    // 优惠券模板名称
    //
    /**
     * @example XXXX
     *
     * @var string
     */
    public $name;

    // 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
    //
    /**
     * @example VOUCHER
     *
     * @var string
     */
    public $type;

    // 优惠券金额，单位（分）
    //
    /**
     * @example 10000
     *
     * @var string
     */
    public $amountInCent;

    // 已使用金额，单位(分）
    //
    /**
     * @example 10000
     *
     * @var string
     */
    public $usedAmountInCent;

    // 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
    //
    /**
     * @example AVAILABLE
     *
     * @var string
     */
    public $status;

    // 有效期开始时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 有效期结束时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 模板id
    //
    /**
     * @example 1111
     *
     * @var int
     */
    public $youhuiTemplateId;

    // 优惠券=折扣券时使用，如0.75
    //
    /**
     * @example 0.75
     *
     * @var string
     */
    public $discountRate;

    // 优惠券类型=满减券时使用，如满200000分
    //
    /**
     * @example 200000
     *
     * @var string
     */
    public $fullAmountInCent;

    // 可以使用的总次数
    //
    /**
     * @example 5
     *
     * @var int
     */
    public $usageCount;

    // 已使用次数（冻结次数）
    //
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
    //
    /**
     * @example BUY
     *
     * @var string
     */
    public $orderTypeList;
    protected $_name = [
        'id'               => 'id',
        'displayName'      => 'display_name',
        'name'             => 'name',
        'type'             => 'type',
        'amountInCent'     => 'amount_in_cent',
        'usedAmountInCent' => 'used_amount_in_cent',
        'status'           => 'status',
        'startTime'        => 'start_time',
        'endTime'          => 'end_time',
        'youhuiTemplateId' => 'youhui_template_id',
        'discountRate'     => 'discount_rate',
        'fullAmountInCent' => 'full_amount_in_cent',
        'usageCount'       => 'usage_count',
        'usedCount'        => 'used_count',
        'productList'      => 'product_list',
        'orderTypeList'    => 'order_type_list',
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
        if (null !== $this->amountInCent) {
            $res['amount_in_cent'] = $this->amountInCent;
        }
        if (null !== $this->usedAmountInCent) {
            $res['used_amount_in_cent'] = $this->usedAmountInCent;
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
        if (null !== $this->fullAmountInCent) {
            $res['full_amount_in_cent'] = $this->fullAmountInCent;
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
        if (isset($map['amount_in_cent'])) {
            $model->amountInCent = $map['amount_in_cent'];
        }
        if (isset($map['used_amount_in_cent'])) {
            $model->usedAmountInCent = $map['used_amount_in_cent'];
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
        if (isset($map['full_amount_in_cent'])) {
            $model->fullAmountInCent = $map['full_amount_in_cent'];
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

        return $model;
    }
}

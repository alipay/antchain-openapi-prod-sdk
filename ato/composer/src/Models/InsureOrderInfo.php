<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class InsureOrderInfo extends Model
{
    // 商家订单ID
    /**
     * @example F20240531174508229522
     *
     * @var string
     */
    public $orderId;

    // 投保编号（承保id）
    /**
     * @example T20240531174508229522
     *
     * @var string
     */
    public $insureId;

    // 商品名称
    /**
     * @example 华为meta60
     *
     * @var string
     */
    public $productName;

    // 保险开始时间
    /**
     * @example 2024-09-24 20:04:35
     *
     * @var string
     */
    public $insureStartTime;

    // 保险终止时间
    /**
     * @example 2024-09-24 20:04:35
     *
     * @var string
     */
    public $insureEndTime;

    // 投保金额（保额），单位分 100代表1元
    /**
     * @example 100
     *
     * @var int
     */
    public $insureAmount;

    // 投保费用（保费），单位分 100代表1元
    /**
     * @example 100
     *
     * @var int
     */
    public $insurePremium;

    // 投保状态枚举
    /**
     * @example INSURE_SUCC
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'orderId'         => 'order_id',
        'insureId'        => 'insure_id',
        'productName'     => 'product_name',
        'insureStartTime' => 'insure_start_time',
        'insureEndTime'   => 'insure_end_time',
        'insureAmount'    => 'insure_amount',
        'insurePremium'   => 'insure_premium',
        'status'          => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->insureId) {
            $res['insure_id'] = $this->insureId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->insureStartTime) {
            $res['insure_start_time'] = $this->insureStartTime;
        }
        if (null !== $this->insureEndTime) {
            $res['insure_end_time'] = $this->insureEndTime;
        }
        if (null !== $this->insureAmount) {
            $res['insure_amount'] = $this->insureAmount;
        }
        if (null !== $this->insurePremium) {
            $res['insure_premium'] = $this->insurePremium;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsureOrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['insure_id'])) {
            $model->insureId = $map['insure_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['insure_start_time'])) {
            $model->insureStartTime = $map['insure_start_time'];
        }
        if (isset($map['insure_end_time'])) {
            $model->insureEndTime = $map['insure_end_time'];
        }
        if (isset($map['insure_amount'])) {
            $model->insureAmount = $map['insure_amount'];
        }
        if (isset($map['insure_premium'])) {
            $model->insurePremium = $map['insure_premium'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}

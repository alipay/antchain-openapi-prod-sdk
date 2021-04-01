<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecMypointsPreorderskuResponse extends Model
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

    // 数量
    /**
     * @var int
     */
    public $count;

    // 业务幂等ID
    /**
     * @var string
     */
    public $orderNo;

    // 预下单Id
    /**
     * @var string
     */
    public $preOrderId;

    // 商品ID
    /**
     * @var string
     */
    public $skuId;

    // 总集分宝数量(单位:个)
    /**
     * @var int
     */
    public $totalAmount;

    // 总费用
    /**
     * @var string
     */
    public $totalCost;

    // 是否需要重试
    /**
     * @var bool
     */
    public $needRetry;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'count'       => 'count',
        'orderNo'     => 'order_no',
        'preOrderId'  => 'pre_order_id',
        'skuId'       => 'sku_id',
        'totalAmount' => 'total_amount',
        'totalCost'   => 'total_cost',
        'needRetry'   => 'need_retry',
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
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->preOrderId) {
            $res['pre_order_id'] = $this->preOrderId;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->totalCost) {
            $res['total_cost'] = $this->totalCost;
        }
        if (null !== $this->needRetry) {
            $res['need_retry'] = $this->needRetry;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecMypointsPreorderskuResponse
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
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['pre_order_id'])) {
            $model->preOrderId = $map['pre_order_id'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['total_cost'])) {
            $model->totalCost = $map['total_cost'];
        }
        if (isset($map['need_retry'])) {
            $model->needRetry = $map['need_retry'];
        }

        return $model;
    }
}

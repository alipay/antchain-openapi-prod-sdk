<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInsureResponse extends Model
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

    // 商户的订单号
    /**
     * @var string
     */
    public $orderId;

    // 保单号
    /**
     * @var string
     */
    public $insureId;

    // 保险订单状态。TOBE_INSURE：待发起投保 ；INSUR_PRE_SUCC：投保成功。WITHHOLD_DEDUCTING：代扣中；WITHHOLD_SUCC：代扣成功。WITHHOLD_FAIL：代扣失败。INSUR_SUCC：承保成功
    /**
     * @var string
     */
    public $status;

    // 商品名称
    /**
     * @var string
     */
    public $productName;

    // 2024-09-24 20:04:35
    /**
     * @var string
     */
    public $insureStartTime;

    // 2024-12-24 20:04:35
    /**
     * @var string
     */
    public $insureEndTime;

    // 投保金额（保额），单位分。100代表1元
    /**
     * @var string
     */
    public $insureAmount;

    // 投保费用（保费），单位分。100代表1元
    /**
     * @var string
     */
    public $insurePremium;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'orderId'         => 'order_id',
        'insureId'        => 'insure_id',
        'status'          => 'status',
        'productName'     => 'product_name',
        'insureStartTime' => 'insure_start_time',
        'insureEndTime'   => 'insure_end_time',
        'insureAmount'    => 'insure_amount',
        'insurePremium'   => 'insure_premium',
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->insureId) {
            $res['insure_id'] = $this->insureId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsureResponse
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['insure_id'])) {
            $model->insureId = $map['insure_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
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

        return $model;
    }
}

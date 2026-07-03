<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgePetitemResponse extends Model
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

    // 小程序客户号
    /**
     * @var string
     */
    public $openId;

    // 子渠道号(唯一标识)
    /**
     * @var string
     */
    public $trafficPlatform;

    // 门店ID
    /**
     * @var string
     */
    public $storeId;

    // 分期订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 活体已打款金额
    /**
     * @var string
     */
    public $petAmount;

    // 分期服务费(贴息金额)
    /**
     * @var string
     */
    public $serviceAmount;

    // 用户已还本金
    /**
     * @var string
     */
    public $repaidAmount;

    // 应还本金
    /**
     * @var string
     */
    public $dueAmount;

    // 应还罚息
    /**
     * @var string
     */
    public $duePenaltyAmount;

    // 可退还资方金额
    /**
     * @var string
     */
    public $refundFundAmount;

    // 渠道号
    /**
     * @var string
     */
    public $channelCode;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'openId'           => 'open_id',
        'trafficPlatform'  => 'traffic_platform',
        'storeId'          => 'store_id',
        'bizOrderNo'       => 'biz_order_no',
        'petAmount'        => 'pet_amount',
        'serviceAmount'    => 'service_amount',
        'repaidAmount'     => 'repaid_amount',
        'dueAmount'        => 'due_amount',
        'duePenaltyAmount' => 'due_penalty_amount',
        'refundFundAmount' => 'refund_fund_amount',
        'channelCode'      => 'channel_code',
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
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->petAmount) {
            $res['pet_amount'] = $this->petAmount;
        }
        if (null !== $this->serviceAmount) {
            $res['service_amount'] = $this->serviceAmount;
        }
        if (null !== $this->repaidAmount) {
            $res['repaid_amount'] = $this->repaidAmount;
        }
        if (null !== $this->dueAmount) {
            $res['due_amount'] = $this->dueAmount;
        }
        if (null !== $this->duePenaltyAmount) {
            $res['due_penalty_amount'] = $this->duePenaltyAmount;
        }
        if (null !== $this->refundFundAmount) {
            $res['refund_fund_amount'] = $this->refundFundAmount;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgePetitemResponse
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
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['traffic_platform'])) {
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['pet_amount'])) {
            $model->petAmount = $map['pet_amount'];
        }
        if (isset($map['service_amount'])) {
            $model->serviceAmount = $map['service_amount'];
        }
        if (isset($map['repaid_amount'])) {
            $model->repaidAmount = $map['repaid_amount'];
        }
        if (isset($map['due_amount'])) {
            $model->dueAmount = $map['due_amount'];
        }
        if (isset($map['due_penalty_amount'])) {
            $model->duePenaltyAmount = $map['due_penalty_amount'];
        }
        if (isset($map['refund_fund_amount'])) {
            $model->refundFundAmount = $map['refund_fund_amount'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }

        return $model;
    }
}

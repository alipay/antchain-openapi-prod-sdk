<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgePetitemResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'openId' => 'open_id',
        'trafficPlatform' => 'traffic_platform',
        'storeId' => 'store_id',
        'bizOrderNo' => 'biz_order_no',
        'channelCode' => 'channel_code',
        'consumedAmount' => 'consumed_amount',
        'mallConsumeSettleAmount' => 'mall_consume_settle_amount',
        'mallConsumeUnsettleAmount' => 'mall_consume_unsettle_amount',
        'repaidAmount' => 'repaid_amount',
        'remainingAmount' => 'remaining_amount',
        'refundUserAmount' => 'refund_user_amount',
        'overdue' => 'overdue',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->consumedAmount) {
            $res['consumed_amount'] = $this->consumedAmount;
        }
        if (null !== $this->mallConsumeSettleAmount) {
            $res['mall_consume_settle_amount'] = $this->mallConsumeSettleAmount;
        }
        if (null !== $this->mallConsumeUnsettleAmount) {
            $res['mall_consume_unsettle_amount'] = $this->mallConsumeUnsettleAmount;
        }
        if (null !== $this->repaidAmount) {
            $res['repaid_amount'] = $this->repaidAmount;
        }
        if (null !== $this->remainingAmount) {
            $res['remaining_amount'] = $this->remainingAmount;
        }
        if (null !== $this->refundUserAmount) {
            $res['refund_user_amount'] = $this->refundUserAmount;
        }
        if (null !== $this->overdue) {
            $res['overdue'] = $this->overdue;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDubbridgePetitemResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['traffic_platform'])){
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if(isset($map['store_id'])){
            $model->storeId = $map['store_id'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['channel_code'])){
            $model->channelCode = $map['channel_code'];
        }
        if(isset($map['consumed_amount'])){
            $model->consumedAmount = $map['consumed_amount'];
        }
        if(isset($map['mall_consume_settle_amount'])){
            $model->mallConsumeSettleAmount = $map['mall_consume_settle_amount'];
        }
        if(isset($map['mall_consume_unsettle_amount'])){
            $model->mallConsumeUnsettleAmount = $map['mall_consume_unsettle_amount'];
        }
        if(isset($map['repaid_amount'])){
            $model->repaidAmount = $map['repaid_amount'];
        }
        if(isset($map['remaining_amount'])){
            $model->remainingAmount = $map['remaining_amount'];
        }
        if(isset($map['refund_user_amount'])){
            $model->refundUserAmount = $map['refund_user_amount'];
        }
        if(isset($map['overdue'])){
            $model->overdue = $map['overdue'];
        }
        return $model;
    }
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

    // 渠道code
    /**
     * @var string
     */
    public $channelCode;

    // 用户已支出金额
    /**
     * @var string
     */
    public $consumedAmount;

    // 商城消费结算金额
    /**
     * @var string
     */
    public $mallConsumeSettleAmount;

    // 商城消费在途未结算金额
    /**
     * @var string
     */
    public $mallConsumeUnsettleAmount;

    // 已还金额
    /**
     * @var string
     */
    public $repaidAmount;

    // 解约后剩余应还金额
    /**
     * @var string
     */
    public $remainingAmount;

    // 解约后退还给用户的金额
    /**
     * @var string
     */
    public $refundUserAmount;

    // 是否逾期(默认false)
    /**
     * @var bool
     */
    public $overdue;

}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class CallbackOrderSettlementRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // ASYNC_SETTLE_RESULT ：异步分账结果
    /**
     * @var string
     */
    public $msgType;

    // 支付交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 分账金额，单位分
    /**
     * @var int
     */
    public $splitAmount;

    // 分账受理单号
    /**
     * @var string
     */
    public $settleNo;

    // 分账受理时间
    /**
     * @var string
     */
    public $splitRequestTime;

    // 分账通知明细
    /**
     * @var SettleOrderRoyaltyDetail[]
     */
    public $splitDetailList;

    // 扩展参数
    /**
     * @var string
     */
    public $extInfo;

    // 消息唯一性判断，重试msgId不变
    /**
     * @var string
     */
    public $msgId;

    // 外部订单号(同一个outProductId唯一)
    /**
     * @var string
     */
    public $outOrderNo;

    // 分账状态，SUCCESS成功，FAIL失败
    /**
     * @var string
     */
    public $splitStatus;

    // 分账失败原因，条件返回：splitStatus=FAIL 返回
    /**
     * @var string
     */
    public $splitFailReason;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'msgType'           => 'msg_type',
        'tradeNo'           => 'trade_no',
        'splitAmount'       => 'split_amount',
        'settleNo'          => 'settle_no',
        'splitRequestTime'  => 'split_request_time',
        'splitDetailList'   => 'split_detail_list',
        'extInfo'           => 'ext_info',
        'msgId'             => 'msg_id',
        'outOrderNo'        => 'out_order_no',
        'splitStatus'       => 'split_status',
        'splitFailReason'   => 'split_fail_reason',
    ];

    public function validate()
    {
        Model::validateRequired('msgType', $this->msgType, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('splitAmount', $this->splitAmount, true);
        Model::validateRequired('settleNo', $this->settleNo, true);
        Model::validateRequired('splitRequestTime', $this->splitRequestTime, true);
        Model::validateRequired('splitDetailList', $this->splitDetailList, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('splitStatus', $this->splitStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->msgType) {
            $res['msg_type'] = $this->msgType;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->splitAmount) {
            $res['split_amount'] = $this->splitAmount;
        }
        if (null !== $this->settleNo) {
            $res['settle_no'] = $this->settleNo;
        }
        if (null !== $this->splitRequestTime) {
            $res['split_request_time'] = $this->splitRequestTime;
        }
        if (null !== $this->splitDetailList) {
            $res['split_detail_list'] = [];
            if (null !== $this->splitDetailList && \is_array($this->splitDetailList)) {
                $n = 0;
                foreach ($this->splitDetailList as $item) {
                    $res['split_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->splitStatus) {
            $res['split_status'] = $this->splitStatus;
        }
        if (null !== $this->splitFailReason) {
            $res['split_fail_reason'] = $this->splitFailReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackOrderSettlementRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['msg_type'])) {
            $model->msgType = $map['msg_type'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['split_amount'])) {
            $model->splitAmount = $map['split_amount'];
        }
        if (isset($map['settle_no'])) {
            $model->settleNo = $map['settle_no'];
        }
        if (isset($map['split_request_time'])) {
            $model->splitRequestTime = $map['split_request_time'];
        }
        if (isset($map['split_detail_list'])) {
            if (!empty($map['split_detail_list'])) {
                $model->splitDetailList = [];
                $n                      = 0;
                foreach ($map['split_detail_list'] as $item) {
                    $model->splitDetailList[$n++] = null !== $item ? SettleOrderRoyaltyDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['split_status'])) {
            $model->splitStatus = $map['split_status'];
        }
        if (isset($map['split_fail_reason'])) {
            $model->splitFailReason = $map['split_fail_reason'];
        }

        return $model;
    }
}

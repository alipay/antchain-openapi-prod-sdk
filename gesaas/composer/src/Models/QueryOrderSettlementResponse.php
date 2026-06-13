<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryOrderSettlementResponse extends Model
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

    // 分账受理时间，格式为yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $splitRequestTime;

    // 分账明细
    /**
     * @var SettleOrderRoyaltyDetail[]
     */
    public $splitDetailList;

    // 支付宝 平台订单号
    /**
     * @var string
     */
    public $tradeNo;

    // 外部订单号(商家)
    /**
     * @var string
     */
    public $outOrderNo;

    // 分账状态，SUCCESS成功，FAIL失败，PROCESSING处理中
    /**
     * @var string
     */
    public $splitStatus;

    // 分账失败原因
    /**
     * @var string
     */
    public $splitFailReason;

    // 分账单号
    /**
     * @var string
     */
    public $settleNo;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'splitRequestTime' => 'split_request_time',
        'splitDetailList'  => 'split_detail_list',
        'tradeNo'          => 'trade_no',
        'outOrderNo'       => 'out_order_no',
        'splitStatus'      => 'split_status',
        'splitFailReason'  => 'split_fail_reason',
        'settleNo'         => 'settle_no',
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
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
        if (null !== $this->settleNo) {
            $res['settle_no'] = $this->settleNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOrderSettlementResponse
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
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
        if (isset($map['settle_no'])) {
            $model->settleNo = $map['settle_no'];
        }

        return $model;
    }
}

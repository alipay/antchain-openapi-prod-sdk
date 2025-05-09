<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class TransferTradeFinanceResponse extends Model
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

    // order_id
    /**
     * @var string
     */
    public $orderId;

    // merchant_id
    /**
     * @var string
     */
    public $merchantId;

    // jsonArray.toString
    /**
     * @var string
     */
    public $fundCandidates;

    // 转融资结果
    /**
     * @var string
     */
    public $transferResult;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'orderId'        => 'order_id',
        'merchantId'     => 'merchant_id',
        'fundCandidates' => 'fund_candidates',
        'transferResult' => 'transfer_result',
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundCandidates) {
            $res['fund_candidates'] = $this->fundCandidates;
        }
        if (null !== $this->transferResult) {
            $res['transfer_result'] = $this->transferResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransferTradeFinanceResponse
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_candidates'])) {
            $model->fundCandidates = $map['fund_candidates'];
        }
        if (isset($map['transfer_result'])) {
            $model->transferResult = $map['transfer_result'];
        }

        return $model;
    }
}

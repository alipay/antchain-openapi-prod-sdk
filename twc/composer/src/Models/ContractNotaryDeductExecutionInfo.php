<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotaryDeductExecutionInfo extends Model
{
    // 付款方的区块链合同签署账号
    /**
     * @example someId
     *
     * @var string
     */
    public $payerId;

    // 扣款金额，单位分
    /**
     * @example 100
     *
     * @var int
     */
    public $amount;

    // 扣款渠道
    /**
     * @example channel
     *
     * @var string
     */
    public $channel;

    // 扣款操作是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $result;

    // 扣款操作发起时间
    /**
     * @example 1589198173000
     *
     * @var string
     */
    public $timestamp;

    // 代扣订单号
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269_1
     *
     * @var string
     */
    public $order;
    protected $_name = [
        'payerId'   => 'payer_id',
        'amount'    => 'amount',
        'channel'   => 'channel',
        'result'    => 'result',
        'timestamp' => 'timestamp',
        'order'     => 'order',
    ];

    public function validate()
    {
        Model::validateRequired('payerId', $this->payerId, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('order', $this->order, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payerId) {
            $res['payer_id'] = $this->payerId;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractNotaryDeductExecutionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['payer_id'])) {
            $model->payerId = $map['payer_id'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }

        return $model;
    }
}

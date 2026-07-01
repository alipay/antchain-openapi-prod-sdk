<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractStatusResponse extends Model
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

    // 交易hash
    /**
     * @var string
     */
    public $txHash;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 合约执行结果，Base64编码后的
    /**
     * @var string
     */
    public $contentBase64;

    // 块高
    /**
     * @var int
     */
    public $blockNumber;

    // 消耗gas量
    /**
     * @var int
     */
    public $gasUsed;

    // log信息
    /**
     * @var string
     */
    public $logBase64;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'txHash'        => 'tx_hash',
        'orderId'       => 'order_id',
        'contentBase64' => 'content_base64',
        'blockNumber'   => 'block_number',
        'gasUsed'       => 'gas_used',
        'logBase64'     => 'log_base64',
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
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->contentBase64) {
            $res['content_base64'] = $this->contentBase64;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->gasUsed) {
            $res['gas_used'] = $this->gasUsed;
        }
        if (null !== $this->logBase64) {
            $res['log_base64'] = $this->logBase64;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractStatusResponse
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
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['content_base64'])) {
            $model->contentBase64 = $map['content_base64'];
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['gas_used'])) {
            $model->gasUsed = $map['gas_used'];
        }
        if (isset($map['log_base64'])) {
            $model->logBase64 = $map['log_base64'];
        }

        return $model;
    }
}

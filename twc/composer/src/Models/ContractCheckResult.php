<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractCheckResult extends Model
{
    // 交易hash
    /**
     * @example 12345678
     *
     * @var string
     */
    public $txHash;

    // 订单id
    /**
     * @example 12345678
     *
     * @var string
     */
    public $orderId;

    // 合约执行结果，Base64编码后的
    /**
     * @example afafafdfa
     *
     * @var string
     */
    public $contentBase64;

    // 块高
    /**
     * @example 12345678
     *
     * @var int
     */
    public $blockNumber;

    // 消耗gas量
    /**
     * @example 12345678
     *
     * @var int
     */
    public $gasUsed;

    // log信息
    /**
     * @example adafada
     *
     * @var string
     */
    public $logBase64;
    protected $_name = [
        'txHash'        => 'tx_hash',
        'orderId'       => 'order_id',
        'contentBase64' => 'content_base64',
        'blockNumber'   => 'block_number',
        'gasUsed'       => 'gas_used',
        'logBase64'     => 'log_base64',
    ];

    public function validate()
    {
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('orderId', $this->orderId, true);
    }

    public function toMap()
    {
        $res = [];
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
     * @return ContractCheckResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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

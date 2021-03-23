<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class DataTransferObject extends Model
{
    // 发起方
    /**
     * @example
     *
     * @var string
     */
    public $from;

    // 转交方
    /**
     * @example
     *
     * @var string
     */
    public $to;

    // 流转备注
    /**
     * @example
     *
     * @var string
     */
    public $formBody;

    // 链上流转记录
    /**
     * @example
     *
     * @var string
     */
    public $txHash;

    // 链上时间戳
    //
    /**
     * @example
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'from'      => 'from',
        'to'        => 'to',
        'formBody'  => 'form_body',
        'txHash'    => 'tx_hash',
        'timestamp' => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('formBody', $this->formBody, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->formBody) {
            $res['form_body'] = $this->formBody;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataTransferObject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['form_body'])) {
            $model->formBody = $map['form_body'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}

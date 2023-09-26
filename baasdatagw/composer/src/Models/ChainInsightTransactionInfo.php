<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightTransactionInfo extends Model
{
    // 交易ID
    /**
     * @example 0705b5f12cb6c9aa55aded6a16b638c339cf8678f2d9c56b9b68993cfa2e5f7e
     *
     * @var string
     */
    public $id;

    // 交易类型
    /**
     * @example TX_CALL_CONTRACT
     *
     * @var string
     */
    public $type;

    // 交易发起者
    /**
     * @example 3697b4fdda4cf0e624e3cc0aef1e82fe4b855a5bd2bf26591ffd33fe9f3391af
     *
     * @var string
     */
    public $from;

    // 交易接收者
    /**
     * @example 4ed664c46bfaf60423f4a9b23b66df23b600bd61e66ec9812a6aceaf4d9c0616
     *
     * @var string
     */
    public $to;

    // 交易成块高度
    /**
     * @example 100
     *
     * @var int
     */
    public $height;

    // 交易成块时间，毫秒时间戳
    /**
     * @example 1000
     *
     * @var int
     */
    public $timestamp;

    // 合约中 ABI 的状态  (无需上传) none / （可以上传）pending / （可以更新）uploaded
    /**
     * @example none
     *
     * @var string
     */
    public $abiStatus;
    protected $_name = [
        'id'        => 'id',
        'type'      => 'type',
        'from'      => 'from',
        'to'        => 'to',
        'height'    => 'height',
        'timestamp' => 'timestamp',
        'abiStatus' => 'abi_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->abiStatus) {
            $res['abi_status'] = $this->abiStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightTransactionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['abi_status'])) {
            $model->abiStatus = $map['abi_status'];
        }

        return $model;
    }
}

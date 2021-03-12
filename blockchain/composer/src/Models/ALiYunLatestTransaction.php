<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunLatestTransaction extends Model
{
    // hash
    /**
     * @example hash
     *
     * @var string
     */
    public $hash;

    // transaction_v10_type
    /**
     * @example transaction_v10_type
     *
     * @var string
     */
    public $transactionV10Type;

    // trans_type_v6
    /**
     * @example trans_type_v6
     *
     * @var string
     */
    public $transTypeV6;

    // from
    /**
     * @example from
     *
     * @var string
     */
    public $from;

    // to
    /**
     * @example to
     *
     * @var string
     */
    public $to;

    // create_time
    /**
     * @example 1231231231
     *
     * @var int
     */
    public $createTime;
    protected $_name = [
        'hash'               => 'hash',
        'transactionV10Type' => 'transaction_v10_type',
        'transTypeV6'        => 'trans_type_v6',
        'from'               => 'from',
        'to'                 => 'to',
        'createTime'         => 'create_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->transactionV10Type) {
            $res['transaction_v10_type'] = $this->transactionV10Type;
        }
        if (null !== $this->transTypeV6) {
            $res['trans_type_v6'] = $this->transTypeV6;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunLatestTransaction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['transaction_v10_type'])) {
            $model->transactionV10Type = $map['transaction_v10_type'];
        }
        if (isset($map['trans_type_v6'])) {
            $model->transTypeV6 = $map['trans_type_v6'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}

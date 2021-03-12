<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainMiniAppTransaction extends Model
{
    // authorized
    /**
     * @example true,false
     *
     * @var bool
     */
    public $authorized;

    // transaction_response
    /**
     * @example transaction_response
     *
     * @var string
     */
    public $transactionResponse;

    // transaction_receipt
    /**
     * @example transaction_receipt
     *
     * @var string
     */
    public $transactionReceipt;
    protected $_name = [
        'authorized'          => 'authorized',
        'transactionResponse' => 'transaction_response',
        'transactionReceipt'  => 'transaction_receipt',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authorized) {
            $res['authorized'] = $this->authorized;
        }
        if (null !== $this->transactionResponse) {
            $res['transaction_response'] = $this->transactionResponse;
        }
        if (null !== $this->transactionReceipt) {
            $res['transaction_receipt'] = $this->transactionReceipt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainMiniAppTransaction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['authorized'])) {
            $model->authorized = $map['authorized'];
        }
        if (isset($map['transaction_response'])) {
            $model->transactionResponse = $map['transaction_response'];
        }
        if (isset($map['transaction_receipt'])) {
            $model->transactionReceipt = $map['transaction_receipt'];
        }

        return $model;
    }
}

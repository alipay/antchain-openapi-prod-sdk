<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class TransactionParticipators extends Model
{
    // 参与者详情列表
    /**
     * @example
     *
     * @var TransactionsParticipator[]
     */
    public $participators;

    // 事务详情
    /**
     * @example
     *
     * @var TransactionInfo
     */
    public $transactionInfo;
    protected $_name = [
        'participators'   => 'participators',
        'transactionInfo' => 'transaction_info',
    ];

    public function validate()
    {
        Model::validateRequired('participators', $this->participators, true);
        Model::validateRequired('transactionInfo', $this->transactionInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->participators) {
            $res['participators'] = [];
            if (null !== $this->participators && \is_array($this->participators)) {
                $n = 0;
                foreach ($this->participators as $item) {
                    $res['participators'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->transactionInfo) {
            $res['transaction_info'] = null !== $this->transactionInfo ? $this->transactionInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionParticipators
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['participators'])) {
            if (!empty($map['participators'])) {
                $model->participators = [];
                $n                    = 0;
                foreach ($map['participators'] as $item) {
                    $model->participators[$n++] = null !== $item ? TransactionsParticipator::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['transaction_info'])) {
            $model->transactionInfo = TransactionInfo::fromMap($map['transaction_info']);
        }

        return $model;
    }
}

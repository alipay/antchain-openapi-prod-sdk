<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class TokenData extends Model
{
    // 拥有的token数量
    /**
     * @example 10000000000
     *
     * @var int
     */
    public $tokenNumber;

    // 来源为debit的token数量
    /**
     * @example 10000000000
     *
     * @var int
     */
    public $debitToken;

    // 来源为debit的token数量
    /**
     * @example 0
     *
     * @var int
     */
    public $creditToken;

    // token发行者account
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $accountId;
    protected $_name = [
        'tokenNumber' => 'token_number',
        'debitToken'  => 'debit_token',
        'creditToken' => 'credit_token',
        'accountId'   => 'account_id',
    ];

    public function validate()
    {
        Model::validateRequired('tokenNumber', $this->tokenNumber, true);
        Model::validateRequired('debitToken', $this->debitToken, true);
        Model::validateRequired('creditToken', $this->creditToken, true);
        Model::validateRequired('accountId', $this->accountId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tokenNumber) {
            $res['token_number'] = $this->tokenNumber;
        }
        if (null !== $this->debitToken) {
            $res['debit_token'] = $this->debitToken;
        }
        if (null !== $this->creditToken) {
            $res['credit_token'] = $this->creditToken;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TokenData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['token_number'])) {
            $model->tokenNumber = $map['token_number'];
        }
        if (isset($map['debit_token'])) {
            $model->debitToken = $map['debit_token'];
        }
        if (isset($map['credit_token'])) {
            $model->creditToken = $map['credit_token'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }

        return $model;
    }
}

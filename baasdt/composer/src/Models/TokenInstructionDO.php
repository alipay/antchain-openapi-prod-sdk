<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class TokenInstructionDO extends Model
{
    // token类型
    /**
     * @example 1
     *
     * @var int
     */
    public $tokenType;

    // token价格
    /**
     * @example 1
     *
     * @var string
     */
    public $tokenPrice;

    // token来源账户ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $payAccountId;
    protected $_name = [
        'tokenType'    => 'token_type',
        'tokenPrice'   => 'token_price',
        'payAccountId' => 'pay_account_id',
    ];

    public function validate()
    {
        Model::validateRequired('tokenType', $this->tokenType, true);
        Model::validateRequired('tokenPrice', $this->tokenPrice, true);
        Model::validateRequired('payAccountId', $this->payAccountId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tokenType) {
            $res['token_type'] = $this->tokenType;
        }
        if (null !== $this->tokenPrice) {
            $res['token_price'] = $this->tokenPrice;
        }
        if (null !== $this->payAccountId) {
            $res['pay_account_id'] = $this->payAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TokenInstructionDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['token_type'])) {
            $model->tokenType = $map['token_type'];
        }
        if (isset($map['token_price'])) {
            $model->tokenPrice = $map['token_price'];
        }
        if (isset($map['pay_account_id'])) {
            $model->payAccountId = $map['pay_account_id'];
        }

        return $model;
    }
}

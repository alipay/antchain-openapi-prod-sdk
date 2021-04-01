<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalassetExchangeEpaccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 交易所代码
    /**
     * @var string
     */
    public $exchangeCode;

    // 用户账户
    /**
     * @var string
     */
    public $userAccount;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'exchangeCode'      => 'exchange_code',
        'userAccount'       => 'user_account',
    ];

    public function validate()
    {
        Model::validateRequired('exchangeCode', $this->exchangeCode, true);
        Model::validateRequired('userAccount', $this->userAccount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->exchangeCode) {
            $res['exchange_code'] = $this->exchangeCode;
        }
        if (null !== $this->userAccount) {
            $res['user_account'] = $this->userAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDigitalassetExchangeEpaccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['exchange_code'])) {
            $model->exchangeCode = $map['exchange_code'];
        }
        if (isset($map['user_account'])) {
            $model->userAccount = $map['user_account'];
        }

        return $model;
    }
}

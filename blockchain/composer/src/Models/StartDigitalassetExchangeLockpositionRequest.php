<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDigitalassetExchangeLockpositionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 版通代码
    /**
     * @var string
     */
    public $epCode;

    // 交易所代码
    /**
     * @var string
     */
    public $exchangeCode;

    // 锁定操作，0为解锁，1为锁定
    /**
     * @var int
     */
    public $operate;

    // 业务方账户
    /**
     * @var string
     */
    public $userAccount;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'epCode'            => 'ep_code',
        'exchangeCode'      => 'exchange_code',
        'operate'           => 'operate',
        'userAccount'       => 'user_account',
    ];

    public function validate()
    {
        Model::validateRequired('exchangeCode', $this->exchangeCode, true);
        Model::validateRequired('operate', $this->operate, true);
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
        if (null !== $this->epCode) {
            $res['ep_code'] = $this->epCode;
        }
        if (null !== $this->exchangeCode) {
            $res['exchange_code'] = $this->exchangeCode;
        }
        if (null !== $this->operate) {
            $res['operate'] = $this->operate;
        }
        if (null !== $this->userAccount) {
            $res['user_account'] = $this->userAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDigitalassetExchangeLockpositionRequest
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
        if (isset($map['ep_code'])) {
            $model->epCode = $map['ep_code'];
        }
        if (isset($map['exchange_code'])) {
            $model->exchangeCode = $map['exchange_code'];
        }
        if (isset($map['operate'])) {
            $model->operate = $map['operate'];
        }
        if (isset($map['user_account'])) {
            $model->userAccount = $map['user_account'];
        }

        return $model;
    }
}

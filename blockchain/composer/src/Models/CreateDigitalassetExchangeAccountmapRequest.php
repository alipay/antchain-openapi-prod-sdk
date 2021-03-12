<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalassetExchangeAccountmapRequest extends Model
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

    // 交易所代码
    /**
     * @var string
     */
    public $exchangeCode;

    // 用户联系方式
    /**
     * @var string
     */
    public $phone;

    // 业务方用户账号
    /**
     * @var string
     */
    public $userAccount;

    // 业务方用户名称
    /**
     * @var string
     */
    public $userName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'exchangeCode'      => 'exchange_code',
        'phone'             => 'phone',
        'userAccount'       => 'user_account',
        'userName'          => 'user_name',
    ];

    public function validate()
    {
        Model::validateRequired('exchangeCode', $this->exchangeCode, true);
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('userAccount', $this->userAccount, true);
        Model::validateRequired('userName', $this->userName, true);
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
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->userAccount) {
            $res['user_account'] = $this->userAccount;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDigitalassetExchangeAccountmapRequest
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
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['user_account'])) {
            $model->userAccount = $map['user_account'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }

        return $model;
    }
}

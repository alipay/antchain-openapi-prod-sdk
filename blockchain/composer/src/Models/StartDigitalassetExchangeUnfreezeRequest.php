<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDigitalassetExchangeUnfreezeRequest extends Model
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

    // 解限数量
    /**
     * @var int
     */
    public $epUnfreezeAmount;

    // 交易所代码
    /**
     * @var string
     */
    public $exchangeCode;

    // 业务方用户账户
    /**
     * @var string
     */
    public $userAccount;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'epCode'            => 'ep_code',
        'epUnfreezeAmount'  => 'ep_unfreeze_amount',
        'exchangeCode'      => 'exchange_code',
        'userAccount'       => 'user_account',
    ];

    public function validate()
    {
        Model::validateRequired('epCode', $this->epCode, true);
        Model::validateRequired('epUnfreezeAmount', $this->epUnfreezeAmount, true);
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
        if (null !== $this->epCode) {
            $res['ep_code'] = $this->epCode;
        }
        if (null !== $this->epUnfreezeAmount) {
            $res['ep_unfreeze_amount'] = $this->epUnfreezeAmount;
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
     * @return StartDigitalassetExchangeUnfreezeRequest
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
        if (isset($map['ep_unfreeze_amount'])) {
            $model->epUnfreezeAmount = $map['ep_unfreeze_amount'];
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

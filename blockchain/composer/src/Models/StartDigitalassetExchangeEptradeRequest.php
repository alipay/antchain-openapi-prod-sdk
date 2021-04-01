<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDigitalassetExchangeEptradeRequest extends Model
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

    // 交易数量
    /**
     * @var int
     */
    public $epAmount;

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

    // 卖方账户
    /**
     * @var string
     */
    public $fromAccount;

    // 买方账户
    /**
     * @var string
     */
    public $toAccount;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'epAmount'          => 'ep_amount',
        'epCode'            => 'ep_code',
        'exchangeCode'      => 'exchange_code',
        'fromAccount'       => 'from_account',
        'toAccount'         => 'to_account',
    ];

    public function validate()
    {
        Model::validateRequired('epAmount', $this->epAmount, true);
        Model::validateRequired('epCode', $this->epCode, true);
        Model::validateRequired('exchangeCode', $this->exchangeCode, true);
        Model::validateRequired('fromAccount', $this->fromAccount, true);
        Model::validateRequired('toAccount', $this->toAccount, true);
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
        if (null !== $this->epAmount) {
            $res['ep_amount'] = $this->epAmount;
        }
        if (null !== $this->epCode) {
            $res['ep_code'] = $this->epCode;
        }
        if (null !== $this->exchangeCode) {
            $res['exchange_code'] = $this->exchangeCode;
        }
        if (null !== $this->fromAccount) {
            $res['from_account'] = $this->fromAccount;
        }
        if (null !== $this->toAccount) {
            $res['to_account'] = $this->toAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDigitalassetExchangeEptradeRequest
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
        if (isset($map['ep_amount'])) {
            $model->epAmount = $map['ep_amount'];
        }
        if (isset($map['ep_code'])) {
            $model->epCode = $map['ep_code'];
        }
        if (isset($map['exchange_code'])) {
            $model->exchangeCode = $map['exchange_code'];
        }
        if (isset($map['from_account'])) {
            $model->fromAccount = $map['from_account'];
        }
        if (isset($map['to_account'])) {
            $model->toAccount = $map['to_account'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class CreateDacDepositRequest extends Model
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

    // 白名单地址为交易from的地址，用于发起转账操作
    /**
     * @var string
     */
    public $whitelistAddress;

    // 存入的金额，可以为整数，或者携带小数位，除以精度之后的值
    /**
     * @var string
     */
    public $depositAmount;

    // 区块链名称
    /**
     * @var string
     */
    public $blockchain;

    // token名称
    /**
     * @var string
     */
    public $tokenSymbol;

    // 外部客户唯一id
    /**
     * @var string
     */
    public $externalCustomerId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'whitelistAddress'   => 'whitelist_address',
        'depositAmount'      => 'deposit_amount',
        'blockchain'         => 'blockchain',
        'tokenSymbol'        => 'token_symbol',
        'externalCustomerId' => 'external_customer_id',
    ];

    public function validate()
    {
        Model::validateRequired('whitelistAddress', $this->whitelistAddress, true);
        Model::validateRequired('depositAmount', $this->depositAmount, true);
        Model::validateRequired('blockchain', $this->blockchain, true);
        Model::validateRequired('tokenSymbol', $this->tokenSymbol, true);
        Model::validateRequired('externalCustomerId', $this->externalCustomerId, true);
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
        if (null !== $this->whitelistAddress) {
            $res['whitelist_address'] = $this->whitelistAddress;
        }
        if (null !== $this->depositAmount) {
            $res['deposit_amount'] = $this->depositAmount;
        }
        if (null !== $this->blockchain) {
            $res['blockchain'] = $this->blockchain;
        }
        if (null !== $this->tokenSymbol) {
            $res['token_symbol'] = $this->tokenSymbol;
        }
        if (null !== $this->externalCustomerId) {
            $res['external_customer_id'] = $this->externalCustomerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDacDepositRequest
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
        if (isset($map['whitelist_address'])) {
            $model->whitelistAddress = $map['whitelist_address'];
        }
        if (isset($map['deposit_amount'])) {
            $model->depositAmount = $map['deposit_amount'];
        }
        if (isset($map['blockchain'])) {
            $model->blockchain = $map['blockchain'];
        }
        if (isset($map['token_symbol'])) {
            $model->tokenSymbol = $map['token_symbol'];
        }
        if (isset($map['external_customer_id'])) {
            $model->externalCustomerId = $map['external_customer_id'];
        }

        return $model;
    }
}

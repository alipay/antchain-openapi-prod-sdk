<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class QueryDacQuotaRequest extends Model
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

    // your company external customer id
    /**
     * @var string
     */
    public $externalCustomerId;

    // blockchain:Ethereum,Polygon,etc
    /**
     * @var string
     */
    public $blockchain;

    // token symbol:USDC,USDT,etc
    /**
     * @var string
     */
    public $tokenSymbol;

    // quotaType:DEPOSIT/WITHDRAWAL
    /**
     * @var string
     */
    public $quotaType;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'externalCustomerId' => 'external_customer_id',
        'blockchain'         => 'blockchain',
        'tokenSymbol'        => 'token_symbol',
        'quotaType'          => 'quota_type',
    ];

    public function validate()
    {
        Model::validateRequired('externalCustomerId', $this->externalCustomerId, true);
        Model::validateRequired('blockchain', $this->blockchain, true);
        Model::validateRequired('tokenSymbol', $this->tokenSymbol, true);
        Model::validateRequired('quotaType', $this->quotaType, true);
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
        if (null !== $this->externalCustomerId) {
            $res['external_customer_id'] = $this->externalCustomerId;
        }
        if (null !== $this->blockchain) {
            $res['blockchain'] = $this->blockchain;
        }
        if (null !== $this->tokenSymbol) {
            $res['token_symbol'] = $this->tokenSymbol;
        }
        if (null !== $this->quotaType) {
            $res['quota_type'] = $this->quotaType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDacQuotaRequest
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
        if (isset($map['external_customer_id'])) {
            $model->externalCustomerId = $map['external_customer_id'];
        }
        if (isset($map['blockchain'])) {
            $model->blockchain = $map['blockchain'];
        }
        if (isset($map['token_symbol'])) {
            $model->tokenSymbol = $map['token_symbol'];
        }
        if (isset($map['quota_type'])) {
            $model->quotaType = $map['quota_type'];
        }

        return $model;
    }
}

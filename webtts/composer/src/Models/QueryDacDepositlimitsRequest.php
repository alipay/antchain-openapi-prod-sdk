<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class QueryDacDepositlimitsRequest extends Model
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

    // 外部用户唯一id
    /**
     * @var string
     */
    public $externalCustomerId;

    // 代币名称
    /**
     * @var string
     */
    public $tokenSymbol;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'externalCustomerId' => 'external_customer_id',
        'tokenSymbol'        => 'token_symbol',
    ];

    public function validate()
    {
        Model::validateRequired('externalCustomerId', $this->externalCustomerId, true);
        Model::validateRequired('tokenSymbol', $this->tokenSymbol, true);
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
        if (null !== $this->tokenSymbol) {
            $res['token_symbol'] = $this->tokenSymbol;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDacDepositlimitsRequest
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
        if (isset($map['token_symbol'])) {
            $model->tokenSymbol = $map['token_symbol'];
        }

        return $model;
    }
}

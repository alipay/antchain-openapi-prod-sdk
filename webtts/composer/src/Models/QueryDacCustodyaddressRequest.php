<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class QueryDacCustodyaddressRequest extends Model
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

    // 区块链名称
    /**
     * @var string
     */
    public $blockchain;

    // 外部客户唯一id
    /**
     * @var string
     */
    public $externalCustomerId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'blockchain'         => 'blockchain',
        'externalCustomerId' => 'external_customer_id',
    ];

    public function validate()
    {
        Model::validateRequired('blockchain', $this->blockchain, true);
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
        if (null !== $this->blockchain) {
            $res['blockchain'] = $this->blockchain;
        }
        if (null !== $this->externalCustomerId) {
            $res['external_customer_id'] = $this->externalCustomerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDacCustodyaddressRequest
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
        if (isset($map['blockchain'])) {
            $model->blockchain = $map['blockchain'];
        }
        if (isset($map['external_customer_id'])) {
            $model->externalCustomerId = $map['external_customer_id'];
        }

        return $model;
    }
}

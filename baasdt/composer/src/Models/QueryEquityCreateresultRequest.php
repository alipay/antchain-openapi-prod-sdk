<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryEquityCreateresultRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 创建商品接口返回的createEquityRequestId
    /**
     * @var string
     */
    public $createEquityRequestId;

    // 要代理操作的租户ID
    /**
     * @var string
     */
    public $delegatedTenantId;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'chainId'               => 'chain_id',
        'createEquityRequestId' => 'create_equity_request_id',
        'delegatedTenantId'     => 'delegated_tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('createEquityRequestId', $this->createEquityRequestId, true);
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
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->createEquityRequestId) {
            $res['create_equity_request_id'] = $this->createEquityRequestId;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEquityCreateresultRequest
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
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['create_equity_request_id'])) {
            $model->createEquityRequestId = $map['create_equity_request_id'];
        }
        if (isset($map['delegated_tenant_id'])) {
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class QueryQueryFirmfinancialRequest extends Model
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

    // 企业Id
    /**
     * @var int
     */
    public $firmId;

    // 租户信息
    /**
     * @var string
     */
    public $tenantId;

    // 查询类型（1：查询状态，2：财报信息）
    /**
     * @var string
     */
    public $queryOptions;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'firmId'            => 'firm_id',
        'tenantId'          => 'tenant_id',
        'queryOptions'      => 'query_options',
    ];

    public function validate()
    {
        Model::validateRequired('firmId', $this->firmId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('queryOptions', $this->queryOptions, true);
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
        if (null !== $this->firmId) {
            $res['firm_id'] = $this->firmId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->queryOptions) {
            $res['query_options'] = $this->queryOptions;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQueryFirmfinancialRequest
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
        if (isset($map['firm_id'])) {
            $model->firmId = $map['firm_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['query_options'])) {
            $model->queryOptions = $map['query_options'];
        }

        return $model;
    }
}

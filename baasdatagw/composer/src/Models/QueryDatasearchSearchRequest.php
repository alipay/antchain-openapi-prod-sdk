<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class QueryDatasearchSearchRequest extends Model
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

    // 用户唯一标识符（租户ID）
    /**
     * @var string
     */
    public $tenantId;

    // 链唯一标识符
    /**
     * @var string
     */
    public $bizId;

    // 检索的metaId范围；私有化不支持，参数留空
    /**
     * @var string[]
     */
    public $metaConditions;

    // 检索请求
    /**
     * @var DataSearchRequest
     */
    public $query;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'bizId'             => 'biz_id',
        'metaConditions'    => 'meta_conditions',
        'query'             => 'query',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('query', $this->query, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->metaConditions) {
            $res['meta_conditions'] = $this->metaConditions;
        }
        if (null !== $this->query) {
            $res['query'] = null !== $this->query ? $this->query->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDatasearchSearchRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['meta_conditions'])) {
            if (!empty($map['meta_conditions'])) {
                $model->metaConditions = $map['meta_conditions'];
            }
        }
        if (isset($map['query'])) {
            $model->query = DataSearchRequest::fromMap($map['query']);
        }

        return $model;
    }
}

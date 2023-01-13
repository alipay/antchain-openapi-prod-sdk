<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class GetDatasearchIndexRequest extends Model
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

    // 合约ABI meta ID
    /**
     * @var string
     */
    public $metaId;

    // 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
    /**
     * @var string
     */
    public $indexType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'bizId'             => 'biz_id',
        'metaId'            => 'meta_id',
        'indexType'         => 'index_type',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('metaId', $this->metaId, true);
        Model::validateRequired('indexType', $this->indexType, true);
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
        if (null !== $this->metaId) {
            $res['meta_id'] = $this->metaId;
        }
        if (null !== $this->indexType) {
            $res['index_type'] = $this->indexType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDatasearchIndexRequest
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
        if (isset($map['meta_id'])) {
            $model->metaId = $map['meta_id'];
        }
        if (isset($map['index_type'])) {
            $model->indexType = $map['index_type'];
        }

        return $model;
    }
}

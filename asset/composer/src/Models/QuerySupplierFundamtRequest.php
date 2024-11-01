<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class QuerySupplierFundamtRequest extends Model
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

    // 请求唯一id
    //
    /**
     * @var string
     */
    public $requestUniqueId;

    // 云站供应商 租户 id
    /**
     * @var string
     */
    public $cloudTenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestUniqueId'   => 'request_unique_id',
        'cloudTenantId'     => 'cloud_tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('requestUniqueId', $this->requestUniqueId, true);
        Model::validateRequired('cloudTenantId', $this->cloudTenantId, true);
        Model::validateMaxLength('requestUniqueId', $this->requestUniqueId, 36);
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
        if (null !== $this->requestUniqueId) {
            $res['request_unique_id'] = $this->requestUniqueId;
        }
        if (null !== $this->cloudTenantId) {
            $res['cloud_tenant_id'] = $this->cloudTenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySupplierFundamtRequest
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
        if (isset($map['request_unique_id'])) {
            $model->requestUniqueId = $map['request_unique_id'];
        }
        if (isset($map['cloud_tenant_id'])) {
            $model->cloudTenantId = $map['cloud_tenant_id'];
        }

        return $model;
    }
}

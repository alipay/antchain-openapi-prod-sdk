<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class VerifyApiApigroupRequest extends Model
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

    // 租户标识
    /**
     * @var string
     */
    public $tenantId;

    // 工作空间标识
    /**
     * @var string
     */
    public $workspaceId;

    // api分组标识
    /**
     * @var string
     */
    public $apiGroupId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'workspaceId'       => 'workspace_id',
        'apiGroupId'        => 'api_group_id',
    ];

    public function validate()
    {
        Model::validateRequired('apiGroupId', $this->apiGroupId, true);
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
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->apiGroupId) {
            $res['api_group_id'] = $this->apiGroupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyApiApigroupRequest
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
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['api_group_id'])) {
            $model->apiGroupId = $map['api_group_id'];
        }

        return $model;
    }
}

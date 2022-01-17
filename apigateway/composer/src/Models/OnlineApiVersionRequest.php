<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class OnlineApiVersionRequest extends Model
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

    // api_id
    /**
     * @var string
     */
    public $apiId;

    // online_desc
    /**
     * @var string
     */
    public $onlineDesc;

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;

    // version_id
    /**
     * @var string
     */
    public $versionId;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // api_type
    /**
     * @var string
     */
    public $apiType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apiId'             => 'api_id',
        'onlineDesc'        => 'online_desc',
        'tenantId'          => 'tenant_id',
        'versionId'         => 'version_id',
        'workspaceId'       => 'workspace_id',
        'apiType'           => 'api_type',
    ];

    public function validate()
    {
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
        if (null !== $this->apiId) {
            $res['api_id'] = $this->apiId;
        }
        if (null !== $this->onlineDesc) {
            $res['online_desc'] = $this->onlineDesc;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->versionId) {
            $res['version_id'] = $this->versionId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->apiType) {
            $res['api_type'] = $this->apiType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OnlineApiVersionRequest
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
        if (isset($map['api_id'])) {
            $model->apiId = $map['api_id'];
        }
        if (isset($map['online_desc'])) {
            $model->onlineDesc = $map['online_desc'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['version_id'])) {
            $model->versionId = $map['version_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['api_type'])) {
            $model->apiType = $map['api_type'];
        }

        return $model;
    }
}

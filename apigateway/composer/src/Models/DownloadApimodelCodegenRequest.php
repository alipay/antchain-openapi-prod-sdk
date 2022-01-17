<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class DownloadApimodelCodegenRequest extends Model
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

    // APp标识列表
    /**
     * @var string
     */
    public $appId;

    // 租户标识
    /**
     * @var string
     */
    public $tenantId;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // api_group_id
    /**
     * @var string
     */
    public $apiGroupId;

    // package_name
    /**
     * @var string
     */
    public $packageName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appId'             => 'app_id',
        'tenantId'          => 'tenant_id',
        'workspaceId'       => 'workspace_id',
        'apiGroupId'        => 'api_group_id',
        'packageName'       => 'package_name',
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
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
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
        if (null !== $this->packageName) {
            $res['package_name'] = $this->packageName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DownloadApimodelCodegenRequest
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
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
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
        if (isset($map['package_name'])) {
            $model->packageName = $map['package_name'];
        }

        return $model;
    }
}

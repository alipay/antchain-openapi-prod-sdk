<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class GetWorkspacegroupInstanceRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 集群id
    /**
     * @var string
     */
    public $clusterId;

    // 是否需要原始的instanceId
    /**
     * @var bool
     */
    public $needReal;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'workspaceGroup'    => 'workspace_group',
        'clusterId'         => 'cluster_id',
        'needReal'          => 'need_real',
        'workspace'         => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
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
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->needReal) {
            $res['need_real'] = $this->needReal;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetWorkspacegroupInstanceRequest
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
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['need_real'])) {
            $model->needReal = $map['need_real'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}

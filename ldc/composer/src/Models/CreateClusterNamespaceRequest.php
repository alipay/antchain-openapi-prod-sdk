<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateClusterNamespaceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // namespace labels
    /**
     * @var Label[]
     */
    public $labels;

    // name
    /**
     * @var string
     */
    public $name;

    // tenant id
    /**
     * @var string
     */
    public $tenantId;

    // tenant name
    /**
     * @var string
     */
    public $tenantName;

    // workspace group id
    /**
     * @var string
     */
    public $workspaceGroupId;

    // workspace group name
    /**
     * @var string
     */
    public $workspaceGroupName;

    // cluster name to create namespace in
    /**
     * @var string
     */
    public $clusterName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'labels'             => 'labels',
        'name'               => 'name',
        'tenantId'           => 'tenant_id',
        'tenantName'         => 'tenant_name',
        'workspaceGroupId'   => 'workspace_group_id',
        'workspaceGroupName' => 'workspace_group_name',
        'clusterName'        => 'cluster_name',
    ];

    public function validate()
    {
        Model::validateRequired('labels', $this->labels, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('workspaceGroupId', $this->workspaceGroupId, true);
        Model::validateRequired('workspaceGroupName', $this->workspaceGroupName, true);
        Model::validateRequired('clusterName', $this->clusterName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateClusterNamespaceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? Label::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['workspace_group_id'])) {
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }

        return $model;
    }
}

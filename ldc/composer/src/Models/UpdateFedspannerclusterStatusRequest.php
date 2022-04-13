<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateFedspannerclusterStatusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // fed spanner cluster 集群名称
    /**
     * @var string
     */
    public $clusterName;

    // 期望的集群状态
    /**
     * @var string
     */
    public $clusterStatus;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceGroup' => 'workspace_group',
        'clusterName'    => 'cluster_name',
        'clusterStatus'  => 'cluster_status',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('clusterStatus', $this->clusterStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->clusterStatus) {
            $res['cluster_status'] = $this->clusterStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFedspannerclusterStatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['cluster_status'])) {
            $model->clusterStatus = $map['cluster_status'];
        }

        return $model;
    }
}

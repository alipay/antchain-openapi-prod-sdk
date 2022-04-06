<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryMiddlewareclusterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace_id 和workspace_group_id至少要填一个
    /**
     * @var string
     */
    public $workspaceId;

    // cluster_id OSP上的ID
    /**
     * @var string
     */
    public $clusterId;

    // cluster_name
    /**
     * @var string
     */
    public $clusterName;

    // workspace_group_name和workspace_id必须至少传入一个
    /**
     * @var string
     */
    public $workspaceGroupName;

    // app_service_id
    /**
     * @var string
     */
    public $appServiceId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'workspaceId'        => 'workspace_id',
        'clusterId'          => 'cluster_id',
        'clusterName'        => 'cluster_name',
        'workspaceGroupName' => 'workspace_group_name',
        'appServiceId'       => 'app_service_id',
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
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }
        if (null !== $this->appServiceId) {
            $res['app_service_id'] = $this->appServiceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMiddlewareclusterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }
        if (isset($map['app_service_id'])) {
            $model->appServiceId = $map['app_service_id'];
        }

        return $model;
    }
}

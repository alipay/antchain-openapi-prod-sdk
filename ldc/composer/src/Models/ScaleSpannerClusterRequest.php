<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ScaleSpannerClusterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群id
    /**
     * @var string
     */
    public $clusterId;

    // 需要扩容的单元数目
    /**
     * @var int
     */
    public $containerCount;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'      => 'auth_token',
        'clusterId'      => 'cluster_id',
        'containerCount' => 'container_count',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('containerCount', $this->containerCount, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->containerCount) {
            $res['container_count'] = $this->containerCount;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScaleSpannerClusterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['container_count'])) {
            $model->containerCount = $map['container_count'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}

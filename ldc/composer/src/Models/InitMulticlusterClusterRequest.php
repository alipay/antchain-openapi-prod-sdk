<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class InitMulticlusterClusterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // federation namespace
    /**
     * @var string
     */
    public $fedNamespace;

    // master cluster info
    /**
     * @var MasterCluster[]
     */
    public $masterClusterInfo;

    // workspace group name
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'         => 'auth_token',
        'fedNamespace'      => 'fed_namespace',
        'masterClusterInfo' => 'master_cluster_info',
        'workspaceGroup'    => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('masterClusterInfo', $this->masterClusterInfo, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->fedNamespace) {
            $res['fed_namespace'] = $this->fedNamespace;
        }
        if (null !== $this->masterClusterInfo) {
            $res['master_cluster_info'] = [];
            if (null !== $this->masterClusterInfo && \is_array($this->masterClusterInfo)) {
                $n = 0;
                foreach ($this->masterClusterInfo as $item) {
                    $res['master_cluster_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitMulticlusterClusterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['fed_namespace'])) {
            $model->fedNamespace = $map['fed_namespace'];
        }
        if (isset($map['master_cluster_info'])) {
            if (!empty($map['master_cluster_info'])) {
                $model->masterClusterInfo = [];
                $n                        = 0;
                foreach ($map['master_cluster_info'] as $item) {
                    $model->masterClusterInfo[$n++] = null !== $item ? MasterCluster::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}

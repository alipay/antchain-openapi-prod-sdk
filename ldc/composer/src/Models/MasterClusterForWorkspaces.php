<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class MasterClusterForWorkspaces extends Model
{
    // workspace id
    /**
     * @example 0001
     *
     * @var string[]
     */
    public $workspaceId;

    // master cluster info to init minion cluster
    /**
     * @example
     *
     * @var MasterCluster
     */
    public $masterClusterInfo;
    protected $_name = [
        'workspaceId'       => 'workspace_id',
        'masterClusterInfo' => 'master_cluster_info',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('masterClusterInfo', $this->masterClusterInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->masterClusterInfo) {
            $res['master_cluster_info'] = null !== $this->masterClusterInfo ? $this->masterClusterInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MasterClusterForWorkspaces
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace_id'])) {
            if (!empty($map['workspace_id'])) {
                $model->workspaceId = $map['workspace_id'];
            }
        }
        if (isset($map['master_cluster_info'])) {
            $model->masterClusterInfo = MasterCluster::fromMap($map['master_cluster_info']);
        }

        return $model;
    }
}

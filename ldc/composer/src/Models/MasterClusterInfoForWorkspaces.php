<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class MasterClusterInfoForWorkspaces extends Model
{
    // master cluster info
    /**
     * @example
     *
     * @var MasterCluster
     */
    public $masterClusterInfo;

    // workspace ids
    /**
     * @example
     *
     * @var string[]
     */
    public $workspaceIds;
    protected $_name = [
        'masterClusterInfo' => 'master_cluster_info',
        'workspaceIds'      => 'workspace_ids',
    ];

    public function validate()
    {
        Model::validateRequired('masterClusterInfo', $this->masterClusterInfo, true);
        Model::validateRequired('workspaceIds', $this->workspaceIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->masterClusterInfo) {
            $res['master_cluster_info'] = null !== $this->masterClusterInfo ? $this->masterClusterInfo->toMap() : null;
        }
        if (null !== $this->workspaceIds) {
            $res['workspace_ids'] = $this->workspaceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MasterClusterInfoForWorkspaces
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['master_cluster_info'])) {
            $model->masterClusterInfo = MasterCluster::fromMap($map['master_cluster_info']);
        }
        if (isset($map['workspace_ids'])) {
            if (!empty($map['workspace_ids'])) {
                $model->workspaceIds = $map['workspace_ids'];
            }
        }

        return $model;
    }
}

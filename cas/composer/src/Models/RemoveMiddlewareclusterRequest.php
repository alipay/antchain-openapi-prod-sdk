<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class RemoveMiddlewareclusterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // cluster_id
    /**
     * @var string
     */
    public $clusterId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'workspaceId' => 'workspace_id',
        'clusterId'   => 'cluster_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('clusterId', $this->clusterId, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RemoveMiddlewareclusterRequest
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

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SyncLoadbalanceRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // lb_id
    /**
     * @var string
     */
    public $lbId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'workspaceId' => 'workspace_id',
        'lbId'        => 'lb_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('lbId', $this->lbId, true);
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
        if (null !== $this->lbId) {
            $res['lb_id'] = $this->lbId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncLoadbalanceRequest
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
        if (isset($map['lb_id'])) {
            $model->lbId = $map['lb_id'];
        }

        return $model;
    }
}

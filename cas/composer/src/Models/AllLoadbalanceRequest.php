<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AllLoadbalanceRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // workspace_ids
    /**
     * @var string[]
     */
    public $workspaceIds;
    protected $_name = [
        'authToken'    => 'auth_token',
        'workspaceIds' => 'workspace_ids',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceIds', $this->workspaceIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceIds) {
            $res['workspace_ids'] = $this->workspaceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllLoadbalanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_ids'])) {
            if (!empty($map['workspace_ids'])) {
                $model->workspaceIds = $map['workspace_ids'];
            }
        }

        return $model;
    }
}

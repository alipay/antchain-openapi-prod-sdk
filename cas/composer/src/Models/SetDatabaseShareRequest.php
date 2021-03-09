<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SetDatabaseShareRequest extends Model
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

    // ids
    /**
     * @var string[]
     */
    public $ids;
    protected $_name = [
        'authToken'    => 'auth_token',
        'workspaceIds' => 'workspace_ids',
        'ids'          => 'ids',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceIds', $this->workspaceIds, true);
        Model::validateRequired('ids', $this->ids, true);
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
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetDatabaseShareRequest
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
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
            }
        }

        return $model;
    }
}

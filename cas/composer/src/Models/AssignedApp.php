<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AssignedApp extends Model
{
    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // app_id
    /**
     * @example app_id
     *
     * @var string
     */
    public $appId;
    protected $_name = [
        'workspaceId' => 'workspace_id',
        'appId'       => 'app_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('appId', $this->appId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssignedApp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }

        return $model;
    }
}

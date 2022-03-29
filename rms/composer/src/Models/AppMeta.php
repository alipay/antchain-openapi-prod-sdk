<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AppMeta extends Model
{
    // workspace_id
    /**
     * @example 1
     *
     * @var int
     */
    public $workspaceId;

    // 应用名
    /**
     * @example test
     *
     * @var string
     */
    public $appName;

    // app_id
    /**
     * @example 1
     *
     * @var int
     */
    public $appId;
    protected $_name = [
        'workspaceId' => 'workspace_id',
        'appName'     => 'app_name',
        'appId'       => 'app_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('appId', $this->appId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }

        return $model;
    }
}

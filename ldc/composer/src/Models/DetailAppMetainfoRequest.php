<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DetailAppMetainfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组的label：SIT, DEV, ...
    /**
     * @var string
     */
    public $workspaceGroupLabel;

    // 应用名字
    // app:appService在此场景下为1:1，否则会报错
    /**
     * @var string
     */
    public $appName;
    protected $_name = [
        'authToken'           => 'auth_token',
        'workspaceGroupLabel' => 'workspace_group_label',
        'appName'             => 'app_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroupLabel) {
            $res['workspace_group_label'] = $this->workspaceGroupLabel;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailAppMetainfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group_label'])) {
            $model->workspaceGroupLabel = $map['workspace_group_label'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }

        return $model;
    }
}

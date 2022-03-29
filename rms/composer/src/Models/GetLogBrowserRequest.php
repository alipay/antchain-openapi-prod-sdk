<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetLogBrowserRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 扫描根目录
    /**
     * @var string[]
     */
    public $scanDirs;

    // preferHost
    /**
     * @var string
     */
    public $preferHost;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'appName'       => 'app_name',
        'scanDirs'      => 'scan_dirs',
        'preferHost'    => 'prefer_host',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('scanDirs', $this->scanDirs, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->scanDirs) {
            $res['scan_dirs'] = $this->scanDirs;
        }
        if (null !== $this->preferHost) {
            $res['prefer_host'] = $this->preferHost;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetLogBrowserRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['scan_dirs'])) {
            if (!empty($map['scan_dirs'])) {
                $model->scanDirs = $map['scan_dirs'];
            }
        }
        if (isset($map['prefer_host'])) {
            $model->preferHost = $map['prefer_host'];
        }

        return $model;
    }
}

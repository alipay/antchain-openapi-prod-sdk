<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetLogTailRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // the preferHost
    /**
     * @var string
     */
    public $preferHost;

    // 日志完整路径
    /**
     * @var string
     */
    public $fullPath;

    // 扫描路径
    /**
     * @var string[]
     */
    public $scanDirs;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'appName'       => 'app_name',
        'preferHost'    => 'prefer_host',
        'fullPath'      => 'full_path',
        'scanDirs'      => 'scan_dirs',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('appName', $this->appName, true);
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
        if (null !== $this->preferHost) {
            $res['prefer_host'] = $this->preferHost;
        }
        if (null !== $this->fullPath) {
            $res['full_path'] = $this->fullPath;
        }
        if (null !== $this->scanDirs) {
            $res['scan_dirs'] = $this->scanDirs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetLogTailRequest
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
        if (isset($map['prefer_host'])) {
            $model->preferHost = $map['prefer_host'];
        }
        if (isset($map['full_path'])) {
            $model->fullPath = $map['full_path'];
        }
        if (isset($map['scan_dirs'])) {
            if (!empty($map['scan_dirs'])) {
                $model->scanDirs = $map['scan_dirs'];
            }
        }

        return $model;
    }
}

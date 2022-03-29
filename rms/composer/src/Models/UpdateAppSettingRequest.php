<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateAppSettingRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 是否开启应用监控采集
    /**
     * @var bool
     */
    public $collectEnable;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;

    // 配置信息
    /**
     * @var string
     */
    public $setting;

    // 应用名称
    /**
     * @var string
     */
    public $appName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'collectEnable' => 'collect_enable',
        'workspaceName' => 'workspace_name',
        'setting'       => 'setting',
        'appName'       => 'app_name',
    ];

    public function validate()
    {
        Model::validateRequired('collectEnable', $this->collectEnable, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('appName', $this->appName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->collectEnable) {
            $res['collect_enable'] = $this->collectEnable;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->setting) {
            $res['setting'] = $this->setting;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAppSettingRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['collect_enable'])) {
            $model->collectEnable = $map['collect_enable'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['setting'])) {
            $model->setting = $map['setting'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }

        return $model;
    }
}

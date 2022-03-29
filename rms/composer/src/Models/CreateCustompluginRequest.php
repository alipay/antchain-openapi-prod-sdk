<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CreateCustompluginRequest extends Model
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

    // 自定义监控指标详细信息 (嵌套对象)
    /**
     * @var CustomPluginDO
     */
    public $customPlugin;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'customPlugin'  => 'custom_plugin',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('customPlugin', $this->customPlugin, true);
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
        if (null !== $this->customPlugin) {
            $res['custom_plugin'] = null !== $this->customPlugin ? $this->customPlugin->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCustompluginRequest
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
        if (isset($map['custom_plugin'])) {
            $model->customPlugin = CustomPluginDO::fromMap($map['custom_plugin']);
        }

        return $model;
    }
}

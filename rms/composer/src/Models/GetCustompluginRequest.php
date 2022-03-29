<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetCustompluginRequest extends Model
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

    // 自定义监控指标 ID
    /**
     * @var int
     */
    public $id;

    // 类型
    /**
     * @var string
     */
    public $pluginType;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'id'            => 'id',
        'pluginType'    => 'plugin_type',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('pluginType', $this->pluginType, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->pluginType) {
            $res['plugin_type'] = $this->pluginType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetCustompluginRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['plugin_type'])) {
            $model->pluginType = $map['plugin_type'];
        }

        return $model;
    }
}

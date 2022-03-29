<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class DeleteCustompluginRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 监控产品类型
    /**
     * @var string
     */
    public $pluginType;

    // id
    /**
     * @var int
     */
    public $id;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'pluginType'    => 'plugin_type',
        'id'            => 'id',
        'workspaceName' => 'workspace_name',
    ];

    public function validate()
    {
        Model::validateRequired('pluginType', $this->pluginType, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->pluginType) {
            $res['plugin_type'] = $this->pluginType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteCustompluginRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['plugin_type'])) {
            $model->pluginType = $map['plugin_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}

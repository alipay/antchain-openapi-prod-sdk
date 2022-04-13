<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AddAntvipDomainRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组名称
    /**
     * @var string
     */
    public $workspaceGroup;

    // 应用名称
    /**
     * @var string
     */
    public $application;

    // 要添加的部署单元名称列表
    /**
     * @var string[]
     */
    public $cells;

    // 健康检查类型，默认为TCP
    /**
     * @var string
     */
    public $healthCheckType;

    // 健康检查端口，非必填项
    /**
     * @var int
     */
    public $healthCheckDefaultPort;
    protected $_name = [
        'authToken'              => 'auth_token',
        'workspaceGroup'         => 'workspace_group',
        'application'            => 'application',
        'cells'                  => 'cells',
        'healthCheckType'        => 'health_check_type',
        'healthCheckDefaultPort' => 'health_check_default_port',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('application', $this->application, true);
        Model::validateRequired('cells', $this->cells, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->application) {
            $res['application'] = $this->application;
        }
        if (null !== $this->cells) {
            $res['cells'] = $this->cells;
        }
        if (null !== $this->healthCheckType) {
            $res['health_check_type'] = $this->healthCheckType;
        }
        if (null !== $this->healthCheckDefaultPort) {
            $res['health_check_default_port'] = $this->healthCheckDefaultPort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddAntvipDomainRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['application'])) {
            $model->application = $map['application'];
        }
        if (isset($map['cells'])) {
            if (!empty($map['cells'])) {
                $model->cells = $map['cells'];
            }
        }
        if (isset($map['health_check_type'])) {
            $model->healthCheckType = $map['health_check_type'];
        }
        if (isset($map['health_check_default_port'])) {
            $model->healthCheckDefaultPort = $map['health_check_default_port'];
        }

        return $model;
    }
}

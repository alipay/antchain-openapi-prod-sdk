<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CheckContainerserviceConflictopsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 应用服务名称
    /**
     * @var string
     */
    public $containerServiceName;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 是否检查Sidercar有运维工单，默认false
    /**
     * @var bool
     */
    public $checkSidercar;
    protected $_name = [
        'authToken'            => 'auth_token',
        'namespace'            => 'namespace',
        'containerServiceName' => 'container_service_name',
        'workspaceGroup'       => 'workspace_group',
        'checkSidercar'        => 'check_sidercar',
    ];

    public function validate()
    {
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->checkSidercar) {
            $res['check_sidercar'] = $this->checkSidercar;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckContainerserviceConflictopsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['check_sidercar'])) {
            $model->checkSidercar = $map['check_sidercar'];
        }

        return $model;
    }
}

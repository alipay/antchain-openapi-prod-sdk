<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateFedloadbalancerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 联邦负载均衡实例名称
    /**
     * @var string
     */
    public $name;

    // 联邦负载均衡实例所在命名空间
    /**
     * @var string
     */
    public $namespace;

    // 地址类型，例如公网、内网
    /**
     * @var string
     */
    public $addrType;

    // 指定负载均衡规格
    /**
     * @var string
     */
    public $spec;

    // 联邦负载均衡实例对应的部署单元列表
    /**
     * @var string[]
     */
    public $cells;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'      => 'auth_token',
        'name'           => 'name',
        'namespace'      => 'namespace',
        'addrType'       => 'addr_type',
        'spec'           => 'spec',
        'cells'          => 'cells',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('addrType', $this->addrType, true);
        Model::validateRequired('cells', $this->cells, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->addrType) {
            $res['addr_type'] = $this->addrType;
        }
        if (null !== $this->spec) {
            $res['spec'] = $this->spec;
        }
        if (null !== $this->cells) {
            $res['cells'] = $this->cells;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFedloadbalancerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['addr_type'])) {
            $model->addrType = $map['addr_type'];
        }
        if (isset($map['spec'])) {
            $model->spec = $map['spec'];
        }
        if (isset($map['cells'])) {
            if (!empty($map['cells'])) {
                $model->cells = $map['cells'];
            }
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryDeploymentCellRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'name' => 'name',
        'namePrefix' => 'name_prefix',
        'workspace' => 'workspace',
        'workspaceGroup' => 'workspace_group',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namePrefix) {
            $res['name_prefix'] = $this->namePrefix;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDeploymentCellRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['name_prefix'])){
            $model->namePrefix = $map['name_prefix'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        if(isset($map['workspace_group'])){
            $model->workspaceGroup = $map['workspace_group'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 部署单元名称
    /**
     * @var string
     */
    public $name;

    // 部署单元名称前缀
    /**
     * @var string
     */
    public $namePrefix;

    // 所属工作空间名称
    /**
     * @var string
     */
    public $workspace;

    // 所属环境组名称
    /**
     * @var string
     */
    public $workspaceGroup;

}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateDeploymentCellRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'color' => 'color',
        'isGray' => 'is_gray',
        'name' => 'name',
        'weight' => 'weight',
        'workspace' => 'workspace',
        'workspaceGroup' => 'workspace_group',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->isGray) {
            $res['is_gray'] = $this->isGray;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
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
     * @return UpdateDeploymentCellRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['color'])){
            $model->color = $map['color'];
        }
        if(isset($map['is_gray'])){
            $model->isGray = $map['is_gray'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['weight'])){
            $model->weight = $map['weight'];
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

    // 蓝绿着色信息
    /**
     * @var string
     */
    public $color;

    // 是否灰度
    /**
     * @var bool
     */
    public $isGray;

    // 部署单元名称
    /**
     * @var string
     */
    public $name;

    // 权重
    /**
     * @var int
     */
    public $weight;

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

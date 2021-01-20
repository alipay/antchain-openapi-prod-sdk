<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateDeploymentCellRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'cellGroup' => 'cell_group',
        'color' => 'color',
        'identity' => 'identity',
        'isGray' => 'is_gray',
        'name' => 'name',
        'type' => 'type',
        'weight' => 'weight',
        'workspace' => 'workspace',
        'workspaceGroup' => 'workspace_group',
        'zone' => 'zone',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cellGroup) {
            $res['cell_group'] = $this->cellGroup;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->isGray) {
            $res['is_gray'] = $this->isGray;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
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
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateDeploymentCellRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['cell_group'])){
            $model->cellGroup = $map['cell_group'];
        }
        if(isset($map['color'])){
            $model->color = $map['color'];
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['is_gray'])){
            $model->isGray = $map['is_gray'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
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
        if(isset($map['zone'])){
            $model->zone = $map['zone'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 所属逻辑单元名称[单元化模式特有]
    // 当type为"RZone"或"CZone"时，为必填项
    /**
     * @var string
     */
    public $cellGroup;

    // 蓝绿着色信息[单元化模式特有]
    /**
     * @var string
     */
    public $color;

    // 部署单元唯一标识
    /**
     * @var string
     */
    public $identity;

    // 是否灰度[单元化模式特有]
    /**
     * @var bool
     */
    public $isGray;

    // 部署单元名称
    /**
     * @var string
     */
    public $name;

    // 部署单元类型:
    // RZone, CZone,GZone,default
    /**
     * @var string
     */
    public $type;

    // 权重[单元化模式特有]
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

    // 所属机房名称
    /**
     * @var string
     */
    public $zone;

}

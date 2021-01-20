<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeleteCellgroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'name' => 'name',
        'workspaceGroup' => 'workspace_group',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteCellgroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
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

    // 逻辑单元名称
    /**
     * @var string
     */
    public $name;

    // 所属环境名称
    /**
     * @var string
     */
    public $workspaceGroup;

}

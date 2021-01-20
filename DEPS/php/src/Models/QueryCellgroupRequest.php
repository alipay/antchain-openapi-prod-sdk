<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryCellgroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'namePrefix' => 'name_prefix',
        'workspaceGroup' => 'workspace_group',
        'name' => 'name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->namePrefix) {
            $res['name_prefix'] = $this->namePrefix;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryCellgroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['name_prefix'])){
            $model->namePrefix = $map['name_prefix'];
        }
        if(isset($map['workspace_group'])){
            $model->workspaceGroup = $map['workspace_group'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // cell group 查询前缀
    /**
     * @var string
     */
    public $namePrefix;

    // 所属环境名称
    /**
     * @var string
     */
    public $workspaceGroup;

    // 逻辑单元名称
    /**
     * @var string
     */
    public $name;

}

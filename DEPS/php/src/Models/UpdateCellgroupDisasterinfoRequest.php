<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\DisasterInfo;

class UpdateCellgroupDisasterinfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'disasterInfo' => 'disaster_info',
        'name' => 'name',
        'operator' => 'operator',
        'workspaceGroup' => 'workspace_group',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->disasterInfo) {
            $res['disaster_info'] = [];
            if(null !== $this->disasterInfo && is_array($this->disasterInfo)){
                $n = 0;
                foreach($this->disasterInfo as $item){
                    $res['disaster_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateCellgroupDisasterinfoRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['disaster_info'])){
            if(!empty($map['disaster_info'])){
                $model->disasterInfo = [];
                $n = 0;
                foreach($map['disaster_info'] as $item) {
                    $model->disasterInfo[$n++] = null !== $item ? DisasterInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['operator'])){
            $model->operator = $map['operator'];
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

    // 灾备信息
    /**
     * @var DisasterInfo[]
     */
    public $disasterInfo;

    // 逻辑单元名称
    /**
     * @var string
     */
    public $name;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 所属环境组名称
    /**
     * @var string
     */
    public $workspaceGroup;

}

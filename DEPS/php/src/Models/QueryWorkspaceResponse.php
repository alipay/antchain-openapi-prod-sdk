<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsGroup;
use AntChain\Deps\Models\Workspace;

class QueryWorkspaceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'groups' => 'groups',
        'workspaces' => 'workspaces',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->groups) {
            $res['groups'] = [];
            if(null !== $this->groups && is_array($this->groups)){
                $n = 0;
                foreach($this->groups as $item){
                    $res['groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = [];
            if(null !== $this->workspaces && is_array($this->workspaces)){
                $n = 0;
                foreach($this->workspaces as $item){
                    $res['workspaces'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryWorkspaceResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['groups'])){
            if(!empty($map['groups'])){
                $model->groups = [];
                $n = 0;
                foreach($map['groups'] as $item) {
                    $model->groups[$n++] = null !== $item ? OpsGroup::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['workspaces'])){
            if(!empty($map['workspaces'])){
                $model->workspaces = [];
                $n = 0;
                foreach($map['workspaces'] as $item) {
                    $model->workspaces[$n++] = null !== $item ? Workspace::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 此应用下所有计算容器分组运维状态详情
    /**
     * @var OpsGroup[]
     */
    public $groups;

    // 查询结果，workspace列表
    /**
     * @var Workspace[]
     */
    public $workspaces;

}

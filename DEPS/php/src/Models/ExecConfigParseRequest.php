<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\TemplateParamDef;

class ExecConfigParseRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appName' => 'app_name',
        'params' => 'params',
        'workspaceGroupId' => 'workspace_group_id',
        'workspaceId' => 'workspace_id',
    ];
    public function validate() {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('params', $this->params, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->params) {
            $res['params'] = [];
            if(null !== $this->params && is_array($this->params)){
                $n = 0;
                foreach($this->params as $item){
                    $res['params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecConfigParseRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['params'])){
            if(!empty($map['params'])){
                $model->params = [];
                $n = 0;
                foreach($map['params'] as $item) {
                    $model->params[$n++] = null !== $item ? TemplateParamDef::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['workspace_group_id'])){
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
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

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 参数定义列表
    /**
     * @var TemplateParamDef[]
     */
    public $params;

    // 工作空间组 id
    /**
     * @var string
     */
    public $workspaceGroupId;

    // 工作空间 id
    /**
     * @var string
     */
    public $workspaceId;

}

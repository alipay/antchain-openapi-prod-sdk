<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppServiceEntity;

class DeployView extends Model {
    protected $_name = [
        'workspaceAppServices' => 'workspace_app_services',
        'workspaceDisplayName' => 'workspace_display_name',
        'workspaceId' => 'workspace_id',
        'workspaceName' => 'workspace_name',
    ];
    public function validate() {
        Model::validateRequired('workspaceAppServices', $this->workspaceAppServices, true);
        Model::validateRequired('workspaceDisplayName', $this->workspaceDisplayName, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->workspaceAppServices) {
            $res['workspace_app_services'] = [];
            if(null !== $this->workspaceAppServices && is_array($this->workspaceAppServices)){
                $n = 0;
                foreach($this->workspaceAppServices as $item){
                    $res['workspace_app_services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->workspaceDisplayName) {
            $res['workspace_display_name'] = $this->workspaceDisplayName;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeployView
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['workspace_app_services'])){
            if(!empty($map['workspace_app_services'])){
                $model->workspaceAppServices = [];
                $n = 0;
                foreach($map['workspace_app_services'] as $item) {
                    $model->workspaceAppServices[$n++] = null !== $item ? AppServiceEntity::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['workspace_display_name'])){
            $model->workspaceDisplayName = $map['workspace_display_name'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        if(isset($map['workspace_name'])){
            $model->workspaceName = $map['workspace_name'];
        }
        return $model;
    }
    // 当前 workspace 下的所有应用服务
    /**
     * @example 
     * @var AppServiceEntity[]
     */
    public $workspaceAppServices;

    // workspace 显示名称
    /**
     * @example 测试环境
     * @var string
     */
    public $workspaceDisplayName;

    // workspace id
    /**
     * @example 00004302401
     * @var string
     */
    public $workspaceId;

    // workspace 名称
    /**
     * @example 58sit
     * @var string
     */
    public $workspaceName;

}

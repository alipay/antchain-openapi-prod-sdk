<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Application;

class CreateDeploymentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'applications' => 'applications',
        'autoExecute' => 'auto_execute',
        'deployDimension' => 'deploy_dimension',
        'title' => 'title',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('applications', $this->applications, true);
        Model::validateRequired('deployDimension', $this->deployDimension, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->applications) {
            $res['applications'] = [];
            if(null !== $this->applications && is_array($this->applications)){
                $n = 0;
                foreach($this->applications as $item){
                    $res['applications'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->autoExecute) {
            $res['auto_execute'] = $this->autoExecute;
        }
        if (null !== $this->deployDimension) {
            $res['deploy_dimension'] = $this->deployDimension;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateDeploymentRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['applications'])){
            if(!empty($map['applications'])){
                $model->applications = [];
                $n = 0;
                foreach($map['applications'] as $item) {
                    $model->applications[$n++] = null !== $item ? Application::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['auto_execute'])){
            $model->autoExecute = $map['auto_execute'];
        }
        if(isset($map['deploy_dimension'])){
            $model->deployDimension = $map['deploy_dimension'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
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

    // 应用列表
    /**
     * @var Application[]
     */
    public $applications;

    // 是否启用自动运维，默认为**False**
    /**
     * @var bool
     */
    public $autoExecute;

    // 部署维度，有两种取值：APPLICATION和APP_SERVICE。设置为APPLICATION，表示在尚未引入应用服务环境中对整个应用都执行部署操作; APP_SERVICE表示在引入应用服务的环境中对应用服务执行部署操作。
    /**
     * @var string
     */
    public $deployDimension;

    // 部署单标题。长度不超过50个UTF-8字符
    /**
     * @var string
     */
    public $title;

    // 执行部署操作的目标工作空间
    /**
     * @var string
     */
    public $workspace;

}

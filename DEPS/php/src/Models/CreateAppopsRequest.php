<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Application;
use AntChain\Deps\Models\Computer;

class CreateAppopsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'applications' => 'applications',
        'autoExecute' => 'auto_execute',
        'computers' => 'computers',
        'opsAction' => 'ops_action',
        'opsActionParams' => 'ops_action_params',
        'opsDimension' => 'ops_dimension',
        'title' => 'title',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
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
        if (null !== $this->computers) {
            $res['computers'] = [];
            if(null !== $this->computers && is_array($this->computers)){
                $n = 0;
                foreach($this->computers as $item){
                    $res['computers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->opsAction) {
            $res['ops_action'] = $this->opsAction;
        }
        if (null !== $this->opsActionParams) {
            $res['ops_action_params'] = $this->opsActionParams;
        }
        if (null !== $this->opsDimension) {
            $res['ops_dimension'] = $this->opsDimension;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateAppopsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
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
        if(isset($map['computers'])){
            if(!empty($map['computers'])){
                $model->computers = [];
                $n = 0;
                foreach($map['computers'] as $item) {
                    $model->computers[$n++] = null !== $item ? Computer::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['ops_action'])){
            $model->opsAction = $map['ops_action'];
        }
        if(isset($map['ops_action_params'])){
            $model->opsActionParams = $map['ops_action_params'];
        }
        if(isset($map['ops_dimension'])){
            $model->opsDimension = $map['ops_dimension'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 执行运维操作的目标应用名称列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个应用，使用如下形式：applications.1.name=myapp1&applications.2.name=myapp2
    /**
     * @var Application[]
     */
    public $applications;

    // 是否启用自动运维，默认为**False**
    /**
     * @var bool
     */
    public $autoExecute;

    // 执行运维操作的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    /**
     * @var Computer[]
     */
    public $computers;

    // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源。
    // 部署静态资源需传入 ops_action_params 为("default_execute_account", "resource_download_url", "resource_target_file")
    // 
    /**
     * @var string
     */
    public $opsAction;

    // ops_action 所需要的参数，以JSON格式传入。以 {"param_name": "param_value"} 定义JSON。
    /**
     * @var string
     */
    public $opsActionParams;

    // 应用运维的维度，有三种取值：APPLICATION、APP_SERVICE和MACHINE。设置为APPLICATION，表示在非应用服务环境下整个应用都执行该应用运维操作；设置为APP_SERVICE，表示在应用服务环境下对应用服务执行运维操作;设置为MACHINE，表示应用下的一台或多台机器执行改应用运维操作。
    /**
     * @var string
     */
    public $opsDimension;

    // 运维单标题。长度不超过50个UTF-8字符
    /**
     * @var string
     */
    public $title;

}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateAppopsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 执行运维操作的目标应用列表,可通过services指定应用下待运维的应用服务实例. 如果要指定多个应用, 使用如下形式: applications.1.name=app1&applications.2.name=app2&applications.2.services.1.name=app2-sv1&applications.2.services.1.workspace=shdev
    /**
     * @var Application[]
     */
    public $applications;

    // 是否自动执行运维单, 默认为false.当设置为true是,创建完成并初始化成功后会自动执行该运维单.
    /**
     * @var bool
     */
    public $autoExecution;

    // 执行运维操作的目标机器id列表。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    /**
     * @var string[]
     */
    public $computers;

    // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源
    /**
     * @var string
     */
    public $opsAction;

    // 执行ops_action所需要的参数。
    /**
     * @var OpsParam[]
     */
    public $opsActionParams;

    // 应用运维的维度，有两种取值：APPLICATION和MACHINE。设置为APPLICATION，表示在非应用服务环境下该应用执行该应用运维操作；设置为MACHINE，表示应用下的一台或多台机器执行该应用运维操作。
    /**
     * @var string
     */
    public $opsDemension;

    // 应用运维单标题
    /**
     * @var string
     */
    public $title;

    // 工作空间组名称
    /**
     * @var string
     */
    public $workspaceGroup;

    // Map<String, String> 序列化后字符串
    /**
     * @var string
     */
    public $context;

    // 机器分组策略，默认采用快速分组
    // QUICK         -     快速分组
    // ALL_ONE    - 共分一组
    // EACH_ONE - 每台一组
    //
    /**
     * @var string
     */
    public $groupStrategy;
    protected $_name = [
        'authToken'       => 'auth_token',
        'applications'    => 'applications',
        'autoExecution'   => 'auto_execution',
        'computers'       => 'computers',
        'opsAction'       => 'ops_action',
        'opsActionParams' => 'ops_action_params',
        'opsDemension'    => 'ops_demension',
        'title'           => 'title',
        'workspaceGroup'  => 'workspace_group',
        'context'         => 'context',
        'groupStrategy'   => 'group_strategy',
    ];

    public function validate()
    {
        Model::validateRequired('opsAction', $this->opsAction, true);
        Model::validateRequired('opsDemension', $this->opsDemension, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->applications) {
            $res['applications'] = [];
            if (null !== $this->applications && \is_array($this->applications)) {
                $n = 0;
                foreach ($this->applications as $item) {
                    $res['applications'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->autoExecution) {
            $res['auto_execution'] = $this->autoExecution;
        }
        if (null !== $this->computers) {
            $res['computers'] = $this->computers;
        }
        if (null !== $this->opsAction) {
            $res['ops_action'] = $this->opsAction;
        }
        if (null !== $this->opsActionParams) {
            $res['ops_action_params'] = [];
            if (null !== $this->opsActionParams && \is_array($this->opsActionParams)) {
                $n = 0;
                foreach ($this->opsActionParams as $item) {
                    $res['ops_action_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->opsDemension) {
            $res['ops_demension'] = $this->opsDemension;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAppopsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['applications'])) {
            if (!empty($map['applications'])) {
                $model->applications = [];
                $n                   = 0;
                foreach ($map['applications'] as $item) {
                    $model->applications[$n++] = null !== $item ? Application::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['auto_execution'])) {
            $model->autoExecution = $map['auto_execution'];
        }
        if (isset($map['computers'])) {
            if (!empty($map['computers'])) {
                $model->computers = $map['computers'];
            }
        }
        if (isset($map['ops_action'])) {
            $model->opsAction = $map['ops_action'];
        }
        if (isset($map['ops_action_params'])) {
            if (!empty($map['ops_action_params'])) {
                $model->opsActionParams = [];
                $n                      = 0;
                foreach ($map['ops_action_params'] as $item) {
                    $model->opsActionParams[$n++] = null !== $item ? OpsParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ops_demension'])) {
            $model->opsDemension = $map['ops_demension'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateDeploymentTemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 模板编码
    /**
     * @var string
     */
    public $name;

    // 中文名称
    /**
     * @var string
     */
    public $displayName;

    // 模板描述
    /**
     * @var string
     */
    public $description;

    // 是否覆盖版本中的发布策略
    /**
     * @var bool
     */
    public $overrideDeployConfig;

    // 发布策略
    /**
     * @var DeployConfig
     */
    public $deployConfig;

    // 是否开启变更卡点
    /**
     * @var bool
     */
    public $enableCustomHook;

    // 卡点类型：api或has
    /**
     * @var string
     */
    public $hookType;

    // 自定义卡点配置列表
    /**
     * @var CustomHook[]
     */
    public $customHooks;

    // 操作人
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'            => 'auth_token',
        'name'                 => 'name',
        'displayName'          => 'display_name',
        'description'          => 'description',
        'overrideDeployConfig' => 'override_deploy_config',
        'deployConfig'         => 'deploy_config',
        'enableCustomHook'     => 'enable_custom_hook',
        'hookType'             => 'hook_type',
        'customHooks'          => 'custom_hooks',
        'operator'             => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('overrideDeployConfig', $this->overrideDeployConfig, true);
        Model::validateRequired('enableCustomHook', $this->enableCustomHook, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->overrideDeployConfig) {
            $res['override_deploy_config'] = $this->overrideDeployConfig;
        }
        if (null !== $this->deployConfig) {
            $res['deploy_config'] = null !== $this->deployConfig ? $this->deployConfig->toMap() : null;
        }
        if (null !== $this->enableCustomHook) {
            $res['enable_custom_hook'] = $this->enableCustomHook;
        }
        if (null !== $this->hookType) {
            $res['hook_type'] = $this->hookType;
        }
        if (null !== $this->customHooks) {
            $res['custom_hooks'] = [];
            if (null !== $this->customHooks && \is_array($this->customHooks)) {
                $n = 0;
                foreach ($this->customHooks as $item) {
                    $res['custom_hooks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDeploymentTemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['override_deploy_config'])) {
            $model->overrideDeployConfig = $map['override_deploy_config'];
        }
        if (isset($map['deploy_config'])) {
            $model->deployConfig = DeployConfig::fromMap($map['deploy_config']);
        }
        if (isset($map['enable_custom_hook'])) {
            $model->enableCustomHook = $map['enable_custom_hook'];
        }
        if (isset($map['hook_type'])) {
            $model->hookType = $map['hook_type'];
        }
        if (isset($map['custom_hooks'])) {
            if (!empty($map['custom_hooks'])) {
                $model->customHooks = [];
                $n                  = 0;
                foreach ($map['custom_hooks'] as $item) {
                    $model->customHooks[$n++] = null !== $item ? CustomHook::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}

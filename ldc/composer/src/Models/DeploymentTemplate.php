<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DeploymentTemplate extends Model
{
    // 模板编码
    /**
     * @example TEMPLATE_1
     *
     * @var string
     */
    public $name;

    // 中文名称
    /**
     * @example 测试模板
     *
     * @var string
     */
    public $displayName;

    // 模板描述
    /**
     * @example 测试模板
     *
     * @var string
     */
    public $description;

    // 是否覆盖版本中的发布策略
    /**
     * @example true, false
     *
     * @var bool
     */
    public $overrideDeployConfig;

    // 发布策略
    /**
     * @example
     *
     * @var DeployConfig
     */
    public $deployConfig;

    // 是否开启变更卡点
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableCustomHook;

    // 卡点类型：api或has
    /**
     * @example has
     *
     * @var string
     */
    public $hookType;

    // 自定义卡点配置列表
    //
    /**
     * @example
     *
     * @var CustomHook[]
     */
    public $customHooks;

    // 操作人
    /**
     * @example admin
     *
     * @var string
     */
    public $operator;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;

    // 版本号
    /**
     * @example 1
     *
     * @var int
     */
    public $version;
    protected $_name = [
        'name'                 => 'name',
        'displayName'          => 'display_name',
        'description'          => 'description',
        'overrideDeployConfig' => 'override_deploy_config',
        'deployConfig'         => 'deploy_config',
        'enableCustomHook'     => 'enable_custom_hook',
        'hookType'             => 'hook_type',
        'customHooks'          => 'custom_hooks',
        'operator'             => 'operator',
        'createdTime'          => 'created_time',
        'modifiedTime'         => 'modified_time',
        'version'              => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('overrideDeployConfig', $this->overrideDeployConfig, true);
        Model::validateRequired('enableCustomHook', $this->enableCustomHook, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeploymentTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}

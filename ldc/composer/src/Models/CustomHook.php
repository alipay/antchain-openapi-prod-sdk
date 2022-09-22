<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CustomHook extends Model
{
    // 卡点范围，目前只支持分批
    /**
     * @example batch
     *
     * @var string
     */
    public $hookScope;

    // 卡点类型：api或has
    /**
     * @example api
     *
     * @var string
     */
    public $hookType;

    // 卡点名称
    /**
     * @example TEST1
     *
     * @var string
     */
    public $hookName;

    // 卡点执行策略：each-每个分组，first-第一个分组，last-最后一个分组，custom-自定义分组。
    // 默认每个分组都会执行。
    /**
     * @example each
     *
     * @var string
     */
    public $hookStrategy;

    // 自定义批次编号，从1开始。hook_strategy=custom时有效
    /**
     * @example 1
     *
     * @var int
     */
    public $customNum;

    // api类型卡点配置，当hook_type=api时不能为空
    /**
     * @example {}
     *
     * @var ApiHookConfig
     */
    public $apiHookConfig;

    // 守夜人类型卡点配置，当hook_type=has时不能为空
    /**
     * @example {}
     *
     * @var HasHookConfig
     */
    public $hasHookConfig;

    // 【暂不支持】是否允许忽略
    /**
     * @example true
     *
     * @var bool
     */
    public $ignoreSupported;

    // 【暂不支持】任务超时时间，单位毫秒，默认10分钟
    /**
     * @example 60000
     *
     * @var int
     */
    public $timeoutMillis;

    // 【暂不支持】默认true
    /**
     * @example true, false
     *
     * @var bool
     */
    public $unOverride;

    // 【暂不支持】是否需要确认
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needConfirm;
    protected $_name = [
        'hookScope'       => 'hook_scope',
        'hookType'        => 'hook_type',
        'hookName'        => 'hook_name',
        'hookStrategy'    => 'hook_strategy',
        'customNum'       => 'custom_num',
        'apiHookConfig'   => 'api_hook_config',
        'hasHookConfig'   => 'has_hook_config',
        'ignoreSupported' => 'ignore_supported',
        'timeoutMillis'   => 'timeout_millis',
        'unOverride'      => 'un_override',
        'needConfirm'     => 'need_confirm',
    ];

    public function validate()
    {
        Model::validateRequired('hookScope', $this->hookScope, true);
        Model::validateRequired('hookType', $this->hookType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hookScope) {
            $res['hook_scope'] = $this->hookScope;
        }
        if (null !== $this->hookType) {
            $res['hook_type'] = $this->hookType;
        }
        if (null !== $this->hookName) {
            $res['hook_name'] = $this->hookName;
        }
        if (null !== $this->hookStrategy) {
            $res['hook_strategy'] = $this->hookStrategy;
        }
        if (null !== $this->customNum) {
            $res['custom_num'] = $this->customNum;
        }
        if (null !== $this->apiHookConfig) {
            $res['api_hook_config'] = null !== $this->apiHookConfig ? $this->apiHookConfig->toMap() : null;
        }
        if (null !== $this->hasHookConfig) {
            $res['has_hook_config'] = null !== $this->hasHookConfig ? $this->hasHookConfig->toMap() : null;
        }
        if (null !== $this->ignoreSupported) {
            $res['ignore_supported'] = $this->ignoreSupported;
        }
        if (null !== $this->timeoutMillis) {
            $res['timeout_millis'] = $this->timeoutMillis;
        }
        if (null !== $this->unOverride) {
            $res['un_override'] = $this->unOverride;
        }
        if (null !== $this->needConfirm) {
            $res['need_confirm'] = $this->needConfirm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomHook
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['hook_scope'])) {
            $model->hookScope = $map['hook_scope'];
        }
        if (isset($map['hook_type'])) {
            $model->hookType = $map['hook_type'];
        }
        if (isset($map['hook_name'])) {
            $model->hookName = $map['hook_name'];
        }
        if (isset($map['hook_strategy'])) {
            $model->hookStrategy = $map['hook_strategy'];
        }
        if (isset($map['custom_num'])) {
            $model->customNum = $map['custom_num'];
        }
        if (isset($map['api_hook_config'])) {
            $model->apiHookConfig = ApiHookConfig::fromMap($map['api_hook_config']);
        }
        if (isset($map['has_hook_config'])) {
            $model->hasHookConfig = HasHookConfig::fromMap($map['has_hook_config']);
        }
        if (isset($map['ignore_supported'])) {
            $model->ignoreSupported = $map['ignore_supported'];
        }
        if (isset($map['timeout_millis'])) {
            $model->timeoutMillis = $map['timeout_millis'];
        }
        if (isset($map['un_override'])) {
            $model->unOverride = $map['un_override'];
        }
        if (isset($map['need_confirm'])) {
            $model->needConfirm = $map['need_confirm'];
        }

        return $model;
    }
}

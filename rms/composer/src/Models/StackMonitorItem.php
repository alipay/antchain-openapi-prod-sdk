<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class StackMonitorItem extends Model
{
    // 监控项 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 技术栈 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $stackId;

    // 名称，必须是英文
    /**
     * @example cal
     *
     * @var string
     */
    public $name;

    // 显示名
    /**
     * @example 调用缓存服务
     *
     * @var string
     */
    public $displayName;

    // 能否自定义
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canCustom;

    // 管理实体 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $manageEntityId;

    // metric类型(dependency、error、service、resource等)
    /**
     * @example dependency
     *
     * @var string
     */
    public $metricType;

    // 配置(JSON String, 使用前需要解析)
    /**
     * @example {"sourceDim":"sofacloud#sofa_server","express":"sofacloud#sofa_server.app"}
     *
     * @var string
     */
    public $config;

    // 标题
    /**
     * @example nodeResource
     *
     * @var string
     */
    public $title;
    protected $_name = [
        'id'             => 'id',
        'stackId'        => 'stack_id',
        'name'           => 'name',
        'displayName'    => 'display_name',
        'canCustom'      => 'can_custom',
        'manageEntityId' => 'manage_entity_id',
        'metricType'     => 'metric_type',
        'config'         => 'config',
        'title'          => 'title',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('stackId', $this->stackId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('canCustom', $this->canCustom, true);
        Model::validateRequired('manageEntityId', $this->manageEntityId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->canCustom) {
            $res['can_custom'] = $this->canCustom;
        }
        if (null !== $this->manageEntityId) {
            $res['manage_entity_id'] = $this->manageEntityId;
        }
        if (null !== $this->metricType) {
            $res['metric_type'] = $this->metricType;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StackMonitorItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['stack_id'])) {
            $model->stackId = $map['stack_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['can_custom'])) {
            $model->canCustom = $map['can_custom'];
        }
        if (isset($map['manage_entity_id'])) {
            $model->manageEntityId = $map['manage_entity_id'];
        }
        if (isset($map['metric_type'])) {
            $model->metricType = $map['metric_type'];
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }

        return $model;
    }
}

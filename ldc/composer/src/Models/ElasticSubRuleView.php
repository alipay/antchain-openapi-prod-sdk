<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ElasticSubRuleView extends Model
{
    // 弹性子规则ID
    /**
     * @example 123
     *
     * @var int
     */
    public $id;

    // 所属APP
    /**
     * @example test-app
     *
     * @var string
     */
    public $appName;

    // 关联的弹性规则ID
    /**
     * @example 123
     *
     * @var int
     */
    public $elasticRuleId;

    // 父节点
    /**
     * @example 123
     *
     * @var int
     */
    public $parentId;

    // 值
    /**
     * @example test-value
     *
     * @var string
     */
    public $value;

    // 是否使用默认eid，默认 false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $useDefaultEid;

    // 状态，有效值：VALID（线上生效），PRESS（仅压测生效），INVALID（无效状态）
    /**
     * @example VALID
     *
     * @var string
     */
    public $status;

    // 规则类型
    /**
     * @example SERVICE
     *
     * @var string
     */
    public $type;

    // 场景ID
    /**
     * @example 123
     *
     * @var int
     */
    public $sceneId;
    protected $_name = [
        'id'            => 'id',
        'appName'       => 'app_name',
        'elasticRuleId' => 'elastic_rule_id',
        'parentId'      => 'parent_id',
        'value'         => 'value',
        'useDefaultEid' => 'use_default_eid',
        'status'        => 'status',
        'type'          => 'type',
        'sceneId'       => 'scene_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('elasticRuleId', $this->elasticRuleId, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->elasticRuleId) {
            $res['elastic_rule_id'] = $this->elasticRuleId;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->useDefaultEid) {
            $res['use_default_eid'] = $this->useDefaultEid;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ElasticSubRuleView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['elastic_rule_id'])) {
            $model->elasticRuleId = $map['elastic_rule_id'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['use_default_eid'])) {
            $model->useDefaultEid = $map['use_default_eid'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }

        return $model;
    }
}

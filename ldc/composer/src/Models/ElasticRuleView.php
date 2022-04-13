<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ElasticRuleView extends Model
{
    // ID
    /**
     * @example 123
     *
     * @var int
     */
    public $id;

    // 弹性类型，有效值：SERVICE，MSGBROKER
    /**
     * @example SERVICE
     *
     * @var string
     */
    public $type;

    // 弹性值
    /**
     * @example test-rule
     *
     * @var string
     */
    public $name;

    // 关联应用
    /**
     * @example test-app
     *
     * @var string
     */
    public $appName;

    // 状态，有效值：VALID（线上生效），PRESS（仅压测生效），INVALID（无效状态）
    /**
     * @example VALID
     *
     * @var string
     */
    public $status;

    // 操作人
    /**
     * @example zhangsan
     *
     * @var string
     */
    public $operator;

    // 场景 ID
    /**
     * @example 123
     *
     * @var int
     */
    public $sceneId;
    protected $_name = [
        'id'       => 'id',
        'type'     => 'type',
        'name'     => 'name',
        'appName'  => 'app_name',
        'status'   => 'status',
        'operator' => 'operator',
        'sceneId'  => 'scene_id',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ElasticRuleView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }

        return $model;
    }
}

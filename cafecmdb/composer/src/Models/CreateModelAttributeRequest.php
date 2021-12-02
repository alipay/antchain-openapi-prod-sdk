<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class CreateModelAttributeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 所属模型的唯一标识
    /**
     * @var string
     */
    public $modelId;

    // 唯一标识（所属模型内唯一）
    /**
     * @var string
     */
    public $uniqueId;

    // 名称（所属模型内唯一）
    /**
     * @var string
     */
    public $name;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 类型【取值范围：INTEGER，LONG，DOUBLE，FLOAT，BOOLEAN，STRING，DATE，DATETIME，ENUM，ARRAY】
    /**
     * @var string
     */
    public $type;

    // 是否只读
    /**
     * @var bool
     */
    public $readonly;

    // 是否必填
    /**
     * @var bool
     */
    public $required;

    // 用于前端展示排序，数字越大优先级越高，默认为 0
    /**
     * @var int
     */
    public $priority;

    // 用于前端展示的扩展属性
    /**
     * @var MapStringToStringEntry[]
     */
    public $displayProperties;

    // group_id
    /**
     * @var string
     */
    public $groupId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'modelId'           => 'model_id',
        'uniqueId'          => 'unique_id',
        'name'              => 'name',
        'description'       => 'description',
        'type'              => 'type',
        'readonly'          => 'readonly',
        'required'          => 'required',
        'priority'          => 'priority',
        'displayProperties' => 'display_properties',
        'groupId'           => 'group_id',
    ];

    public function validate()
    {
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('uniqueId', $this->uniqueId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('readonly', $this->readonly, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('groupId', $this->groupId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->readonly) {
            $res['readonly'] = $this->readonly;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->displayProperties) {
            $res['display_properties'] = [];
            if (null !== $this->displayProperties && \is_array($this->displayProperties)) {
                $n = 0;
                foreach ($this->displayProperties as $item) {
                    $res['display_properties'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateModelAttributeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['readonly'])) {
            $model->readonly = $map['readonly'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['display_properties'])) {
            if (!empty($map['display_properties'])) {
                $model->displayProperties = [];
                $n                        = 0;
                foreach ($map['display_properties'] as $item) {
                    $model->displayProperties[$n++] = null !== $item ? MapStringToStringEntry::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }

        return $model;
    }
}

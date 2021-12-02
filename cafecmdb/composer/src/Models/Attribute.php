<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class Attribute extends Model
{
    // 所属模型的唯一标识
    /**
     * @example computer
     *
     * @var string
     */
    public $modelId;

    // 唯一标识（所属模型内唯一）
    /**
     * @example ip
     *
     * @var string
     */
    public $uniqueId;

    // 名称（所属模型内唯一）
    /**
     * @example IP
     *
     * @var string
     */
    public $name;

    // 描述
    /**
     * @example IP 地址
     *
     * @var string
     */
    public $description;

    // 类型【取值范围：INTEGER，LONG，DOUBLE，FLOAT，BOOLEAN，STRING，DATE，DATETIME，ENUM，ARRAY】
    /**
     * @example STRING
     *
     * @var string
     */
    public $type;

    // 是否为系统内置
    /**
     * @example true, false
     *
     * @var bool
     */
    public $system;

    // 是否只读
    /**
     * @example true, false
     *
     * @var bool
     */
    public $readonly;

    // 是否必填
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;

    // 用于前端展示排序，数字越大优先级越高，默认为 0
    /**
     * @example 0
     *
     * @var int
     */
    public $priority;

    // 用于前端展示的扩展属性
    /**
     * @example
     *
     * @var MapStringToStringEntry[]
     */
    public $displayProperties;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;

    // 字段分组Id
    /**
     * @example group_name
     *
     * @var string
     */
    public $groupId;
    protected $_name = [
        'modelId'           => 'model_id',
        'uniqueId'          => 'unique_id',
        'name'              => 'name',
        'description'       => 'description',
        'type'              => 'type',
        'system'            => 'system',
        'readonly'          => 'readonly',
        'required'          => 'required',
        'priority'          => 'priority',
        'displayProperties' => 'display_properties',
        'createdTime'       => 'created_time',
        'modifiedTime'      => 'modified_time',
        'groupId'           => 'group_id',
    ];

    public function validate()
    {
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('uniqueId', $this->uniqueId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('system', $this->system, true);
        Model::validateRequired('readonly', $this->readonly, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('priority', $this->priority, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('modifiedTime', $this->modifiedTime, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->system) {
            $res['system'] = $this->system;
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
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Attribute
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['system'])) {
            $model->system = $map['system'];
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
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }

        return $model;
    }
}

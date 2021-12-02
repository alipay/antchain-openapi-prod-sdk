<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class Model extends Model
{
    // 唯一标识（全局唯一）
    /**
     * @example computer
     *
     * @var string
     */
    public $uniqueId;

    // 名称（全局唯一）
    /**
     * @example 主机
     *
     * @var string
     */
    public $name;

    // 所属模型分组的唯一标识
    /**
     * @example host_manage
     *
     * @var string
     */
    public $categoryId;

    // 描述
    /**
     * @example 主机（包括物理机、虚拟机等）
     *
     * @var string
     */
    public $description;

    // 是否为系统内置
    /**
     * @example true, false
     *
     * @var bool
     */
    public $system;

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
    protected $_name = [
        'uniqueId'          => 'unique_id',
        'name'              => 'name',
        'categoryId'        => 'category_id',
        'description'       => 'description',
        'system'            => 'system',
        'priority'          => 'priority',
        'displayProperties' => 'display_properties',
        'createdTime'       => 'created_time',
        'modifiedTime'      => 'modified_time',
    ];

    public function validate()
    {
        self::validateRequired('uniqueId', $this->uniqueId, true);
        self::validateRequired('name', $this->name, true);
        self::validateRequired('categoryId', $this->categoryId, true);
        self::validateRequired('system', $this->system, true);
        self::validateRequired('priority', $this->priority, true);
        self::validateRequired('createdTime', $this->createdTime, true);
        self::validateRequired('modifiedTime', $this->modifiedTime, true);
        self::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        self::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->system) {
            $res['system'] = $this->system;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Model
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['category_id'])) {
            $model->categoryId = $map['category_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['system'])) {
            $model->system = $map['system'];
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

        return $model;
    }
}

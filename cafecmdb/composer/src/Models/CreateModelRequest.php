<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class CreateModelRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 唯一标识（全局唯一）
    /**
     * @var string
     */
    public $uniqueId;

    // 名称（全局唯一）
    /**
     * @var string
     */
    public $name;

    // 所属模型分组的唯一标识
    /**
     * @var string
     */
    public $categoryId;

    // 描述
    /**
     * @var string
     */
    public $description;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'uniqueId'          => 'unique_id',
        'name'              => 'name',
        'categoryId'        => 'category_id',
        'description'       => 'description',
        'priority'          => 'priority',
        'displayProperties' => 'display_properties',
    ];

    public function validate()
    {
        Model::validateRequired('uniqueId', $this->uniqueId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('categoryId', $this->categoryId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateModelRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
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

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class OutputGroup extends Model
{
    // 子节点id
    /**
     * @example string
     *
     * @var string
     */
    public $id;

    // 自节点名称
    /**
     * @example ss
     *
     * @var string
     */
    public $name;

    // 快捷条件选择类型
    /**
     * @example ss
     *
     * @var string
     */
    public $conditionType;

    // 条件表达式
    /**
     * @example
     *
     * @var string[]
     */
    public $conditionConfig;

    // 子节点下的播报内容
    /**
     * @example
     *
     * @var Output[]
     */
    public $contentList;

    // 重试播报时的优先级
    /**
     * @example
     *
     * @var int
     */
    public $priority;
    protected $_name = [
        'id'              => 'id',
        'name'            => 'name',
        'conditionType'   => 'condition_type',
        'conditionConfig' => 'condition_config',
        'contentList'     => 'content_list',
        'priority'        => 'priority',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('conditionType', $this->conditionType, true);
        Model::validateRequired('conditionConfig', $this->conditionConfig, true);
        Model::validateRequired('contentList', $this->contentList, true);
        Model::validateRequired('priority', $this->priority, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->conditionType) {
            $res['condition_type'] = $this->conditionType;
        }
        if (null !== $this->conditionConfig) {
            $res['condition_config'] = $this->conditionConfig;
        }
        if (null !== $this->contentList) {
            $res['content_list'] = [];
            if (null !== $this->contentList && \is_array($this->contentList)) {
                $n = 0;
                foreach ($this->contentList as $item) {
                    $res['content_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OutputGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['condition_type'])) {
            $model->conditionType = $map['condition_type'];
        }
        if (isset($map['condition_config'])) {
            if (!empty($map['condition_config'])) {
                $model->conditionConfig = $map['condition_config'];
            }
        }
        if (isset($map['content_list'])) {
            if (!empty($map['content_list'])) {
                $model->contentList = [];
                $n                  = 0;
                foreach ($map['content_list'] as $item) {
                    $model->contentList[$n++] = null !== $item ? Output::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }

        return $model;
    }
}

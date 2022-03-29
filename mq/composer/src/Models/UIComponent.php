<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UIComponent extends Model
{
    // UI组件类型
    /**
     * @example title
     *
     * @var string
     */
    public $type;

    // UI组件中的 内容组成部分，可以由多个Content对象组成
    /**
     * @example
     *
     * @var ComponentContent[]
     */
    public $contents;

    // 列表内元素组件集合
    /**
     * @example
     *
     * @var ItemComponent[]
     */
    public $listItems;
    protected $_name = [
        'type'      => 'type',
        'contents'  => 'contents',
        'listItems' => 'list_items',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('contents', $this->contents, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->contents) {
            $res['contents'] = [];
            if (null !== $this->contents && \is_array($this->contents)) {
                $n = 0;
                foreach ($this->contents as $item) {
                    $res['contents'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->listItems) {
            $res['list_items'] = [];
            if (null !== $this->listItems && \is_array($this->listItems)) {
                $n = 0;
                foreach ($this->listItems as $item) {
                    $res['list_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UIComponent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['contents'])) {
            if (!empty($map['contents'])) {
                $model->contents = [];
                $n               = 0;
                foreach ($map['contents'] as $item) {
                    $model->contents[$n++] = null !== $item ? ComponentContent::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['list_items'])) {
            if (!empty($map['list_items'])) {
                $model->listItems = [];
                $n                = 0;
                foreach ($map['list_items'] as $item) {
                    $model->listItems[$n++] = null !== $item ? ItemComponent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class BubbleButton extends Model
{
    // 按钮文案
    /**
     * @example 你好
     *
     * @var string
     */
    public $title;

    // 行动点执行动作值
    /**
     * @example 70001
     *
     * @var string
     */
    public $value;

    // 行动点执行动作类型
    /**
     * @example OUT_BIZ_ID
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'title' => 'title',
        'value' => 'value',
        'type'  => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BubbleButton
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}

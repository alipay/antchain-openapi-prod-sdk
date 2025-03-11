<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarComponentInfo extends Model
{
    // 组件标题
    /**
     * @example -
     *
     * @var string
     */
    public $title;

    // 组件编码
    /**
     * @example -
     *
     * @var string
     */
    public $code;

    // 组件值
    /**
     * @example -
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'title' => 'title',
        'code'  => 'code',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarComponentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}

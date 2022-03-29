<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UIKeyVauleTemplate extends Model
{
    // 中文，描述这个UI元素的key
    /**
     * @example Topic展示
     *
     * @var string
     */
    public $display;

    // 对应ui元素的key
    /**
     * @example topic
     *
     * @var string
     */
    public $key;

    // 对应UI元素的值
    /**
     * @example TP_TEST
     *
     * @var string
     */
    public $value;

    // 该配置是否对 用户 可见。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $visible;
    protected $_name = [
        'display' => 'display',
        'key'     => 'key',
        'value'   => 'value',
        'visible' => 'visible',
    ];

    public function validate()
    {
        Model::validateRequired('display', $this->display, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('visible', $this->visible, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->display) {
            $res['display'] = $this->display;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->visible) {
            $res['visible'] = $this->visible;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UIKeyVauleTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['display'])) {
            $model->display = $map['display'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['visible'])) {
            $model->visible = $map['visible'];
        }

        return $model;
    }
}

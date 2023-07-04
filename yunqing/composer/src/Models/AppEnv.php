<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AppEnv extends Model
{
    // 应用部署时用于渲染的值，渲染为value
    /**
     * @example default
     *
     * @var string
     */
    public $renderValue;

    // 参数的值，部署的时候会被render_value的渲染结果覆盖
    /**
     * @example default
     *
     * @var string
     */
    public $value;

    // 参数的key
    /**
     * @example cell_id
     *
     * @var string
     */
    public $key;
    protected $_name = [
        'renderValue' => 'render_value',
        'value'       => 'value',
        'key'         => 'key',
    ];

    public function validate()
    {
        Model::validateRequired('renderValue', $this->renderValue, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('key', $this->key, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->renderValue) {
            $res['render_value'] = $this->renderValue;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppEnv
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['render_value'])) {
            $model->renderValue = $map['render_value'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }

        return $model;
    }
}

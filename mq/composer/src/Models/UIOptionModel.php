<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UIOptionModel extends Model
{
    // 选项展示的中文描述
    /**
     * @example ODPS数据源
     *
     * @var string
     */
    public $display;

    // 选项的枚举值
    /**
     * @example ODPS
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'display' => 'display',
        'value'   => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('display', $this->display, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->display) {
            $res['display'] = $this->display;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UIOptionModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['display'])) {
            $model->display = $map['display'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}

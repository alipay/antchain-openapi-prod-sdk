<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ConfigEntity extends Model
{
    // 值
    /**
     * @example application_name
     *
     * @var string
     */
    public $value;

    // 英文描述
    /**
     * @example application_name
     *
     * @var string
     */
    public $descEn;

    // 中文描述
    /**
     * @example 应用名
     *
     * @var string
     */
    public $descCn;
    protected $_name = [
        'value'  => 'value',
        'descEn' => 'desc_en',
        'descCn' => 'desc_cn',
    ];

    public function validate()
    {
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('descEn', $this->descEn, true);
        Model::validateRequired('descCn', $this->descCn, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->descEn) {
            $res['desc_en'] = $this->descEn;
        }
        if (null !== $this->descCn) {
            $res['desc_cn'] = $this->descCn;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfigEntity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['desc_en'])) {
            $model->descEn = $map['desc_en'];
        }
        if (isset($map['desc_cn'])) {
            $model->descCn = $map['desc_cn'];
        }

        return $model;
    }
}

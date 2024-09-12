<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\UNITYCS\Models;

use AlibabaCloud\Tea\Model;

class MetaDataAttr extends Model
{
    // 元数据属性编码
    /**
     * @example 略
     *
     * @var string
     */
    public $code;

    // 元数据属性值
    /**
     * @example 略
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'code'  => 'code',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
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
     * @return MetaDataAttr
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}

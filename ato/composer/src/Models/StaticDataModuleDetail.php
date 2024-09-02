<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class StaticDataModuleDetail extends Model
{
    // 描述
    /**
     * @example 企业
     *
     * @var string
     */
    public $propertyText;

    // 商户类型
    /**
     * @example 01
     *
     * @var string
     */
    public $propertyValue;
    protected $_name = [
        'propertyText'  => 'property_text',
        'propertyValue' => 'property_value',
    ];

    public function validate()
    {
        Model::validateRequired('propertyText', $this->propertyText, true);
        Model::validateRequired('propertyValue', $this->propertyValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->propertyText) {
            $res['property_text'] = $this->propertyText;
        }
        if (null !== $this->propertyValue) {
            $res['property_value'] = $this->propertyValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StaticDataModuleDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['property_text'])) {
            $model->propertyText = $map['property_text'];
        }
        if (isset($map['property_value'])) {
            $model->propertyValue = $map['property_value'];
        }

        return $model;
    }
}

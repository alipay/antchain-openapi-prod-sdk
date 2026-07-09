<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotbasicDeviceModelAttributeInfo extends Model
{
    // 型号
    /**
     * @example A2
     *
     * @var string
     */
    public $modelValue;

    // 规格列表
    // 为空表示使用标准规格
    /**
     * @example
     *
     * @var string[]
     */
    public $specsList;
    protected $_name = [
        'modelValue' => 'model_value',
        'specsList'  => 'specs_list',
    ];

    public function validate()
    {
        Model::validateRequired('modelValue', $this->modelValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->modelValue) {
            $res['model_value'] = $this->modelValue;
        }
        if (null !== $this->specsList) {
            $res['specs_list'] = $this->specsList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotbasicDeviceModelAttributeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['model_value'])) {
            $model->modelValue = $map['model_value'];
        }
        if (isset($map['specs_list'])) {
            if (!empty($map['specs_list'])) {
                $model->specsList = $map['specs_list'];
            }
        }

        return $model;
    }
}

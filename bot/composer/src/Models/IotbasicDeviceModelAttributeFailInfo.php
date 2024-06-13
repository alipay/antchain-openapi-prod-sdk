<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotbasicDeviceModelAttributeFailInfo extends Model
{
    // 型号
    /**
     * @example A2
     *
     * @var string
     */
    public $modelValue;

    // 规格列表 为空表示使用标准规格
    /**
     * @example
     *
     * @var string[]
     */
    public $specsList;

    // 失败code
    /**
     * @example code
     *
     * @var string
     */
    public $errorCode;

    // 失败消息
    /**
     * @example message
     *
     * @var string
     */
    public $errorMessage;
    protected $_name = [
        'modelValue'   => 'model_value',
        'specsList'    => 'specs_list',
        'errorCode'    => 'error_code',
        'errorMessage' => 'error_message',
    ];

    public function validate()
    {
        Model::validateRequired('modelValue', $this->modelValue, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('errorMessage', $this->errorMessage, true);
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
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotbasicDeviceModelAttributeFailInfo
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
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateDeviceModelResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 接口调用结果
    /**
     * @var bool
     */
    public $success;

    // 属性失败列表
    /**
     * @var IotbasicDeviceModelAttributeFailInfo[]
     */
    public $attributeFailList;

    // 固定属性失败列表
    /**
     * @var IotbasicDeviceModelFixedAttributeFailInfo[]
     */
    public $fixedAttributeFailList;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'success'                => 'success',
        'attributeFailList'      => 'attribute_fail_list',
        'fixedAttributeFailList' => 'fixed_attribute_fail_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->attributeFailList) {
            $res['attribute_fail_list'] = [];
            if (null !== $this->attributeFailList && \is_array($this->attributeFailList)) {
                $n = 0;
                foreach ($this->attributeFailList as $item) {
                    $res['attribute_fail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->fixedAttributeFailList) {
            $res['fixed_attribute_fail_list'] = [];
            if (null !== $this->fixedAttributeFailList && \is_array($this->fixedAttributeFailList)) {
                $n = 0;
                foreach ($this->fixedAttributeFailList as $item) {
                    $res['fixed_attribute_fail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDeviceModelResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['attribute_fail_list'])) {
            if (!empty($map['attribute_fail_list'])) {
                $model->attributeFailList = [];
                $n                        = 0;
                foreach ($map['attribute_fail_list'] as $item) {
                    $model->attributeFailList[$n++] = null !== $item ? IotbasicDeviceModelAttributeFailInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['fixed_attribute_fail_list'])) {
            if (!empty($map['fixed_attribute_fail_list'])) {
                $model->fixedAttributeFailList = [];
                $n                             = 0;
                foreach ($map['fixed_attribute_fail_list'] as $item) {
                    $model->fixedAttributeFailList[$n++] = null !== $item ? IotbasicDeviceModelFixedAttributeFailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

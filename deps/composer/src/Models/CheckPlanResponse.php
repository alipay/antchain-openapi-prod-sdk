<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CheckPlanResponse extends Model
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

    // data
    /**
     * @var string
     */
    public $data;

    // error_reasons
    /**
     * @var string[]
     */
    public $errorReasons;

    // validation_messages
    /**
     * @var string
     */
    public $validationMessages;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'data'               => 'data',
        'errorReasons'       => 'error_reasons',
        'validationMessages' => 'validation_messages',
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
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->errorReasons) {
            $res['error_reasons'] = $this->errorReasons;
        }
        if (null !== $this->validationMessages) {
            $res['validation_messages'] = $this->validationMessages;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckPlanResponse
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
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['error_reasons'])) {
            if (!empty($map['error_reasons'])) {
                $model->errorReasons = $map['error_reasons'];
            }
        }
        if (isset($map['validation_messages'])) {
            $model->validationMessages = $map['validation_messages'];
        }

        return $model;
    }
}

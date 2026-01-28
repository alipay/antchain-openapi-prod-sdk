<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class CheckEasMdetectionResponse extends Model
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

    // 检查结果
    /**
     * @var bool
     */
    public $checkResult;

    // 检查结果码
    /**
     * @var string
     */
    public $checkCode;

    // 检查消息
    /**
     * @var string
     */
    public $checkMessage;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'checkResult'  => 'check_result',
        'checkCode'    => 'check_code',
        'checkMessage' => 'check_message',
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
        if (null !== $this->checkResult) {
            $res['check_result'] = $this->checkResult;
        }
        if (null !== $this->checkCode) {
            $res['check_code'] = $this->checkCode;
        }
        if (null !== $this->checkMessage) {
            $res['check_message'] = $this->checkMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckEasMdetectionResponse
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
        if (isset($map['check_result'])) {
            $model->checkResult = $map['check_result'];
        }
        if (isset($map['check_code'])) {
            $model->checkCode = $map['check_code'];
        }
        if (isset($map['check_message'])) {
            $model->checkMessage = $map['check_message'];
        }

        return $model;
    }
}

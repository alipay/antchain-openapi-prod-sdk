<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class CheckSpProductOrderparameterResponse extends Model
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

    // 参数校验结果，PASS 通过，UNPASS 不通过
    /**
     * @var string
     */
    public $checkStatus;

    // 参数校验不通过的提示信息
    /**
     * @var string
     */
    public $checkMsg;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'checkStatus' => 'check_status',
        'checkMsg'    => 'check_msg',
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
        if (null !== $this->checkStatus) {
            $res['check_status'] = $this->checkStatus;
        }
        if (null !== $this->checkMsg) {
            $res['check_msg'] = $this->checkMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckSpProductOrderparameterResponse
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
        if (isset($map['check_status'])) {
            $model->checkStatus = $map['check_status'];
        }
        if (isset($map['check_msg'])) {
            $model->checkMsg = $map['check_msg'];
        }

        return $model;
    }
}

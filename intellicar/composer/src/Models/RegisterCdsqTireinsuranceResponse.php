<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class RegisterCdsqTireinsuranceResponse extends Model
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

    // 结果码
    /**
     * @var string
     */
    public $responseCode;

    // 错误信息
    /**
     * @var string
     */
    public $responseMsg;

    // 保单服务号
    /**
     * @var string
     */
    public $policyNo;

    // 保险起期，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $policyStart;

    // 保险止期，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $policyEnd;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'responseCode' => 'response_code',
        'responseMsg'  => 'response_msg',
        'policyNo'     => 'policy_no',
        'policyStart'  => 'policy_start',
        'policyEnd'    => 'policy_end',
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
        if (null !== $this->responseCode) {
            $res['response_code'] = $this->responseCode;
        }
        if (null !== $this->responseMsg) {
            $res['response_msg'] = $this->responseMsg;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->policyStart) {
            $res['policy_start'] = $this->policyStart;
        }
        if (null !== $this->policyEnd) {
            $res['policy_end'] = $this->policyEnd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterCdsqTireinsuranceResponse
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
        if (isset($map['response_code'])) {
            $model->responseCode = $map['response_code'];
        }
        if (isset($map['response_msg'])) {
            $model->responseMsg = $map['response_msg'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['policy_start'])) {
            $model->policyStart = $map['policy_start'];
        }
        if (isset($map['policy_end'])) {
            $model->policyEnd = $map['policy_end'];
        }

        return $model;
    }
}

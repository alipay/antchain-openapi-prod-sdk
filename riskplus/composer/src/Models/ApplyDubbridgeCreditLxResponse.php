<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgeCreditLxResponse extends Model
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

    // 天枢客户编号
    /**
     * @var string
     */
    public $customNo;

    // 额度授信申请编号
    /**
     * @var string
     */
    public $creditNo;

    // 授信审核状态，
    // 0. 授信成功
    // 1. 授信失败
    // 2. 授信中
    /**
     * @var int
     */
    public $auditState;

    // 业务处理描述信息
    /**
     * @var string
     */
    public $msg;

    // 业务错误码，
    // 无异常=0 ，不同异常，返回不同的code
    /**
     * @var string
     */
    public $errorCode;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'customNo'   => 'custom_no',
        'creditNo'   => 'credit_no',
        'auditState' => 'audit_state',
        'msg'        => 'msg',
        'errorCode'  => 'error_code',
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
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->creditNo) {
            $res['credit_no'] = $this->creditNo;
        }
        if (null !== $this->auditState) {
            $res['audit_state'] = $this->auditState;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDubbridgeCreditLxResponse
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
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['credit_no'])) {
            $model->creditNo = $map['credit_no'];
        }
        if (isset($map['audit_state'])) {
            $model->auditState = $map['audit_state'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }

        return $model;
    }
}

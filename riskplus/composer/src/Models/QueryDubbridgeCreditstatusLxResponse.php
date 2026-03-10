<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeCreditstatusLxResponse extends Model
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

    // 授信审核状态
    // 0. 授信成功
    // 1. 授信失败
    // 2. 授信中（重试查询）
    // 3. 查无此单（按1授信失败处理，订单轮询至下一资方）
    /**
     * @var int
     */
    public $auditState;

    // 业务错误码
    // 无异常=0 ，不同异常，返回不同的code
    /**
     * @var int
     */
    public $errorCode;

    // 授信失败必填，描述具体的失败原因，用于运营分析
    /**
     * @var string
     */
    public $msg;

    // 授信成功必填,授信成功后，资方的授信编号，后续用信/支用时用到
    /**
     * @var string
     */
    public $creditNo;

    // 授信批准的额度，授信成功必填，单位:元
    /**
     * @var int
     */
    public $creditAmt;

    // 授信生效日期，授信审核通过时必填，格式：yyyy-MM-dd
    /**
     * @var string
     */
    public $creditValidDate;

    // 授信失效日期，授信审核通过时必填，格式：yyyy-MM-dd  ,如果授信的当前日期大于
    // 等于失效日期,就认为失效
    /**
     * @var string
     */
    public $creditExpireDate;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'auditState'       => 'audit_state',
        'errorCode'        => 'error_code',
        'msg'              => 'msg',
        'creditNo'         => 'credit_no',
        'creditAmt'        => 'credit_amt',
        'creditValidDate'  => 'credit_valid_date',
        'creditExpireDate' => 'credit_expire_date',
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
        if (null !== $this->auditState) {
            $res['audit_state'] = $this->auditState;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->creditNo) {
            $res['credit_no'] = $this->creditNo;
        }
        if (null !== $this->creditAmt) {
            $res['credit_amt'] = $this->creditAmt;
        }
        if (null !== $this->creditValidDate) {
            $res['credit_valid_date'] = $this->creditValidDate;
        }
        if (null !== $this->creditExpireDate) {
            $res['credit_expire_date'] = $this->creditExpireDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeCreditstatusLxResponse
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
        if (isset($map['audit_state'])) {
            $model->auditState = $map['audit_state'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['credit_no'])) {
            $model->creditNo = $map['credit_no'];
        }
        if (isset($map['credit_amt'])) {
            $model->creditAmt = $map['credit_amt'];
        }
        if (isset($map['credit_valid_date'])) {
            $model->creditValidDate = $map['credit_valid_date'];
        }
        if (isset($map['credit_expire_date'])) {
            $model->creditExpireDate = $map['credit_expire_date'];
        }

        return $model;
    }
}

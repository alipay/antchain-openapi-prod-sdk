<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeCreditamtLxResponse extends Model
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

    // 返回描述信息
    /**
     * @var string
     */
    public $msg;

    // 查询状态，0. 查询成功
    // 1. 查询失败---表示“拒绝”的有效终态，下一步重新调用授信申请接口
    /**
     * @var int
     */
    public $status;

    // 剩余可用额度,授信成功必填,单位:元
    /**
     * @var string
     */
    public $creditRemainAmt;

    // 授信批准的额度，授信成功必填,单位:元
    /**
     * @var string
     */
    public $creditAmt;

    // 授信生效日期，授信审核通过时必填,格式：yyyy-MM-dd
    /**
     * @var string
     */
    public $creditValidDate;

    // 授信失效日期，授信审核通过时必填,格式：yyyy-MM-dd
    /**
     * @var string
     */
    public $creditExpireDate;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'msg'              => 'msg',
        'status'           => 'status',
        'creditRemainAmt'  => 'credit_remain_amt',
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
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->creditRemainAmt) {
            $res['credit_remain_amt'] = $this->creditRemainAmt;
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
     * @return QueryDubbridgeCreditamtLxResponse
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
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['credit_remain_amt'])) {
            $model->creditRemainAmt = $map['credit_remain_amt'];
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

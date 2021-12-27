<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubheCreditStatusResponse extends Model
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

    // 授信状态（0-通过/1-不通过2-处理中）
    /**
     * @var string
     */
    public $status;

    // 拒绝原因
    /**
     * @var string
     */
    public $msg;

    // 授信额度
    /**
     * @var int
     */
    public $creditAmt;

    // 期数
    /**
     * @var int
     */
    public $period;

    // 还款方式
    /**
     * @var string
     */
    public $repayType;

    // 额度信息
    /**
     * @var CreditAmount
     */
    public $creditInfo;

    // 客户编号(该客户的唯一标识，后续接口需要用到)
    /**
     * @var string
     */
    public $customNo;

    // 授信申请编号
    /**
     * @var string
     */
    public $applyNo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'status'     => 'status',
        'msg'        => 'msg',
        'creditAmt'  => 'credit_amt',
        'period'     => 'period',
        'repayType'  => 'repay_type',
        'creditInfo' => 'credit_info',
        'customNo'   => 'custom_no',
        'applyNo'    => 'apply_no',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->creditAmt) {
            $res['credit_amt'] = $this->creditAmt;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->creditInfo) {
            $res['credit_info'] = null !== $this->creditInfo ? $this->creditInfo->toMap() : null;
        }
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->applyNo) {
            $res['apply_no'] = $this->applyNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubheCreditStatusResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['credit_amt'])) {
            $model->creditAmt = $map['credit_amt'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['credit_info'])) {
            $model->creditInfo = CreditAmount::fromMap($map['credit_info']);
        }
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['apply_no'])) {
            $model->applyNo = $map['apply_no'];
        }

        return $model;
    }
}

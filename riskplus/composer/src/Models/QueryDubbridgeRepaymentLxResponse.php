<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRepaymentLxResponse extends Model
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

    // 还款状态，
    // 1、成功(结算成功)
    // 2、失败(结算失败)
    // 3. 还款中(结算处理中)
    // 4. 查无此通知（会重复发起还款）
    /**
     * @var int
     */
    public $repayStatus;

    // 处理成功时间，成功必填YYYY-MM-DD HH:MM:SS
    /**
     * @var string
     */
    public $processTime;

    // 还款描述，失败时，需给出的错误描述
    /**
     * @var string
     */
    public $msg;

    // 还款总额,保留两位有效数字(单位:元)
    /**
     * @var int
     */
    public $repayAmount;

    // 实还本金,保留两位有效数字(单位:元)
    /**
     * @var string
     */
    public $repayPrincipal;

    // 实还利息,保留两位有效数字(单位:元)
    /**
     * @var string
     */
    public $repayInterest;

    // 实还罚息,保留两位有效数字(单位:元)
    /**
     * @var int
     */
    public $repayMuclt;

    // 实还担保费,保留两位有效数字(单位:元)
    /**
     * @var int
     */
    public $repayGuarantee;

    // 实还信用评估费,保留两位有效数字(单位:元)
    /**
     * @var int
     */
    public $repayCreditFee;

    // 实还咨询服务费,保留两位有效数字(单位:元)
    /**
     * @var int
     */
    public $repayGranteeConsultServiceFee;
    protected $_name = [
        'reqMsgId'                      => 'req_msg_id',
        'resultCode'                    => 'result_code',
        'resultMsg'                     => 'result_msg',
        'repayStatus'                   => 'repay_status',
        'processTime'                   => 'process_time',
        'msg'                           => 'msg',
        'repayAmount'                   => 'repay_amount',
        'repayPrincipal'                => 'repay_principal',
        'repayInterest'                 => 'repay_interest',
        'repayMuclt'                    => 'repay_muclt',
        'repayGuarantee'                => 'repay_guarantee',
        'repayCreditFee'                => 'repay_credit_fee',
        'repayGranteeConsultServiceFee' => 'repay_grantee_consult_service_fee',
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
        if (null !== $this->repayStatus) {
            $res['repay_status'] = $this->repayStatus;
        }
        if (null !== $this->processTime) {
            $res['process_time'] = $this->processTime;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->repayAmount) {
            $res['repay_amount'] = $this->repayAmount;
        }
        if (null !== $this->repayPrincipal) {
            $res['repay_principal'] = $this->repayPrincipal;
        }
        if (null !== $this->repayInterest) {
            $res['repay_interest'] = $this->repayInterest;
        }
        if (null !== $this->repayMuclt) {
            $res['repay_muclt'] = $this->repayMuclt;
        }
        if (null !== $this->repayGuarantee) {
            $res['repay_guarantee'] = $this->repayGuarantee;
        }
        if (null !== $this->repayCreditFee) {
            $res['repay_credit_fee'] = $this->repayCreditFee;
        }
        if (null !== $this->repayGranteeConsultServiceFee) {
            $res['repay_grantee_consult_service_fee'] = $this->repayGranteeConsultServiceFee;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRepaymentLxResponse
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
        if (isset($map['repay_status'])) {
            $model->repayStatus = $map['repay_status'];
        }
        if (isset($map['process_time'])) {
            $model->processTime = $map['process_time'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['repay_amount'])) {
            $model->repayAmount = $map['repay_amount'];
        }
        if (isset($map['repay_principal'])) {
            $model->repayPrincipal = $map['repay_principal'];
        }
        if (isset($map['repay_interest'])) {
            $model->repayInterest = $map['repay_interest'];
        }
        if (isset($map['repay_muclt'])) {
            $model->repayMuclt = $map['repay_muclt'];
        }
        if (isset($map['repay_guarantee'])) {
            $model->repayGuarantee = $map['repay_guarantee'];
        }
        if (isset($map['repay_credit_fee'])) {
            $model->repayCreditFee = $map['repay_credit_fee'];
        }
        if (isset($map['repay_grantee_consult_service_fee'])) {
            $model->repayGranteeConsultServiceFee = $map['repay_grantee_consult_service_fee'];
        }

        return $model;
    }
}

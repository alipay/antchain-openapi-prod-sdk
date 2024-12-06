<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryInsureResultResponse extends Model
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

    // 通知单号
    /**
     * @var string
     */
    public $noticeNo;

    // 付款状态
    /**
     * @var string
     */
    public $paymentStatus;

    // 保单号
    /**
     * @var string
     */
    public $policyNo;

    // 保额(人民币)
    /**
     * @var string
     */
    public $insuranceAmount;

    // 保费(人民币)
    /**
     * @var string
     */
    public $insurancePremium;

    // 保险起期
    /**
     * @var string
     */
    public $effectDate;

    // 保险止期
    /**
     * @var string
     */
    public $expireDate;

    // 电子保单URL
    /**
     * @var string
     */
    public $outPolicyUrl;

    // 投保申请号-外部
    /**
     * @var string
     */
    public $insuranceApplicationNo;

    // 交易流水号
    /**
     * @var string
     */
    public $insuranceApplicationNoInner;
    protected $_name = [
        'reqMsgId'                    => 'req_msg_id',
        'resultCode'                  => 'result_code',
        'resultMsg'                   => 'result_msg',
        'noticeNo'                    => 'notice_no',
        'paymentStatus'               => 'payment_status',
        'policyNo'                    => 'policy_no',
        'insuranceAmount'             => 'insurance_amount',
        'insurancePremium'            => 'insurance_premium',
        'effectDate'                  => 'effect_date',
        'expireDate'                  => 'expire_date',
        'outPolicyUrl'                => 'out_policy_url',
        'insuranceApplicationNo'      => 'insurance_application_no',
        'insuranceApplicationNoInner' => 'insurance_application_no_inner',
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
        if (null !== $this->noticeNo) {
            $res['notice_no'] = $this->noticeNo;
        }
        if (null !== $this->paymentStatus) {
            $res['payment_status'] = $this->paymentStatus;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->insuranceAmount) {
            $res['insurance_amount'] = $this->insuranceAmount;
        }
        if (null !== $this->insurancePremium) {
            $res['insurance_premium'] = $this->insurancePremium;
        }
        if (null !== $this->effectDate) {
            $res['effect_date'] = $this->effectDate;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->outPolicyUrl) {
            $res['out_policy_url'] = $this->outPolicyUrl;
        }
        if (null !== $this->insuranceApplicationNo) {
            $res['insurance_application_no'] = $this->insuranceApplicationNo;
        }
        if (null !== $this->insuranceApplicationNoInner) {
            $res['insurance_application_no_inner'] = $this->insuranceApplicationNoInner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsureResultResponse
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
        if (isset($map['notice_no'])) {
            $model->noticeNo = $map['notice_no'];
        }
        if (isset($map['payment_status'])) {
            $model->paymentStatus = $map['payment_status'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['insurance_amount'])) {
            $model->insuranceAmount = $map['insurance_amount'];
        }
        if (isset($map['insurance_premium'])) {
            $model->insurancePremium = $map['insurance_premium'];
        }
        if (isset($map['effect_date'])) {
            $model->effectDate = $map['effect_date'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['out_policy_url'])) {
            $model->outPolicyUrl = $map['out_policy_url'];
        }
        if (isset($map['insurance_application_no'])) {
            $model->insuranceApplicationNo = $map['insurance_application_no'];
        }
        if (isset($map['insurance_application_no_inner'])) {
            $model->insuranceApplicationNoInner = $map['insurance_application_no_inner'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRepayInfoResponse extends Model
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

    // 还款编号
    /**
     * @var string
     */
    public $repayNo;

    // 借据编码
    /**
     * @var string
     */
    public $receiptNo;

    // 客户编号
    /**
     * @var string
     */
    public $customNo;

    // 客户名称
    /**
     * @var string
     */
    public $customName;

    // 还款类型1:提前还款，2：正常还款 3:批量还款 4：自由还款
    /**
     * @var string
     */
    public $repayType;

    // repay_sign
    /**
     * @var string
     */
    public $repaySign;

    // 还款日期
    /**
     * @var string
     */
    public $repayDate;

    // 实还总额
    /**
     * @var int
     */
    public $repayAmount;

    // 实还本金
    /**
     * @var int
     */
    public $repayPrincipal;

    // 实还利息
    /**
     * @var int
     */
    public $repayInterest;

    // 实还通道手续费
    /**
     * @var int
     */
    public $channelAmt;

    // 实还手续费
    /**
     * @var string
     */
    public $repayFee;

    // 实收罚息
    /**
     * @var int
     */
    public $repayPunish;

    // 还款账户
    /**
     * @var string
     */
    public $repayAccount;

    // 还款账户名称
    /**
     * @var string
     */
    public $repayAccountName;

    // 还款账户的手机号
    /**
     * @var string
     */
    public $repayMobile;

    // 还款账户银行行号
    /**
     * @var string
     */
    public $repayBankNo;

    // 还款账户银行名称
    /**
     * @var string
     */
    public $repayBankName;

    // 还款状态0:失败 1成功 2-审批中 3-还款中
    /**
     * @var string
     */
    public $repayStatus;

    // 失败原因
    /**
     * @var string
     */
    public $failReason;

    // 授信申请编号
    /**
     * @var string
     */
    public $applyNo;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'repayNo'          => 'repay_no',
        'receiptNo'        => 'receipt_no',
        'customNo'         => 'custom_no',
        'customName'       => 'custom_name',
        'repayType'        => 'repay_type',
        'repaySign'        => 'repay_sign',
        'repayDate'        => 'repay_date',
        'repayAmount'      => 'repay_amount',
        'repayPrincipal'   => 'repay_principal',
        'repayInterest'    => 'repay_interest',
        'channelAmt'       => 'channel_amt',
        'repayFee'         => 'repay_fee',
        'repayPunish'      => 'repay_punish',
        'repayAccount'     => 'repay_account',
        'repayAccountName' => 'repay_account_name',
        'repayMobile'      => 'repay_mobile',
        'repayBankNo'      => 'repay_bank_no',
        'repayBankName'    => 'repay_bank_name',
        'repayStatus'      => 'repay_status',
        'failReason'       => 'fail_reason',
        'applyNo'          => 'apply_no',
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
        if (null !== $this->repayNo) {
            $res['repay_no'] = $this->repayNo;
        }
        if (null !== $this->receiptNo) {
            $res['receipt_no'] = $this->receiptNo;
        }
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->repaySign) {
            $res['repay_sign'] = $this->repaySign;
        }
        if (null !== $this->repayDate) {
            $res['repay_date'] = $this->repayDate;
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
        if (null !== $this->channelAmt) {
            $res['channel_amt'] = $this->channelAmt;
        }
        if (null !== $this->repayFee) {
            $res['repay_fee'] = $this->repayFee;
        }
        if (null !== $this->repayPunish) {
            $res['repay_punish'] = $this->repayPunish;
        }
        if (null !== $this->repayAccount) {
            $res['repay_account'] = $this->repayAccount;
        }
        if (null !== $this->repayAccountName) {
            $res['repay_account_name'] = $this->repayAccountName;
        }
        if (null !== $this->repayMobile) {
            $res['repay_mobile'] = $this->repayMobile;
        }
        if (null !== $this->repayBankNo) {
            $res['repay_bank_no'] = $this->repayBankNo;
        }
        if (null !== $this->repayBankName) {
            $res['repay_bank_name'] = $this->repayBankName;
        }
        if (null !== $this->repayStatus) {
            $res['repay_status'] = $this->repayStatus;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        if (null !== $this->applyNo) {
            $res['apply_no'] = $this->applyNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRepayInfoResponse
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
        if (isset($map['repay_no'])) {
            $model->repayNo = $map['repay_no'];
        }
        if (isset($map['receipt_no'])) {
            $model->receiptNo = $map['receipt_no'];
        }
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['custom_name'])) {
            $model->customName = $map['custom_name'];
        }
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['repay_sign'])) {
            $model->repaySign = $map['repay_sign'];
        }
        if (isset($map['repay_date'])) {
            $model->repayDate = $map['repay_date'];
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
        if (isset($map['channel_amt'])) {
            $model->channelAmt = $map['channel_amt'];
        }
        if (isset($map['repay_fee'])) {
            $model->repayFee = $map['repay_fee'];
        }
        if (isset($map['repay_punish'])) {
            $model->repayPunish = $map['repay_punish'];
        }
        if (isset($map['repay_account'])) {
            $model->repayAccount = $map['repay_account'];
        }
        if (isset($map['repay_account_name'])) {
            $model->repayAccountName = $map['repay_account_name'];
        }
        if (isset($map['repay_mobile'])) {
            $model->repayMobile = $map['repay_mobile'];
        }
        if (isset($map['repay_bank_no'])) {
            $model->repayBankNo = $map['repay_bank_no'];
        }
        if (isset($map['repay_bank_name'])) {
            $model->repayBankName = $map['repay_bank_name'];
        }
        if (isset($map['repay_status'])) {
            $model->repayStatus = $map['repay_status'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }
        if (isset($map['apply_no'])) {
            $model->applyNo = $map['apply_no'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRepayResultResponse extends Model
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

    // 借据编号
    /**
     * @var string
     */
    public $receiptNo;

    // 客户编号
    /**
     * @var string
     */
    public $customNo;

    // 还款类型
    // 1: 全部结清，
    // 2：正常还款
    // 3：当期结清
    // 4：逾期还款
    //
    /**
     * @var string
     */
    public $repayType;

    // 还款标志
    // 1 线下还款
    // 2 用户主动还款
    // 3 系统代扣
    //
    /**
     * @var string
     */
    public $repaySign;

    // 还款账户
    /**
     * @var string
     */
    public $repayAccount;

    // 还款状态
    /**
     * @var string
     */
    public $repayStatus;

    // 失败原因
    /**
     * @var string
     */
    public $failReason;

    // 还款信息列表
    /**
     * @var RepayInfos[]
     */
    public $repayInfos;

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

    // 实还总本金
    /**
     * @var int
     */
    public $repayPrincipal;

    // 实还总利息
    /**
     * @var int
     */
    public $repayInterest;

    // 实收总罚息
    /**
     * @var int
     */
    public $repayPunish;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'repayNo'        => 'repay_no',
        'receiptNo'      => 'receipt_no',
        'customNo'       => 'custom_no',
        'repayType'      => 'repay_type',
        'repaySign'      => 'repay_sign',
        'repayAccount'   => 'repay_account',
        'repayStatus'    => 'repay_status',
        'failReason'     => 'fail_reason',
        'repayInfos'     => 'repay_infos',
        'repayDate'      => 'repay_date',
        'repayAmount'    => 'repay_amount',
        'repayPrincipal' => 'repay_principal',
        'repayInterest'  => 'repay_interest',
        'repayPunish'    => 'repay_punish',
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
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->repaySign) {
            $res['repay_sign'] = $this->repaySign;
        }
        if (null !== $this->repayAccount) {
            $res['repay_account'] = $this->repayAccount;
        }
        if (null !== $this->repayStatus) {
            $res['repay_status'] = $this->repayStatus;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        if (null !== $this->repayInfos) {
            $res['repay_infos'] = [];
            if (null !== $this->repayInfos && \is_array($this->repayInfos)) {
                $n = 0;
                foreach ($this->repayInfos as $item) {
                    $res['repay_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->repayPunish) {
            $res['repay_punish'] = $this->repayPunish;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRepayResultResponse
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
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['repay_sign'])) {
            $model->repaySign = $map['repay_sign'];
        }
        if (isset($map['repay_account'])) {
            $model->repayAccount = $map['repay_account'];
        }
        if (isset($map['repay_status'])) {
            $model->repayStatus = $map['repay_status'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }
        if (isset($map['repay_infos'])) {
            if (!empty($map['repay_infos'])) {
                $model->repayInfos = [];
                $n                 = 0;
                foreach ($map['repay_infos'] as $item) {
                    $model->repayInfos[$n++] = null !== $item ? RepayInfos::fromMap($item) : $item;
                }
            }
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
        if (isset($map['repay_punish'])) {
            $model->repayPunish = $map['repay_punish'];
        }

        return $model;
    }
}

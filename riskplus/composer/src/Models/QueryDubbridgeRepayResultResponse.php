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
     * @var RepayInfos
     */
    public $repayInfos;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'repayNo'      => 'repay_no',
        'receiptNo'    => 'receipt_no',
        'customNo'     => 'custom_no',
        'repayType'    => 'repay_type',
        'repaySign'    => 'repay_sign',
        'repayAccount' => 'repay_account',
        'repayStatus'  => 'repay_status',
        'failReason'   => 'fail_reason',
        'repayInfos'   => 'repay_infos',
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
            $res['repay_infos'] = null !== $this->repayInfos ? $this->repayInfos->toMap() : null;
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
            $model->repayInfos = RepayInfos::fromMap($map['repay_infos']);
        }

        return $model;
    }
}

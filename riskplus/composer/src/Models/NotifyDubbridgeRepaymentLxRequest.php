<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class NotifyDubbridgeRepaymentLxRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 还款请求流水号/账单号
    /**
     * @var string
     */
    public $billId;

    // 贷款申请编号
    /**
     * @var string
     */
    public $applyId;

    // 是否本次还款最后一次通知，
    // 1-是
    // 2-否
    // 用户一次还多期时，该笔还款按期多次通知，最后一次通知为是。为否时没有还款计划列表。
    /**
     * @var int
     */
    public $lastNotify;

    // 代扣请求流水号
    /**
     * @var string
     */
    public $withholdSerialNo;

    // 合作方代码
    /**
     * @var string
     */
    public $partnerCode;

    // 还款类型，
    // 不同还款类型分开通知：
    // 10-正常还款,
    // 20-部分提前还,
    // 30-提前结清,
    // 40-逾期还款
    // 50-代偿
    /**
     * @var int
     */
    public $repayType;

    // 还款路径，
    // 1-清分 2-代扣
    /**
     * @var string
     */
    public $repayChannel;

    // 还款期数
    /**
     * @var string
     */
    public $repayTerm;

    // 还款日期
    /**
     * @var string
     */
    public $repayDate;

    // 还款总额,保留两位有效数字(单位:元)
    /**
     * @var string
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
     * @var string
     */
    public $repayMuclt;

    // 实还担保费,保留两位有效数字(单位:元)
    /**
     * @var string
     */
    public $repayGuarantee;

    // 当期结清状态：
    // 0-当期未结清
    // 1-当期已结清
    /**
     * @var string
     */
    public $repaymentMode;

    // 还款计划列表，随借随还业务更新后的还款计划列表
    /**
     * @var BillDetail[]
     */
    public $rpyDetails;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'billId'            => 'bill_id',
        'applyId'           => 'apply_id',
        'lastNotify'        => 'last_notify',
        'withholdSerialNo'  => 'withhold_serial_no',
        'partnerCode'       => 'partner_code',
        'repayType'         => 'repay_type',
        'repayChannel'      => 'repay_channel',
        'repayTerm'         => 'repay_term',
        'repayDate'         => 'repay_date',
        'repayAmount'       => 'repay_amount',
        'repayPrincipal'    => 'repay_principal',
        'repayInterest'     => 'repay_interest',
        'repayMuclt'        => 'repay_muclt',
        'repayGuarantee'    => 'repay_guarantee',
        'repaymentMode'     => 'repayment_mode',
        'rpyDetails'        => 'rpy_details',
    ];

    public function validate()
    {
        Model::validateRequired('billId', $this->billId, true);
        Model::validateRequired('applyId', $this->applyId, true);
        Model::validateRequired('lastNotify', $this->lastNotify, true);
        Model::validateRequired('repayType', $this->repayType, true);
        Model::validateRequired('repayChannel', $this->repayChannel, true);
        Model::validateRequired('repayTerm', $this->repayTerm, true);
        Model::validateRequired('repayDate', $this->repayDate, true);
        Model::validateRequired('repayAmount', $this->repayAmount, true);
        Model::validateRequired('repayPrincipal', $this->repayPrincipal, true);
        Model::validateRequired('repayInterest', $this->repayInterest, true);
        Model::validateRequired('repaymentMode', $this->repaymentMode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->billId) {
            $res['bill_id'] = $this->billId;
        }
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->lastNotify) {
            $res['last_notify'] = $this->lastNotify;
        }
        if (null !== $this->withholdSerialNo) {
            $res['withhold_serial_no'] = $this->withholdSerialNo;
        }
        if (null !== $this->partnerCode) {
            $res['partner_code'] = $this->partnerCode;
        }
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->repayChannel) {
            $res['repay_channel'] = $this->repayChannel;
        }
        if (null !== $this->repayTerm) {
            $res['repay_term'] = $this->repayTerm;
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
        if (null !== $this->repayMuclt) {
            $res['repay_muclt'] = $this->repayMuclt;
        }
        if (null !== $this->repayGuarantee) {
            $res['repay_guarantee'] = $this->repayGuarantee;
        }
        if (null !== $this->repaymentMode) {
            $res['repayment_mode'] = $this->repaymentMode;
        }
        if (null !== $this->rpyDetails) {
            $res['rpy_details'] = [];
            if (null !== $this->rpyDetails && \is_array($this->rpyDetails)) {
                $n = 0;
                foreach ($this->rpyDetails as $item) {
                    $res['rpy_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyDubbridgeRepaymentLxRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['bill_id'])) {
            $model->billId = $map['bill_id'];
        }
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }
        if (isset($map['last_notify'])) {
            $model->lastNotify = $map['last_notify'];
        }
        if (isset($map['withhold_serial_no'])) {
            $model->withholdSerialNo = $map['withhold_serial_no'];
        }
        if (isset($map['partner_code'])) {
            $model->partnerCode = $map['partner_code'];
        }
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['repay_channel'])) {
            $model->repayChannel = $map['repay_channel'];
        }
        if (isset($map['repay_term'])) {
            $model->repayTerm = $map['repay_term'];
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
        if (isset($map['repay_muclt'])) {
            $model->repayMuclt = $map['repay_muclt'];
        }
        if (isset($map['repay_guarantee'])) {
            $model->repayGuarantee = $map['repay_guarantee'];
        }
        if (isset($map['repayment_mode'])) {
            $model->repaymentMode = $map['repayment_mode'];
        }
        if (isset($map['rpy_details'])) {
            if (!empty($map['rpy_details'])) {
                $model->rpyDetails = [];
                $n                 = 0;
                foreach ($map['rpy_details'] as $item) {
                    $model->rpyDetails[$n++] = null !== $item ? BillDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

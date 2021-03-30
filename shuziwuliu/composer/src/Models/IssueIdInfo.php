<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class IssueIdInfo extends Model
{
    // 信用流转凭证
    /**
     * @example 123123
     *
     * @var string
     */
    public $issueId;

    // 全局唯一业务号
    /**
     * @example fa142b66cb1
     *
     * @var string
     */
    public $outBizNo;

    // 合同号（预留）
    /**
     * @example 123
     *
     * @var string
     */
    public $contractId;

    // 发行信用流转的运单号
    /**
     * @example 123123
     *
     * @var string
     */
    public $waybillId;

    // 支付订单
    /**
     * @example 123123
     *
     * @var string
     */
    public $payOrder;

    // 凭证金额
    /**
     * @example 198.76
     *
     * @var string
     */
    public $ticketAmt;

    // 信用凭证发起时间
    /**
     * @example 1581579336000
     *
     * @var string
     */
    public $issueDate;

    // 信用凭证到期时间
    /**
     * @example 1581579336000
     *
     * @var string
     */
    public $expireDate;

    // 发行结果状态 -1:发行失败状态， 0:未完成状态， 1:已发行状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 失败原因信息
    /**
     * @example success
     *
     * @var string
     */
    public $errMsg;
    protected $_name = [
        'issueId'    => 'issue_id',
        'outBizNo'   => 'out_biz_no',
        'contractId' => 'contract_id',
        'waybillId'  => 'waybill_id',
        'payOrder'   => 'pay_order',
        'ticketAmt'  => 'ticket_amt',
        'issueDate'  => 'issue_date',
        'expireDate' => 'expire_date',
        'status'     => 'status',
        'errMsg'     => 'err_msg',
    ];

    public function validate()
    {
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('waybillId', $this->waybillId, true);
        Model::validateRequired('payOrder', $this->payOrder, true);
        Model::validateRequired('ticketAmt', $this->ticketAmt, true);
        Model::validateRequired('issueDate', $this->issueDate, true);
        Model::validateRequired('expireDate', $this->expireDate, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('errMsg', $this->errMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->waybillId) {
            $res['waybill_id'] = $this->waybillId;
        }
        if (null !== $this->payOrder) {
            $res['pay_order'] = $this->payOrder;
        }
        if (null !== $this->ticketAmt) {
            $res['ticket_amt'] = $this->ticketAmt;
        }
        if (null !== $this->issueDate) {
            $res['issue_date'] = $this->issueDate;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IssueIdInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['waybill_id'])) {
            $model->waybillId = $map['waybill_id'];
        }
        if (isset($map['pay_order'])) {
            $model->payOrder = $map['pay_order'];
        }
        if (isset($map['ticket_amt'])) {
            $model->ticketAmt = $map['ticket_amt'];
        }
        if (isset($map['issue_date'])) {
            $model->issueDate = $map['issue_date'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['err_msg'])) {
            $model->errMsg = $map['err_msg'];
        }

        return $model;
    }
}

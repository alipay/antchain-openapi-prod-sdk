<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class StatementInfo extends Model {
    protected $_name = [
        'batchId' => 'batch_id',
        'outBizNo' => 'out_biz_no',
        'issueId' => 'issue_id',
        'contractId' => 'contract_id',
        'waybillId' => 'waybill_id',
        'payOrder' => 'pay_order',
        'creditLimit' => 'credit_limit',
        'stateType' => 'state_type',
        'stateMsg' => 'state_msg',
        'fromDid' => 'from_did',
        'toDid' => 'to_did',
        'issueDate' => 'issue_date',
        'expireDate' => 'expire_date',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
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
        if (null !== $this->creditLimit) {
            $res['credit_limit'] = $this->creditLimit;
        }
        if (null !== $this->stateType) {
            $res['state_type'] = $this->stateType;
        }
        if (null !== $this->stateMsg) {
            $res['state_msg'] = $this->stateMsg;
        }
        if (null !== $this->fromDid) {
            $res['from_did'] = $this->fromDid;
        }
        if (null !== $this->toDid) {
            $res['to_did'] = $this->toDid;
        }
        if (null !== $this->issueDate) {
            $res['issue_date'] = $this->issueDate;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StatementInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['batch_id'])){
            $model->batchId = $map['batch_id'];
        }
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        if(isset($map['issue_id'])){
            $model->issueId = $map['issue_id'];
        }
        if(isset($map['contract_id'])){
            $model->contractId = $map['contract_id'];
        }
        if(isset($map['waybill_id'])){
            $model->waybillId = $map['waybill_id'];
        }
        if(isset($map['pay_order'])){
            $model->payOrder = $map['pay_order'];
        }
        if(isset($map['credit_limit'])){
            $model->creditLimit = $map['credit_limit'];
        }
        if(isset($map['state_type'])){
            $model->stateType = $map['state_type'];
        }
        if(isset($map['state_msg'])){
            $model->stateMsg = $map['state_msg'];
        }
        if(isset($map['from_did'])){
            $model->fromDid = $map['from_did'];
        }
        if(isset($map['to_did'])){
            $model->toDid = $map['to_did'];
        }
        if(isset($map['issue_date'])){
            $model->issueDate = $map['issue_date'];
        }
        if(isset($map['expire_date'])){
            $model->expireDate = $map['expire_date'];
        }
        return $model;
    }
    // 信用流转批次号
    /**
     * @example 123123
     * @var string
     */
    public $batchId;

    // 全局唯一业务号
    /**
     * @example 123123
     * @var string
     */
    public $outBizNo;

    // 信用流转凭证
    /**
     * @example 1212312
     * @var string
     */
    public $issueId;

    // 合同号（预留）
    /**
     * @example 123123
     * @var string
     */
    public $contractId;

    // 发行信用流转的运单号
    /**
     * @example 321312
     * @var string
     */
    public $waybillId;

    // 发行信用流转的支付单号
    /**
     * @example 123123
     * @var string
     */
    public $payOrder;

    // 金额信息
    /**
     * @example 18.67
     * @var string
     */
    public $creditLimit;

    // 流水类型
    /**
     * @example FINANCE
     * @var string
     */
    public $stateType;

    // 流水类型说明
    /**
     * @example 融资
     * @var string
     */
    public $stateMsg;

    // 凭证来源方did
    /**
     * @example did:mychain:fa142b66cb1dece6a36cd66081ceeece19674409149c32679f2e17ed2dd8312c
     * @var string
     */
    public $fromDid;

    // 凭证流转方did
    /**
     * @example did:mychain:fa142b66cb1dece6a36cd66081ceeece19674409149c32679f2e17ed2dd8312c
     * @var string
     */
    public $toDid;

    // 信用凭证发起时间
    /**
     * @example 1581579336000
     * @var string
     */
    public $issueDate;

    // 信用凭证到期时间
    /**
     * @example 1581579336000
     * @var string
     */
    public $expireDate;

}

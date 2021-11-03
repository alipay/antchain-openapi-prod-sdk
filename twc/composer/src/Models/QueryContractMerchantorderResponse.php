<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractMerchantorderResponse extends Model
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

    // 申请单id
    /**
     * @var string
     */
    public $orderId;

    // 外部商户id
    /**
     * @var string
     */
    public $externalId;

    // 进件时填写的商户名称
    /**
     * @var string
     */
    public $merchantName;

    // 申请总体状态。99:已完结;-1:失败;031:审核中
    /**
     * @var string
     */
    public $status;

    // 申请单创建时间
    /**
     * @var string
     */
    public $applyTime;

    // 风控审核状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
    /**
     * @var string
     */
    public $fkAudit;

    // 风控审批备注，如有则返回
    /**
     * @var string
     */
    public $fkAuditMemo;

    // 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
    /**
     * @var string
     */
    public $kzAudit;

    // 客资审批备注，如有则返回
    /**
     * @var string
     */
    public $kzAuditMemo;

    // 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
    /**
     * @var string
     */
    public $subConfirm;

    // 进件生成的卡编号，在发起结算时可以作为结算账号
    /**
     * @var string
     */
    public $cardAliasNo;

    // 二级商户id。当总体申请状态status为99时，smid才算进件完成
    /**
     * @var string
     */
    public $smid;

    // 本申请单的请求类型。一般可选值包括ZHIFUTONG_CONSULT（直付通商户预校验）/ZHIFUTONG_CREATE（直付通商户创建）/ZHIFUTONG_MODIFY（直付通商户修改）
    /**
     * @var string
     */
    public $applyType;

    // 申请单处理失败时，通过此此段返回具体的失败理由；与kf_audit_memo和kz_audit_memo配合使用
    /**
     * @var string
     */
    public $reason;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'orderId'      => 'order_id',
        'externalId'   => 'external_id',
        'merchantName' => 'merchant_name',
        'status'       => 'status',
        'applyTime'    => 'apply_time',
        'fkAudit'      => 'fk_audit',
        'fkAuditMemo'  => 'fk_audit_memo',
        'kzAudit'      => 'kz_audit',
        'kzAuditMemo'  => 'kz_audit_memo',
        'subConfirm'   => 'sub_confirm',
        'cardAliasNo'  => 'card_alias_no',
        'smid'         => 'smid',
        'applyType'    => 'apply_type',
        'reason'       => 'reason',
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->externalId) {
            $res['external_id'] = $this->externalId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->applyTime) {
            $res['apply_time'] = $this->applyTime;
        }
        if (null !== $this->fkAudit) {
            $res['fk_audit'] = $this->fkAudit;
        }
        if (null !== $this->fkAuditMemo) {
            $res['fk_audit_memo'] = $this->fkAuditMemo;
        }
        if (null !== $this->kzAudit) {
            $res['kz_audit'] = $this->kzAudit;
        }
        if (null !== $this->kzAuditMemo) {
            $res['kz_audit_memo'] = $this->kzAuditMemo;
        }
        if (null !== $this->subConfirm) {
            $res['sub_confirm'] = $this->subConfirm;
        }
        if (null !== $this->cardAliasNo) {
            $res['card_alias_no'] = $this->cardAliasNo;
        }
        if (null !== $this->smid) {
            $res['smid'] = $this->smid;
        }
        if (null !== $this->applyType) {
            $res['apply_type'] = $this->applyType;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractMerchantorderResponse
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['external_id'])) {
            $model->externalId = $map['external_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['apply_time'])) {
            $model->applyTime = $map['apply_time'];
        }
        if (isset($map['fk_audit'])) {
            $model->fkAudit = $map['fk_audit'];
        }
        if (isset($map['fk_audit_memo'])) {
            $model->fkAuditMemo = $map['fk_audit_memo'];
        }
        if (isset($map['kz_audit'])) {
            $model->kzAudit = $map['kz_audit'];
        }
        if (isset($map['kz_audit_memo'])) {
            $model->kzAuditMemo = $map['kz_audit_memo'];
        }
        if (isset($map['sub_confirm'])) {
            $model->subConfirm = $map['sub_confirm'];
        }
        if (isset($map['card_alias_no'])) {
            $model->cardAliasNo = $map['card_alias_no'];
        }
        if (isset($map['smid'])) {
            $model->smid = $map['smid'];
        }
        if (isset($map['apply_type'])) {
            $model->applyType = $map['apply_type'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }

        return $model;
    }
}

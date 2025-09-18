<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SubMerchantOrder extends Model
{
    // 是否开通线上预授权，
    // TRUE/FALSE
    /**
     * @example xxxx
     *
     * @var string
     */
    public $appPreAuth;

    // 申请单创建时间
    /**
     * @example xxxx
     *
     * @var string
     */
    public $applyTime;

    // 本申请单的请求类型，
    // 商户预校验: ZHIFUTONG_CONSULT
    // 商户创建: ZHIFUTONG_CREATE
    // 商户修改: ZHIFUTONG_MODIFY
    //
    /**
     * @example xxxx
     *
     * @var string
     */
    public $applyType;

    // 进件生成的卡编号，在发起结算时可以作为结算账号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $cardAliasNo;

    // 外部商户id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $externalId;

    // 是否开通线下预授权，
    // TRUE/FALSE
    /**
     * @example xxxx
     *
     * @var string
     */
    public $facePreAuth;

    // 风控审核状态，
    // CREATE: 已创建待审批
    // SKIP: 跳过风控审批步骤
    // PASS: 风控审核通过
    // REJECT: 风控审批拒绝
    //
    /**
     * @example xxxx
     *
     * @var string
     */
    public $fkAudit;

    // 风控审批备注
    /**
     * @example xxxx
     *
     * @var string
     */
    public $fkAuditMemo;

    // 判断个人当面付权限版本，
    // TRUE: 表示是标准版
    // FALSE: 表示受限版
    //
    /**
     * @example xxxx
     *
     * @var string
     */
    public $isFaceLimit;

    // 客资审核状态，
    // CREATE: 已创建待审批
    // SKIP: 跳过客资审批步骤
    // PASS: 客资审核通过
    // REJECT: 客资审批拒绝
    /**
     * @example xxxx
     *
     * @var string
     */
    public $kzAudit;

    // 客资审批备注
    /**
     * @example xxxx
     *
     * @var string
     */
    public $kzAuditMemo;

    // 进件时填写的商户名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $merchantName;

    // 入驻申请单号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $orderId;

    // 申请单处理失败时，通过此此段返回具体的失败理由，
    // 与kf_audit_memo和kz_audit_memo配合使用
    /**
     * @example xxxx
     *
     * @var string
     */
    public $reason;

    // 签约支付宝账号（脱敏）
    /**
     * @example xxxx
     *
     * @var string
     */
    public $safeBindingLogonId;

    // 二级商户id，当总体申请状态status为99时，smid才算进件完成
    /**
     * @example xxxx
     *
     * @var string
     */
    public $smid;

    // 申请总体状态，
    // 99: 已完结
    // -1: 失败
    // 031: 审核中
    /**
     * @example xxxx
     *
     * @var string
     */
    public $status;

    // 二级商户确认状态，
    // CREATE: 已发起二级商户确认
    // SKIP: 无需确认
    // FAIL: 签约失败
    // NOT_CONFIRM: 商户未确认
    // FINISH: 签约完成
    /**
     * @example xxxx
     *
     * @var string
     */
    public $subConfirm;
    protected $_name = [
        'appPreAuth'         => 'app_pre_auth',
        'applyTime'          => 'apply_time',
        'applyType'          => 'apply_type',
        'cardAliasNo'        => 'card_alias_no',
        'externalId'         => 'external_id',
        'facePreAuth'        => 'face_pre_auth',
        'fkAudit'            => 'fk_audit',
        'fkAuditMemo'        => 'fk_audit_memo',
        'isFaceLimit'        => 'is_face_limit',
        'kzAudit'            => 'kz_audit',
        'kzAuditMemo'        => 'kz_audit_memo',
        'merchantName'       => 'merchant_name',
        'orderId'            => 'order_id',
        'reason'             => 'reason',
        'safeBindingLogonId' => 'safe_binding_logon_id',
        'smid'               => 'smid',
        'status'             => 'status',
        'subConfirm'         => 'sub_confirm',
    ];

    public function validate()
    {
        Model::validateRequired('applyTime', $this->applyTime, true);
        Model::validateRequired('applyType', $this->applyType, true);
        Model::validateRequired('externalId', $this->externalId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appPreAuth) {
            $res['app_pre_auth'] = $this->appPreAuth;
        }
        if (null !== $this->applyTime) {
            $res['apply_time'] = $this->applyTime;
        }
        if (null !== $this->applyType) {
            $res['apply_type'] = $this->applyType;
        }
        if (null !== $this->cardAliasNo) {
            $res['card_alias_no'] = $this->cardAliasNo;
        }
        if (null !== $this->externalId) {
            $res['external_id'] = $this->externalId;
        }
        if (null !== $this->facePreAuth) {
            $res['face_pre_auth'] = $this->facePreAuth;
        }
        if (null !== $this->fkAudit) {
            $res['fk_audit'] = $this->fkAudit;
        }
        if (null !== $this->fkAuditMemo) {
            $res['fk_audit_memo'] = $this->fkAuditMemo;
        }
        if (null !== $this->isFaceLimit) {
            $res['is_face_limit'] = $this->isFaceLimit;
        }
        if (null !== $this->kzAudit) {
            $res['kz_audit'] = $this->kzAudit;
        }
        if (null !== $this->kzAuditMemo) {
            $res['kz_audit_memo'] = $this->kzAuditMemo;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->safeBindingLogonId) {
            $res['safe_binding_logon_id'] = $this->safeBindingLogonId;
        }
        if (null !== $this->smid) {
            $res['smid'] = $this->smid;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subConfirm) {
            $res['sub_confirm'] = $this->subConfirm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubMerchantOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_pre_auth'])) {
            $model->appPreAuth = $map['app_pre_auth'];
        }
        if (isset($map['apply_time'])) {
            $model->applyTime = $map['apply_time'];
        }
        if (isset($map['apply_type'])) {
            $model->applyType = $map['apply_type'];
        }
        if (isset($map['card_alias_no'])) {
            $model->cardAliasNo = $map['card_alias_no'];
        }
        if (isset($map['external_id'])) {
            $model->externalId = $map['external_id'];
        }
        if (isset($map['face_pre_auth'])) {
            $model->facePreAuth = $map['face_pre_auth'];
        }
        if (isset($map['fk_audit'])) {
            $model->fkAudit = $map['fk_audit'];
        }
        if (isset($map['fk_audit_memo'])) {
            $model->fkAuditMemo = $map['fk_audit_memo'];
        }
        if (isset($map['is_face_limit'])) {
            $model->isFaceLimit = $map['is_face_limit'];
        }
        if (isset($map['kz_audit'])) {
            $model->kzAudit = $map['kz_audit'];
        }
        if (isset($map['kz_audit_memo'])) {
            $model->kzAuditMemo = $map['kz_audit_memo'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['safe_binding_logon_id'])) {
            $model->safeBindingLogonId = $map['safe_binding_logon_id'];
        }
        if (isset($map['smid'])) {
            $model->smid = $map['smid'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sub_confirm'])) {
            $model->subConfirm = $map['sub_confirm'];
        }

        return $model;
    }
}

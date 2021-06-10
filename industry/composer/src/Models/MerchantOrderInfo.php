<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class MerchantOrderInfo extends Model
{
    // 申请单id
    /**
     * @example 2021012000502000000005130266
     *
     * @var string
     */
    public $orderId;

    // 平台方的用户id, 保持唯一
    /**
     * @example 208812345678
     *
     * @var string
     */
    public $merchantUserId;

    // 申请状态 99-已完结;-1-失败;031-审核中
    /**
     * @example 99
     *
     * @var string
     */
    public $status;

    // 风控审批状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
    /**
     * @example CREATE
     *
     * @var string
     */
    public $fkAudit;

    // 风控审批备注
    /**
     * @example 无
     *
     * @var string
     */
    public $fkAuditMemo;

    // 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
    /**
     * @example CREATE
     *
     * @var string
     */
    public $kzAudit;

    // 客资审批备注
    /**
     * @example 无
     *
     * @var string
     */
    public $kzAuditMemo;

    // 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
    /**
     * @example CREATE
     *
     * @var string
     */
    public $subConfirm;

    // 进件备注, 主要用于保存审核拒绝原因
    /**
     * @example {"rejectReason": "拒绝原因", "remark": "CREATE"}
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'orderId'        => 'order_id',
        'merchantUserId' => 'merchant_user_id',
        'status'         => 'status',
        'fkAudit'        => 'fk_audit',
        'fkAuditMemo'    => 'fk_audit_memo',
        'kzAudit'        => 'kz_audit',
        'kzAuditMemo'    => 'kz_audit_memo',
        'subConfirm'     => 'sub_confirm',
        'remark'         => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantUserId', $this->merchantUserId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantOrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_user_id'])) {
            $model->merchantUserId = $map['merchant_user_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
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
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}

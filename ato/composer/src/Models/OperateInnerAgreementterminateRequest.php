<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OperateInnerAgreementterminateRequest extends Model
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

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 订单 id
    /**
     * @var string
     */
    public $orderId;

    // 解约申请 id
    /**
     * @var string
     */
    public $terminateApplyId;

    // 操作处理状态：
    // agree-同意；refuse-拒绝
    /**
     * @var string
     */
    public $operateStatus;

    // 支付宝系统中用以唯一标识用户签约记录的编号
    /**
     * @var string
     */
    public $agreementNo;

    // 代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    /**
     * @var string
     */
    public $externalAgreementNo;

    // 商家拒绝原因
    /**
     * @var string
     */
    public $merchantRefuseReason;

    // 商家拒绝举证材料（拒绝时上传）
    /**
     * @var string[]
     */
    public $merchantRefuseEvidences;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'tenantId'                => 'tenant_id',
        'orderId'                 => 'order_id',
        'terminateApplyId'        => 'terminate_apply_id',
        'operateStatus'           => 'operate_status',
        'agreementNo'             => 'agreement_no',
        'externalAgreementNo'     => 'external_agreement_no',
        'merchantRefuseReason'    => 'merchant_refuse_reason',
        'merchantRefuseEvidences' => 'merchant_refuse_evidences',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('terminateApplyId', $this->terminateApplyId, true);
        Model::validateRequired('operateStatus', $this->operateStatus, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->terminateApplyId) {
            $res['terminate_apply_id'] = $this->terminateApplyId;
        }
        if (null !== $this->operateStatus) {
            $res['operate_status'] = $this->operateStatus;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }
        if (null !== $this->merchantRefuseReason) {
            $res['merchant_refuse_reason'] = $this->merchantRefuseReason;
        }
        if (null !== $this->merchantRefuseEvidences) {
            $res['merchant_refuse_evidences'] = $this->merchantRefuseEvidences;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateInnerAgreementterminateRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['terminate_apply_id'])) {
            $model->terminateApplyId = $map['terminate_apply_id'];
        }
        if (isset($map['operate_status'])) {
            $model->operateStatus = $map['operate_status'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['external_agreement_no'])) {
            $model->externalAgreementNo = $map['external_agreement_no'];
        }
        if (isset($map['merchant_refuse_reason'])) {
            $model->merchantRefuseReason = $map['merchant_refuse_reason'];
        }
        if (isset($map['merchant_refuse_evidences'])) {
            if (!empty($map['merchant_refuse_evidences'])) {
                $model->merchantRefuseEvidences = $map['merchant_refuse_evidences'];
            }
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateInternalContractRequest extends Model
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

    // 签署结束信息，phase为FINISH时必选
    /**
     * @var ContractNotaryFinishInfo
     */
    public $finishInfo;

    // 签署流程ID
    /**
     * @var string
     */
    public $flowId;

    // 签署发起信息，phase为INIT时必选
    /**
     * @var ContractNotaryInitInfo
     */
    public $initInfo;

    // 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)，DOCUMENT(正式合同文件)，DEDUCT_CANCEL(代扣计划取消)，DEDUCT_EXECUTION(代扣计划执行)，DEDUCT_PLAN(代扣计划保存)，DEDUCT_REFUND(代扣计划退款)
    /**
     * @var string
     */
    public $phase;

    // 签署过程信息，phase为SIGN时必选
    /**
     * @var ContractNotarySignInfo
     */
    public $signInfo;

    // 存证事务ID
    /**
     * @var string
     */
    public $transactionId;

    // 签署文件存档阶段存证核验信息
    /**
     * @var ContractNotaryDocumentInfo
     */
    public $documentInfo;

    // 电子合同代扣计划取消操作信息
    /**
     * @var ContractNotaryDeductCancelInfo
     */
    public $cancelInfo;

    // 电子合同存证代扣计划执行操作信息
    /**
     * @var ContractNotaryDeductExecutionInfo
     */
    public $executionInfo;

    // 电子合同存证代扣计划信息
    /**
     * @var ContractNotaryDeductPlanInfo
     */
    public $planInfo;

    // 电子合同存证代扣计划退款信息
    /**
     * @var ContractNotaryDeductRefundInfo
     */
    public $refundInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'finishInfo'        => 'finish_info',
        'flowId'            => 'flow_id',
        'initInfo'          => 'init_info',
        'phase'             => 'phase',
        'signInfo'          => 'sign_info',
        'transactionId'     => 'transaction_id',
        'documentInfo'      => 'document_info',
        'cancelInfo'        => 'cancel_info',
        'executionInfo'     => 'execution_info',
        'planInfo'          => 'plan_info',
        'refundInfo'        => 'refund_info',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
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
        if (null !== $this->finishInfo) {
            $res['finish_info'] = null !== $this->finishInfo ? $this->finishInfo->toMap() : null;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->initInfo) {
            $res['init_info'] = null !== $this->initInfo ? $this->initInfo->toMap() : null;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->signInfo) {
            $res['sign_info'] = null !== $this->signInfo ? $this->signInfo->toMap() : null;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->documentInfo) {
            $res['document_info'] = null !== $this->documentInfo ? $this->documentInfo->toMap() : null;
        }
        if (null !== $this->cancelInfo) {
            $res['cancel_info'] = null !== $this->cancelInfo ? $this->cancelInfo->toMap() : null;
        }
        if (null !== $this->executionInfo) {
            $res['execution_info'] = null !== $this->executionInfo ? $this->executionInfo->toMap() : null;
        }
        if (null !== $this->planInfo) {
            $res['plan_info'] = null !== $this->planInfo ? $this->planInfo->toMap() : null;
        }
        if (null !== $this->refundInfo) {
            $res['refund_info'] = null !== $this->refundInfo ? $this->refundInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInternalContractRequest
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
        if (isset($map['finish_info'])) {
            $model->finishInfo = ContractNotaryFinishInfo::fromMap($map['finish_info']);
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['init_info'])) {
            $model->initInfo = ContractNotaryInitInfo::fromMap($map['init_info']);
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['sign_info'])) {
            $model->signInfo = ContractNotarySignInfo::fromMap($map['sign_info']);
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['document_info'])) {
            $model->documentInfo = ContractNotaryDocumentInfo::fromMap($map['document_info']);
        }
        if (isset($map['cancel_info'])) {
            $model->cancelInfo = ContractNotaryDeductCancelInfo::fromMap($map['cancel_info']);
        }
        if (isset($map['execution_info'])) {
            $model->executionInfo = ContractNotaryDeductExecutionInfo::fromMap($map['execution_info']);
        }
        if (isset($map['plan_info'])) {
            $model->planInfo = ContractNotaryDeductPlanInfo::fromMap($map['plan_info']);
        }
        if (isset($map['refund_info'])) {
            $model->refundInfo = ContractNotaryDeductRefundInfo::fromMap($map['refund_info']);
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerAgreementterminateResponse extends Model
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

    // 订单ID
    /**
     * @var string
     */
    public $orderId;

    // 申请解约号
    /**
     * @var string
     */
    public $terminateApplyId;

    // 订单创建时间
    /**
     * @var string
     */
    public $orderGmtCreate;

    // 用户解约申请时间
    /**
     * @var string
     */
    public $gmtTerminateApply;

    // 解约状态
    /**
     * @var string
     */
    public $terminateStatus;

    // 商家举证材料列表
    /**
     * @var MerchantSupportEvidence[]
     */
    public $merchantSupportEvidenceList;

    // 用户申请解约材料
    /**
     * @var TerminateApplyEvidence[]
     */
    public $terminateApplyEvidenceList;

    // 代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    /**
     * @var string
     */
    public $externalAgreementNo;

    // 支付宝系统中用以唯一标识用户签约记录的编号
    /**
     * @var string
     */
    public $agreementNo;

    // 处理状态
    /**
     * @var string
     */
    public $handleStatus;

    // 商家处理超时类型
    /**
     * @var string
     */
    public $merchantHandleDurationType;

    // 商家处理超时时长
    /**
     * @var string
     */
    public $merchantHandleDuration;
    protected $_name = [
        'reqMsgId'                    => 'req_msg_id',
        'resultCode'                  => 'result_code',
        'resultMsg'                   => 'result_msg',
        'orderId'                     => 'order_id',
        'terminateApplyId'            => 'terminate_apply_id',
        'orderGmtCreate'              => 'order_gmt_create',
        'gmtTerminateApply'           => 'gmt_terminate_apply',
        'terminateStatus'             => 'terminate_status',
        'merchantSupportEvidenceList' => 'merchant_support_evidence_list',
        'terminateApplyEvidenceList'  => 'terminate_apply_evidence_list',
        'externalAgreementNo'         => 'external_agreement_no',
        'agreementNo'                 => 'agreement_no',
        'handleStatus'                => 'handle_status',
        'merchantHandleDurationType'  => 'merchant_handle_duration_type',
        'merchantHandleDuration'      => 'merchant_handle_duration',
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
        if (null !== $this->terminateApplyId) {
            $res['terminate_apply_id'] = $this->terminateApplyId;
        }
        if (null !== $this->orderGmtCreate) {
            $res['order_gmt_create'] = $this->orderGmtCreate;
        }
        if (null !== $this->gmtTerminateApply) {
            $res['gmt_terminate_apply'] = $this->gmtTerminateApply;
        }
        if (null !== $this->terminateStatus) {
            $res['terminate_status'] = $this->terminateStatus;
        }
        if (null !== $this->merchantSupportEvidenceList) {
            $res['merchant_support_evidence_list'] = [];
            if (null !== $this->merchantSupportEvidenceList && \is_array($this->merchantSupportEvidenceList)) {
                $n = 0;
                foreach ($this->merchantSupportEvidenceList as $item) {
                    $res['merchant_support_evidence_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->terminateApplyEvidenceList) {
            $res['terminate_apply_evidence_list'] = [];
            if (null !== $this->terminateApplyEvidenceList && \is_array($this->terminateApplyEvidenceList)) {
                $n = 0;
                foreach ($this->terminateApplyEvidenceList as $item) {
                    $res['terminate_apply_evidence_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->handleStatus) {
            $res['handle_status'] = $this->handleStatus;
        }
        if (null !== $this->merchantHandleDurationType) {
            $res['merchant_handle_duration_type'] = $this->merchantHandleDurationType;
        }
        if (null !== $this->merchantHandleDuration) {
            $res['merchant_handle_duration'] = $this->merchantHandleDuration;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInnerAgreementterminateResponse
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
        if (isset($map['terminate_apply_id'])) {
            $model->terminateApplyId = $map['terminate_apply_id'];
        }
        if (isset($map['order_gmt_create'])) {
            $model->orderGmtCreate = $map['order_gmt_create'];
        }
        if (isset($map['gmt_terminate_apply'])) {
            $model->gmtTerminateApply = $map['gmt_terminate_apply'];
        }
        if (isset($map['terminate_status'])) {
            $model->terminateStatus = $map['terminate_status'];
        }
        if (isset($map['merchant_support_evidence_list'])) {
            if (!empty($map['merchant_support_evidence_list'])) {
                $model->merchantSupportEvidenceList = [];
                $n                                  = 0;
                foreach ($map['merchant_support_evidence_list'] as $item) {
                    $model->merchantSupportEvidenceList[$n++] = null !== $item ? MerchantSupportEvidence::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['terminate_apply_evidence_list'])) {
            if (!empty($map['terminate_apply_evidence_list'])) {
                $model->terminateApplyEvidenceList = [];
                $n                                 = 0;
                foreach ($map['terminate_apply_evidence_list'] as $item) {
                    $model->terminateApplyEvidenceList[$n++] = null !== $item ? TerminateApplyEvidence::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['external_agreement_no'])) {
            $model->externalAgreementNo = $map['external_agreement_no'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['handle_status'])) {
            $model->handleStatus = $map['handle_status'];
        }
        if (isset($map['merchant_handle_duration_type'])) {
            $model->merchantHandleDurationType = $map['merchant_handle_duration_type'];
        }
        if (isset($map['merchant_handle_duration'])) {
            $model->merchantHandleDuration = $map['merchant_handle_duration'];
        }

        return $model;
    }
}

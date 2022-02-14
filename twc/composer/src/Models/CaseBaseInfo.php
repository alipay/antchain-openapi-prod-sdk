<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CaseBaseInfo extends Model
{
    // caseID
    /**
     * @example 123213
     *
     * @var string
     */
    public $caseId;

    // PENDING_RIGHTS_PROTECTION(1, "待发起维权"),
    // TO_BE_SUBMITTED(2, "待提交"),
    // ACCEPTED_AND_PROCESSED(3, "收案处理中"),
    // RESULTS_TO_BE_CONFIRMED(4, "结果待确认"),
    // CLOSED(5, "已关闭"),
    /**
     * @example CLOSED
     *
     * @var string
     */
    public $casePhase;

    // 维权ID
    /**
     * @example 12323
     *
     * @var string
     */
    public $recordId;

    // MEDIATION(1, "调解"),
    // LITIGATION(2, "诉讼"),
    // ARBITRATION(3, "仲裁"),
    // CARRIED_OUT(4, "执行"),
    /**
     * @example MEDIATION
     *
     * @var string
     */
    public $recordType;

    // MATERIAL_PREPARATION(1, "材料准备中"),
    // SUBMITTED(2, "已提交"),
    // FILED(3, "已立案"),
    // CLOSED(4, "已结案"),
    // WITHDRAW_THE_CASE(5, "撤案"),
    // REVOKE(6, "撤销"),
    // INADMISSIBLE(7, "不予受理"),
    // SUBMITTING(8, "提交中"),
    // SUBMISSION_FAILED(9, "提交失败"),
    // FINAL_RULING(10, "裁定终本"),
    // CARRIED_OUT_FINISHED(11, "执行完毕"),
    // TO_BE_SIGNED(12, "签署中"),
    // SIGNING_TIMED_OUT(13, "签署超时"),
    // SIGN_REJECTED(14, "签署被拒绝"),
    // SIGN_REVOCATION(15, "签署撤销"),
    // WITHDRAW_THE_CASE_ING(16, "撤案处理中"),
    // WITHDRAW_SIGNING_TIMED_OUT(17, "撤案签署超时"),
    // WITHDRAW_SIGN_REJECTED(18, "撤案签署被拒绝"),
    // WITHDRAW_SIGN_REVOCATION(19, "撤案签署撤销"),
    // SIGNED(20, "签署完成"),
    // WITHDRAW_SIGNED(21, "撤案签署完成"),
    /**
     * @example SUBMITTED
     *
     * @var string
     */
    public $caseStatus;

    // 案件提交时间
    /**
     * @example 2022-01-06 15:23:32
     *
     * @var string
     */
    public $submitTime;

    // 维权机构
    /**
     * @example 宁波仲裁委
     *
     * @var string
     */
    public $arbitralBody;

    // 结案时间 如没有则为""
    /**
     * @example 2022-01-06 12:23:12
     *
     * @var string
     */
    public $closeTime;

    // 案号 如没有则为""
    /**
     * @example 第x年xx号
     *
     * @var string
     */
    public $acceptanceNumber;

    // 案件回款金额,两位小数 单位(元) 如没有则为""
    /**
     * @example 1200.23
     *
     * @var string
     */
    public $casePaymentActualAmount;

    // 是否能够下载 true可以下载 false没有可下载文件
    /**
     * @example true
     *
     * @var string
     */
    public $canDownload;
    protected $_name = [
        'caseId'                  => 'case_id',
        'casePhase'               => 'case_phase',
        'recordId'                => 'record_id',
        'recordType'              => 'record_type',
        'caseStatus'              => 'case_status',
        'submitTime'              => 'submit_time',
        'arbitralBody'            => 'arbitral_body',
        'closeTime'               => 'close_time',
        'acceptanceNumber'        => 'acceptance_number',
        'casePaymentActualAmount' => 'case_payment_actual_amount',
        'canDownload'             => 'can_download',
    ];

    public function validate()
    {
        Model::validateRequired('caseId', $this->caseId, true);
        Model::validateRequired('casePhase', $this->casePhase, true);
        Model::validateRequired('recordId', $this->recordId, true);
        Model::validateRequired('recordType', $this->recordType, true);
        Model::validateRequired('caseStatus', $this->caseStatus, true);
        Model::validateRequired('submitTime', $this->submitTime, true);
        Model::validateRequired('arbitralBody', $this->arbitralBody, true);
        Model::validateRequired('canDownload', $this->canDownload, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->caseId) {
            $res['case_id'] = $this->caseId;
        }
        if (null !== $this->casePhase) {
            $res['case_phase'] = $this->casePhase;
        }
        if (null !== $this->recordId) {
            $res['record_id'] = $this->recordId;
        }
        if (null !== $this->recordType) {
            $res['record_type'] = $this->recordType;
        }
        if (null !== $this->caseStatus) {
            $res['case_status'] = $this->caseStatus;
        }
        if (null !== $this->submitTime) {
            $res['submit_time'] = $this->submitTime;
        }
        if (null !== $this->arbitralBody) {
            $res['arbitral_body'] = $this->arbitralBody;
        }
        if (null !== $this->closeTime) {
            $res['close_time'] = $this->closeTime;
        }
        if (null !== $this->acceptanceNumber) {
            $res['acceptance_number'] = $this->acceptanceNumber;
        }
        if (null !== $this->casePaymentActualAmount) {
            $res['case_payment_actual_amount'] = $this->casePaymentActualAmount;
        }
        if (null !== $this->canDownload) {
            $res['can_download'] = $this->canDownload;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaseBaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['case_id'])) {
            $model->caseId = $map['case_id'];
        }
        if (isset($map['case_phase'])) {
            $model->casePhase = $map['case_phase'];
        }
        if (isset($map['record_id'])) {
            $model->recordId = $map['record_id'];
        }
        if (isset($map['record_type'])) {
            $model->recordType = $map['record_type'];
        }
        if (isset($map['case_status'])) {
            $model->caseStatus = $map['case_status'];
        }
        if (isset($map['submit_time'])) {
            $model->submitTime = $map['submit_time'];
        }
        if (isset($map['arbitral_body'])) {
            $model->arbitralBody = $map['arbitral_body'];
        }
        if (isset($map['close_time'])) {
            $model->closeTime = $map['close_time'];
        }
        if (isset($map['acceptance_number'])) {
            $model->acceptanceNumber = $map['acceptance_number'];
        }
        if (isset($map['case_payment_actual_amount'])) {
            $model->casePaymentActualAmount = $map['case_payment_actual_amount'];
        }
        if (isset($map['can_download'])) {
            $model->canDownload = $map['can_download'];
        }

        return $model;
    }
}

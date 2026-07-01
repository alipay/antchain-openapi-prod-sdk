<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class MediationCaseDetailInfo extends Model
{
    // 案件编码
    /**
     * @example 测试案件编号001
     *
     * @var string
     */
    public $caseNumber;

    // 案号
    /**
     * @example (2021)互调001号
     *
     * @var string
     */
    public $caseCode;

    // 案由
    /**
     * @example 金融合同纠纷
     *
     * @var string
     */
    public $causeActionName;

    // 案件状态
    /**
     * @example 已提交
     *
     * @var string
     */
    public $caseTatus;

    // 调解平台
    /**
     * @example 北京版权调解中心
     *
     * @var string
     */
    public $mediationPlatform;

    // 调解机构
    /**
     * @example XX云调中心
     *
     * @var string
     */
    public $mediationOrg;

    // 调解员
    /**
     * @example 调解员1
     *
     * @var string
     */
    public $mediator;

    // 申请时间
    /**
     * @example 1611545931418
     *
     * @var int
     */
    public $applyTime;

    // 调解结果
    /**
     * @example 调解成功
     *
     * @var string
     */
    public $mediationResult;

    // 申请人意向金额
    /**
     * @example 8500.21
     *
     * @var int
     */
    public $accuserIntentAmount;

    // 被申请人意向金额
    /**
     * @example 7800.34
     *
     * @var int
     */
    public $accusedIntentAmount;

    // 和解金额
    /**
     * @example 8213.12
     *
     * @var int
     */
    public $mediationAmount;

    // 已确认事实
    /**
     * @example 证据1、2、3的三性双方已确认
     *
     * @var string
     */
    public $confirmFact;

    // 调解协议（已达成调解协议或未达成原因）
    /**
     * @example 双方同意减免10%的费用,以7800.34元达成调解协议
     *
     * @var string
     */
    public $mediationAgreement;
    protected $_name = [
        'caseNumber'          => 'case_number',
        'caseCode'            => 'case_code',
        'causeActionName'     => 'cause_action_name',
        'caseTatus'           => 'case_tatus',
        'mediationPlatform'   => 'mediation_platform',
        'mediationOrg'        => 'mediation_org',
        'mediator'            => 'mediator',
        'applyTime'           => 'apply_time',
        'mediationResult'     => 'mediation_result',
        'accuserIntentAmount' => 'accuser_intent_amount',
        'accusedIntentAmount' => 'accused_intent_amount',
        'mediationAmount'     => 'mediation_amount',
        'confirmFact'         => 'confirm_fact',
        'mediationAgreement'  => 'mediation_agreement',
    ];

    public function validate()
    {
        Model::validateRequired('caseNumber', $this->caseNumber, true);
        Model::validateRequired('caseCode', $this->caseCode, true);
        Model::validateRequired('causeActionName', $this->causeActionName, true);
        Model::validateRequired('caseTatus', $this->caseTatus, true);
        Model::validateRequired('mediationPlatform', $this->mediationPlatform, true);
        Model::validateRequired('mediationOrg', $this->mediationOrg, true);
        Model::validateRequired('mediator', $this->mediator, true);
        Model::validateRequired('applyTime', $this->applyTime, true);
        Model::validateRequired('mediationResult', $this->mediationResult, true);
        Model::validateRequired('accuserIntentAmount', $this->accuserIntentAmount, true);
        Model::validateRequired('accusedIntentAmount', $this->accusedIntentAmount, true);
        Model::validateRequired('mediationAmount', $this->mediationAmount, true);
        Model::validateRequired('confirmFact', $this->confirmFact, true);
        Model::validateRequired('mediationAgreement', $this->mediationAgreement, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->caseNumber) {
            $res['case_number'] = $this->caseNumber;
        }
        if (null !== $this->caseCode) {
            $res['case_code'] = $this->caseCode;
        }
        if (null !== $this->causeActionName) {
            $res['cause_action_name'] = $this->causeActionName;
        }
        if (null !== $this->caseTatus) {
            $res['case_tatus'] = $this->caseTatus;
        }
        if (null !== $this->mediationPlatform) {
            $res['mediation_platform'] = $this->mediationPlatform;
        }
        if (null !== $this->mediationOrg) {
            $res['mediation_org'] = $this->mediationOrg;
        }
        if (null !== $this->mediator) {
            $res['mediator'] = $this->mediator;
        }
        if (null !== $this->applyTime) {
            $res['apply_time'] = $this->applyTime;
        }
        if (null !== $this->mediationResult) {
            $res['mediation_result'] = $this->mediationResult;
        }
        if (null !== $this->accuserIntentAmount) {
            $res['accuser_intent_amount'] = $this->accuserIntentAmount;
        }
        if (null !== $this->accusedIntentAmount) {
            $res['accused_intent_amount'] = $this->accusedIntentAmount;
        }
        if (null !== $this->mediationAmount) {
            $res['mediation_amount'] = $this->mediationAmount;
        }
        if (null !== $this->confirmFact) {
            $res['confirm_fact'] = $this->confirmFact;
        }
        if (null !== $this->mediationAgreement) {
            $res['mediation_agreement'] = $this->mediationAgreement;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MediationCaseDetailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['case_number'])) {
            $model->caseNumber = $map['case_number'];
        }
        if (isset($map['case_code'])) {
            $model->caseCode = $map['case_code'];
        }
        if (isset($map['cause_action_name'])) {
            $model->causeActionName = $map['cause_action_name'];
        }
        if (isset($map['case_tatus'])) {
            $model->caseTatus = $map['case_tatus'];
        }
        if (isset($map['mediation_platform'])) {
            $model->mediationPlatform = $map['mediation_platform'];
        }
        if (isset($map['mediation_org'])) {
            $model->mediationOrg = $map['mediation_org'];
        }
        if (isset($map['mediator'])) {
            $model->mediator = $map['mediator'];
        }
        if (isset($map['apply_time'])) {
            $model->applyTime = $map['apply_time'];
        }
        if (isset($map['mediation_result'])) {
            $model->mediationResult = $map['mediation_result'];
        }
        if (isset($map['accuser_intent_amount'])) {
            $model->accuserIntentAmount = $map['accuser_intent_amount'];
        }
        if (isset($map['accused_intent_amount'])) {
            $model->accusedIntentAmount = $map['accused_intent_amount'];
        }
        if (isset($map['mediation_amount'])) {
            $model->mediationAmount = $map['mediation_amount'];
        }
        if (isset($map['confirm_fact'])) {
            $model->confirmFact = $map['confirm_fact'];
        }
        if (isset($map['mediation_agreement'])) {
            $model->mediationAgreement = $map['mediation_agreement'];
        }

        return $model;
    }
}

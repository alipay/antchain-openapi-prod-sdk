<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class ApplicantInfo extends Model
{
    // 用户类型：PERSON / ENTERPRISE
    /**
     * @example PERSON
     *
     * @var string
     */
    public $userType;

    // 用户名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $certName;

    // 证件类型：IDENTITY_CARD/SOCIAL_CREDIT_CODE/MTP_HM/FOREIGN_PASSPORT/MTP_TW/ENTERPRISE_REGISTERED_NO
    /**
     * @example IDENTITY_CARD
     *
     * @var string
     */
    public $certDocType;

    // 证件号码
    /**
     * @example C1211131
     *
     * @var string
     */
    public $certNo;

    // 是否对证件号码脱敏，默认true
    /**
     * @example true
     *
     * @var bool
     */
    public $applicantMasking;

    // 手机号码
    /**
     * @example 13888888888
     *
     * @var string
     */
    public $mobileNo;

    // 法人姓名
    /**
     * @example 王五
     *
     * @var string
     */
    public $legalPerson;

    // 法人身份证
    /**
     * @example C1211131
     *
     * @var string
     */
    public $legalPersonId;

    // 经办人姓名
    /**
     * @example 李四
     *
     * @var string
     */
    public $agent;

    // 经办人身份证
    /**
     * @example C1211131
     *
     * @var string
     */
    public $agentId;
    protected $_name = [
        'userType'         => 'user_type',
        'certName'         => 'cert_name',
        'certDocType'      => 'cert_doc_type',
        'certNo'           => 'cert_no',
        'applicantMasking' => 'applicant_masking',
        'mobileNo'         => 'mobile_no',
        'legalPerson'      => 'legal_person',
        'legalPersonId'    => 'legal_person_id',
        'agent'            => 'agent',
        'agentId'          => 'agent_id',
    ];

    public function validate()
    {
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certDocType', $this->certDocType, true);
        Model::validateRequired('certNo', $this->certNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certDocType) {
            $res['cert_doc_type'] = $this->certDocType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->applicantMasking) {
            $res['applicant_masking'] = $this->applicantMasking;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }
        if (null !== $this->legalPerson) {
            $res['legal_person'] = $this->legalPerson;
        }
        if (null !== $this->legalPersonId) {
            $res['legal_person_id'] = $this->legalPersonId;
        }
        if (null !== $this->agent) {
            $res['agent'] = $this->agent;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicantInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_doc_type'])) {
            $model->certDocType = $map['cert_doc_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['applicant_masking'])) {
            $model->applicantMasking = $map['applicant_masking'];
        }
        if (isset($map['mobile_no'])) {
            $model->mobileNo = $map['mobile_no'];
        }
        if (isset($map['legal_person'])) {
            $model->legalPerson = $map['legal_person'];
        }
        if (isset($map['legal_person_id'])) {
            $model->legalPersonId = $map['legal_person_id'];
        }
        if (isset($map['agent'])) {
            $model->agent = $map['agent'];
        }
        if (isset($map['agent_id'])) {
            $model->agentId = $map['agent_id'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class Identity extends Model {
    protected $_name = [
        'agent' => 'agent',
        'agentCertType' => 'agent_cert_type',
        'agentId' => 'agent_id',
        'certName' => 'cert_name',
        'certNo' => 'cert_no',
        'certType' => 'cert_type',
        'legalPerson' => 'legal_person',
        'legalPersonCertType' => 'legal_person_cert_type',
        'legalPersonId' => 'legal_person_id',
        'mobileNo' => 'mobile_no',
        'properties' => 'properties',
        'userType' => 'user_type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->agent) {
            $res['agent'] = $this->agent;
        }
        if (null !== $this->agentCertType) {
            $res['agent_cert_type'] = $this->agentCertType;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->legalPerson) {
            $res['legal_person'] = $this->legalPerson;
        }
        if (null !== $this->legalPersonCertType) {
            $res['legal_person_cert_type'] = $this->legalPersonCertType;
        }
        if (null !== $this->legalPersonId) {
            $res['legal_person_id'] = $this->legalPersonId;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Identity
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['agent'])){
            $model->agent = $map['agent'];
        }
        if(isset($map['agent_cert_type'])){
            $model->agentCertType = $map['agent_cert_type'];
        }
        if(isset($map['agent_id'])){
            $model->agentId = $map['agent_id'];
        }
        if(isset($map['cert_name'])){
            $model->certName = $map['cert_name'];
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['cert_type'])){
            $model->certType = $map['cert_type'];
        }
        if(isset($map['legal_person'])){
            $model->legalPerson = $map['legal_person'];
        }
        if(isset($map['legal_person_cert_type'])){
            $model->legalPersonCertType = $map['legal_person_cert_type'];
        }
        if(isset($map['legal_person_id'])){
            $model->legalPersonId = $map['legal_person_id'];
        }
        if(isset($map['mobile_no'])){
            $model->mobileNo = $map['mobile_no'];
        }
        if(isset($map['properties'])){
            $model->properties = $map['properties'];
        }
        if(isset($map['user_type'])){
            $model->userType = $map['user_type'];
        }
        return $model;
    }
    // 经办人姓名，企业认证选填
    /**
     * @example 小明
     * @var string
     */
    public $agent;

    // 经办人证件类型，企业认证选填
    /**
     * @example IDENTITY_CARD
     * @var string
     */
    public $agentCertType;

    // 经办人身份证，企业认证选填
    /**
     * @example 123123123123
     * @var string
     */
    public $agentId;

    // 用户名称
    /**
     * @example 小王
     * @var string
     */
    public $certName;

    // 证件号
    /**
     * @example 12332112312312
     * @var string
     */
    public $certNo;

    // 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
    /**
     * @example IDENTITY_CARD
     * @var string
     */
    public $certType;

    // 法人姓名，企业认证必选
    /**
     * @example 小李
     * @var string
     */
    public $legalPerson;

    // 法人证件类型，企业认证必选
    /**
     * @example IDENTITY_CARD
     * @var string
     */
    public $legalPersonCertType;

    // 法人身份证，企业认证必选
    /**
     * @example 123123321123
     * @var string
     */
    public $legalPersonId;

    // 用户手机号码
    /**
     * @example 1231231231
     * @var string
     */
    public $mobileNo;

    // 扩展属性
    /**
     * @example {"key":"value"}
     * @var string
     */
    public $properties;

    // 用户类型，PERSON或者ENTERPRISE
    /**
     * @example PERSON
     * @var string
     */
    public $userType;

}

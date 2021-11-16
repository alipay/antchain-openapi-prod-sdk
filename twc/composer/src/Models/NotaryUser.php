<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class NotaryUser extends Model
{
    // 用户类型，PERSON或者ENTERPRISE
    /**
     * @example PERSON
     *
     * @var string
     */
    public $userType;

    // 证件类型
    // ● 个人：支持身份证IDENTITY_CARD
    // ● 企业：支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
    /**
     * @example IDENTITY_CARD
     *
     * @var string
     */
    public $certType;

    // 证件用户名称
    // ● 个人：身份证姓名
    // ● 企业：企业名称
    /**
     * @example 小王
     *
     * @var string
     */
    public $certName;

    // 证件号
    // ● 个人：身份证号
    // ● 企业：社会统一信用代码或企业工商注册号，与证件类型保持一致即可
    /**
     * @example 12332112312312
     *
     * @var string
     */
    public $certNo;

    // 个人必填，用户手机号码
    /**
     * @example 18811111111
     *
     * @var string
     */
    public $personMobileNo;

    // 企业选填，法人证件类型，仅支持身份证，IDENTITY_CARD
    /**
     * @example IDENTITY_CARD
     *
     * @var string
     */
    public $legalPersonCertType;

    // 企业选填，法人身份证姓名
    /**
     * @example 小李
     *
     * @var string
     */
    public $legalPersonCertName;

    // 企业选填，法人身份证号
    /**
     * @example 123123321123
     *
     * @var string
     */
    public $legalPersonCertNo;

    // 企业选填，法人手机号
    /**
     * @example 18811111111
     *
     * @var string
     */
    public $legalPersonMobileNo;

    // 扩展属性
    /**
     * @example {"key":"value"}
     *
     * @var string
     */
    public $properties;
    protected $_name = [
        'userType'            => 'user_type',
        'certType'            => 'cert_type',
        'certName'            => 'cert_name',
        'certNo'              => 'cert_no',
        'personMobileNo'      => 'person_mobile_no',
        'legalPersonCertType' => 'legal_person_cert_type',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo'   => 'legal_person_cert_no',
        'legalPersonMobileNo' => 'legal_person_mobile_no',
        'properties'          => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->personMobileNo) {
            $res['person_mobile_no'] = $this->personMobileNo;
        }
        if (null !== $this->legalPersonCertType) {
            $res['legal_person_cert_type'] = $this->legalPersonCertType;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->legalPersonMobileNo) {
            $res['legal_person_mobile_no'] = $this->legalPersonMobileNo;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['person_mobile_no'])) {
            $model->personMobileNo = $map['person_mobile_no'];
        }
        if (isset($map['legal_person_cert_type'])) {
            $model->legalPersonCertType = $map['legal_person_cert_type'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['legal_person_mobile_no'])) {
            $model->legalPersonMobileNo = $map['legal_person_mobile_no'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}

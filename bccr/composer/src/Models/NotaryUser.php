<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class NotaryUser extends Model
{
    // 用户类型
    /**
     * @example PERSON 或者 ENTERPRISE
     *
     * @var string
     */
    public $userType;

    // 用户名称
    /**
     * @example 个人用户姓名、企业名称
     *
     * @var string
     */
    public $userName;

    // 用户账号
    /**
     * @example 该用户为业务方注册用户时传入
     *
     * @var string
     */
    public $userAccount;

    // 证件类型
    /**
     * @example 个人证件类型： identity_card（身份证） 企业证件类型： unified _ social _ credit _ code（统一 社会信用代码） enterprise_registered_number（企 业工商注册号）
     *
     * @var string
     */
    public $certType;

    // 证件号
    /**
     * @example 证件类型对应的证件号码
     *
     * @var string
     */
    public $certNo;

    // 联系电话
    /**
     * @example 个人手机号或企业联系人手机号码
     *
     * @var string
     */
    public $phone;

    // 法定代表人姓名,用户类型为机构时必填
    /**
     * @example 用户类型为机构时必填
     *
     * @var string
     */
    public $legalPersonName;

    // 法定代表人证件号码,用户类型为机构时必填
    /**
     * @example 法定代表人证件号码
     *
     * @var string
     */
    public $legalPersonCertNo;

    // 法定代表人证件类型
    /**
     * @example 证件类型： identity_card（身份证，默认） foreign_permanent_resident_id_ca rd(外国人永久居留身份证)
     *
     * @var string
     */
    public $legalPersonCertType;

    // 身份证正面
    /**
     * @example 类型为个人时，传入个人的证件照片；类型为企业时，传入法人的证件正面
     *
     * @var string
     */
    public $certFrontFile;

    // 身份证反面
    /**
     * @example 类型为个人时，传入个人的证件照片；类型为企业时，传入法人的证件反面
     *
     * @var string
     */
    public $certBackFile;

    // 企业营业执照
    /**
     * @example 用户类型为机构时必填
     *
     * @var string
     */
    public $enterpriseCertFile;
    protected $_name = [
        'userType'            => 'user_type',
        'userName'            => 'user_name',
        'userAccount'         => 'user_account',
        'certType'            => 'cert_type',
        'certNo'              => 'cert_no',
        'phone'               => 'phone',
        'legalPersonName'     => 'legal_person_name',
        'legalPersonCertNo'   => 'legal_person_cert_no',
        'legalPersonCertType' => 'legal_person_cert_type',
        'certFrontFile'       => 'cert_front_file',
        'certBackFile'        => 'cert_back_file',
        'enterpriseCertFile'  => 'enterprise_cert_file',
    ];

    public function validate()
    {
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certNo', $this->certNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userAccount) {
            $res['user_account'] = $this->userAccount;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->legalPersonName) {
            $res['legal_person_name'] = $this->legalPersonName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->legalPersonCertType) {
            $res['legal_person_cert_type'] = $this->legalPersonCertType;
        }
        if (null !== $this->certFrontFile) {
            $res['cert_front_file'] = $this->certFrontFile;
        }
        if (null !== $this->certBackFile) {
            $res['cert_back_file'] = $this->certBackFile;
        }
        if (null !== $this->enterpriseCertFile) {
            $res['enterprise_cert_file'] = $this->enterpriseCertFile;
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
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_account'])) {
            $model->userAccount = $map['user_account'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['legal_person_name'])) {
            $model->legalPersonName = $map['legal_person_name'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['legal_person_cert_type'])) {
            $model->legalPersonCertType = $map['legal_person_cert_type'];
        }
        if (isset($map['cert_front_file'])) {
            $model->certFrontFile = $map['cert_front_file'];
        }
        if (isset($map['cert_back_file'])) {
            $model->certBackFile = $map['cert_back_file'];
        }
        if (isset($map['enterprise_cert_file'])) {
            $model->enterpriseCertFile = $map['enterprise_cert_file'];
        }

        return $model;
    }
}

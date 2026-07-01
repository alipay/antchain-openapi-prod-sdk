<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CompanyFourMetaInfo extends Model
{
    // 企业证件名称
    /**
     * @example XX公司
     *
     * @var string
     */
    public $companyCertName;

    // 企业证件号码
    /**
     * @example 9111011421316034XK
     *
     * @var string
     */
    public $companyCertNo;

    // 证件类型, 默认社会统一信用代码  NATIONAL_LEGAL_MERGE:统一社会信用代码，NATIONAL_LEGAL：营业执照号码
    /**
     * @example NATIONAL_LEGAL_MERGE
     *
     * @var string
     */
    public $companyCertType;

    // 法人证件名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $legalPersonCertName;

    // 法人证件号码
    /**
     * @example 110103202110131593
     *
     * @var string
     */
    public $legalPersonCertNo;

    // 法人证件类型 RESIDENT：居民身份证号，PASSPORT：护照，MILITARY：军官证
    /**
     * @example RESIDENT
     *
     * @var string
     */
    public $legalPersonCertType;
    protected $_name = [
        'companyCertName'     => 'company_cert_name',
        'companyCertNo'       => 'company_cert_no',
        'companyCertType'     => 'company_cert_type',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo'   => 'legal_person_cert_no',
        'legalPersonCertType' => 'legal_person_cert_type',
    ];

    public function validate()
    {
        Model::validateRequired('companyCertName', $this->companyCertName, true);
        Model::validateRequired('companyCertNo', $this->companyCertNo, true);
        Model::validateRequired('legalPersonCertName', $this->legalPersonCertName, true);
        Model::validateRequired('legalPersonCertNo', $this->legalPersonCertNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->companyCertName) {
            $res['company_cert_name'] = $this->companyCertName;
        }
        if (null !== $this->companyCertNo) {
            $res['company_cert_no'] = $this->companyCertNo;
        }
        if (null !== $this->companyCertType) {
            $res['company_cert_type'] = $this->companyCertType;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->legalPersonCertType) {
            $res['legal_person_cert_type'] = $this->legalPersonCertType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CompanyFourMetaInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['company_cert_name'])) {
            $model->companyCertName = $map['company_cert_name'];
        }
        if (isset($map['company_cert_no'])) {
            $model->companyCertNo = $map['company_cert_no'];
        }
        if (isset($map['company_cert_type'])) {
            $model->companyCertType = $map['company_cert_type'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['legal_person_cert_type'])) {
            $model->legalPersonCertType = $map['legal_person_cert_type'];
        }

        return $model;
    }
}

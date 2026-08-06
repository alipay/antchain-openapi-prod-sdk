<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractCompanyfourmetacheckRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'companyCertName' => 'company_cert_name',
        'companyCertNo' => 'company_cert_no',
        'certifyType' => 'certify_type',
        'companyCertType' => 'company_cert_type',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo' => 'legal_person_cert_no',
        'legalPersonCertType' => 'legal_person_cert_type',
    ];
    public function validate() {
        Model::validateRequired('companyCertName', $this->companyCertName, true);
        Model::validateRequired('companyCertNo', $this->companyCertNo, true);
        Model::validateRequired('companyCertType', $this->companyCertType, true);
        Model::validateRequired('legalPersonCertName', $this->legalPersonCertName, true);
        Model::validateRequired('legalPersonCertNo', $this->legalPersonCertNo, true);
        Model::validateRequired('legalPersonCertType', $this->legalPersonCertType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->companyCertName) {
            $res['company_cert_name'] = $this->companyCertName;
        }
        if (null !== $this->companyCertNo) {
            $res['company_cert_no'] = $this->companyCertNo;
        }
        if (null !== $this->certifyType) {
            $res['certify_type'] = $this->certifyType;
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
     * @return QueryContractCompanyfourmetacheckRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['company_cert_name'])){
            $model->companyCertName = $map['company_cert_name'];
        }
        if(isset($map['company_cert_no'])){
            $model->companyCertNo = $map['company_cert_no'];
        }
        if(isset($map['certify_type'])){
            $model->certifyType = $map['certify_type'];
        }
        if(isset($map['company_cert_type'])){
            $model->companyCertType = $map['company_cert_type'];
        }
        if(isset($map['legal_person_cert_name'])){
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if(isset($map['legal_person_cert_no'])){
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if(isset($map['legal_person_cert_type'])){
            $model->legalPersonCertType = $map['legal_person_cert_type'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 企业名称
    /**
     * @var string
     */
    public $companyCertName;

    // 企业证件号码
    /**
     * @var string
     */
    public $companyCertNo;

    // 认证类型:ENTERPRISE-企业, PERSON-个人
    /**
     * @var string
     */
    public $certifyType;

    // 企业证件号码类型:统一社会信用代码:CRED_ORG_USCC,PERSON_CERT_TYPE:CRED_PSN_CH_IDCARD
    /**
     * @var string
     */
    public $companyCertType;

    // 企业法人名称
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 企业法人证件号
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 企业法人证件类型:RESIDENT:居民身份证号,PASSPORT:护照,MILITARY:军官证
    /**
     * @var string
     */
    public $legalPersonCertType;

}

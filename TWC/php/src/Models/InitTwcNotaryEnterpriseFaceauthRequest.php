<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class InitTwcNotaryEnterpriseFaceauthRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'epCertName' => 'ep_cert_name',
        'epCertNo' => 'ep_cert_no',
        'epCertType' => 'ep_cert_type',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo' => 'legal_person_cert_no',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->epCertName) {
            $res['ep_cert_name'] = $this->epCertName;
        }
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->epCertType) {
            $res['ep_cert_type'] = $this->epCertType;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InitTwcNotaryEnterpriseFaceauthRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['ep_cert_name'])){
            $model->epCertName = $map['ep_cert_name'];
        }
        if(isset($map['ep_cert_no'])){
            $model->epCertNo = $map['ep_cert_no'];
        }
        if(isset($map['ep_cert_type'])){
            $model->epCertType = $map['ep_cert_type'];
        }
        if(isset($map['legal_person_cert_name'])){
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if(isset($map['legal_person_cert_no'])){
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 企业名称
    /**
     * @var string
     */
    public $epCertName;

    // 企业证件号
    /**
     * @var string
     */
    public $epCertNo;

    // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
    /**
     * @var string
     */
    public $epCertType;

    // 企业法人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 企业法人身份证号（目前仅支持身份证号）
    /**
     * @var string
     */
    public $legalPersonCertNo;

}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class VerifyFinserviceZhimaIdentifyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo' => 'legal_person_cert_no',
        'merchantUrl' => 'merchant_url',
    ];
    public function validate() {
        Model::validateRequired('legalPersonCertName', $this->legalPersonCertName, true);
        Model::validateRequired('legalPersonCertNo', $this->legalPersonCertNo, true);
        Model::validateRequired('merchantUrl', $this->merchantUrl, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->merchantUrl) {
            $res['merchant_url'] = $this->merchantUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return VerifyFinserviceZhimaIdentifyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['legal_person_cert_name'])){
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if(isset($map['legal_person_cert_no'])){
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if(isset($map['merchant_url'])){
            $model->merchantUrl = $map['merchant_url'];
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

    // 需要校验的人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 需要校验的人身份证号
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 认证结束后的商户回调地址。
    /**
     * @var string
     */
    public $merchantUrl;

}

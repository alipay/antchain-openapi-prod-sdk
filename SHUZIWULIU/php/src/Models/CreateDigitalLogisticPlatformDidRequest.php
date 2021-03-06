<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalLogisticPlatformDidRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'epCertName' => 'ep_cert_name',
        'epCertNo' => 'ep_cert_no',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo' => 'legal_person_cert_no',
        'extensionInfo' => 'extension_info',
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
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateDigitalLogisticPlatformDidRequest
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
        if(isset($map['legal_person_cert_name'])){
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if(isset($map['legal_person_cert_no'])){
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if(isset($map['extension_info'])){
            $model->extensionInfo = $map['extension_info'];
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

    // 企业信用号码
    /**
     * @var string
     */
    public $epCertNo;

    // 企业法人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 企业法人身份证号码
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 扩展字段
    /**
     * @var string
     */
    public $extensionInfo;

}

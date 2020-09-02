<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASPLUS\Models\BizInfo;

class QueryBaasPlusEverifyThreemetainternalRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'bizInfo' => 'biz_info',
        'epCertName' => 'ep_cert_name',
        'epCertNo' => 'ep_cert_no',
        'legalPersonCertName' => 'legal_person_cert_name',
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
        if (null !== $this->bizInfo) {
            $res['biz_info'] = null !== $this->bizInfo ? $this->bizInfo->toMap() : null;
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
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusEverifyThreemetainternalRequest
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
        if(isset($map['biz_info'])){
            $model->bizInfo = BizInfo::fromMap($map['biz_info']);
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

    // 内部字段
    /**
     * @var BizInfo
     */
    public $bizInfo;

    // 企业名称
    // 
    /**
     * @var string
     */
    public $epCertName;

    // 企业证件号
    // 
    /**
     * @var string
     */
    public $epCertNo;

    // 法人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;

}

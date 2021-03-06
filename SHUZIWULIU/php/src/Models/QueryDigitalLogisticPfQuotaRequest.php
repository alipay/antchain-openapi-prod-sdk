<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalLogisticPfQuotaRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'certNo' => 'cert_no',
        'certType' => 'cert_type',
        'customerNo' => 'customer_no',
        'financingSubjectDid' => 'financing_subject_did',
    ];
    public function validate() {
        Model::validateMaxLength('certNo', $this->certNo, 20);
        Model::validateMaxLength('certType', $this->certType, 3);
        Model::validateMaxLength('customerNo', $this->customerNo, 20);
    }
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        if (null !== $this->financingSubjectDid) {
            $res['financing_subject_did'] = $this->financingSubjectDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDigitalLogisticPfQuotaRequest
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
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['cert_type'])){
            $model->certType = $map['cert_type'];
        }
        if(isset($map['customer_no'])){
            $model->customerNo = $map['customer_no'];
        }
        if(isset($map['financing_subject_did'])){
            $model->financingSubjectDid = $map['financing_subject_did'];
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

    // 证件号
    /**
     * @var string
     */
    public $certNo;

    // 证件类型;050 统一社会信用证代码
    /**
     * @var string
     */
    public $certType;

    // 银行端客户号
    /**
     * @var string
     */
    public $customerNo;

    // 融资主体did
    /**
     * @var string
     */
    public $financingSubjectDid;

}

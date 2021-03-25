<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class DeleteJointconstraintRecordRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contractCode' => 'contract_code',
        'contractFulfillmentCode' => 'contract_fulfillment_code',
        'payerCertNumber' => 'payer_cert_number',
        'payerCertType' => 'payer_cert_type',
        'payerType' => 'payer_type',
    ];
    public function validate() {
        Model::validateRequired('contractCode', $this->contractCode, true);
        Model::validateRequired('contractFulfillmentCode', $this->contractFulfillmentCode, true);
        Model::validateRequired('payerCertNumber', $this->payerCertNumber, true);
        Model::validateRequired('payerCertType', $this->payerCertType, true);
        Model::validateRequired('payerType', $this->payerType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->contractCode) {
            $res['contract_code'] = $this->contractCode;
        }
        if (null !== $this->contractFulfillmentCode) {
            $res['contract_fulfillment_code'] = $this->contractFulfillmentCode;
        }
        if (null !== $this->payerCertNumber) {
            $res['payer_cert_number'] = $this->payerCertNumber;
        }
        if (null !== $this->payerCertType) {
            $res['payer_cert_type'] = $this->payerCertType;
        }
        if (null !== $this->payerType) {
            $res['payer_type'] = $this->payerType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteJointconstraintRecordRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['contract_code'])){
            $model->contractCode = $map['contract_code'];
        }
        if(isset($map['contract_fulfillment_code'])){
            $model->contractFulfillmentCode = $map['contract_fulfillment_code'];
        }
        if(isset($map['payer_cert_number'])){
            $model->payerCertNumber = $map['payer_cert_number'];
        }
        if(isset($map['payer_cert_type'])){
            $model->payerCertType = $map['payer_cert_type'];
        }
        if(isset($map['payer_type'])){
            $model->payerType = $map['payer_type'];
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

    // 合同编号
    // 
    // 
    /**
     * @var string
     */
    public $contractCode;

    // 合同履行记录标签
    // 
    // 
    /**
     * @var string
     */
    public $contractFulfillmentCode;

    // 应付方证件号码
    // 
    // 
    /**
     * @var string
     */
    public $payerCertNumber;

    // 应付方证件类型
    // 
    // 0：统一社会信用代码
    // 
    // 1：身份证号码
    /**
     * @var int
     */
    public $payerCertType;

    // 应付方类型
    // 
    // 0：企业
    // 
    // 1：个人
    /**
     * @var int
     */
    public $payerType;

}

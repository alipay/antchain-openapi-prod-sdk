<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVESERVICE\Models;

use AlibabaCloud\Tea\Model;

class QueryCustomerTransartificialRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'custNo' => 'cust_no',
        'caseCode' => 'case_code',
        'productType' => 'product_type',
        'createBy' => 'create_by',
    ];
    public function validate() {
        Model::validateRequired('custNo', $this->custNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->custNo) {
            $res['cust_no'] = $this->custNo;
        }
        if (null !== $this->caseCode) {
            $res['case_code'] = $this->caseCode;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->createBy) {
            $res['create_by'] = $this->createBy;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryCustomerTransartificialRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['cust_no'])){
            $model->custNo = $map['cust_no'];
        }
        if(isset($map['case_code'])){
            $model->caseCode = $map['case_code'];
        }
        if(isset($map['product_type'])){
            $model->productType = $map['product_type'];
        }
        if(isset($map['create_by'])){
            $model->createBy = $map['create_by'];
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

    // 客户号
    /**
     * @var string
     */
    public $custNo;

    // 案件号
    /**
     * @var string
     */
    public $caseCode;

    // 产品类型
    /**
     * @var string
     */
    public $productType;

    // 约定固定值-一般是对应平台的缩写
    /**
     * @var string
     */
    public $createBy;

}

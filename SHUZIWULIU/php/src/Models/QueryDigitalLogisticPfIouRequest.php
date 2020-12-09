<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalLogisticPfIouRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'customerNo' => 'customer_no',
        'debitId' => 'debit_id',
        'financingId' => 'financing_id',
    ];
    public function validate() {
        Model::validateMaxLength('customerNo', $this->customerNo, 20);
        Model::validateMaxLength('debitId', $this->debitId, 16);
        Model::validateMaxLength('financingId', $this->financingId, 32);
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
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        if (null !== $this->debitId) {
            $res['debit_id'] = $this->debitId;
        }
        if (null !== $this->financingId) {
            $res['financing_id'] = $this->financingId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDigitalLogisticPfIouRequest
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
        if(isset($map['customer_no'])){
            $model->customerNo = $map['customer_no'];
        }
        if(isset($map['debit_id'])){
            $model->debitId = $map['debit_id'];
        }
        if(isset($map['financing_id'])){
            $model->financingId = $map['financing_id'];
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

    // 客户号
    /**
     * @var string
     */
    public $customerNo;

    // 借据Id
    /**
     * @var string
     */
    public $debitId;

    // 支用Id
    /**
     * @var string
     */
    public $financingId;

}

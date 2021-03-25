<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryPayresultfileurlRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'billDate' => 'bill_date',
        'billType' => 'bill_type',
    ];
    public function validate() {
        Model::validateRequired('billDate', $this->billDate, true);
        Model::validateRequired('billType', $this->billType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->billDate) {
            $res['bill_date'] = $this->billDate;
        }
        if (null !== $this->billType) {
            $res['bill_type'] = $this->billType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryPayresultfileurlRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['bill_date'])){
            $model->billDate = $map['bill_date'];
        }
        if(isset($map['bill_type'])){
            $model->billType = $map['bill_type'];
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

    // 对账日期
    /**
     * @var string
     */
    public $billDate;

    // 交易类型
    /**
     * @var string
     */
    public $billType;

}

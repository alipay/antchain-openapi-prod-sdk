<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryActiveDataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'locationName' => 'location_name',
        'productName' => 'product_name',
        'specification' => 'specification',
        'dataDimension' => 'data_dimension',
        'inputByProcess' => 'input_by_process',
    ];
    public function validate() {
        Model::validateRequired('locationName', $this->locationName, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('specification', $this->specification, true);
        Model::validateRequired('inputByProcess', $this->inputByProcess, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->locationName) {
            $res['location_name'] = $this->locationName;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->specification) {
            $res['specification'] = $this->specification;
        }
        if (null !== $this->dataDimension) {
            $res['data_dimension'] = $this->dataDimension;
        }
        if (null !== $this->inputByProcess) {
            $res['input_by_process'] = $this->inputByProcess;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryActiveDataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['location_name'])){
            $model->locationName = $map['location_name'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['specification'])){
            $model->specification = $map['specification'];
        }
        if(isset($map['data_dimension'])){
            $model->dataDimension = $map['data_dimension'];
        }
        if(isset($map['input_by_process'])){
            $model->inputByProcess = $map['input_by_process'];
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

    // 生产单元名称
    /**
     * @var string
     */
    public $locationName;

    // 产品名称
    /**
     * @var string
     */
    public $productName;

    // 产品规格
    /**
     * @var string
     */
    public $specification;

    // 填报维度，`PRODUCT` 表示产品维度，`UNIT` 表示单元维度
    /**
     * @var string
     */
    public $dataDimension;

    // 是否按照单元过程查询，true标识按照，false标识不按照
    /**
     * @var bool
     */
    public $inputByProcess;

}

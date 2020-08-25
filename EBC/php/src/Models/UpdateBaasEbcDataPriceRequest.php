<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class UpdateBaasEbcDataPriceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'dataIdList' => 'data_id_list',
        'dataType' => 'data_type',
        'price' => 'price',
    ];
    public function validate() {
        Model::validateMaximum('price', $this->price, '999999999');
        Model::validateMinimum('price', $this->price, '1');
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
        if (null !== $this->dataIdList) {
            $res['data_id_list'] = $this->dataIdList;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBaasEbcDataPriceRequest
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
        if(isset($map['data_id_list'])){
            if(!empty($map['data_id_list'])){
                $model->dataIdList = $map['data_id_list'];
            }
        }
        if(isset($map['data_type'])){
            $model->dataType = $map['data_type'];
        }
        if(isset($map['price'])){
            $model->price = $map['price'];
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

    // 目标数据id列表，最多20个
    /**
     * @var array
     */
    public $dataIdList;

    // 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
    /**
     * @var int
     */
    public $dataType;

    // 数据价值
    /**
     * @var int
     */
    public $price;

}

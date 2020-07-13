<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\AttributeDesc;

class CreateAasEbcPersonRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'attributeDescList' => 'attribute_desc_list',
        'personName' => 'person_name',
        'primaryIdNo' => 'primary_id_no',
        'secondIdNo1' => 'second_id_no_1',
        'secondIdNo2' => 'second_id_no_2',
        'secondIdNo3' => 'second_id_no_3',
    ];
    public function validate() {
        Model::validateMaxLength('personName', $this->personName, 32);
        Model::validateMaxLength('primaryIdNo', $this->primaryIdNo, 1024);
        Model::validateMaxLength('secondIdNo1', $this->secondIdNo1, 1024);
        Model::validateMaxLength('secondIdNo2', $this->secondIdNo2, 1024);
        Model::validateMaxLength('secondIdNo3', $this->secondIdNo3, 1024);
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
        if (null !== $this->attributeDescList) {
            $res['attribute_desc_list'] = [];
            if(null !== $this->attributeDescList && is_array($this->attributeDescList)){
                $n = 0;
                foreach($this->attributeDescList as $item){
                    $res['attribute_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->personName) {
            $res['person_name'] = $this->personName;
        }
        if (null !== $this->primaryIdNo) {
            $res['primary_id_no'] = $this->primaryIdNo;
        }
        if (null !== $this->secondIdNo1) {
            $res['second_id_no_1'] = $this->secondIdNo1;
        }
        if (null !== $this->secondIdNo2) {
            $res['second_id_no_2'] = $this->secondIdNo2;
        }
        if (null !== $this->secondIdNo3) {
            $res['second_id_no_3'] = $this->secondIdNo3;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateAasEbcPersonRequest
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
        if(isset($map['attribute_desc_list'])){
            if(!empty($map['attribute_desc_list'])){
                $model->attributeDescList = [];
                $n = 0;
                foreach($map['attribute_desc_list'] as $item) {
                    $model->attributeDescList[$n++] = null !== $item ? AttributeDesc::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['person_name'])){
            $model->personName = $map['person_name'];
        }
        if(isset($map['primary_id_no'])){
            $model->primaryIdNo = $map['primary_id_no'];
        }
        if(isset($map['second_id_no_1'])){
            $model->secondIdNo1 = $map['second_id_no_1'];
        }
        if(isset($map['second_id_no_2'])){
            $model->secondIdNo2 = $map['second_id_no_2'];
        }
        if(isset($map['second_id_no_3'])){
            $model->secondIdNo3 = $map['second_id_no_3'];
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

    // 加密属性描述列表
    // 
    /**
     * @var array
     */
    public $attributeDescList;

    // 姓名
    /**
     * @var string
     */
    public $personName;

    // 持有人主证件编号，无身份证的个人使用0000000000000000
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $primaryIdNo;

    // 持有人辅助证件编号-1
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $secondIdNo1;

    // 持有人辅助证件编号-1
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $secondIdNo2;

    // 持有人辅助证件编号-3
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $secondIdNo3;

}

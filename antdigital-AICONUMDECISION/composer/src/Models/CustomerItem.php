<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AICONUMDECISION\Models;

use AlibabaCloud\Tea\Model;

class CustomerItem extends Model {
    protected $_name = [
        'bizId' => 'biz_id',
        'phoneNumber' => 'phone_number',
        'bizProperties' => 'biz_properties',
    ];
    public function validate() {
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->bizProperties) {
            $res['biz_properties'] = $this->bizProperties;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CustomerItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['biz_id'])){
            $model->bizId = $map['biz_id'];
        }
        if(isset($map['phone_number'])){
            $model->phoneNumber = $map['phone_number'];
        }
        if(isset($map['biz_properties'])){
            $model->bizProperties = $map['biz_properties'];
        }
        return $model;
    }
    // 客户业务键
    /**
     * @example 客户业务键
     * @var string
     */
    public $bizId;

    // 手机号
    /**
     * @example 12233332222
     * @var string
     */
    public $phoneNumber;

    // 业务属性
    /**
     * @example {"姓名":"张","customerId":"Z3gnNptlEf7FyNGsD3o1mg","性别":"1","issue":"1","effectTime":"1","price":"1"}
     * @var string
     */
    public $bizProperties;

}

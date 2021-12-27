<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDubheCustomerInfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 客户姓名(可修改字段)
    /**
     * @var string
     */
    public $customName;

    // 户籍所在地(可修改字段)
    /**
     * @var string
     */
    public $censusRegister;

    // 证件号码(可修改字段)
    /**
     * @var string
     */
    public $cardNo;

    // 手机号码(可修改字段)
    /**
     * @var string
     */
    public $mobile;

    // 客户编号(唯一不变)
    /**
     * @var string
     */
    public $customNo;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customName'        => 'custom_name',
        'censusRegister'    => 'census_register',
        'cardNo'            => 'card_no',
        'mobile'            => 'mobile',
        'customNo'          => 'custom_no',
        'orderNo'           => 'order_no',
    ];

    public function validate()
    {
        Model::validateRequired('customNo', $this->customNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->censusRegister) {
            $res['census_register'] = $this->censusRegister;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDubheCustomerInfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['custom_name'])) {
            $model->customName = $map['custom_name'];
        }
        if (isset($map['census_register'])) {
            $model->censusRegister = $map['census_register'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }

        return $model;
    }
}

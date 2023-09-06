<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class ImportResourceConsigneeinfoRequest extends Model
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

    // 姓名
    /**
     * @var string
     */
    public $name;

    // 手机号
    /**
     * @var string
     */
    public $phone;

    // 收货地址
    /**
     * @var string
     */
    public $deliveryAddress;

    // email
    /**
     * @var string
     */
    public $email;

    // 中奖人手机号
    /**
     * @var string
     */
    public $luckyPhone;

    // 单据号，幂等用
    /**
     * @var string
     */
    public $bizNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'phone'             => 'phone',
        'deliveryAddress'   => 'delivery_address',
        'email'             => 'email',
        'luckyPhone'        => 'lucky_phone',
        'bizNo'             => 'biz_no',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('deliveryAddress', $this->deliveryAddress, true);
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('luckyPhone', $this->luckyPhone, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->deliveryAddress) {
            $res['delivery_address'] = $this->deliveryAddress;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->luckyPhone) {
            $res['lucky_phone'] = $this->luckyPhone;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportResourceConsigneeinfoRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['delivery_address'])) {
            $model->deliveryAddress = $map['delivery_address'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['lucky_phone'])) {
            $model->luckyPhone = $map['lucky_phone'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }

        return $model;
    }
}

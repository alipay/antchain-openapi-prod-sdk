<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class GetSpProductOrderRequest extends Model
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

    /**
     * @var string
     */
    public $productAccessCode;

    // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
    /**
     * @var string
     */
    public $orderNo;

    // 产品码 全局唯一
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productAccessCode' => 'product_access_code',
        'orderNo'           => 'order_no',
        'productCode'       => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateMaxLength('orderNo', $this->orderNo, 64);
        Model::validateMaxLength('productCode', $this->productCode, 20);
        Model::validateMinLength('orderNo', $this->orderNo, 32);
        Model::validateMinLength('productCode', $this->productCode, 3);
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
        if (null !== $this->productAccessCode) {
            $res['product_access_code'] = $this->productAccessCode;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetSpProductOrderRequest
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
        if (isset($map['product_access_code'])) {
            $model->productAccessCode = $map['product_access_code'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}

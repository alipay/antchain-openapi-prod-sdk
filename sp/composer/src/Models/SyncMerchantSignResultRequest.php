<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class SyncMerchantSignResultRequest extends Model
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

    // 本次关联注册失败错误原因。
    /**
     * @var string
     */
    public $errorMsg;

    // 商家注册(进件)受理单号
    /**
     * @var string
     */
    public $orderId;

    // 商家注册（包括进件）结果。99:已完结;-1:失败;
    /**
     * @var string
     */
    public $status;

    // 二级商户id
    /**
     * @var string
     */
    public $smid;

    // 商户租户id
    /**
     * @var string
     */
    public $merchantUserId;

    // 商户名称
    /**
     * @var string
     */
    public $merchantName;

    // 八位数的商户租户名称
    /**
     * @var string
     */
    public $merchantUserName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productAccessCode' => 'product_access_code',
        'errorMsg'          => 'error_msg',
        'orderId'           => 'order_id',
        'status'            => 'status',
        'smid'              => 'smid',
        'merchantUserId'    => 'merchant_user_id',
        'merchantName'      => 'merchant_name',
        'merchantUserName'  => 'merchant_user_name',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('smid', $this->smid, true);
        Model::validateRequired('merchantUserId', $this->merchantUserId, true);
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
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->smid) {
            $res['smid'] = $this->smid;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->merchantUserName) {
            $res['merchant_user_name'] = $this->merchantUserName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncMerchantSignResultRequest
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
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['smid'])) {
            $model->smid = $map['smid'];
        }
        if (isset($map['merchant_user_id'])) {
            $model->merchantUserId = $map['merchant_user_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['merchant_user_name'])) {
            $model->merchantUserName = $map['merchant_user_name'];
        }

        return $model;
    }
}

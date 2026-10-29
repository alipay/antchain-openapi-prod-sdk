<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncAcctOrderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId' => 'order_id',
        'platformId' => 'platform_id',
        'platformName' => 'platform_name',
        'orderInfo' => 'order_info',
        'userInfo' => 'user_info',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('platformId', $this->platformId, true);
        Model::validateRequired('platformName', $this->platformName, true);
        Model::validateRequired('orderInfo', $this->orderInfo, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->platformId) {
            $res['platform_id'] = $this->platformId;
        }
        if (null !== $this->platformName) {
            $res['platform_name'] = $this->platformName;
        }
        if (null !== $this->orderInfo) {
            $res['order_info'] = $this->orderInfo;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = $this->userInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncAcctOrderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['platform_id'])){
            $model->platformId = $map['platform_id'];
        }
        if(isset($map['platform_name'])){
            $model->platformName = $map['platform_name'];
        }
        if(isset($map['order_info'])){
            $model->orderInfo = $map['order_info'];
        }
        if(isset($map['user_info'])){
            $model->userInfo = $map['user_info'];
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

    // 平台传入的签约单号
    /**
     * @var string
     */
    public $orderId;

    // 平台商统一社会信用代码
    /**
     * @var string
     */
    public $platformId;

    // 平台商名称
    /**
     * @var string
     */
    public $platformName;

    // 签约单信息，JSON字符串，参考后文 OrderInfoRequest 定义
    /**
     * @var string
     */
    public $orderInfo;

    // 卖家信息，JSON字符串，参考后文 UserInfoRequest 定义
    /**
     * @var string
     */
    public $userInfo;

}

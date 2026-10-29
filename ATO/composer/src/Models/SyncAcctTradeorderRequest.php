<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncAcctTradeorderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId' => 'order_id',
        'platformId' => 'platform_id',
        'acctTradeOrderId' => 'acct_trade_order_id',
        'orderInfo' => 'order_info',
        'productInfo' => 'product_info',
        'userInfo' => 'user_info',
        'thirdUserInfo' => 'third_user_info',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('platformId', $this->platformId, true);
        Model::validateRequired('acctTradeOrderId', $this->acctTradeOrderId, true);
        Model::validateRequired('orderInfo', $this->orderInfo, true);
        Model::validateRequired('productInfo', $this->productInfo, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
        Model::validateRequired('thirdUserInfo', $this->thirdUserInfo, true);
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
        if (null !== $this->acctTradeOrderId) {
            $res['acct_trade_order_id'] = $this->acctTradeOrderId;
        }
        if (null !== $this->orderInfo) {
            $res['order_info'] = $this->orderInfo;
        }
        if (null !== $this->productInfo) {
            $res['product_info'] = $this->productInfo;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = $this->userInfo;
        }
        if (null !== $this->thirdUserInfo) {
            $res['third_user_info'] = $this->thirdUserInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncAcctTradeorderRequest
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
        if(isset($map['acct_trade_order_id'])){
            $model->acctTradeOrderId = $map['acct_trade_order_id'];
        }
        if(isset($map['order_info'])){
            $model->orderInfo = $map['order_info'];
        }
        if(isset($map['product_info'])){
            $model->productInfo = $map['product_info'];
        }
        if(isset($map['user_info'])){
            $model->userInfo = $map['user_info'];
        }
        if(isset($map['third_user_info'])){
            $model->thirdUserInfo = $map['third_user_info'];
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

    // 关联的签约单号，长度大于6小于50
    /**
     * @var string
     */
    public $orderId;

    // 平台商统一社会信用代码，长度大于0小于等于32
    /**
     * @var string
     */
    public $platformId;

    // 平台传入的交易订单号，长度大于6小于50
    /**
     * @var string
     */
    public $acctTradeOrderId;

    // 交易订单信息，JSON字符串，参考后文 TradeOrderInfoRequest 定义
    /**
     * @var string
     */
    public $orderInfo;

    // 商品信息，JSON字符串，参考后文 TradeProductInfoRequest 定义
    /**
     * @var string
     */
    public $productInfo;

    // 交易卖家信息，JSON字符串，参考后文 TradeUserInfoRequest 定义；平台账号ID、姓名、身份证号需与关联签约单一致
    /**
     * @var string
     */
    public $userInfo;

    // 交易买家信息，JSON字符串，参考后文 TradeThirdUserInfoRequest 定义
    /**
     * @var string
     */
    public $thirdUserInfo;

}

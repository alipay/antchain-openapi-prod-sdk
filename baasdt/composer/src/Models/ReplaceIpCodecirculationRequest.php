<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ReplaceIpCodecirculationRequest extends Model
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

    // 基础参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 数字凭证加密编码或UNI序列号
    /**
     * @var string
     */
    public $code;

    // 领取用户的名称
    /**
     * @var string
     */
    public $userName;

    // 领取用户的手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 当前持有人手机号
    /**
     * @var string
     */
    public $sellerPhoneNumber;

    // 外部客户自定义客户ID
    /**
     * @var string
     */
    public $externalUserId;

    // 用户头像地址
    /**
     * @var string
     */
    public $avatar;

    // 领取用户的位置信息
    /**
     * @var string
     */
    public $gps;

    // 交易单ID
    /**
     * @var string
     */
    public $flowOrderId;

    // 交易金额
    /**
     * @var string
     */
    public $flowAmount;

    // 流转交易平台
    /**
     * @var string
     */
    public $flowTradePlatform;

    // 商品名称
    /**
     * @var string
     */
    public $flowGoodsName;

    // 交易时间戳
    /**
     * @var int
     */
    public $flowTransactionTime;

    // 流转信息jsonstring
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'baseRequest'         => 'base_request',
        'code'                => 'code',
        'userName'            => 'user_name',
        'phoneNumber'         => 'phone_number',
        'sellerPhoneNumber'   => 'seller_phone_number',
        'externalUserId'      => 'external_user_id',
        'avatar'              => 'avatar',
        'gps'                 => 'gps',
        'flowOrderId'         => 'flow_order_id',
        'flowAmount'          => 'flow_amount',
        'flowTradePlatform'   => 'flow_trade_platform',
        'flowGoodsName'       => 'flow_goods_name',
        'flowTransactionTime' => 'flow_transaction_time',
        'extInfo'             => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('sellerPhoneNumber', $this->sellerPhoneNumber, true);
        Model::validateRequired('flowOrderId', $this->flowOrderId, true);
        Model::validateRequired('flowAmount', $this->flowAmount, true);
        Model::validateRequired('flowTradePlatform', $this->flowTradePlatform, true);
        Model::validateRequired('flowTransactionTime', $this->flowTransactionTime, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->sellerPhoneNumber) {
            $res['seller_phone_number'] = $this->sellerPhoneNumber;
        }
        if (null !== $this->externalUserId) {
            $res['external_user_id'] = $this->externalUserId;
        }
        if (null !== $this->avatar) {
            $res['avatar'] = $this->avatar;
        }
        if (null !== $this->gps) {
            $res['gps'] = $this->gps;
        }
        if (null !== $this->flowOrderId) {
            $res['flow_order_id'] = $this->flowOrderId;
        }
        if (null !== $this->flowAmount) {
            $res['flow_amount'] = $this->flowAmount;
        }
        if (null !== $this->flowTradePlatform) {
            $res['flow_trade_platform'] = $this->flowTradePlatform;
        }
        if (null !== $this->flowGoodsName) {
            $res['flow_goods_name'] = $this->flowGoodsName;
        }
        if (null !== $this->flowTransactionTime) {
            $res['flow_transaction_time'] = $this->flowTransactionTime;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReplaceIpCodecirculationRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['seller_phone_number'])) {
            $model->sellerPhoneNumber = $map['seller_phone_number'];
        }
        if (isset($map['external_user_id'])) {
            $model->externalUserId = $map['external_user_id'];
        }
        if (isset($map['avatar'])) {
            $model->avatar = $map['avatar'];
        }
        if (isset($map['gps'])) {
            $model->gps = $map['gps'];
        }
        if (isset($map['flow_order_id'])) {
            $model->flowOrderId = $map['flow_order_id'];
        }
        if (isset($map['flow_amount'])) {
            $model->flowAmount = $map['flow_amount'];
        }
        if (isset($map['flow_trade_platform'])) {
            $model->flowTradePlatform = $map['flow_trade_platform'];
        }
        if (isset($map['flow_goods_name'])) {
            $model->flowGoodsName = $map['flow_goods_name'];
        }
        if (isset($map['flow_transaction_time'])) {
            $model->flowTransactionTime = $map['flow_transaction_time'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}

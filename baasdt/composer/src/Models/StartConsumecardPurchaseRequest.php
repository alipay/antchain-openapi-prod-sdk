<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class StartConsumecardPurchaseRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 支付方证件号
    /**
     * @var string
     */
    public $buyerIdNumber;

    // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
    /**
     * @var int
     */
    public $buyerIdType;

    // 支付方发起ip
    /**
     * @var string
     */
    public $buyerIp;

    // 支付方姓名
    /**
     * @var string
     */
    public $buyerName;

    // 支付方手机号
    /**
     * @var string
     */
    public $buyerPhone;

    // 商品ID
    /**
     * @var string
     */
    public $goodsId;

    // 外部系统交易创建时间，毫秒时间戳
    /**
     * @var int
     */
    public $originCreateTime;

    // 外部系统订单号
    /**
     * @var string
     */
    public $originOrderId;

    // 附言
    /**
     * @var string
     */
    public $remark;

    // 期望支付的商品价格(单位:元,精确到分)
    /**
     * @var string
     */
    public $tokenPrice;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'buyerIdNumber'     => 'buyer_id_number',
        'buyerIdType'       => 'buyer_id_type',
        'buyerIp'           => 'buyer_ip',
        'buyerName'         => 'buyer_name',
        'buyerPhone'        => 'buyer_phone',
        'goodsId'           => 'goods_id',
        'originCreateTime'  => 'origin_create_time',
        'originOrderId'     => 'origin_order_id',
        'remark'            => 'remark',
        'tokenPrice'        => 'token_price',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('buyerIdNumber', $this->buyerIdNumber, true);
        Model::validateRequired('buyerIdType', $this->buyerIdType, true);
        Model::validateRequired('buyerIp', $this->buyerIp, true);
        Model::validateRequired('buyerName', $this->buyerName, true);
        Model::validateRequired('buyerPhone', $this->buyerPhone, true);
        Model::validateRequired('goodsId', $this->goodsId, true);
        Model::validateRequired('originCreateTime', $this->originCreateTime, true);
        Model::validateRequired('originOrderId', $this->originOrderId, true);
        Model::validateRequired('remark', $this->remark, true);
        Model::validateRequired('tokenPrice', $this->tokenPrice, true);
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
        if (null !== $this->buyerIdNumber) {
            $res['buyer_id_number'] = $this->buyerIdNumber;
        }
        if (null !== $this->buyerIdType) {
            $res['buyer_id_type'] = $this->buyerIdType;
        }
        if (null !== $this->buyerIp) {
            $res['buyer_ip'] = $this->buyerIp;
        }
        if (null !== $this->buyerName) {
            $res['buyer_name'] = $this->buyerName;
        }
        if (null !== $this->buyerPhone) {
            $res['buyer_phone'] = $this->buyerPhone;
        }
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->originCreateTime) {
            $res['origin_create_time'] = $this->originCreateTime;
        }
        if (null !== $this->originOrderId) {
            $res['origin_order_id'] = $this->originOrderId;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->tokenPrice) {
            $res['token_price'] = $this->tokenPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartConsumecardPurchaseRequest
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
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['buyer_id_number'])) {
            $model->buyerIdNumber = $map['buyer_id_number'];
        }
        if (isset($map['buyer_id_type'])) {
            $model->buyerIdType = $map['buyer_id_type'];
        }
        if (isset($map['buyer_ip'])) {
            $model->buyerIp = $map['buyer_ip'];
        }
        if (isset($map['buyer_name'])) {
            $model->buyerName = $map['buyer_name'];
        }
        if (isset($map['buyer_phone'])) {
            $model->buyerPhone = $map['buyer_phone'];
        }
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['origin_create_time'])) {
            $model->originCreateTime = $map['origin_create_time'];
        }
        if (isset($map['origin_order_id'])) {
            $model->originOrderId = $map['origin_order_id'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['token_price'])) {
            $model->tokenPrice = $map['token_price'];
        }

        return $model;
    }
}

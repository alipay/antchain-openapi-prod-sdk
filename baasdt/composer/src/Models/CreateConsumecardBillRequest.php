<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateConsumecardBillRequest extends Model
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

    // 账单标价(单位:元,精确到分)
    /**
     * @var string
     */
    public $billDisplayPrice;

    // 账单名称
    /**
     * @var string
     */
    public $billName;

    // 账单实际支付金额(单位:元,精确到分)
    /**
     * @var string
     */
    public $billTokenPrice;

    // 账单类型
    /**
     * @var string
     */
    public $billType;

    // 交易发起方的链上账户Id
    /**
     * @var string
     */
    public $buyerAccountId;

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

    // 外部系统创建时间
    /**
     * @var int
     */
    public $originCreateTime;

    // 外部系统订单号
    /**
     * @var string
     */
    public $originOrderId;

    // 附言（不必填）
    /**
     * @var string
     */
    public $remark;

    // 交易接收方的链上账户Id
    /**
     * @var string
     */
    public $sellerAccountId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'billDisplayPrice'  => 'bill_display_price',
        'billName'          => 'bill_name',
        'billTokenPrice'    => 'bill_token_price',
        'billType'          => 'bill_type',
        'buyerAccountId'    => 'buyer_account_id',
        'buyerIdNumber'     => 'buyer_id_number',
        'buyerIdType'       => 'buyer_id_type',
        'buyerIp'           => 'buyer_ip',
        'buyerName'         => 'buyer_name',
        'buyerPhone'        => 'buyer_phone',
        'originCreateTime'  => 'origin_create_time',
        'originOrderId'     => 'origin_order_id',
        'remark'            => 'remark',
        'sellerAccountId'   => 'seller_account_id',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('billDisplayPrice', $this->billDisplayPrice, true);
        Model::validateRequired('billName', $this->billName, true);
        Model::validateRequired('billTokenPrice', $this->billTokenPrice, true);
        Model::validateRequired('billType', $this->billType, true);
        Model::validateRequired('buyerAccountId', $this->buyerAccountId, true);
        Model::validateRequired('buyerIdNumber', $this->buyerIdNumber, true);
        Model::validateRequired('buyerIdType', $this->buyerIdType, true);
        Model::validateRequired('buyerIp', $this->buyerIp, true);
        Model::validateRequired('buyerName', $this->buyerName, true);
        Model::validateRequired('buyerPhone', $this->buyerPhone, true);
        Model::validateRequired('originCreateTime', $this->originCreateTime, true);
        Model::validateRequired('originOrderId', $this->originOrderId, true);
        Model::validateRequired('sellerAccountId', $this->sellerAccountId, true);
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
        if (null !== $this->billDisplayPrice) {
            $res['bill_display_price'] = $this->billDisplayPrice;
        }
        if (null !== $this->billName) {
            $res['bill_name'] = $this->billName;
        }
        if (null !== $this->billTokenPrice) {
            $res['bill_token_price'] = $this->billTokenPrice;
        }
        if (null !== $this->billType) {
            $res['bill_type'] = $this->billType;
        }
        if (null !== $this->buyerAccountId) {
            $res['buyer_account_id'] = $this->buyerAccountId;
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
        if (null !== $this->originCreateTime) {
            $res['origin_create_time'] = $this->originCreateTime;
        }
        if (null !== $this->originOrderId) {
            $res['origin_order_id'] = $this->originOrderId;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->sellerAccountId) {
            $res['seller_account_id'] = $this->sellerAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateConsumecardBillRequest
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
        if (isset($map['bill_display_price'])) {
            $model->billDisplayPrice = $map['bill_display_price'];
        }
        if (isset($map['bill_name'])) {
            $model->billName = $map['bill_name'];
        }
        if (isset($map['bill_token_price'])) {
            $model->billTokenPrice = $map['bill_token_price'];
        }
        if (isset($map['bill_type'])) {
            $model->billType = $map['bill_type'];
        }
        if (isset($map['buyer_account_id'])) {
            $model->buyerAccountId = $map['buyer_account_id'];
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
        if (isset($map['origin_create_time'])) {
            $model->originCreateTime = $map['origin_create_time'];
        }
        if (isset($map['origin_order_id'])) {
            $model->originOrderId = $map['origin_order_id'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['seller_account_id'])) {
            $model->sellerAccountId = $map['seller_account_id'];
        }

        return $model;
    }
}

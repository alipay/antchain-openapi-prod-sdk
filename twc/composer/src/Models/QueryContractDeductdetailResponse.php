<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractDeductdetailResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 用户支付宝uid
    /**
     * @var string
     */
    public $alipayUserId;

    // 商户统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商品名称
    /**
     * @var string
     */
    public $productName;

    // 订单创建时间
    /**
     * @var string
     */
    public $orderCreateDate;

    // 订单状态
    /**
     * @var string
     */
    public $orderStatusCode;

    // 订单子状态
    /**
     * @var string
     */
    public $orderSubStatusCode;

    // 总金额，单位为分
    /**
     * @var int
     */
    public $totalRentMoney;

    // 商户smid
    /**
     * @var string
     */
    public $alipaySmid;

    // 商户名称
    /**
     * @var string
     */
    public $merchantName;

    // 用户支付宝代扣签约协议号
    /**
     * @var string
     */
    public $alipayAgreementNo;

    // 履约记录
    /**
     * @var string[]
     */
    public $fulfillmentList;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'tenantId'           => 'tenant_id',
        'orderId'            => 'order_id',
        'alipayUserId'       => 'alipay_user_id',
        'merchantId'         => 'merchant_id',
        'productName'        => 'product_name',
        'orderCreateDate'    => 'order_create_date',
        'orderStatusCode'    => 'order_status_code',
        'orderSubStatusCode' => 'order_sub_status_code',
        'totalRentMoney'     => 'total_rent_money',
        'alipaySmid'         => 'alipay_smid',
        'merchantName'       => 'merchant_name',
        'alipayAgreementNo'  => 'alipay_agreement_no',
        'fulfillmentList'    => 'fulfillment_list',
    ];

    public function validate()
    {
        Model::validatePattern('orderCreateDate', $this->orderCreateDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->orderCreateDate) {
            $res['order_create_date'] = $this->orderCreateDate;
        }
        if (null !== $this->orderStatusCode) {
            $res['order_status_code'] = $this->orderStatusCode;
        }
        if (null !== $this->orderSubStatusCode) {
            $res['order_sub_status_code'] = $this->orderSubStatusCode;
        }
        if (null !== $this->totalRentMoney) {
            $res['total_rent_money'] = $this->totalRentMoney;
        }
        if (null !== $this->alipaySmid) {
            $res['alipay_smid'] = $this->alipaySmid;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->alipayAgreementNo) {
            $res['alipay_agreement_no'] = $this->alipayAgreementNo;
        }
        if (null !== $this->fulfillmentList) {
            $res['fulfillment_list'] = $this->fulfillmentList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractDeductdetailResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['order_create_date'])) {
            $model->orderCreateDate = $map['order_create_date'];
        }
        if (isset($map['order_status_code'])) {
            $model->orderStatusCode = $map['order_status_code'];
        }
        if (isset($map['order_sub_status_code'])) {
            $model->orderSubStatusCode = $map['order_sub_status_code'];
        }
        if (isset($map['total_rent_money'])) {
            $model->totalRentMoney = $map['total_rent_money'];
        }
        if (isset($map['alipay_smid'])) {
            $model->alipaySmid = $map['alipay_smid'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['alipay_agreement_no'])) {
            $model->alipayAgreementNo = $map['alipay_agreement_no'];
        }
        if (isset($map['fulfillment_list'])) {
            if (!empty($map['fulfillment_list'])) {
                $model->fulfillmentList = $map['fulfillment_list'];
            }
        }

        return $model;
    }
}

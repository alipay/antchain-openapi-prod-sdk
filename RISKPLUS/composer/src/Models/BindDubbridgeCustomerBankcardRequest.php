<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BindDubbridgeCustomerBankcardRequest extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 客户编号
    /**
     * @var string
     */
    public $customerNo;

    // 银行卡号
    /**
     * @var string
     */
    public $bankCardNo;

    // 渠道描述，具体请见分配
    /**
     * @var string
     */
    public $channelCode;

    // 客户名称
    /**
     * @var string
     */
    public $customName;

    // 资产方用户唯一标识
    /**
     * @var string
     */
    public $openId;

    // 身份证号
    /**
     * @var string
     */
    public $cardNo;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 业务类型
    /**
     * @var string
     */
    public $prodType;

    // 银行编码
    /**
     * @var string
     */
    public $bankCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'customerNo'        => 'customer_no',
        'bankCardNo'        => 'bank_card_no',
        'channelCode'       => 'channel_code',
        'customName'        => 'custom_name',
        'openId'            => 'open_id',
        'cardNo'            => 'card_no',
        'mobile'            => 'mobile',
        'prodType'          => 'prod_type',
        'bankCode'          => 'bank_code',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('customerNo', $this->customerNo, true);
        Model::validateRequired('bankCardNo', $this->bankCardNo, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->prodType) {
            $res['prod_type'] = $this->prodType;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindDubbridgeCustomerBankcardRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['custom_name'])) {
            $model->customName = $map['custom_name'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['prod_type'])) {
            $model->prodType = $map['prod_type'];
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }

        return $model;
    }
}

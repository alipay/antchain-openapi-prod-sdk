<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class InitFundAlipaysettletocardRequest extends Model
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

    // 统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 支付渠道: ALIPAY-支付宝支付 JDPAY-京东支付
    /**
     * @var string
     */
    public $payChannel;

    // 京东二级商户号,当pay_channel=JDPAY时，该字段必填
    /**
     * @var string
     */
    public $subMerchantId;

    // 账单开始日期, 格式：YYYY-MM-DD
    /**
     * @var string
     */
    public $gmtPlan;

    // 账单结束日期；格式：YYYY-MM-DD
    /**
     * @var string
     */
    public $gmtFinish;

    // 交易流水
    /**
     * @var string
     */
    public $billType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantId'        => 'merchant_id',
        'payChannel'        => 'pay_channel',
        'subMerchantId'     => 'sub_merchant_id',
        'gmtPlan'           => 'gmt_plan',
        'gmtFinish'         => 'gmt_finish',
        'billType'          => 'bill_type',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('payChannel', $this->payChannel, true);
        Model::validateRequired('subMerchantId', $this->subMerchantId, true);
        Model::validateRequired('gmtPlan', $this->gmtPlan, true);
        Model::validateRequired('gmtFinish', $this->gmtFinish, true);
        Model::validateRequired('billType', $this->billType, true);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->subMerchantId) {
            $res['sub_merchant_id'] = $this->subMerchantId;
        }
        if (null !== $this->gmtPlan) {
            $res['gmt_plan'] = $this->gmtPlan;
        }
        if (null !== $this->gmtFinish) {
            $res['gmt_finish'] = $this->gmtFinish;
        }
        if (null !== $this->billType) {
            $res['bill_type'] = $this->billType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitFundAlipaysettletocardRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['sub_merchant_id'])) {
            $model->subMerchantId = $map['sub_merchant_id'];
        }
        if (isset($map['gmt_plan'])) {
            $model->gmtPlan = $map['gmt_plan'];
        }
        if (isset($map['gmt_finish'])) {
            $model->gmtFinish = $map['gmt_finish'];
        }
        if (isset($map['bill_type'])) {
            $model->billType = $map['bill_type'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class VerifyDubbridgeCustomerBankcardRequest extends Model
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

    // 客户号
    /**
     * @var string
     */
    public $customerNo;

    // 绑卡流水
    /**
     * @var string
     */
    public $bindSerialNo;

    // 绑卡验证码
    /**
     * @var string
     */
    public $bindValidCode;

    // 银行卡号
    /**
     * @var string
     */
    public $bankCardNo;

    // 渠道号
    /**
     * @var string
     */
    public $channelCode;

    // 业务类型
    /**
     * @var string
     */
    public $prodType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'customerNo'        => 'customer_no',
        'bindSerialNo'      => 'bind_serial_no',
        'bindValidCode'     => 'bind_valid_code',
        'bankCardNo'        => 'bank_card_no',
        'channelCode'       => 'channel_code',
        'prodType'          => 'prod_type',
    ];

    public function validate()
    {
        Model::validateRequired('bindSerialNo', $this->bindSerialNo, true);
        Model::validateRequired('bindValidCode', $this->bindValidCode, true);
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
        if (null !== $this->bindSerialNo) {
            $res['bind_serial_no'] = $this->bindSerialNo;
        }
        if (null !== $this->bindValidCode) {
            $res['bind_valid_code'] = $this->bindValidCode;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->prodType) {
            $res['prod_type'] = $this->prodType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyDubbridgeCustomerBankcardRequest
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
        if (isset($map['bind_serial_no'])) {
            $model->bindSerialNo = $map['bind_serial_no'];
        }
        if (isset($map['bind_valid_code'])) {
            $model->bindValidCode = $map['bind_valid_code'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['prod_type'])) {
            $model->prodType = $map['prod_type'];
        }

        return $model;
    }
}

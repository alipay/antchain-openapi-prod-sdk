<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class PayOrderDataRequest extends Model
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

    // 接入方测订单号，保证全局唯一
    /**
     * @var string
     */
    public $externalOrderNo;

    // 订单金额，单位为分
    /**
     * @var int
     */
    public $amountCent;

    // ALIPAY 表示小程序支付，ALIPAY_APP表示App支付
    /**
     * @var string
     */
    public $payChannel;

    // 订单标题，支付宝账单会展示
    /**
     * @var string
     */
    public $subject;

    // 订单超时时间，秒级
    /**
     * @var int
     */
    public $timeoutExpireSecond;

    // 接入方存储的accessToken
    /**
     * @var string
     */
    public $accessToken;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'externalOrderNo'     => 'external_order_no',
        'amountCent'          => 'amount_cent',
        'payChannel'          => 'pay_channel',
        'subject'             => 'subject',
        'timeoutExpireSecond' => 'timeout_expire_second',
        'accessToken'         => 'access_token',
    ];

    public function validate()
    {
        Model::validateRequired('externalOrderNo', $this->externalOrderNo, true);
        Model::validateRequired('amountCent', $this->amountCent, true);
        Model::validateRequired('payChannel', $this->payChannel, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('timeoutExpireSecond', $this->timeoutExpireSecond, true);
        Model::validateRequired('accessToken', $this->accessToken, true);
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
        if (null !== $this->externalOrderNo) {
            $res['external_order_no'] = $this->externalOrderNo;
        }
        if (null !== $this->amountCent) {
            $res['amount_cent'] = $this->amountCent;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->timeoutExpireSecond) {
            $res['timeout_expire_second'] = $this->timeoutExpireSecond;
        }
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayOrderDataRequest
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
        if (isset($map['external_order_no'])) {
            $model->externalOrderNo = $map['external_order_no'];
        }
        if (isset($map['amount_cent'])) {
            $model->amountCent = $map['amount_cent'];
        }
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['timeout_expire_second'])) {
            $model->timeoutExpireSecond = $map['timeout_expire_second'];
        }
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }

        return $model;
    }
}

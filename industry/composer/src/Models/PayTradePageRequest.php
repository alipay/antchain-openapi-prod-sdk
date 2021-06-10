<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class PayTradePageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 来源场景码,IP版权默认传IP_COPYRIGHT
    /**
     * @var string
     */
    public $source;

    // 渠道 自营平台、第三方平台等
    /**
     * @var string
     */
    public $channel;

    // 支付成功后returl地址
    /**
     * @var string
     */
    public $returnUrl;

    // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
    /**
     * @var string
     */
    public $merchantOrderNo;

    // 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
    /**
     * @var string
     */
    public $totalAmount;

    // 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
    /**
     * @var string
     */
    public $subject;

    // 支付渠道产品码；
    // 目前只支持直付通，code= ZFT;
    /**
     * @var string
     */
    public $payProductCode;

    // 默认：人民币（156）
    /**
     * @var string
     */
    public $transCurrency;

    // 平台方下的用户id (即商家id)
    /**
     * @var string
     */
    public $merchantUserId;

    // 订单描述。不超过128长度
    /**
     * @var string
     */
    public $body;
    protected $_name = [
        'authToken'       => 'auth_token',
        'source'          => 'source',
        'channel'         => 'channel',
        'returnUrl'       => 'return_url',
        'merchantOrderNo' => 'merchant_order_no',
        'totalAmount'     => 'total_amount',
        'subject'         => 'subject',
        'payProductCode'  => 'pay_product_code',
        'transCurrency'   => 'trans_currency',
        'merchantUserId'  => 'merchant_user_id',
        'body'            => 'body',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('returnUrl', $this->returnUrl, true);
        Model::validateRequired('merchantOrderNo', $this->merchantOrderNo, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('payProductCode', $this->payProductCode, true);
        Model::validateRequired('merchantUserId', $this->merchantUserId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }
        if (null !== $this->merchantOrderNo) {
            $res['merchant_order_no'] = $this->merchantOrderNo;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->payProductCode) {
            $res['pay_product_code'] = $this->payProductCode;
        }
        if (null !== $this->transCurrency) {
            $res['trans_currency'] = $this->transCurrency;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }
        if (null !== $this->body) {
            $res['body'] = $this->body;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayTradePageRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['return_url'])) {
            $model->returnUrl = $map['return_url'];
        }
        if (isset($map['merchant_order_no'])) {
            $model->merchantOrderNo = $map['merchant_order_no'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['pay_product_code'])) {
            $model->payProductCode = $map['pay_product_code'];
        }
        if (isset($map['trans_currency'])) {
            $model->transCurrency = $map['trans_currency'];
        }
        if (isset($map['merchant_user_id'])) {
            $model->merchantUserId = $map['merchant_user_id'];
        }
        if (isset($map['body'])) {
            $model->body = $map['body'];
        }

        return $model;
    }
}

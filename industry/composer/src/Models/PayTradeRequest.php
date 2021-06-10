<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class PayTradeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 来源场景码, 由中台分配给业务方
    /**
     * @var string
     */
    public $source;

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

    // 平台方下的商家id
    /**
     * @var string
     */
    public $merchantUserId;

    // 交易币种，默认：人民币（156）
    /**
     * @var string
     */
    public $transCurrency;

    // 买家支付宝uid
    /**
     * @var string
     */
    public $buyerId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'source'          => 'source',
        'merchantOrderNo' => 'merchant_order_no',
        'totalAmount'     => 'total_amount',
        'subject'         => 'subject',
        'merchantUserId'  => 'merchant_user_id',
        'transCurrency'   => 'trans_currency',
        'buyerId'         => 'buyer_id',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('merchantOrderNo', $this->merchantOrderNo, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('merchantUserId', $this->merchantUserId, true);
        Model::validateRequired('buyerId', $this->buyerId, true);
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
        if (null !== $this->merchantOrderNo) {
            $res['merchant_order_no'] = $this->merchantOrderNo;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }
        if (null !== $this->transCurrency) {
            $res['trans_currency'] = $this->transCurrency;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayTradeRequest
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
        if (isset($map['merchant_order_no'])) {
            $model->merchantOrderNo = $map['merchant_order_no'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['merchant_user_id'])) {
            $model->merchantUserId = $map['merchant_user_id'];
        }
        if (isset($map['trans_currency'])) {
            $model->transCurrency = $map['trans_currency'];
        }
        if (isset($map['buyer_id'])) {
            $model->buyerId = $map['buyer_id'];
        }

        return $model;
    }
}

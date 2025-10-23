<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCutpaymentPaymentRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 入参加密模式：
    // "0"（默认值）：不加密；
    // "6"：AES加密
    // 默认为"0"
    /**
     * @var string
     */
    public $encryptType;

    // 加密密钥
    /**
     * @var string
     */
    public $encryptToken;

    // 签约协议号
    /**
     * @var string
     */
    public $protocolNo;

    // 支付交易商户订单号
    /**
     * @var string
     */
    public $transId;

    // 交易日期yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $origTradeDate;

    // 用户id
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'encryptType'       => 'encrypt_type',
        'encryptToken'      => 'encrypt_token',
        'protocolNo'        => 'protocol_no',
        'transId'           => 'trans_id',
        'origTradeDate'     => 'orig_trade_date',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('protocolNo', $this->protocolNo, true);
        Model::validateRequired('transId', $this->transId, true);
        Model::validateRequired('origTradeDate', $this->origTradeDate, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->encryptToken) {
            $res['encrypt_token'] = $this->encryptToken;
        }
        if (null !== $this->protocolNo) {
            $res['protocol_no'] = $this->protocolNo;
        }
        if (null !== $this->transId) {
            $res['trans_id'] = $this->transId;
        }
        if (null !== $this->origTradeDate) {
            $res['orig_trade_date'] = $this->origTradeDate;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCutpaymentPaymentRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['encrypt_token'])) {
            $model->encryptToken = $map['encrypt_token'];
        }
        if (isset($map['protocol_no'])) {
            $model->protocolNo = $map['protocol_no'];
        }
        if (isset($map['trans_id'])) {
            $model->transId = $map['trans_id'];
        }
        if (isset($map['orig_trade_date'])) {
            $model->origTradeDate = $map['orig_trade_date'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}

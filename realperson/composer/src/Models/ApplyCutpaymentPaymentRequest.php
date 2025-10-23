<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class ApplyCutpaymentPaymentRequest extends Model
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

    // 支付订单id
    /**
     * @var string
     */
    public $transId;

    // 签约协议号
    /**
     * @var string
     */
    public $protocolNo;

    // 银行卡卡号
    /**
     * @var string
     */
    public $cardNo;

    // 用户姓名
    /**
     * @var string
     */
    public $certName;

    // 交易金额，整数，单位:分
    /**
     * @var string
     */
    public $txnAmt;

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 安全码
    /**
     * @var string
     */
    public $securityCode;

    // 有效期
    /**
     * @var string
     */
    public $validDate;

    // 分账信息
    /**
     * @var ShareInfo[]
     */
    public $shareInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'encryptType'       => 'encrypt_type',
        'encryptToken'      => 'encrypt_token',
        'transId'           => 'trans_id',
        'protocolNo'        => 'protocol_no',
        'cardNo'            => 'card_no',
        'certName'          => 'cert_name',
        'txnAmt'            => 'txn_amt',
        'userId'            => 'user_id',
        'securityCode'      => 'security_code',
        'validDate'         => 'valid_date',
        'shareInfo'         => 'share_info',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('transId', $this->transId, true);
        Model::validateRequired('protocolNo', $this->protocolNo, true);
        Model::validateRequired('cardNo', $this->cardNo, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('txnAmt', $this->txnAmt, true);
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
        if (null !== $this->transId) {
            $res['trans_id'] = $this->transId;
        }
        if (null !== $this->protocolNo) {
            $res['protocol_no'] = $this->protocolNo;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->txnAmt) {
            $res['txn_amt'] = $this->txnAmt;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->securityCode) {
            $res['security_code'] = $this->securityCode;
        }
        if (null !== $this->validDate) {
            $res['valid_date'] = $this->validDate;
        }
        if (null !== $this->shareInfo) {
            $res['share_info'] = [];
            if (null !== $this->shareInfo && \is_array($this->shareInfo)) {
                $n = 0;
                foreach ($this->shareInfo as $item) {
                    $res['share_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyCutpaymentPaymentRequest
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
        if (isset($map['trans_id'])) {
            $model->transId = $map['trans_id'];
        }
        if (isset($map['protocol_no'])) {
            $model->protocolNo = $map['protocol_no'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['txn_amt'])) {
            $model->txnAmt = $map['txn_amt'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['security_code'])) {
            $model->securityCode = $map['security_code'];
        }
        if (isset($map['valid_date'])) {
            $model->validDate = $map['valid_date'];
        }
        if (isset($map['share_info'])) {
            if (!empty($map['share_info'])) {
                $model->shareInfo = [];
                $n                = 0;
                foreach ($map['share_info'] as $item) {
                    $model->shareInfo[$n++] = null !== $item ? ShareInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

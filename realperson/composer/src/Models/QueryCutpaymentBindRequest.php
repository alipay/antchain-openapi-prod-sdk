<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCutpaymentBindRequest extends Model
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

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 银行卡卡号
    /**
     * @var string
     */
    public $cardNo;

    // 签约流水号
    /**
     * @var string
     */
    public $signBindSn;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'encryptType'       => 'encrypt_type',
        'encryptToken'      => 'encrypt_token',
        'userId'            => 'user_id',
        'cardNo'            => 'card_no',
        'signBindSn'        => 'sign_bind_sn',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('cardNo', $this->cardNo, true);
        Model::validateRequired('signBindSn', $this->signBindSn, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->signBindSn) {
            $res['sign_bind_sn'] = $this->signBindSn;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCutpaymentBindRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['sign_bind_sn'])) {
            $model->signBindSn = $map['sign_bind_sn'];
        }

        return $model;
    }
}

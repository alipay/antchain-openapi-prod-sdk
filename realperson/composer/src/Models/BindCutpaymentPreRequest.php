<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class BindCutpaymentPreRequest extends Model
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

    // 银行卡类型
    // 0：借记卡
    // 1：信用卡
    /**
     * @var string
     */
    public $cardType;

    // 银行卡属性
    // 0私人，1公司。不填时，默认为私人0
    /**
     * @var string
     */
    public $cardPro;

    // 银行卡卡号
    /**
     * @var string
     */
    public $cardNo;

    // 证件类型
    // 0：身份证
    // 1：港澳居民居住证
    // 2：台湾居民居住证
    // 3：外国人永久居住证
    /**
     * @var string
     */
    public $idCardType;

    // 持卡人姓名
    /**
     * @var string
     */
    public $certName;

    // 证件号
    /**
     * @var string
     */
    public $certNo;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 银行卡安全码
    /**
     * @var string
     */
    public $securityCode;

    // 银行卡有期（格式为：YYMM）
    /**
     * @var string
     */
    public $validDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'encryptType'       => 'encrypt_type',
        'encryptToken'      => 'encrypt_token',
        'userId'            => 'user_id',
        'cardType'          => 'card_type',
        'cardPro'           => 'card_pro',
        'cardNo'            => 'card_no',
        'idCardType'        => 'id_card_type',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'mobile'            => 'mobile',
        'securityCode'      => 'security_code',
        'validDate'         => 'valid_date',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('cardType', $this->cardType, true);
        Model::validateRequired('cardNo', $this->cardNo, true);
        Model::validateRequired('idCardType', $this->idCardType, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
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
        if (null !== $this->cardType) {
            $res['card_type'] = $this->cardType;
        }
        if (null !== $this->cardPro) {
            $res['card_pro'] = $this->cardPro;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->idCardType) {
            $res['id_card_type'] = $this->idCardType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->securityCode) {
            $res['security_code'] = $this->securityCode;
        }
        if (null !== $this->validDate) {
            $res['valid_date'] = $this->validDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindCutpaymentPreRequest
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
        if (isset($map['card_type'])) {
            $model->cardType = $map['card_type'];
        }
        if (isset($map['card_pro'])) {
            $model->cardPro = $map['card_pro'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['id_card_type'])) {
            $model->idCardType = $map['id_card_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['security_code'])) {
            $model->securityCode = $map['security_code'];
        }
        if (isset($map['valid_date'])) {
            $model->validDate = $map['valid_date'];
        }

        return $model;
    }
}

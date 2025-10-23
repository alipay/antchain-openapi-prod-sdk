<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class BindCutpaymentSignRequest extends Model
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

    // 预签约返回的预签约唯一码
    /**
     * @var string
     */
    public $preBindSn;

    // 签约短信验证码
    /**
     * @var string
     */
    public $smsCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'encryptType'       => 'encrypt_type',
        'encryptToken'      => 'encrypt_token',
        'userId'            => 'user_id',
        'preBindSn'         => 'pre_bind_sn',
        'smsCode'           => 'sms_code',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('preBindSn', $this->preBindSn, true);
        Model::validateRequired('smsCode', $this->smsCode, true);
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
        if (null !== $this->preBindSn) {
            $res['pre_bind_sn'] = $this->preBindSn;
        }
        if (null !== $this->smsCode) {
            $res['sms_code'] = $this->smsCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindCutpaymentSignRequest
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
        if (isset($map['pre_bind_sn'])) {
            $model->preBindSn = $map['pre_bind_sn'];
        }
        if (isset($map['sms_code'])) {
            $model->smsCode = $map['sms_code'];
        }

        return $model;
    }
}

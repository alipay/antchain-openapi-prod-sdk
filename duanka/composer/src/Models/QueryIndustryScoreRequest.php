<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class QueryIndustryScoreRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 模型id
    /**
     * @var string
     */
    public $modelId;

    // 用户id（客户身份证号/手机号的md5/sha256散列值）
    /**
     * @var string
     */
    public $userId;

    // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
    /**
     * @var string
     */
    public $userIdType;

    // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
    /**
     * @var string
     */
    public $encryptType;

    // 客户编码
    /**
     * @var string
     */
    public $customerCode;

    // 流水号，串联链路用，非必填
    /**
     * @var string
     */
    public $transNo;

    // encrypt_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
    /**
     * @var string
     */
    public $userIdHashEncrypt;
    protected $_name = [
        'authToken'         => 'auth_token',
        'modelId'           => 'model_id',
        'userId'            => 'user_id',
        'userIdType'        => 'user_id_type',
        'encryptType'       => 'encrypt_type',
        'customerCode'      => 'customer_code',
        'transNo'           => 'trans_no',
        'userIdHashEncrypt' => 'user_id_hash_encrypt',
    ];

    public function validate()
    {
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userIdType', $this->userIdType, true);
        Model::validateRequired('encryptType', $this->encryptType, true);
        Model::validateRequired('customerCode', $this->customerCode, true);
        Model::validateRequired('transNo', $this->transNo, true);
        Model::validateRequired('userIdHashEncrypt', $this->userIdHashEncrypt, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userIdType) {
            $res['user_id_type'] = $this->userIdType;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->customerCode) {
            $res['customer_code'] = $this->customerCode;
        }
        if (null !== $this->transNo) {
            $res['trans_no'] = $this->transNo;
        }
        if (null !== $this->userIdHashEncrypt) {
            $res['user_id_hash_encrypt'] = $this->userIdHashEncrypt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIndustryScoreRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_id_type'])) {
            $model->userIdType = $map['user_id_type'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['customer_code'])) {
            $model->customerCode = $map['customer_code'];
        }
        if (isset($map['trans_no'])) {
            $model->transNo = $map['trans_no'];
        }
        if (isset($map['user_id_hash_encrypt'])) {
            $model->userIdHashEncrypt = $map['user_id_hash_encrypt'];
        }

        return $model;
    }
}

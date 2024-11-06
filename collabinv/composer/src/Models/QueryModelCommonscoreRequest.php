<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class QueryModelCommonscoreRequest extends Model
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

    // 用户授权编码
    /**
     * @var string
     */
    public $authNo;

    // 模型编码
    /**
     * @var string
     */
    public $modelCode;

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
    public $hashType;

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

    // hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
    /**
     * @var string
     */
    public $userIdEncryptType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authNo'            => 'auth_no',
        'modelCode'         => 'model_code',
        'userId'            => 'user_id',
        'userIdType'        => 'user_id_type',
        'hashType'          => 'hash_type',
        'customerCode'      => 'customer_code',
        'transNo'           => 'trans_no',
        'userIdEncryptType' => 'user_id_encrypt_type',
    ];

    public function validate()
    {
        Model::validateRequired('authNo', $this->authNo, true);
        Model::validateRequired('modelCode', $this->modelCode, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userIdType', $this->userIdType, true);
        Model::validateRequired('hashType', $this->hashType, true);
        Model::validateRequired('customerCode', $this->customerCode, true);
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
        if (null !== $this->authNo) {
            $res['auth_no'] = $this->authNo;
        }
        if (null !== $this->modelCode) {
            $res['model_code'] = $this->modelCode;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userIdType) {
            $res['user_id_type'] = $this->userIdType;
        }
        if (null !== $this->hashType) {
            $res['hash_type'] = $this->hashType;
        }
        if (null !== $this->customerCode) {
            $res['customer_code'] = $this->customerCode;
        }
        if (null !== $this->transNo) {
            $res['trans_no'] = $this->transNo;
        }
        if (null !== $this->userIdEncryptType) {
            $res['user_id_encrypt_type'] = $this->userIdEncryptType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryModelCommonscoreRequest
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
        if (isset($map['auth_no'])) {
            $model->authNo = $map['auth_no'];
        }
        if (isset($map['model_code'])) {
            $model->modelCode = $map['model_code'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_id_type'])) {
            $model->userIdType = $map['user_id_type'];
        }
        if (isset($map['hash_type'])) {
            $model->hashType = $map['hash_type'];
        }
        if (isset($map['customer_code'])) {
            $model->customerCode = $map['customer_code'];
        }
        if (isset($map['trans_no'])) {
            $model->transNo = $map['trans_no'];
        }
        if (isset($map['user_id_encrypt_type'])) {
            $model->userIdEncryptType = $map['user_id_encrypt_type'];
        }

        return $model;
    }
}

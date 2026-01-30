<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YDINDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class QueryRetailScoreRequest extends Model
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

    // 模型id
    /**
     * @var string
     */
    public $industryId;

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

    // user_id 散列类型: "MD5"：MD5（小写）, ...
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

    // encrypt_type类型的散列后的操作，默认为空不加密...
    /**
     * @var string
     */
    public $userIdHashEncrypt;

    // 客户场景码
    /**
     * @var string
     */
    public $instanceCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'industryId'        => 'industry_id',
        'userId'            => 'user_id',
        'userIdType'        => 'user_id_type',
        'encryptType'       => 'encrypt_type',
        'customerCode'      => 'customer_code',
        'transNo'           => 'trans_no',
        'userIdHashEncrypt' => 'user_id_hash_encrypt',
        'instanceCode'      => 'instance_code',
    ];

    public function validate()
    {
        Model::validateRequired('industryId', $this->industryId, true);
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
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->industryId) {
            $res['industry_id'] = $this->industryId;
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
        if (null !== $this->instanceCode) {
            $res['instance_code'] = $this->instanceCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRetailScoreRequest
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
        if (isset($map['industry_id'])) {
            $model->industryId = $map['industry_id'];
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
        if (isset($map['instance_code'])) {
            $model->instanceCode = $map['instance_code'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ConsumeCardAccount extends Model
{
    // 授权函地址
    /**
     * @example 授权函地址
     *
     * @var string
     */
    public $authorizationAddress;

    // 认证方id
    /**
     * @example 213745827640
     *
     * @var string
     */
    public $certificationId;

    // 描述
    /**
     * @example 描述
     *
     * @var string
     */
    public $description;

    // 分布式身份ID
    /**
     * @example did:mychain:Chaos:2e151a8d096c824ab935ad6ef5d95a1ed53d4f81
     *
     * @var string
     */
    public $did;

    // 是否有权限采购商品
    /**
     * @example true, false
     *
     * @var bool
     */
    public $authConsumer;

    // 是否有权限发行商品
    /**
     * @example true, false
     *
     * @var bool
     */
    public $authProvider;

    // 个人用户的身份证号码/机构的企业编号
    /**
     * @example 26357645796897
     *
     * @var string
     */
    public $idNumber;

    // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
    /**
     * @example 0
     *
     * @var int
     */
    public $idType;

    // 个人用户的手机号码/机构用户的联系电话或邮箱(必填)
    /**
     * @example 1231524313
     *
     * @var string
     */
    public $phoneNumber;

    // 商户状态
    /**
     * @example 0
     *
     * @var int
     */
    public $status;

    // 是否可以发行资产
    /**
     * @example true, false
     *
     * @var bool
     */
    public $tokenIssuer;

    // 账户创建类型（0:用户，1:商户）
    /**
     * @example 1
     *
     * @var int
     */
    public $type;

    // 账户ID
    /**
     * @example userId0001
     *
     * @var string
     */
    public $userId;

    // 账户名称
    /**
     * @example name
     *
     * @var string
     */
    public $userName;

    // 提现银行卡
    /**
     * @example 213574517602398
     *
     * @var string
     */
    public $withdrawBankCardId;

    // 账户影响信息
    /**
     * @example oss://1259371fc8f77d37...5dfb6d130facf32dd6d4257fa0.jpeg
     *
     * @var string
     */
    public $image;

    // 账户邮箱
    /**
     * @example ***@**.com
     *
     * @var string
     */
    public $email;
    protected $_name = [
        'authorizationAddress' => 'authorization_address',
        'certificationId'      => 'certification_id',
        'description'          => 'description',
        'did'                  => 'did',
        'authConsumer'         => 'auth_consumer',
        'authProvider'         => 'auth_provider',
        'idNumber'             => 'id_number',
        'idType'               => 'id_type',
        'phoneNumber'          => 'phone_number',
        'status'               => 'status',
        'tokenIssuer'          => 'token_issuer',
        'type'                 => 'type',
        'userId'               => 'user_id',
        'userName'             => 'user_name',
        'withdrawBankCardId'   => 'withdraw_bank_card_id',
        'image'                => 'image',
        'email'                => 'email',
    ];

    public function validate()
    {
        Model::validateRequired('authorizationAddress', $this->authorizationAddress, true);
        Model::validateRequired('certificationId', $this->certificationId, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('authConsumer', $this->authConsumer, true);
        Model::validateRequired('authProvider', $this->authProvider, true);
        Model::validateRequired('idNumber', $this->idNumber, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('tokenIssuer', $this->tokenIssuer, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('withdrawBankCardId', $this->withdrawBankCardId, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('email', $this->email, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authorizationAddress) {
            $res['authorization_address'] = $this->authorizationAddress;
        }
        if (null !== $this->certificationId) {
            $res['certification_id'] = $this->certificationId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->authConsumer) {
            $res['auth_consumer'] = $this->authConsumer;
        }
        if (null !== $this->authProvider) {
            $res['auth_provider'] = $this->authProvider;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tokenIssuer) {
            $res['token_issuer'] = $this->tokenIssuer;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->withdrawBankCardId) {
            $res['withdraw_bank_card_id'] = $this->withdrawBankCardId;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumeCardAccount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['authorization_address'])) {
            $model->authorizationAddress = $map['authorization_address'];
        }
        if (isset($map['certification_id'])) {
            $model->certificationId = $map['certification_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['auth_consumer'])) {
            $model->authConsumer = $map['auth_consumer'];
        }
        if (isset($map['auth_provider'])) {
            $model->authProvider = $map['auth_provider'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['token_issuer'])) {
            $model->tokenIssuer = $map['token_issuer'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['withdraw_bank_card_id'])) {
            $model->withdrawBankCardId = $map['withdraw_bank_card_id'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }

        return $model;
    }
}

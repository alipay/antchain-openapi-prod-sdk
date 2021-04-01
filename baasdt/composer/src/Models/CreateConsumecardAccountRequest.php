<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateConsumecardAccountRequest extends Model
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

    // 授权函地址
    /**
     * @var string
     */
    public $authorizationAddress;

    // 是否有采购/消费权限
    /**
     * @var bool
     */
    public $authConsumer;

    // 是否有供应权限
    /**
     * @var bool
     */
    public $authProvider;

    // 业务系统幂等Id,防止同一笔交易重复发送(接入方传入)
    /**
     * @var string
     */
    public $bizId;

    // 认证方id(如: 支付宝的用户Id)
    /**
     * @var string
     */
    public $certificationId;

    // 支持多链多合约,该参数为指明需要操作哪个智能合约环境
    /**
     * @var string
     */
    public $chainId;

    // 手机号国家编码
    /**
     * @var string
     */
    public $countryCode;

    // 账户描述
    /**
     * @var string
     */
    public $description;

    // 个人用户的身份证号码/机构的企业编号
    /**
     * @var string
     */
    public $idNumber;

    // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
    /**
     * @var int
     */
    public $idType;

    // 开户影像信息（BASE64格式传入）
    /**
     * @var string
     */
    public $image;

    // 外部系统传入的交易备注信息(必填)
    /**
     * @var string
     */
    public $memo;

    // 邮箱地址(机构注册必传)
    /**
     * @var string
     */
    public $email;

    // 个人用户的手机号码/机构用户的联系电话(必填)
    /**
     * @var string
     */
    public $phoneNumber;

    // 场景码(需要申请)
    /**
     * @var string
     */
    public $productCode;

    // 平台归属机构的链上账户Id(账户可以归属在一个机构下)
    /**
     * @var string
     */
    public $relegationAccountId;

    // 角色(1 机构, 2 个人)
    /**
     * @var int
     */
    public $roleType;

    // 外部系统对该个人用户/机构的内部编号,用于唯一识别该用户
    /**
     * @var string
     */
    public $userId;

    // 个人用户姓名/机构名称
    /**
     * @var string
     */
    public $userName;

    // 提现银行卡
    /**
     * @var string
     */
    public $withdrawBankCardId;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'authorizationAddress' => 'authorization_address',
        'authConsumer'         => 'auth_consumer',
        'authProvider'         => 'auth_provider',
        'bizId'                => 'biz_id',
        'certificationId'      => 'certification_id',
        'chainId'              => 'chain_id',
        'countryCode'          => 'country_code',
        'description'          => 'description',
        'idNumber'             => 'id_number',
        'idType'               => 'id_type',
        'image'                => 'image',
        'memo'                 => 'memo',
        'email'                => 'email',
        'phoneNumber'          => 'phone_number',
        'productCode'          => 'product_code',
        'relegationAccountId'  => 'relegation_account_id',
        'roleType'             => 'role_type',
        'userId'               => 'user_id',
        'userName'             => 'user_name',
        'withdrawBankCardId'   => 'withdraw_bank_card_id',
    ];

    public function validate()
    {
        Model::validateRequired('authConsumer', $this->authConsumer, true);
        Model::validateRequired('authProvider', $this->authProvider, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('certificationId', $this->certificationId, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('countryCode', $this->countryCode, true);
        Model::validateRequired('idNumber', $this->idNumber, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('roleType', $this->roleType, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userName', $this->userName, true);
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
        if (null !== $this->authorizationAddress) {
            $res['authorization_address'] = $this->authorizationAddress;
        }
        if (null !== $this->authConsumer) {
            $res['auth_consumer'] = $this->authConsumer;
        }
        if (null !== $this->authProvider) {
            $res['auth_provider'] = $this->authProvider;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->certificationId) {
            $res['certification_id'] = $this->certificationId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->countryCode) {
            $res['country_code'] = $this->countryCode;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->relegationAccountId) {
            $res['relegation_account_id'] = $this->relegationAccountId;
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateConsumecardAccountRequest
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
        if (isset($map['authorization_address'])) {
            $model->authorizationAddress = $map['authorization_address'];
        }
        if (isset($map['auth_consumer'])) {
            $model->authConsumer = $map['auth_consumer'];
        }
        if (isset($map['auth_provider'])) {
            $model->authProvider = $map['auth_provider'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['certification_id'])) {
            $model->certificationId = $map['certification_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['country_code'])) {
            $model->countryCode = $map['country_code'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['relegation_account_id'])) {
            $model->relegationAccountId = $map['relegation_account_id'];
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
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

        return $model;
    }
}

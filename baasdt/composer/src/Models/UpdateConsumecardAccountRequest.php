<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateConsumecardAccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
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

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 认证方id
    /**
     * @var string
     */
    public $certificationId;

    // 商户描述
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

    // 账户映像资料
    /**
     * @var string
     */
    public $image;

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
        'baseRequest'          => 'base_request',
        'certificationId'      => 'certification_id',
        'description'          => 'description',
        'idNumber'             => 'id_number',
        'idType'               => 'id_type',
        'image'                => 'image',
        'email'                => 'email',
        'phoneNumber'          => 'phone_number',
        'userName'             => 'user_name',
        'withdrawBankCardId'   => 'withdraw_bank_card_id',
    ];

    public function validate()
    {
        Model::validateRequired('authConsumer', $this->authConsumer, true);
        Model::validateRequired('authProvider', $this->authProvider, true);
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('certificationId', $this->certificationId, true);
        Model::validateRequired('idNumber', $this->idNumber, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->certificationId) {
            $res['certification_id'] = $this->certificationId;
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
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
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
     * @return UpdateConsumecardAccountRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['certification_id'])) {
            $model->certificationId = $map['certification_id'];
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
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
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

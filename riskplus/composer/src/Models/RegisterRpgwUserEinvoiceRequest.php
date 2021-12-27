<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RegisterRpgwUserEinvoiceRequest extends Model
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

    // 企业标识，固定值
    /**
     * @var string
     */
    public $companyCode;

    // 调用方平台用户id
    /**
     * @var string
     */
    public $platformUserIdentification;

    // 身份证号码
    /**
     * @var string
     */
    public $identificationNumber;

    // 用户手机号
    /**
     * @var string
     */
    public $mobilePhone;

    // 用户姓名
    /**
     * @var string
     */
    public $userName;

    // 身份证照片人像面照片url
    /**
     * @var string
     */
    public $identityFrontPic;

    // 身份证照片国徽面url
    /**
     * @var string
     */
    public $identityBackPic;

    // 身份证有效期开始时间，格式yyyy-MM-dd
    /**
     * @var string
     */
    public $idcardValidityStart;

    // 身份证有效期结束时间，格式yyyy-MM-dd
    /**
     * @var string
     */
    public $idcardValidityEnd;

    // 实名认证时间，格式yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $identityTime;

    // 注册模式，固定值
    /**
     * @var string
     */
    public $registerMode;

    // 注册时间，格式yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $registerTime;

    // 用户人脸照片url
    /**
     * @var string
     */
    public $facePic;

    // 支付宝账号，实名认证的支付宝登录邮箱或手机登录，其账户姓名好和实人认证姓名一致
    /**
     * @var string
     */
    public $alipayAccount;

    // 微信支付个人账户（openid）
    /**
     * @var string
     */
    public $wxpayAccount;

    // 银行卡号，标准一类或二类卡格式，持卡人为本用户
    /**
     * @var string
     */
    public $bankcardNo;

    // 开户行名称
    /**
     * @var string
     */
    public $bankName;

    // 开户行归属地省市
    /**
     * @var string
     */
    public $bankcardCity;

    // 用户所在省市
    /**
     * @var string
     */
    public $city;

    // 拓展信息
    /**
     * @var string
     */
    public $extJson;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'companyCode'                => 'company_code',
        'platformUserIdentification' => 'platform_user_identification',
        'identificationNumber'       => 'identification_number',
        'mobilePhone'                => 'mobile_phone',
        'userName'                   => 'user_name',
        'identityFrontPic'           => 'identity_front_pic',
        'identityBackPic'            => 'identity_back_pic',
        'idcardValidityStart'        => 'idcard_validity_start',
        'idcardValidityEnd'          => 'idcard_validity_end',
        'identityTime'               => 'identity_time',
        'registerMode'               => 'register_mode',
        'registerTime'               => 'register_time',
        'facePic'                    => 'face_pic',
        'alipayAccount'              => 'alipay_account',
        'wxpayAccount'               => 'wxpay_account',
        'bankcardNo'                 => 'bankcard_no',
        'bankName'                   => 'bank_name',
        'bankcardCity'               => 'bankcard_city',
        'city'                       => 'city',
        'extJson'                    => 'ext_json',
    ];

    public function validate()
    {
        Model::validateRequired('companyCode', $this->companyCode, true);
        Model::validateRequired('platformUserIdentification', $this->platformUserIdentification, true);
        Model::validateRequired('identificationNumber', $this->identificationNumber, true);
        Model::validateRequired('mobilePhone', $this->mobilePhone, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('identityFrontPic', $this->identityFrontPic, true);
        Model::validateRequired('identityBackPic', $this->identityBackPic, true);
        Model::validateRequired('idcardValidityStart', $this->idcardValidityStart, true);
        Model::validateRequired('idcardValidityEnd', $this->idcardValidityEnd, true);
        Model::validateRequired('identityTime', $this->identityTime, true);
        Model::validateRequired('registerMode', $this->registerMode, true);
        Model::validateRequired('registerTime', $this->registerTime, true);
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
        if (null !== $this->companyCode) {
            $res['company_code'] = $this->companyCode;
        }
        if (null !== $this->platformUserIdentification) {
            $res['platform_user_identification'] = $this->platformUserIdentification;
        }
        if (null !== $this->identificationNumber) {
            $res['identification_number'] = $this->identificationNumber;
        }
        if (null !== $this->mobilePhone) {
            $res['mobile_phone'] = $this->mobilePhone;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->identityFrontPic) {
            $res['identity_front_pic'] = $this->identityFrontPic;
        }
        if (null !== $this->identityBackPic) {
            $res['identity_back_pic'] = $this->identityBackPic;
        }
        if (null !== $this->idcardValidityStart) {
            $res['idcard_validity_start'] = $this->idcardValidityStart;
        }
        if (null !== $this->idcardValidityEnd) {
            $res['idcard_validity_end'] = $this->idcardValidityEnd;
        }
        if (null !== $this->identityTime) {
            $res['identity_time'] = $this->identityTime;
        }
        if (null !== $this->registerMode) {
            $res['register_mode'] = $this->registerMode;
        }
        if (null !== $this->registerTime) {
            $res['register_time'] = $this->registerTime;
        }
        if (null !== $this->facePic) {
            $res['face_pic'] = $this->facePic;
        }
        if (null !== $this->alipayAccount) {
            $res['alipay_account'] = $this->alipayAccount;
        }
        if (null !== $this->wxpayAccount) {
            $res['wxpay_account'] = $this->wxpayAccount;
        }
        if (null !== $this->bankcardNo) {
            $res['bankcard_no'] = $this->bankcardNo;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankcardCity) {
            $res['bankcard_city'] = $this->bankcardCity;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->extJson) {
            $res['ext_json'] = $this->extJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterRpgwUserEinvoiceRequest
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
        if (isset($map['company_code'])) {
            $model->companyCode = $map['company_code'];
        }
        if (isset($map['platform_user_identification'])) {
            $model->platformUserIdentification = $map['platform_user_identification'];
        }
        if (isset($map['identification_number'])) {
            $model->identificationNumber = $map['identification_number'];
        }
        if (isset($map['mobile_phone'])) {
            $model->mobilePhone = $map['mobile_phone'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['identity_front_pic'])) {
            $model->identityFrontPic = $map['identity_front_pic'];
        }
        if (isset($map['identity_back_pic'])) {
            $model->identityBackPic = $map['identity_back_pic'];
        }
        if (isset($map['idcard_validity_start'])) {
            $model->idcardValidityStart = $map['idcard_validity_start'];
        }
        if (isset($map['idcard_validity_end'])) {
            $model->idcardValidityEnd = $map['idcard_validity_end'];
        }
        if (isset($map['identity_time'])) {
            $model->identityTime = $map['identity_time'];
        }
        if (isset($map['register_mode'])) {
            $model->registerMode = $map['register_mode'];
        }
        if (isset($map['register_time'])) {
            $model->registerTime = $map['register_time'];
        }
        if (isset($map['face_pic'])) {
            $model->facePic = $map['face_pic'];
        }
        if (isset($map['alipay_account'])) {
            $model->alipayAccount = $map['alipay_account'];
        }
        if (isset($map['wxpay_account'])) {
            $model->wxpayAccount = $map['wxpay_account'];
        }
        if (isset($map['bankcard_no'])) {
            $model->bankcardNo = $map['bankcard_no'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bankcard_city'])) {
            $model->bankcardCity = $map['bankcard_city'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['ext_json'])) {
            $model->extJson = $map['ext_json'];
        }

        return $model;
    }
}

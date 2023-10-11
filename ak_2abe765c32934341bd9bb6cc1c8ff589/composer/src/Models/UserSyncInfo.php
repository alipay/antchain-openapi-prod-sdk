<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class UserSyncInfo extends Model
{
    // 外部同步的订单 id
    /**
     * @example order_v1_test_0918_001
     *
     * @var string
     */
    public $orderId;

    // 用户登录名，租赁平台会员ID/若支付宝ID必传
    /**
     * @example 2088*****
     *
     * @var string
     */
    public $loginId;

    // 户登录名类型 1.商户会员2.支付宝3.其他
    /**
     * @example 1
     *
     * @var int
     */
    public $loginType;

    // 用户登录时间 格式为2019-08-31 12:00:00
    /**
     * @example 2019-08-31 12:00:00
     *
     * @var string
     */
    public $loginTime;

    // 租赁人姓名，这里是用户通过公钥加密后的密文
    /**
     * @example 张三
     *
     * @var string
     */
    public $userName;

    // 租赁人身份证，这里是用户通过公钥加密后的密文
    /**
     * @example 42110******1290437
     *
     * @var string
     */
    public $userId;

    // 承租人手机号，这里是用户通过公钥加密后的密文
    /**
     * @example 157****8924
     *
     * @var string
     */
    public $userPhoneNumber;

    // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
    /**
     * @example 1
     *
     * @var string
     */
    public $userType;

    // 支付宝账号信息
    /**
     * @example 2088****
     *
     * @var string
     */
    public $alipayUid;

    // 出租企业名称
    /**
     * @example 深圳市爱租机科技有限公司
     *
     * @var string
     */
    public $leaseCorpName;

    // 出租企业统一社会信用代码
    /**
     * @example xxxx
     *
     * @var string
     */
    public $leaseCorpId;

    // 出租法定代表人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $leaseCorpOwnerName;

    // 1.企业用户 2.个人用户
    /**
     * @example 1
     *
     * @var int
     */
    public $lesseeType;

    // 营业执照对应的名称
    /**
     * @example 爱租机
     *
     * @var string
     */
    public $leasedEnterprise;

    // 租赁⼈身份证照⽚正⾯地址
    /**
     * @example https://www.nicholsfleet.com/images/uploads/blog/ledwell_rollback.jpg
     *
     * @var string
     */
    public $userImageUrl;

    // 租赁⼈身份证照⽚反⾯地址
    /**
     * @example https://www.nicholsfleet.com/images/uploads/blog/ledwell_rollback.jpg
     *
     * @var string
     */
    public $userBackImageUrl;

    // 平台注册的电话，这里是用户通过公钥加密后的密文
    /**
     * @example 180****9196
     *
     * @var string
     */
    public $registeredTelephoneNumber;

    // 承租企业实际控制人（股东/法人）身份证号
    /**
     * @example 1063**********0098
     *
     * @var string
     */
    public $actualControllerId;

    // 承租企业实际控制人（股东/法人）手机号。若为企业类型必填，字段长度：不超过 500
    /**
     * @example 191****9091
     *
     * @var string
     */
    public $actualControllerNumber;

    // 承租企业实际控制人（股东/法人）姓名，若为企业类型必填
    /**
     * @example 张三
     *
     * @var string
     */
    public $actualControllerName;

    // 承租企业实际控制人（股东/法人）身份证正面地址，若为企业类型必填
    /**
     * @example https://www.nicholsfleet.com/images/uploads/blog/ledwell_rollback.jpg
     *
     * @var string
     */
    public $actualControllerImageUrl;

    // 承租企业实际控制人（股东/法人）身份证反面地址
    /**
     * @example https://www.nicholsfleet.com/images/uploads/blog/ledwell_rollback.jpg
     *
     * @var string
     */
    public $actualControllerBackImageUrl;

    // 承租企业实际控制人（股东/法人）手机号
    /**
     * @example 151****1313
     *
     * @var string
     */
    public $actualControllerTelephoneNumber;

    // 承租企业统⼀社会信⽤代码
    /**
     * @example xxxx
     *
     * @var string
     */
    public $businessLicenseNumber;

    // 承租企业统一社会信用代码
    /**
     * @example xxxx
     *
     * @var string
     */
    public $businesslicenseUrl;

    // 承租企业法定代表人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $legalRepresentative;

    // 资方定义的其他额外字段，以json形式传递
    /**
     * @example {"discount":9}
     *
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'orderId'                         => 'order_id',
        'loginId'                         => 'login_id',
        'loginType'                       => 'login_type',
        'loginTime'                       => 'login_time',
        'userName'                        => 'user_name',
        'userId'                          => 'user_id',
        'userPhoneNumber'                 => 'user_phone_number',
        'userType'                        => 'user_type',
        'alipayUid'                       => 'alipay_uid',
        'leaseCorpName'                   => 'lease_corp_name',
        'leaseCorpId'                     => 'lease_corp_id',
        'leaseCorpOwnerName'              => 'lease_corp_owner_name',
        'lesseeType'                      => 'lessee_type',
        'leasedEnterprise'                => 'leased_enterprise',
        'userImageUrl'                    => 'user_image_url',
        'userBackImageUrl'                => 'user_back_image_url',
        'registeredTelephoneNumber'       => 'registered_telephone_number',
        'actualControllerId'              => 'actual_controller_id',
        'actualControllerNumber'          => 'actual_controller_number',
        'actualControllerName'            => 'actual_controller_name',
        'actualControllerImageUrl'        => 'actual_controller_image_url',
        'actualControllerBackImageUrl'    => 'actual_controller_back_image_url',
        'actualControllerTelephoneNumber' => 'actual_controller_telephone_number',
        'businessLicenseNumber'           => 'business_license_number',
        'businesslicenseUrl'              => 'businesslicense_url',
        'legalRepresentative'             => 'legal_representative',
        'extraInfo'                       => 'extra_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('loginId', $this->loginId, true);
        Model::validateRequired('loginType', $this->loginType, true);
        Model::validateRequired('loginTime', $this->loginTime, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userPhoneNumber', $this->userPhoneNumber, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('alipayUid', $this->alipayUid, true);
        Model::validateRequired('leaseCorpName', $this->leaseCorpName, true);
        Model::validateRequired('leaseCorpId', $this->leaseCorpId, true);
        Model::validateRequired('leaseCorpOwnerName', $this->leaseCorpOwnerName, true);
        Model::validateRequired('lesseeType', $this->lesseeType, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('loginId', $this->loginId, 50);
        Model::validateMaxLength('loginTime', $this->loginTime, 32);
        Model::validateMaxLength('userName', $this->userName, 500);
        Model::validateMaxLength('userId', $this->userId, 500);
        Model::validateMaxLength('userPhoneNumber', $this->userPhoneNumber, 500);
        Model::validateMaxLength('userType', $this->userType, 2);
        Model::validateMaxLength('alipayUid', $this->alipayUid, 64);
        Model::validateMaxLength('leaseCorpName', $this->leaseCorpName, 50);
        Model::validateMaxLength('leaseCorpId', $this->leaseCorpId, 50);
        Model::validateMaxLength('leaseCorpOwnerName', $this->leaseCorpOwnerName, 50);
        Model::validateMaxLength('leasedEnterprise', $this->leasedEnterprise, 50);
        Model::validateMaxLength('userImageUrl', $this->userImageUrl, 1000);
        Model::validateMaxLength('userBackImageUrl', $this->userBackImageUrl, 1000);
        Model::validateMaxLength('registeredTelephoneNumber', $this->registeredTelephoneNumber, 500);
        Model::validateMaxLength('actualControllerId', $this->actualControllerId, 500);
        Model::validateMaxLength('actualControllerName', $this->actualControllerName, 1000);
        Model::validateMaxLength('actualControllerImageUrl', $this->actualControllerImageUrl, 50);
        Model::validateMaxLength('actualControllerBackImageUrl', $this->actualControllerBackImageUrl, 1000);
        Model::validateMaxLength('actualControllerTelephoneNumber', $this->actualControllerTelephoneNumber, 12);
        Model::validateMaxLength('businessLicenseNumber', $this->businessLicenseNumber, 50);
        Model::validateMaxLength('legalRepresentative', $this->legalRepresentative, 20);
        Model::validateMaxLength('extraInfo', $this->extraInfo, 2000);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('loginId', $this->loginId, 1);
        Model::validateMinLength('loginTime', $this->loginTime, 1);
        Model::validateMinLength('userName', $this->userName, 1);
        Model::validateMinLength('userId', $this->userId, 1);
        Model::validateMinLength('userPhoneNumber', $this->userPhoneNumber, 1);
        Model::validateMinLength('userType', $this->userType, 1);
        Model::validateMinLength('alipayUid', $this->alipayUid, 1);
        Model::validateMinLength('leaseCorpName', $this->leaseCorpName, 1);
        Model::validateMinLength('leaseCorpId', $this->leaseCorpId, 0);
        Model::validateMinLength('leaseCorpOwnerName', $this->leaseCorpOwnerName, 1);
        Model::validateMinLength('leasedEnterprise', $this->leasedEnterprise, 1);
        Model::validateMinLength('userImageUrl', $this->userImageUrl, 0);
        Model::validateMinLength('userBackImageUrl', $this->userBackImageUrl, 0);
        Model::validateMinLength('registeredTelephoneNumber', $this->registeredTelephoneNumber, 0);
        Model::validateMinLength('actualControllerId', $this->actualControllerId, 0);
        Model::validateMinLength('actualControllerName', $this->actualControllerName, 0);
        Model::validateMinLength('actualControllerImageUrl', $this->actualControllerImageUrl, 0);
        Model::validateMinLength('actualControllerBackImageUrl', $this->actualControllerBackImageUrl, 0);
        Model::validateMinLength('actualControllerTelephoneNumber', $this->actualControllerTelephoneNumber, 0);
        Model::validateMinLength('businessLicenseNumber', $this->businessLicenseNumber, 0);
        Model::validateMinLength('legalRepresentative', $this->legalRepresentative, 0);
        Model::validateMinLength('extraInfo', $this->extraInfo, 0);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->loginId) {
            $res['login_id'] = $this->loginId;
        }
        if (null !== $this->loginType) {
            $res['login_type'] = $this->loginType;
        }
        if (null !== $this->loginTime) {
            $res['login_time'] = $this->loginTime;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userPhoneNumber) {
            $res['user_phone_number'] = $this->userPhoneNumber;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }
        if (null !== $this->leaseCorpName) {
            $res['lease_corp_name'] = $this->leaseCorpName;
        }
        if (null !== $this->leaseCorpId) {
            $res['lease_corp_id'] = $this->leaseCorpId;
        }
        if (null !== $this->leaseCorpOwnerName) {
            $res['lease_corp_owner_name'] = $this->leaseCorpOwnerName;
        }
        if (null !== $this->lesseeType) {
            $res['lessee_type'] = $this->lesseeType;
        }
        if (null !== $this->leasedEnterprise) {
            $res['leased_enterprise'] = $this->leasedEnterprise;
        }
        if (null !== $this->userImageUrl) {
            $res['user_image_url'] = $this->userImageUrl;
        }
        if (null !== $this->userBackImageUrl) {
            $res['user_back_image_url'] = $this->userBackImageUrl;
        }
        if (null !== $this->registeredTelephoneNumber) {
            $res['registered_telephone_number'] = $this->registeredTelephoneNumber;
        }
        if (null !== $this->actualControllerId) {
            $res['actual_controller_id'] = $this->actualControllerId;
        }
        if (null !== $this->actualControllerNumber) {
            $res['actual_controller_number'] = $this->actualControllerNumber;
        }
        if (null !== $this->actualControllerName) {
            $res['actual_controller_name'] = $this->actualControllerName;
        }
        if (null !== $this->actualControllerImageUrl) {
            $res['actual_controller_image_url'] = $this->actualControllerImageUrl;
        }
        if (null !== $this->actualControllerBackImageUrl) {
            $res['actual_controller_back_image_url'] = $this->actualControllerBackImageUrl;
        }
        if (null !== $this->actualControllerTelephoneNumber) {
            $res['actual_controller_telephone_number'] = $this->actualControllerTelephoneNumber;
        }
        if (null !== $this->businessLicenseNumber) {
            $res['business_license_number'] = $this->businessLicenseNumber;
        }
        if (null !== $this->businesslicenseUrl) {
            $res['businesslicense_url'] = $this->businesslicenseUrl;
        }
        if (null !== $this->legalRepresentative) {
            $res['legal_representative'] = $this->legalRepresentative;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserSyncInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['login_id'])) {
            $model->loginId = $map['login_id'];
        }
        if (isset($map['login_type'])) {
            $model->loginType = $map['login_type'];
        }
        if (isset($map['login_time'])) {
            $model->loginTime = $map['login_time'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_phone_number'])) {
            $model->userPhoneNumber = $map['user_phone_number'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }
        if (isset($map['lease_corp_name'])) {
            $model->leaseCorpName = $map['lease_corp_name'];
        }
        if (isset($map['lease_corp_id'])) {
            $model->leaseCorpId = $map['lease_corp_id'];
        }
        if (isset($map['lease_corp_owner_name'])) {
            $model->leaseCorpOwnerName = $map['lease_corp_owner_name'];
        }
        if (isset($map['lessee_type'])) {
            $model->lesseeType = $map['lessee_type'];
        }
        if (isset($map['leased_enterprise'])) {
            $model->leasedEnterprise = $map['leased_enterprise'];
        }
        if (isset($map['user_image_url'])) {
            $model->userImageUrl = $map['user_image_url'];
        }
        if (isset($map['user_back_image_url'])) {
            $model->userBackImageUrl = $map['user_back_image_url'];
        }
        if (isset($map['registered_telephone_number'])) {
            $model->registeredTelephoneNumber = $map['registered_telephone_number'];
        }
        if (isset($map['actual_controller_id'])) {
            $model->actualControllerId = $map['actual_controller_id'];
        }
        if (isset($map['actual_controller_number'])) {
            $model->actualControllerNumber = $map['actual_controller_number'];
        }
        if (isset($map['actual_controller_name'])) {
            $model->actualControllerName = $map['actual_controller_name'];
        }
        if (isset($map['actual_controller_image_url'])) {
            $model->actualControllerImageUrl = $map['actual_controller_image_url'];
        }
        if (isset($map['actual_controller_back_image_url'])) {
            $model->actualControllerBackImageUrl = $map['actual_controller_back_image_url'];
        }
        if (isset($map['actual_controller_telephone_number'])) {
            $model->actualControllerTelephoneNumber = $map['actual_controller_telephone_number'];
        }
        if (isset($map['business_license_number'])) {
            $model->businessLicenseNumber = $map['business_license_number'];
        }
        if (isset($map['businesslicense_url'])) {
            $model->businesslicenseUrl = $map['businesslicense_url'];
        }
        if (isset($map['legal_representative'])) {
            $model->legalRepresentative = $map['legal_representative'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}

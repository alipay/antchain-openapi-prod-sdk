<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseUserinfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'alipayUid' => 'alipay_uid',
        'applicationId' => 'application_id',
        'async' => 'async',
        'extraInfo' => 'extra_info',
        'leaseCorpId' => 'lease_corp_id',
        'leaseCorpName' => 'lease_corp_name',
        'leaseCorpOwnerName' => 'lease_corp_owner_name',
        'loginId' => 'login_id',
        'loginTime' => 'login_time',
        'loginType' => 'login_type',
        'orderId' => 'order_id',
        'userBlockchainVerifyHash' => 'user_blockchain_verify_hash',
        'userEmail' => 'user_email',
        'userId' => 'user_id',
        'userImageHash' => 'user_image_hash',
        'userImageTxHash' => 'user_image_tx_hash',
        'userName' => 'user_name',
        'userPhoneNumber' => 'user_phone_number',
        'userType' => 'user_type',
        'relatedNotify' => 'related_notify',
    ];
    public function validate() {
        Model::validateRequired('alipayUid', $this->alipayUid, true);
        Model::validateRequired('leaseCorpId', $this->leaseCorpId, true);
        Model::validateRequired('leaseCorpName', $this->leaseCorpName, true);
        Model::validateRequired('leaseCorpOwnerName', $this->leaseCorpOwnerName, true);
        Model::validateRequired('loginId', $this->loginId, true);
        Model::validateRequired('loginTime', $this->loginTime, true);
        Model::validateRequired('loginType', $this->loginType, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userImageHash', $this->userImageHash, true);
        Model::validateRequired('userImageTxHash', $this->userImageTxHash, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('userPhoneNumber', $this->userPhoneNumber, true);
        Model::validateRequired('userType', $this->userType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->async) {
            $res['async'] = $this->async;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->leaseCorpId) {
            $res['lease_corp_id'] = $this->leaseCorpId;
        }
        if (null !== $this->leaseCorpName) {
            $res['lease_corp_name'] = $this->leaseCorpName;
        }
        if (null !== $this->leaseCorpOwnerName) {
            $res['lease_corp_owner_name'] = $this->leaseCorpOwnerName;
        }
        if (null !== $this->loginId) {
            $res['login_id'] = $this->loginId;
        }
        if (null !== $this->loginTime) {
            $res['login_time'] = $this->loginTime;
        }
        if (null !== $this->loginType) {
            $res['login_type'] = $this->loginType;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->userBlockchainVerifyHash) {
            $res['user_blockchain_verify_hash'] = $this->userBlockchainVerifyHash;
        }
        if (null !== $this->userEmail) {
            $res['user_email'] = $this->userEmail;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userImageHash) {
            $res['user_image_hash'] = $this->userImageHash;
        }
        if (null !== $this->userImageTxHash) {
            $res['user_image_tx_hash'] = $this->userImageTxHash;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userPhoneNumber) {
            $res['user_phone_number'] = $this->userPhoneNumber;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->relatedNotify) {
            $res['related_notify'] = $this->relatedNotify;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateLeaseUserinfoRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['alipay_uid'])){
            $model->alipayUid = $map['alipay_uid'];
        }
        if(isset($map['application_id'])){
            $model->applicationId = $map['application_id'];
        }
        if(isset($map['async'])){
            $model->async = $map['async'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['lease_corp_id'])){
            $model->leaseCorpId = $map['lease_corp_id'];
        }
        if(isset($map['lease_corp_name'])){
            $model->leaseCorpName = $map['lease_corp_name'];
        }
        if(isset($map['lease_corp_owner_name'])){
            $model->leaseCorpOwnerName = $map['lease_corp_owner_name'];
        }
        if(isset($map['login_id'])){
            $model->loginId = $map['login_id'];
        }
        if(isset($map['login_time'])){
            $model->loginTime = $map['login_time'];
        }
        if(isset($map['login_type'])){
            $model->loginType = $map['login_type'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['user_blockchain_verify_hash'])){
            $model->userBlockchainVerifyHash = $map['user_blockchain_verify_hash'];
        }
        if(isset($map['user_email'])){
            $model->userEmail = $map['user_email'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['user_image_hash'])){
            $model->userImageHash = $map['user_image_hash'];
        }
        if(isset($map['user_image_tx_hash'])){
            $model->userImageTxHash = $map['user_image_tx_hash'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
        }
        if(isset($map['user_phone_number'])){
            $model->userPhoneNumber = $map['user_phone_number'];
        }
        if(isset($map['user_type'])){
            $model->userType = $map['user_type'];
        }
        if(isset($map['related_notify'])){
            if(!empty($map['related_notify'])){
                $model->relatedNotify = $map['related_notify'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 支付宝账号信息
    /**
     * @var string
     */
    public $alipayUid;

    // 融资租赁业务id，由资方控制台生成返回
    /**
     * @var string
     */
    public $applicationId;

    // 是否启动异步
    /**
     * @var int
     */
    public $async;

    // 融资租赁用户信息额外字段
    /**
     * @var string
     */
    public $extraInfo;

    // 承租企业统一社会信用代码 长度不可超过50
    /**
     * @var string
     */
    public $leaseCorpId;

    // 承租企业名称 长度不可超过50
    /**
     * @var string
     */
    public $leaseCorpName;

    // 承租法定代表人姓名 长度不可超过50
    /**
     * @var string
     */
    public $leaseCorpOwnerName;

    // 用户登录名，租赁平台会员ID/支付宝ID 长度不可超过50
    /**
     * @var string
     */
    public $loginId;

    // 用户登录时间 格式为2019-8-31 12:00:00
    /**
     * @var string
     */
    public $loginTime;

    // 用户登录名类型 1.商户会员2.支付宝3.其他
    /**
     * @var int
     */
    public $loginType;

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 区块链认证Hash，若为支付宝实人，必填
    /**
     * @var string
     */
    public $userBlockchainVerifyHash;

    // 承租人电子邮件，法院/仲裁电子送达必填项，长度不超过5
    /**
     * @var string
     */
    public $userEmail;

    // 承租人身份证
    /**
     * @var string
     */
    public $userId;

    // 承租人身份证照片哈希
    /**
     * @var string
     */
    public $userImageHash;

    // 承租人身份证照片存证交易哈希
    /**
     * @var string
     */
    public $userImageTxHash;

    // 承租人姓名 长度不可超过10
    /**
     * @var string
     */
    public $userName;

    // 承租人手机号
    /**
     * @var string
     */
    public $userPhoneNumber;

    // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
    /**
     * @var int
     */
    public $userType;

    // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
    /**
     * @var string[]
     */
    public $relatedNotify;

}

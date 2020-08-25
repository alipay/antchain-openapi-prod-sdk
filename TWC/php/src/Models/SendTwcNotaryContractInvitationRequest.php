<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SendTwcNotaryContractInvitationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'bizProcessId' => 'biz_process_id',
        'callbackUrl' => 'callback_url',
        'email' => 'email',
        'idNumber' => 'id_number',
        'inviteeCertType' => 'invitee_cert_type',
        'inviteType' => 'invite_type',
        'legalCertType' => 'legal_cert_type',
        'legalName' => 'legal_name',
        'legalNo' => 'legal_no',
        'mobile' => 'mobile',
        'name' => 'name',
        'notifyType' => 'notify_type',
        'organCertNo' => 'organ_cert_no',
        'organCertType' => 'organ_cert_type',
        'organName' => 'organ_name',
        'redirectUrl' => 'redirect_url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->bizProcessId) {
            $res['biz_process_id'] = $this->bizProcessId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->inviteeCertType) {
            $res['invitee_cert_type'] = $this->inviteeCertType;
        }
        if (null !== $this->inviteType) {
            $res['invite_type'] = $this->inviteType;
        }
        if (null !== $this->legalCertType) {
            $res['legal_cert_type'] = $this->legalCertType;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->legalNo) {
            $res['legal_no'] = $this->legalNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->notifyType) {
            $res['notify_type'] = $this->notifyType;
        }
        if (null !== $this->organCertNo) {
            $res['organ_cert_no'] = $this->organCertNo;
        }
        if (null !== $this->organCertType) {
            $res['organ_cert_type'] = $this->organCertType;
        }
        if (null !== $this->organName) {
            $res['organ_name'] = $this->organName;
        }
        if (null !== $this->redirectUrl) {
            $res['redirect_url'] = $this->redirectUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SendTwcNotaryContractInvitationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['biz_process_id'])){
            $model->bizProcessId = $map['biz_process_id'];
        }
        if(isset($map['callback_url'])){
            $model->callbackUrl = $map['callback_url'];
        }
        if(isset($map['email'])){
            $model->email = $map['email'];
        }
        if(isset($map['id_number'])){
            $model->idNumber = $map['id_number'];
        }
        if(isset($map['invitee_cert_type'])){
            $model->inviteeCertType = $map['invitee_cert_type'];
        }
        if(isset($map['invite_type'])){
            $model->inviteType = $map['invite_type'];
        }
        if(isset($map['legal_cert_type'])){
            $model->legalCertType = $map['legal_cert_type'];
        }
        if(isset($map['legal_name'])){
            $model->legalName = $map['legal_name'];
        }
        if(isset($map['legal_no'])){
            $model->legalNo = $map['legal_no'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['notify_type'])){
            $model->notifyType = $map['notify_type'];
        }
        if(isset($map['organ_cert_no'])){
            $model->organCertNo = $map['organ_cert_no'];
        }
        if(isset($map['organ_cert_type'])){
            $model->organCertType = $map['organ_cert_type'];
        }
        if(isset($map['organ_name'])){
            $model->organName = $map['organ_name'];
        }
        if(isset($map['redirect_url'])){
            $model->redirectUrl = $map['redirect_url'];
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

    /**
     * @var string
     */
    public $regionName;

    // 业务方id，重定向和回调时都回传这个id
    /**
     * @var string
     */
    public $bizProcessId;

    // 回调接口地址，默认为空，不回调
    /**
     * @var string
     */
    public $callbackUrl;

    // 被邀请人邮箱，若手机号和邮箱都传入，则仅手机号有效
    /**
     * @var string
     */
    public $email;

    // 被邀请人证件号
    /**
     * @var string
     */
    public $idNumber;

    // 被邀请人证件类型，详见个人证件类型说明 ，默认CRED_PSN_CH_IDCARD
    /**
     * @var string
     */
    public $inviteeCertType;

    // 邀请个人实名为PERSON，邀请企业为ORGAN
    /**
     * @var string
     */
    public $inviteType;

    // 企业法定代表人证件类型，详见个人证件类型说明 ，默认CRED_PSN_CH_IDCARD
    /**
     * @var string
     */
    public $legalCertType;

    // 企业法定代表人姓名
    /**
     * @var string
     */
    public $legalName;

    // 企业法定代表人证件号
    /**
     * @var string
     */
    public $legalNo;

    // 被邀请人手机号
    /**
     * @var string
     */
    public $mobile;

    // 被邀请人姓名
    /**
     * @var string
     */
    public $name;

    // 默认为空，传入“sms”表示短信，“email”表示邮件，若两者都传入，则只发送短信
    /**
     * @var string
     */
    public $notifyType;

    // 企业证件号
    /**
     * @var string
     */
    public $organCertNo;

    // 企业证件类型，详见机构证件类型说明 ，默认CRED_ORG_USCC
    /**
     * @var string
     */
    public $organCertType;

    // 企业名称
    /**
     * @var string
     */
    public $organName;

    // 结束后重定向地址（需加前缀https:// 或 http:// ），默认停留在当前页面
    /**
     * @var string
     */
    public $redirectUrl;

}

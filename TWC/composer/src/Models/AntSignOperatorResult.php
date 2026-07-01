<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AntSignOperatorResult extends Model
{
    // 签署方UserId
    /**
     * @example 签署方UserId
     *
     * @var string
     */
    public $signUserId;

    // 签署方证件号
    /**
     * @example 签署方证件号
     *
     * @var string
     */
    public $signCertNo;

    // 签署方证件名称
    /**
     * @example 签署方证件名称
     *
     * @var string
     */
    public $signCertName;

    // 签署方证件类型
    /**
     * @example 签署方证件类型
     *
     * @var string
     */
    public $signCertType;

    // 是否授权
    /**
     * @example 是否授权
     *
     * @var int
     */
    public $authorized;

    // 授权时间
    /**
     * @example 授权时间
     *
     * @var string
     */
    public $authorizeTime;

    // 授权人证件号码
    /**
     * @example 授权人证件号码
     *
     * @var string
     */
    public $authPersonCertNo;

    // 授权人证件名称
    /**
     * @example 授权人证件名称
     *
     * @var string
     */
    public $authPersonCertName;

    // 授权人证件类型
    /**
     * @example 授权人证件类型
     *
     * @var string
     */
    public $authPersonCertType;

    // 邮件联系地址
    /**
     * @example 邮件联系地址
     *
     * @var string
     */
    public $emailAddress;

    // 电话联系方式
    /**
     * @example 电话联系方式
     *
     * @var string
     */
    public $mobileNumber;

    // 签署顺序
    /**
     * @example
     *
     * @var int
     */
    public $signOrder;

    // 签署失败原因
    /**
     * @example 签署失败原因
     *
     * @var string
     */
    public $failInfo;

    // 备注
    /**
     * @example 备注
     *
     * @var string
     */
    public $remark;

    // 是否我方公司
    /**
     * @example 是否我方公司
     *
     * @var int
     */
    public $ourCorp;

    // 签署状态
    /**
     * @example 签署状态
     *
     * @var string
     */
    public $status;

    // 签署时间
    /**
     * @example 签署时间
     *
     * @var string
     */
    public $signTime;

    // [签署方子类型 企业子类型： BUS：企业 SINGLE：个体工商户 GOV：党政机关 INST：事业单位 COMMON：社会组织 OTHER：其他组织
    /**
     * @example [签署方子类型 企业子类型： BUS：企业 SINGLE：个体工商户 GOV：党政机关 INST：事业单位 COMMON：社会组织 OTHER：其他组织
     *
     * @var string
     */
    public $signSubType;
    protected $_name = [
        'signUserId'         => 'sign_user_id',
        'signCertNo'         => 'sign_cert_no',
        'signCertName'       => 'sign_cert_name',
        'signCertType'       => 'sign_cert_type',
        'authorized'         => 'authorized',
        'authorizeTime'      => 'authorize_time',
        'authPersonCertNo'   => 'auth_person_cert_no',
        'authPersonCertName' => 'auth_person_cert_name',
        'authPersonCertType' => 'auth_person_cert_type',
        'emailAddress'       => 'email_address',
        'mobileNumber'       => 'mobile_number',
        'signOrder'          => 'sign_order',
        'failInfo'           => 'fail_info',
        'remark'             => 'remark',
        'ourCorp'            => 'our_corp',
        'status'             => 'status',
        'signTime'           => 'sign_time',
        'signSubType'        => 'sign_sub_type',
    ];

    public function validate()
    {
        Model::validateRequired('signUserId', $this->signUserId, true);
        Model::validateRequired('signCertNo', $this->signCertNo, true);
        Model::validateRequired('signCertName', $this->signCertName, true);
        Model::validateRequired('signCertType', $this->signCertType, true);
        Model::validateRequired('authorized', $this->authorized, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signUserId) {
            $res['sign_user_id'] = $this->signUserId;
        }
        if (null !== $this->signCertNo) {
            $res['sign_cert_no'] = $this->signCertNo;
        }
        if (null !== $this->signCertName) {
            $res['sign_cert_name'] = $this->signCertName;
        }
        if (null !== $this->signCertType) {
            $res['sign_cert_type'] = $this->signCertType;
        }
        if (null !== $this->authorized) {
            $res['authorized'] = $this->authorized;
        }
        if (null !== $this->authorizeTime) {
            $res['authorize_time'] = $this->authorizeTime;
        }
        if (null !== $this->authPersonCertNo) {
            $res['auth_person_cert_no'] = $this->authPersonCertNo;
        }
        if (null !== $this->authPersonCertName) {
            $res['auth_person_cert_name'] = $this->authPersonCertName;
        }
        if (null !== $this->authPersonCertType) {
            $res['auth_person_cert_type'] = $this->authPersonCertType;
        }
        if (null !== $this->emailAddress) {
            $res['email_address'] = $this->emailAddress;
        }
        if (null !== $this->mobileNumber) {
            $res['mobile_number'] = $this->mobileNumber;
        }
        if (null !== $this->signOrder) {
            $res['sign_order'] = $this->signOrder;
        }
        if (null !== $this->failInfo) {
            $res['fail_info'] = $this->failInfo;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->ourCorp) {
            $res['our_corp'] = $this->ourCorp;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->signSubType) {
            $res['sign_sub_type'] = $this->signSubType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntSignOperatorResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_user_id'])) {
            $model->signUserId = $map['sign_user_id'];
        }
        if (isset($map['sign_cert_no'])) {
            $model->signCertNo = $map['sign_cert_no'];
        }
        if (isset($map['sign_cert_name'])) {
            $model->signCertName = $map['sign_cert_name'];
        }
        if (isset($map['sign_cert_type'])) {
            $model->signCertType = $map['sign_cert_type'];
        }
        if (isset($map['authorized'])) {
            $model->authorized = $map['authorized'];
        }
        if (isset($map['authorize_time'])) {
            $model->authorizeTime = $map['authorize_time'];
        }
        if (isset($map['auth_person_cert_no'])) {
            $model->authPersonCertNo = $map['auth_person_cert_no'];
        }
        if (isset($map['auth_person_cert_name'])) {
            $model->authPersonCertName = $map['auth_person_cert_name'];
        }
        if (isset($map['auth_person_cert_type'])) {
            $model->authPersonCertType = $map['auth_person_cert_type'];
        }
        if (isset($map['email_address'])) {
            $model->emailAddress = $map['email_address'];
        }
        if (isset($map['mobile_number'])) {
            $model->mobileNumber = $map['mobile_number'];
        }
        if (isset($map['sign_order'])) {
            $model->signOrder = $map['sign_order'];
        }
        if (isset($map['fail_info'])) {
            $model->failInfo = $map['fail_info'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['our_corp'])) {
            $model->ourCorp = $map['our_corp'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['sign_sub_type'])) {
            $model->signSubType = $map['sign_sub_type'];
        }

        return $model;
    }
}

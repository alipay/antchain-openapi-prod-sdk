<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSignOperatorResult extends Model
{
    // 签署方UserId
    /**
     * @example C2020309209302930
     *
     * @var string
     */
    public $signUserId;

    // 签署方证件号
    /**
     * @example 4202039203901902109
     *
     * @var string
     */
    public $signCertNo;

    // 签署方证件名称
    /**
     * @example 李四
     *
     * @var string
     */
    public $signCertName;

    // 签署方证件类型
    /**
     * @example CRED_ORG_USCC
     *
     * @var string
     */
    public $signCertType;

    // 是否授权
    /**
     * @example 1
     *
     * @var int
     */
    public $authorized;

    // 授权时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $authorizeTime;

    // 授权人证件号码
    /**
     * @example 121213131313
     *
     * @var string
     */
    public $authPersonCertNo;

    // 授权人证件名称
    /**
     * @example 李四
     *
     * @var string
     */
    public $authPersonCertName;

    // 授权人证件类型
    /**
     * @example CRED_PSN_CH_IDCARD
     *
     * @var string
     */
    public $authPersonCertType;

    // 签署失败原因
    /**
     * @example 签署失败
     *
     * @var string
     */
    public $failInfo;

    // SIGNNED
    /**
     * @example 签署方状态
     *
     * @var string
     */
    public $status;

    // 签署时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $signTime;

    // 是否我方公司
    /**
     * @example 1
     *
     * @var int
     */
    public $ourCorp;

    // 电话联系方式，脱敏显示
    /**
     * @example 152*****90
     *
     * @var string
     */
    public $mobileNumber;

    // 邮件联系地址，脱敏展示返回
    /**
     * @example xxx@qq.com
     *
     * @var string
     */
    public $emailAddress;
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
        'failInfo'           => 'fail_info',
        'status'             => 'status',
        'signTime'           => 'sign_time',
        'ourCorp'            => 'our_corp',
        'mobileNumber'       => 'mobile_number',
        'emailAddress'       => 'email_address',
    ];

    public function validate()
    {
        Model::validateRequired('signUserId', $this->signUserId, true);
        Model::validateRequired('signCertName', $this->signCertName, true);
        Model::validatePattern('authorizeTime', $this->authorizeTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('signTime', $this->signTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->failInfo) {
            $res['fail_info'] = $this->failInfo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->ourCorp) {
            $res['our_corp'] = $this->ourCorp;
        }
        if (null !== $this->mobileNumber) {
            $res['mobile_number'] = $this->mobileNumber;
        }
        if (null !== $this->emailAddress) {
            $res['email_address'] = $this->emailAddress;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSignOperatorResult
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
        if (isset($map['fail_info'])) {
            $model->failInfo = $map['fail_info'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['our_corp'])) {
            $model->ourCorp = $map['our_corp'];
        }
        if (isset($map['mobile_number'])) {
            $model->mobileNumber = $map['mobile_number'];
        }
        if (isset($map['email_address'])) {
            $model->emailAddress = $map['email_address'];
        }

        return $model;
    }
}

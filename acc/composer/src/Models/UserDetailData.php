<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class UserDetailData extends Model
{
    // 账户Id
    /**
     * @example 账户Id
     *
     * @var int
     */
    public $userId;

    // 统一身份id
    //
    //
    /**
     * @example 统一身份id
     *
     * @var string
     */
    public $did;

    // 账户名
    //
    //
    /**
     * @example 账户名
     *
     * @var string
     */
    public $loginId;

    // 用户姓名
    //
    //
    /**
     * @example 用户姓名
     *
     * @var string
     */
    public $userName;

    // 用户类型
    /**
     * @example 用户类型
     *
     * @var string
     */
    public $userType;

    // 账户类型
    /**
     * @example 账户类型
     *
     * @var string
     */
    public $accountType;

    // 个人认证状态
    /**
     * @example 个人认证状态
     *
     * @var string
     */
    public $certStatus;

    // 邮箱
    /**
     * @example 邮箱
     *
     * @var string
     */
    public $email;

    // 手机号
    /**
     * @example 手机号
     *
     * @var string
     */
    public $telphone;

    // 个人证件类型
    /**
     * @example 个人证件类型
     *
     * @var string
     */
    public $certType;

    // 证件号码
    //
    /**
     * @example 证件号码
     *
     * @var string
     */
    public $certNum;

    // cert_file_front_id
    /**
     * @example cert_file_front_id
     *
     * @var string
     */
    public $certFileFrontId;

    // 个人证件正面类型
    /**
     * @example JPG
     *
     * @var string
     */
    public $certFileFrontType;

    // 个人证件反面图片，osskeyId
    //
    //
    /**
     * @example 个人证件反面图片，osskeyId
     *
     * @var string
     */
    public $certFileReverseId;

    // 个人证件反面类型。JPG
    //
    //
    /**
     * @example JPG
     *
     * @var string
     */
    public $certFileReverseType;

    // 关联企业信息
    //
    //
    /**
     * @example
     *
     * @var RefFirm[]
     */
    public $refFirms;

    // 是否有印章
    /**
     * @example true, false
     *
     * @var bool
     */
    public $sealFlag;
    protected $_name = [
        'userId'              => 'user_id',
        'did'                 => 'did',
        'loginId'             => 'login_id',
        'userName'            => 'user_name',
        'userType'            => 'user_type',
        'accountType'         => 'account_type',
        'certStatus'          => 'cert_status',
        'email'               => 'email',
        'telphone'            => 'telphone',
        'certType'            => 'cert_type',
        'certNum'             => 'cert_num',
        'certFileFrontId'     => 'cert_file_front_id',
        'certFileFrontType'   => 'cert_file_front_type',
        'certFileReverseId'   => 'cert_file_reverse_id',
        'certFileReverseType' => 'cert_file_reverse_type',
        'refFirms'            => 'ref_firms',
        'sealFlag'            => 'seal_flag',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('loginId', $this->loginId, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('accountType', $this->accountType, true);
        Model::validateRequired('certStatus', $this->certStatus, true);
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('telphone', $this->telphone, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certNum', $this->certNum, true);
        Model::validateRequired('certFileFrontId', $this->certFileFrontId, true);
        Model::validateRequired('certFileFrontType', $this->certFileFrontType, true);
        Model::validateRequired('certFileReverseId', $this->certFileReverseId, true);
        Model::validateRequired('certFileReverseType', $this->certFileReverseType, true);
        Model::validateRequired('refFirms', $this->refFirms, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->loginId) {
            $res['login_id'] = $this->loginId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }
        if (null !== $this->certStatus) {
            $res['cert_status'] = $this->certStatus;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->telphone) {
            $res['telphone'] = $this->telphone;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNum) {
            $res['cert_num'] = $this->certNum;
        }
        if (null !== $this->certFileFrontId) {
            $res['cert_file_front_id'] = $this->certFileFrontId;
        }
        if (null !== $this->certFileFrontType) {
            $res['cert_file_front_type'] = $this->certFileFrontType;
        }
        if (null !== $this->certFileReverseId) {
            $res['cert_file_reverse_id'] = $this->certFileReverseId;
        }
        if (null !== $this->certFileReverseType) {
            $res['cert_file_reverse_type'] = $this->certFileReverseType;
        }
        if (null !== $this->refFirms) {
            $res['ref_firms'] = [];
            if (null !== $this->refFirms && \is_array($this->refFirms)) {
                $n = 0;
                foreach ($this->refFirms as $item) {
                    $res['ref_firms'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sealFlag) {
            $res['seal_flag'] = $this->sealFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserDetailData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['login_id'])) {
            $model->loginId = $map['login_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }
        if (isset($map['cert_status'])) {
            $model->certStatus = $map['cert_status'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['telphone'])) {
            $model->telphone = $map['telphone'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_num'])) {
            $model->certNum = $map['cert_num'];
        }
        if (isset($map['cert_file_front_id'])) {
            $model->certFileFrontId = $map['cert_file_front_id'];
        }
        if (isset($map['cert_file_front_type'])) {
            $model->certFileFrontType = $map['cert_file_front_type'];
        }
        if (isset($map['cert_file_reverse_id'])) {
            $model->certFileReverseId = $map['cert_file_reverse_id'];
        }
        if (isset($map['cert_file_reverse_type'])) {
            $model->certFileReverseType = $map['cert_file_reverse_type'];
        }
        if (isset($map['ref_firms'])) {
            if (!empty($map['ref_firms'])) {
                $model->refFirms = [];
                $n               = 0;
                foreach ($map['ref_firms'] as $item) {
                    $model->refFirms[$n++] = null !== $item ? RefFirm::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['seal_flag'])) {
            $model->sealFlag = $map['seal_flag'];
        }

        return $model;
    }
}

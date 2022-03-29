<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class MonitorUser extends Model
{
    // 用户来源
    /**
     * @example IAM
     *
     * @var string
     */
    public $identityType;

    // 用户上的权限
    /**
     * @example true, false
     *
     * @var bool
     */
    public $superViewer;

    // 是否为超级管理员
    /**
     * @example true, false
     *
     * @var bool
     */
    public $superAdmin;

    // 显示名，花名
    /**
     * @example 花名
     *
     * @var string
     */
    public $nickName;

    // emp_id
    /**
     * @example 57551
     *
     * @var string
     */
    public $empId;

    // id
    /**
     * @example 96971
     *
     * @var int
     */
    public $id;

    // 登录名，等于_id, _id实在太难辨别了，域帐号  yerui.yr
    /**
     * @example yerui.yr
     *
     * @var string
     */
    public $loginName;

    // 展示名称
    /**
     * @example test
     *
     * @var string
     */
    public $displayName;

    // 兼容UniversalRead里返回的userDisplayName
    /**
     * @example test
     *
     * @var string
     */
    public $userDisplayName;

    // 真名
    /**
     * @example test
     *
     * @var string
     */
    public $realName;

    // phone_num
    /**
     * @example 18111111111
     *
     * @var string
     */
    public $phoneNum;

    // email
    /**
     * @example xxxx@xx.com
     *
     * @var string
     */
    public $email;

    // enterprise_id（金融云专属）
    /**
     * @example 1
     *
     * @var string
     */
    public $enterpriseId;

    // token
    /**
     * @example test
     *
     * @var string
     */
    public $token;

    // 一方化标记位
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isFromAliyun;
    protected $_name = [
        'identityType'    => 'identity_type',
        'superViewer'     => 'super_viewer',
        'superAdmin'      => 'super_admin',
        'nickName'        => 'nick_name',
        'empId'           => 'emp_id',
        'id'              => 'id',
        'loginName'       => 'login_name',
        'displayName'     => 'display_name',
        'userDisplayName' => 'user_display_name',
        'realName'        => 'real_name',
        'phoneNum'        => 'phone_num',
        'email'           => 'email',
        'enterpriseId'    => 'enterprise_id',
        'token'           => 'token',
        'isFromAliyun'    => 'is_from_aliyun',
    ];

    public function validate()
    {
        Model::validateRequired('identityType', $this->identityType, true);
        Model::validateRequired('superViewer', $this->superViewer, true);
        Model::validateRequired('superAdmin', $this->superAdmin, true);
        Model::validateRequired('nickName', $this->nickName, true);
        Model::validateRequired('empId', $this->empId, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('userDisplayName', $this->userDisplayName, true);
        Model::validateRequired('realName', $this->realName, true);
        Model::validateRequired('phoneNum', $this->phoneNum, true);
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('enterpriseId', $this->enterpriseId, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('isFromAliyun', $this->isFromAliyun, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identityType) {
            $res['identity_type'] = $this->identityType;
        }
        if (null !== $this->superViewer) {
            $res['super_viewer'] = $this->superViewer;
        }
        if (null !== $this->superAdmin) {
            $res['super_admin'] = $this->superAdmin;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->empId) {
            $res['emp_id'] = $this->empId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->userDisplayName) {
            $res['user_display_name'] = $this->userDisplayName;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->enterpriseId) {
            $res['enterprise_id'] = $this->enterpriseId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->isFromAliyun) {
            $res['is_from_aliyun'] = $this->isFromAliyun;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitorUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identity_type'])) {
            $model->identityType = $map['identity_type'];
        }
        if (isset($map['super_viewer'])) {
            $model->superViewer = $map['super_viewer'];
        }
        if (isset($map['super_admin'])) {
            $model->superAdmin = $map['super_admin'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['emp_id'])) {
            $model->empId = $map['emp_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['user_display_name'])) {
            $model->userDisplayName = $map['user_display_name'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['enterprise_id'])) {
            $model->enterpriseId = $map['enterprise_id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['is_from_aliyun'])) {
            $model->isFromAliyun = $map['is_from_aliyun'];
        }

        return $model;
    }
}

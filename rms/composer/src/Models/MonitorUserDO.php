<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class MonitorUserDO extends Model
{
    // 登录名
    /**
     * @example yerui.yr
     *
     * @var string
     */
    public $loginName;

    // 昵称(花名或显示名)
    /**
     * @example 花名
     *
     * @var string
     */
    public $nickName;

    // 手机号码
    /**
     * @example 18810552566
     *
     * @var string
     */
    public $phoneNum;

    // 真名
    /**
     * @example 郑明明
     *
     * @var string
     */
    public $realName;

    // 一方化标记位
    /**
     * @example true, false
     *
     * @var bool
     */
    public $fromAliyun;

    // 是否未超级管理员
    /**
     * @example true, false
     *
     * @var bool
     */
    public $superAdmin;

    // 用户上的权限
    /**
     * @example true, false
     *
     * @var bool
     */
    public $superViewer;

    // super_admin或者super_viewer
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isSuper;

    // 用户 ID
    /**
     * @example 123
     *
     * @var int
     */
    public $id;

    // 用户来源
    /**
     * @example IAM
     *
     * @var string
     */
    public $identityType;
    protected $_name = [
        'loginName'    => 'login_name',
        'nickName'     => 'nick_name',
        'phoneNum'     => 'phone_num',
        'realName'     => 'real_name',
        'fromAliyun'   => 'from_aliyun',
        'superAdmin'   => 'super_admin',
        'superViewer'  => 'super_viewer',
        'isSuper'      => 'is_super',
        'id'           => 'id',
        'identityType' => 'identity_type',
    ];

    public function validate()
    {
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('nickName', $this->nickName, true);
        Model::validateRequired('phoneNum', $this->phoneNum, true);
        Model::validateRequired('realName', $this->realName, true);
        Model::validateRequired('fromAliyun', $this->fromAliyun, true);
        Model::validateRequired('superAdmin', $this->superAdmin, true);
        Model::validateRequired('superViewer', $this->superViewer, true);
        Model::validateRequired('isSuper', $this->isSuper, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('identityType', $this->identityType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->fromAliyun) {
            $res['from_aliyun'] = $this->fromAliyun;
        }
        if (null !== $this->superAdmin) {
            $res['super_admin'] = $this->superAdmin;
        }
        if (null !== $this->superViewer) {
            $res['super_viewer'] = $this->superViewer;
        }
        if (null !== $this->isSuper) {
            $res['is_super'] = $this->isSuper;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identityType) {
            $res['identity_type'] = $this->identityType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitorUserDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['from_aliyun'])) {
            $model->fromAliyun = $map['from_aliyun'];
        }
        if (isset($map['super_admin'])) {
            $model->superAdmin = $map['super_admin'];
        }
        if (isset($map['super_viewer'])) {
            $model->superViewer = $map['super_viewer'];
        }
        if (isset($map['is_super'])) {
            $model->isSuper = $map['is_super'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['identity_type'])) {
            $model->identityType = $map['identity_type'];
        }

        return $model;
    }
}

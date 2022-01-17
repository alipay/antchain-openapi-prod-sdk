<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class AuthUserInfoVO extends Model
{
    // api分组标识符
    /**
     * @example api_group_id
     *
     * @var string
     */
    public $apiGroupId;

    // api标识符
    /**
     * @example api_id
     *
     * @var string
     */
    public $apiId;

    // 授权状态
    /**
     * @example AUTH/UNAUTH
     *
     * @var string
     */
    public $authStatus;

    // 授权用户唯一标识
    /**
     * @example auth_user_id
     *
     * @var string
     */
    public $authUserId;

    // 企业的唯一标识
    /**
     * @example QWERTYUIO
     *
     * @var string
     */
    public $customer;

    // 邮箱
    /**
     * @example AAA@AA
     *
     * @var string
     */
    public $email;

    // 创建日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 登录名
    /**
     * @example login_name
     *
     * @var string
     */
    public $loginName;

    // 手机号
    /**
     * @example 13245678901
     *
     * @var string
     */
    public $mobile;

    // 昵称
    /**
     * @example nick_name
     *
     * @var string
     */
    public $nickName;

    // operator
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // 真实性名
    /**
     * @example real_name
     *
     * @var string
     */
    public $realName;

    // 操作员状态
    /**
     * @example (INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态
     *
     * @var string
     */
    public $status;

    // 租户ID
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // 用户标识
    /**
     * @example user_id
     *
     * @var string
     */
    public $userId;

    // workspace id
    /**
     * @example workspace id
     *
     * @var string
     */
    public $workspaceId;

    // 工号
    /**
     * @example work_no
     *
     * @var string
     */
    public $workNo;

    // 能否操作授权
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canAuth;
    protected $_name = [
        'apiGroupId'  => 'api_group_id',
        'apiId'       => 'api_id',
        'authStatus'  => 'auth_status',
        'authUserId'  => 'auth_user_id',
        'customer'    => 'customer',
        'email'       => 'email',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'loginName'   => 'login_name',
        'mobile'      => 'mobile',
        'nickName'    => 'nick_name',
        'operator'    => 'operator',
        'realName'    => 'real_name',
        'status'      => 'status',
        'tenantId'    => 'tenant_id',
        'userId'      => 'user_id',
        'workspaceId' => 'workspace_id',
        'workNo'      => 'work_no',
        'canAuth'     => 'can_auth',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiGroupId) {
            $res['api_group_id'] = $this->apiGroupId;
        }
        if (null !== $this->apiId) {
            $res['api_id'] = $this->apiId;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->authUserId) {
            $res['auth_user_id'] = $this->authUserId;
        }
        if (null !== $this->customer) {
            $res['customer'] = $this->customer;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workNo) {
            $res['work_no'] = $this->workNo;
        }
        if (null !== $this->canAuth) {
            $res['can_auth'] = $this->canAuth;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthUserInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_group_id'])) {
            $model->apiGroupId = $map['api_group_id'];
        }
        if (isset($map['api_id'])) {
            $model->apiId = $map['api_id'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['auth_user_id'])) {
            $model->authUserId = $map['auth_user_id'];
        }
        if (isset($map['customer'])) {
            $model->customer = $map['customer'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['work_no'])) {
            $model->workNo = $map['work_no'];
        }
        if (isset($map['can_auth'])) {
            $model->canAuth = $map['can_auth'];
        }

        return $model;
    }
}

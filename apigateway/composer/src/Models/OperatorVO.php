<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class OperatorVO extends Model
{
    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTime;

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

    // 操作员ID
    /**
     * @example id
     *
     * @var string
     */
    public $id;

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

    // 真实姓名
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

    // 租户
    /**
     * @example
     *
     * @var string[]
     */
    public $tenants;

    // 操作员最近一次修改时间，ISO8601格式
    /**
     * @example update_time
     *
     * @var string
     */
    public $updateTime;

    // 操作员工号
    /**
     * @example work_no
     *
     * @var string
     */
    public $workNo;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'createTime'  => 'create_time',
        'customer'    => 'customer',
        'email'       => 'email',
        'id'          => 'id',
        'loginName'   => 'login_name',
        'mobile'      => 'mobile',
        'nickName'    => 'nick_name',
        'realName'    => 'real_name',
        'status'      => 'status',
        'tenants'     => 'tenants',
        'updateTime'  => 'update_time',
        'workNo'      => 'work_no',
        'tenantId'    => 'tenant_id',
        'workspaceId' => 'workspace_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->customer) {
            $res['customer'] = $this->customer;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
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
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenants) {
            $res['tenants'] = $this->tenants;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->workNo) {
            $res['work_no'] = $this->workNo;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperatorVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['customer'])) {
            $model->customer = $map['customer'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
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
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenants'])) {
            if (!empty($map['tenants'])) {
                $model->tenants = $map['tenants'];
            }
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['work_no'])) {
            $model->workNo = $map['work_no'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class Operator extends Model
{
    // 操作员创建时间，ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $createTime;

    // 操作员所在的企业
    /**
     * @example
     *
     * @var string
     */
    public $customer;

    // 邮箱
    /**
     * @example zhangsan@alipay.com
     *
     * @var string
     */
    public $email;

    // 外部对接系统操作员id
    /**
     * @example ding0000001
     *
     * @var string
     */
    public $externalId;

    // 外部对接系统类型
    /**
     * @example DING_TALK
     *
     * @var string
     */
    public $externalSystem;

    // 操作员ID
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $id;

    // 是否是主账号
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isMaster;

    // 登录名
    /**
     * @example
     *
     * @var string
     */
    public $loginName;

    // 手机号
    /**
     * @example
     *
     * @var string
     */
    public $mobile;

    // 昵称
    /**
     * @example
     *
     * @var string
     */
    public $nickname;

    // 真实姓名
    /**
     * @example
     *
     * @var string
     */
    public $realName;

    // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
    /**
     * @example
     *
     * @var string
     */
    public $status;

    // 操作员加入的租户列表
    /**
     * @example
     *
     * @var string[]
     */
    public $tenants;

    // 操作员最近一次修改时间，ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $updateTime;

    // 操作员工号
    /**
     * @example 0001
     *
     * @var string
     */
    public $workNo;

    // 部门唯一码
    /**
     * @example
     *
     * @var string
     */
    public $departmentCode;

    // 最近一次登录时间，为空则代表没有登录过，ISO8601格式，
    /**
     * @example 2023-03-23T11:33:27Z
     *
     * @var string
     */
    public $lastLoginTime;
    protected $_name = [
        'createTime'     => 'create_time',
        'customer'       => 'customer',
        'email'          => 'email',
        'externalId'     => 'external_id',
        'externalSystem' => 'external_system',
        'id'             => 'id',
        'isMaster'       => 'is_master',
        'loginName'      => 'login_name',
        'mobile'         => 'mobile',
        'nickname'       => 'nickname',
        'realName'       => 'real_name',
        'status'         => 'status',
        'tenants'        => 'tenants',
        'updateTime'     => 'update_time',
        'workNo'         => 'work_no',
        'departmentCode' => 'department_code',
        'lastLoginTime'  => 'last_login_time',
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
        if (null !== $this->externalId) {
            $res['external_id'] = $this->externalId;
        }
        if (null !== $this->externalSystem) {
            $res['external_system'] = $this->externalSystem;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->isMaster) {
            $res['is_master'] = $this->isMaster;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->nickname) {
            $res['nickname'] = $this->nickname;
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
        if (null !== $this->departmentCode) {
            $res['department_code'] = $this->departmentCode;
        }
        if (null !== $this->lastLoginTime) {
            $res['last_login_time'] = $this->lastLoginTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Operator
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
        if (isset($map['external_id'])) {
            $model->externalId = $map['external_id'];
        }
        if (isset($map['external_system'])) {
            $model->externalSystem = $map['external_system'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['is_master'])) {
            $model->isMaster = $map['is_master'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['nickname'])) {
            $model->nickname = $map['nickname'];
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
        if (isset($map['department_code'])) {
            $model->departmentCode = $map['department_code'];
        }
        if (isset($map['last_login_time'])) {
            $model->lastLoginTime = $map['last_login_time'];
        }

        return $model;
    }
}

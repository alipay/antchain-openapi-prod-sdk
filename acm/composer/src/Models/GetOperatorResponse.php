<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class GetOperatorResponse extends Model
{
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 操作员创建时间，ISO8601格式
    /**
     * @var string
     */
    public $createTime;

    // 操作员所在的企业
    /**
     * @var string
     */
    public $customer;

    // 邮箱
    /**
     * @var string
     */
    public $email;

    // 外部对接系统操作员ID
    /**
     * @var string
     */
    public $externalId;

    // 外部对接系统类型
    /**
     * @var string
     */
    public $externalSystem;

    // 操作员ID
    /**
     * @var string
     */
    public $id;

    // 登录名
    /**
     * @var string
     */
    public $loginName;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 昵称
    /**
     * @var string
     */
    public $nickname;

    // 真实姓名
    /**
     * @var string
     */
    public $realName;

    // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
    /**
     * @var string
     */
    public $status;

    // 用户加入的租户列表
    /**
     * @var string[]
     */
    public $tenants;

    // 操作员最近一次修改时间，ISO8601格式
    /**
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'createTime'     => 'create_time',
        'customer'       => 'customer',
        'email'          => 'email',
        'externalId'     => 'external_id',
        'externalSystem' => 'external_system',
        'id'             => 'id',
        'loginName'      => 'login_name',
        'mobile'         => 'mobile',
        'nickname'       => 'nickname',
        'realName'       => 'real_name',
        'status'         => 'status',
        'tenants'        => 'tenants',
        'updateTime'     => 'update_time',
    ];

    public function validate()
    {
        Model::validateRequired('customer', $this->customer, true);
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('externalId', $this->externalId, true);
        Model::validateRequired('externalSystem', $this->externalSystem, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('nickname', $this->nickname, true);
        Model::validateRequired('realName', $this->realName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('tenants', $this->tenants, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetOperatorResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
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

        return $model;
    }
}

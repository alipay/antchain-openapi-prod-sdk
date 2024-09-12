<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER\Models;

use AlibabaCloud\Tea\Model;

class VerifySessionTokenResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 用户名称
    /**
     * @var string
     */
    public $userName;

    // 私有化中的租户ID（0表示适用所有租户）
    /**
     * @var int
     */
    public $tenantId;

    // 用户类型，OPERATOR：登录账号；SERVICE：服务账号
    /**
     * @var string
     */
    public $userType;

    // 是否已失效
    /**
     * @var bool
     */
    public $expired;

    // 是否已冻结
    /**
     * @var bool
     */
    public $disabled;

    // 邮箱地址
    /**
     * @var string
     */
    public $email;

    // 电话号码
    /**
     * @var string
     */
    public $phone;

    // 失效时间
    /**
     * @var string
     */
    public $expiredTime;

    // 是否需要修改密码
    /**
     * @var bool
     */
    public $changeRequired;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'userId'         => 'user_id',
        'userName'       => 'user_name',
        'tenantId'       => 'tenant_id',
        'userType'       => 'user_type',
        'expired'        => 'expired',
        'disabled'       => 'disabled',
        'email'          => 'email',
        'phone'          => 'phone',
        'expiredTime'    => 'expired_time',
        'changeRequired' => 'change_required',
    ];

    public function validate()
    {
        Model::validatePattern('expiredTime', $this->expiredTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->expired) {
            $res['expired'] = $this->expired;
        }
        if (null !== $this->disabled) {
            $res['disabled'] = $this->disabled;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }
        if (null !== $this->changeRequired) {
            $res['change_required'] = $this->changeRequired;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifySessionTokenResponse
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['expired'])) {
            $model->expired = $map['expired'];
        }
        if (isset($map['disabled'])) {
            $model->disabled = $map['disabled'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }
        if (isset($map['change_required'])) {
            $model->changeRequired = $map['change_required'];
        }

        return $model;
    }
}

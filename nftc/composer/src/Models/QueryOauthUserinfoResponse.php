<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class QueryOauthUserinfoResponse extends Model
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

    // 昵称
    /**
     * @var string
     */
    public $nickName;

    // 头像链接
    /**
     * @var string
     */
    public $avatar;

    // 用户id
    /**
     * @var string
     */
    public $openUserId;

    // 租户下用户id
    /**
     * @var string
     */
    public $tenantUid;

    // 用户手机号
    /**
     * @var string
     */
    public $phone;

    // 0-未实名; 1-已实名
    /**
     * @var int
     */
    public $isRealNameVerified;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'nickName'           => 'nick_name',
        'avatar'             => 'avatar',
        'openUserId'         => 'open_user_id',
        'tenantUid'          => 'tenant_uid',
        'phone'              => 'phone',
        'isRealNameVerified' => 'is_real_name_verified',
    ];

    public function validate()
    {
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
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->avatar) {
            $res['avatar'] = $this->avatar;
        }
        if (null !== $this->openUserId) {
            $res['open_user_id'] = $this->openUserId;
        }
        if (null !== $this->tenantUid) {
            $res['tenant_uid'] = $this->tenantUid;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->isRealNameVerified) {
            $res['is_real_name_verified'] = $this->isRealNameVerified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOauthUserinfoResponse
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
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['avatar'])) {
            $model->avatar = $map['avatar'];
        }
        if (isset($map['open_user_id'])) {
            $model->openUserId = $map['open_user_id'];
        }
        if (isset($map['tenant_uid'])) {
            $model->tenantUid = $map['tenant_uid'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['is_real_name_verified'])) {
            $model->isRealNameVerified = $map['is_real_name_verified'];
        }

        return $model;
    }
}

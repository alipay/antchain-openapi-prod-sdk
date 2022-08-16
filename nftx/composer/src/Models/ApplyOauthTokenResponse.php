<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class ApplyOauthTokenResponse extends Model
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

    // 后续调用接口鉴权的token
    /**
     * @var string
     */
    public $accessToken;

    // 到期时间
    /**
     * @var string
     */
    public $expireTime;

    // openuid
    /**
     * @var string
     */
    public $openUserId;

    // 预留字段，本期不使用
    /**
     * @var string
     */
    public $refreshToken;

    // 预留字段，本期不使用
    /**
     * @var string
     */
    public $refreshExpireTime;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'accessToken'       => 'access_token',
        'expireTime'        => 'expire_time',
        'openUserId'        => 'open_user_id',
        'refreshToken'      => 'refresh_token',
        'refreshExpireTime' => 'refresh_expire_time',
    ];

    public function validate()
    {
        Model::validatePattern('expireTime', $this->expireTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('refreshExpireTime', $this->refreshExpireTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->openUserId) {
            $res['open_user_id'] = $this->openUserId;
        }
        if (null !== $this->refreshToken) {
            $res['refresh_token'] = $this->refreshToken;
        }
        if (null !== $this->refreshExpireTime) {
            $res['refresh_expire_time'] = $this->refreshExpireTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyOauthTokenResponse
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
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['open_user_id'])) {
            $model->openUserId = $map['open_user_id'];
        }
        if (isset($map['refresh_token'])) {
            $model->refreshToken = $map['refresh_token'];
        }
        if (isset($map['refresh_expire_time'])) {
            $model->refreshExpireTime = $map['refresh_expire_time'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CheckSessionAliveResponse extends Model
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

    // 用户id
    /**
     * @var int
     */
    public $userId;

    // 登录时间
    /**
     * @var string
     */
    public $loginTime;

    // 添加用户类型
    /**
     * @var UserData
     */
    public $userData;

    // did
    /**
     * @var string
     */
    public $did;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'userId'     => 'user_id',
        'loginTime'  => 'login_time',
        'userData'   => 'user_data',
        'did'        => 'did',
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->loginTime) {
            $res['login_time'] = $this->loginTime;
        }
        if (null !== $this->userData) {
            $res['user_data'] = null !== $this->userData ? $this->userData->toMap() : null;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckSessionAliveResponse
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
        if (isset($map['login_time'])) {
            $model->loginTime = $map['login_time'];
        }
        if (isset($map['user_data'])) {
            $model->userData = UserData::fromMap($map['user_data']);
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }

        return $model;
    }
}

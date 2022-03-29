<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class DetailUserResponse extends Model
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

    // auth_url
    /**
     * @var string
     */
    public $authUrl;

    // user
    /**
     * @var MonitorUser
     */
    public $user;

    // nav_head
    /**
     * @var NavContent
     */
    public $navHead;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'authUrl'    => 'auth_url',
        'user'       => 'user',
        'navHead'    => 'nav_head',
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
        if (null !== $this->authUrl) {
            $res['auth_url'] = $this->authUrl;
        }
        if (null !== $this->user) {
            $res['user'] = null !== $this->user ? $this->user->toMap() : null;
        }
        if (null !== $this->navHead) {
            $res['nav_head'] = null !== $this->navHead ? $this->navHead->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailUserResponse
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
        if (isset($map['auth_url'])) {
            $model->authUrl = $map['auth_url'];
        }
        if (isset($map['user'])) {
            $model->user = MonitorUser::fromMap($map['user']);
        }
        if (isset($map['nav_head'])) {
            $model->navHead = NavContent::fromMap($map['nav_head']);
        }

        return $model;
    }
}

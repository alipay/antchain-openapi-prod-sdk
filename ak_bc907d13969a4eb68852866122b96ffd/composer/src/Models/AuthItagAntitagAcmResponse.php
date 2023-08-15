<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class AuthItagAntitagAcmResponse extends Model
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

    // 消息ID
    /**
     * @var string
     */
    public $reqmsgid;

    // 结果码
    /**
     * @var string
     */
    public $resultcode;

    // 结果消息
    /**
     * @var string
     */
    public $resultmsg;

    // 用户ID
    /**
     * @var string
     */
    public $userid;

    // 授权码
    /**
     * @var string
     */
    public $accesstoken;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'reqmsgid'    => 'reqmsgid',
        'resultcode'  => 'resultcode',
        'resultmsg'   => 'resultmsg',
        'userid'      => 'userid',
        'accesstoken' => 'accesstoken',
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
        if (null !== $this->reqmsgid) {
            $res['reqmsgid'] = $this->reqmsgid;
        }
        if (null !== $this->resultcode) {
            $res['resultcode'] = $this->resultcode;
        }
        if (null !== $this->resultmsg) {
            $res['resultmsg'] = $this->resultmsg;
        }
        if (null !== $this->userid) {
            $res['userid'] = $this->userid;
        }
        if (null !== $this->accesstoken) {
            $res['accesstoken'] = $this->accesstoken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthItagAntitagAcmResponse
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
        if (isset($map['reqmsgid'])) {
            $model->reqmsgid = $map['reqmsgid'];
        }
        if (isset($map['resultcode'])) {
            $model->resultcode = $map['resultcode'];
        }
        if (isset($map['resultmsg'])) {
            $model->resultmsg = $map['resultmsg'];
        }
        if (isset($map['userid'])) {
            $model->userid = $map['userid'];
        }
        if (isset($map['accesstoken'])) {
            $model->accesstoken = $map['accesstoken'];
        }

        return $model;
    }
}

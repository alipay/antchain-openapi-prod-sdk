<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class GetStsTokenResponse extends Model
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

    // AK
    /**
     * @var string
     */
    public $accessKeyId;

    // SK
    /**
     * @var string
     */
    public $accessKeySecret;

    // stsToken
    /**
     * @var string
     */
    public $securityToken;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'accessKeyId'     => 'access_key_id',
        'accessKeySecret' => 'access_key_secret',
        'securityToken'   => 'security_token',
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
        if (null !== $this->accessKeyId) {
            $res['access_key_id'] = $this->accessKeyId;
        }
        if (null !== $this->accessKeySecret) {
            $res['access_key_secret'] = $this->accessKeySecret;
        }
        if (null !== $this->securityToken) {
            $res['security_token'] = $this->securityToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetStsTokenResponse
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
        if (isset($map['access_key_id'])) {
            $model->accessKeyId = $map['access_key_id'];
        }
        if (isset($map['access_key_secret'])) {
            $model->accessKeySecret = $map['access_key_secret'];
        }
        if (isset($map['security_token'])) {
            $model->securityToken = $map['security_token'];
        }

        return $model;
    }
}

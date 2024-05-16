<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_55afdde95cc7448bad87a98d904c1f44\Models;

use AlibabaCloud\Tea\Model;

class GetUniversalsaasDigitalhumanNlsTokenResponse extends Model
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

    // appkey
    //
    /**
     * @var string
     */
    public $appKey;

    // token
    /**
     * @var string
     */
    public $appToken;

    // token的有效期时间戳
    /**
     * @var int
     */
    public $expireTime;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'appKey'     => 'app_key',
        'appToken'   => 'app_token',
        'expireTime' => 'expire_time',
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
        if (null !== $this->appKey) {
            $res['app_key'] = $this->appKey;
        }
        if (null !== $this->appToken) {
            $res['app_token'] = $this->appToken;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetUniversalsaasDigitalhumanNlsTokenResponse
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
        if (isset($map['app_key'])) {
            $model->appKey = $map['app_key'];
        }
        if (isset($map['app_token'])) {
            $model->appToken = $map['app_token'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class GetTrackingTokenResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'accesskeyId' => 'accesskey_id',
        'accesskeySecret' => 'accesskey_secret',
        'securityToken' => 'security_token',
        'expiration' => 'expiration',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->accesskeyId) {
            $res['accesskey_id'] = $this->accesskeyId;
        }
        if (null !== $this->accesskeySecret) {
            $res['accesskey_secret'] = $this->accesskeySecret;
        }
        if (null !== $this->securityToken) {
            $res['security_token'] = $this->securityToken;
        }
        if (null !== $this->expiration) {
            $res['expiration'] = $this->expiration;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetTrackingTokenResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['accesskey_id'])){
            $model->accesskeyId = $map['accesskey_id'];
        }
        if(isset($map['accesskey_secret'])){
            $model->accesskeySecret = $map['accesskey_secret'];
        }
        if(isset($map['security_token'])){
            $model->securityToken = $map['security_token'];
        }
        if(isset($map['expiration'])){
            $model->expiration = $map['expiration'];
        }
        return $model;
    }
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

    // 临时ak
    /**
     * @var string
     */
    public $accesskeyId;

    // 临时sk
    /**
     * @var string
     */
    public $accesskeySecret;

    // token
    /**
     * @var string
     */
    public $securityToken;

    // 失效时间
    /**
     * @var string
     */
    public $expiration;

}

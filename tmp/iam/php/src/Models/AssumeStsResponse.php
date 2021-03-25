<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class AssumeStsResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'accessKey' => 'access_key',
        'accessSecret' => 'access_secret',
        'expiredTime' => 'expired_time',
        'securityToken' => 'security_token',
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
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->accessSecret) {
            $res['access_secret'] = $this->accessSecret;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }
        if (null !== $this->securityToken) {
            $res['security_token'] = $this->securityToken;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AssumeStsResponse
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
        if(isset($map['access_key'])){
            $model->accessKey = $map['access_key'];
        }
        if(isset($map['access_secret'])){
            $model->accessSecret = $map['access_secret'];
        }
        if(isset($map['expired_time'])){
            $model->expiredTime = $map['expired_time'];
        }
        if(isset($map['security_token'])){
            $model->securityToken = $map['security_token'];
        }
        return $model;
    }
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

    // 安全令牌accessKey
    /**
     * @var string
     */
    public $accessKey;

    // 安全令牌accessSecret
    /**
     * @var string
     */
    public $accessSecret;

    // 过期时间戳，单位为毫秒
    /**
     * @var int
     */
    public $expiredTime;

    // 安全令牌
    /**
     * @var string
     */
    public $securityToken;

}

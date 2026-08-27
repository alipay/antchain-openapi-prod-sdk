<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ResetInnerMermngcontractwebofficetokenResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'accessToken' => 'access_token',
        'accessTokenExpiredTime' => 'access_token_expired_time',
        'refreshToken' => 'refresh_token',
        'refreshTokenExpiredTime' => 'refresh_token_expired_time',
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
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }
        if (null !== $this->accessTokenExpiredTime) {
            $res['access_token_expired_time'] = $this->accessTokenExpiredTime;
        }
        if (null !== $this->refreshToken) {
            $res['refresh_token'] = $this->refreshToken;
        }
        if (null !== $this->refreshTokenExpiredTime) {
            $res['refresh_token_expired_time'] = $this->refreshTokenExpiredTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResetInnerMermngcontractwebofficetokenResponse
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
        if(isset($map['access_token'])){
            $model->accessToken = $map['access_token'];
        }
        if(isset($map['access_token_expired_time'])){
            $model->accessTokenExpiredTime = $map['access_token_expired_time'];
        }
        if(isset($map['refresh_token'])){
            $model->refreshToken = $map['refresh_token'];
        }
        if(isset($map['refresh_token_expired_time'])){
            $model->refreshTokenExpiredTime = $map['refresh_token_expired_time'];
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

    // 访问token
    /**
     * @var string
     */
    public $accessToken;

    // 访问token过期时间
    /**
     * @var string
     */
    public $accessTokenExpiredTime;

    // 刷新token
    /**
     * @var string
     */
    public $refreshToken;

    // 刷新token过期时间
    /**
     * @var string
     */
    public $refreshTokenExpiredTime;

}

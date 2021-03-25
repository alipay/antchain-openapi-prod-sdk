<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryOauthTokenResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'accessExpiredTime' => 'access_expired_time',
        'accessToken' => 'access_token',
        'customerId' => 'customer_id',
        'refreshExpiredTime' => 'refresh_expired_time',
        'refreshToken' => 'refresh_token',
        'tenant' => 'tenant',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {
        Model::validatePattern('accessExpiredTime', $this->accessExpiredTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('refreshExpiredTime', $this->refreshExpiredTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
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
        if (null !== $this->accessExpiredTime) {
            $res['access_expired_time'] = $this->accessExpiredTime;
        }
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->refreshExpiredTime) {
            $res['refresh_expired_time'] = $this->refreshExpiredTime;
        }
        if (null !== $this->refreshToken) {
            $res['refresh_token'] = $this->refreshToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOauthTokenResponse
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
        if(isset($map['access_expired_time'])){
            $model->accessExpiredTime = $map['access_expired_time'];
        }
        if(isset($map['access_token'])){
            $model->accessToken = $map['access_token'];
        }
        if(isset($map['customer_id'])){
            $model->customerId = $map['customer_id'];
        }
        if(isset($map['refresh_expired_time'])){
            $model->refreshExpiredTime = $map['refresh_expired_time'];
        }
        if(isset($map['refresh_token'])){
            $model->refreshToken = $map['refresh_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
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

    // 过期时间
    /**
     * @var string
     */
    public $accessExpiredTime;

    // access token
    /**
     * @var string
     */
    public $accessToken;

    // 用户 id
    /**
     * @var string
     */
    public $customerId;

    // 过期时间
    /**
     * @var string
     */
    public $refreshExpiredTime;

    // refresh token
    /**
     * @var string
     */
    public $refreshToken;

    // 租户名
    /**
     * @var string
     */
    public $tenant;

    // 租户 ID
    /**
     * @var string
     */
    public $tenantId;

}

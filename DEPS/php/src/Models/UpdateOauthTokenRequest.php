<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateOauthTokenRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'accessExpiredTime' => 'access_expired_time',
        'accessToken' => 'access_token',
        'customerId' => 'customer_id',
        'refreshExpiredTime' => 'refresh_expired_time',
        'refreshToken' => 'refresh_token',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('accessExpiredTime', $this->accessExpiredTime, true);
        Model::validateRequired('accessToken', $this->accessToken, true);
        Model::validateRequired('customerId', $this->customerId, true);
        Model::validateRequired('refreshExpiredTime', $this->refreshExpiredTime, true);
        Model::validateRequired('refreshToken', $this->refreshToken, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validatePattern('accessExpiredTime', $this->accessExpiredTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('refreshExpiredTime', $this->refreshExpiredTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
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
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateOauthTokenRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
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
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

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

    // 用户 ID
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

    // workspace
    /**
     * @var string
     */
    public $workspace;

}

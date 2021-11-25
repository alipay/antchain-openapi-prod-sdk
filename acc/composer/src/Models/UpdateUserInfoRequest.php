<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class UpdateUserInfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 云蚂侧用户id
    //
    /**
     * @var int
     */
    public $userId;

    // 信息同步类型
    //
    /**
     * @var string
     */
    public $operationType;

    // 用户邮箱
    //
    /**
     * @var string
     */
    public $email;

    // 用户手机号码
    //
    /**
     * @var string
     */
    public $telphone;

    // 个人认证状态
    //
    /**
     * @var string
     */
    public $userCertStatus;

    // 个人认证did
    //
    /**
     * @var string
     */
    public $userDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'operationType'     => 'operation_type',
        'email'             => 'email',
        'telphone'          => 'telphone',
        'userCertStatus'    => 'user_cert_status',
        'userDid'           => 'user_did',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('operationType', $this->operationType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->telphone) {
            $res['telphone'] = $this->telphone;
        }
        if (null !== $this->userCertStatus) {
            $res['user_cert_status'] = $this->userCertStatus;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateUserInfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['telphone'])) {
            $model->telphone = $map['telphone'];
        }
        if (isset($map['user_cert_status'])) {
            $model->userCertStatus = $map['user_cert_status'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class CreateOperatorRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 企业唯一标识
    /**
     * @var string
     */
    public $customer;

    // 外部对接系统操作员ID
    /**
     * @var string
     */
    public $externalId;

    // 外部对接系统类型
    /**
     * @var string
     */
    public $externalSystem;

    // 操作员唯一登录名
    /**
     * @var string
     */
    public $loginName;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 操作员昵称
    /**
     * @var string
     */
    public $nickname;

    // 操作员真实姓名
    /**
     * @var string
     */
    public $realName;

    // 租户唯一标识
    /**
     * @var string
     */
    public $tenant;

    // 业务场景码
    /**
     * @var string
     */
    public $bussinessCode;
    protected $_name = [
        'authToken'      => 'auth_token',
        'customer'       => 'customer',
        'externalId'     => 'external_id',
        'externalSystem' => 'external_system',
        'loginName'      => 'login_name',
        'mobile'         => 'mobile',
        'nickname'       => 'nickname',
        'realName'       => 'real_name',
        'tenant'         => 'tenant',
        'bussinessCode'  => 'bussiness_code',
    ];

    public function validate()
    {
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('realName', $this->realName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->customer) {
            $res['customer'] = $this->customer;
        }
        if (null !== $this->externalId) {
            $res['external_id'] = $this->externalId;
        }
        if (null !== $this->externalSystem) {
            $res['external_system'] = $this->externalSystem;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->nickname) {
            $res['nickname'] = $this->nickname;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->bussinessCode) {
            $res['bussiness_code'] = $this->bussinessCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateOperatorRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['customer'])) {
            $model->customer = $map['customer'];
        }
        if (isset($map['external_id'])) {
            $model->externalId = $map['external_id'];
        }
        if (isset($map['external_system'])) {
            $model->externalSystem = $map['external_system'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['nickname'])) {
            $model->nickname = $map['nickname'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['bussiness_code'])) {
            $model->bussinessCode = $map['bussiness_code'];
        }

        return $model;
    }
}

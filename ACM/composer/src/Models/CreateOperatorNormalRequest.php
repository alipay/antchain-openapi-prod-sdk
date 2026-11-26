<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class CreateOperatorNormalRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'loginName' => 'login_name',
        'realName' => 'real_name',
        'mobile' => 'mobile',
    ];
    public function validate() {
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('realName', $this->realName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateOperatorNormalRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        if(isset($map['real_name'])){
            $model->realName = $map['real_name'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户唯一标识
    /**
     * @var string
     */
    public $tenant;

    // 操作员唯一登录名
    /**
     * @var string
     */
    public $loginName;

    // 操作员真实姓名
    /**
     * @var string
     */
    public $realName;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

}

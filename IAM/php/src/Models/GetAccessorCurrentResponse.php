<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetAccessorCurrentResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'id' => 'id',
        'loginName' => 'login_name',
        'name' => 'name',
        'tenant' => 'tenant',
        'type' => 'type',
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetAccessorCurrentResponse
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
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
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

    // 一方化链路为阿里云用户ID，蚂蚁链路为金融云用户ID
    /**
     * @var string
     */
    public $id;

    // 登录名
    /**
     * @var string
     */
    public $loginName;

    // 一方化链路：
    // 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
    // 蚂蚁链路：
    // 用户真实姓名
    // 
    /**
     * @var string
     */
    public $name;

    // 当前AK所属租户
    /**
     * @var string
     */
    public $tenant;

    // 一方化链路：
    // 阿里云用户类型，主账号为CUSTOMER，操作员为SUB，RAM角色为RAM_ROLE
    // 蚂蚁链路：
    // 主账号为MASTER，操作员为OPERATOR，服务账号为SERVICE
    /**
     * @var string
     */
    public $type;

}

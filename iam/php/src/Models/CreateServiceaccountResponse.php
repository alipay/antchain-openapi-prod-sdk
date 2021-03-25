<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class CreateServiceaccountResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'accessKey' => 'access_key',
        'accessSecret' => 'access_secret',
        'alias' => 'alias',
        'description' => 'description',
        'id' => 'id',
        'name' => 'name',
        'tenant' => 'tenant',
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
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateServiceaccountResponse
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
        if(isset($map['alias'])){
            $model->alias = $map['alias'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
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

    // 服务账号AK
    /**
     * @var string
     */
    public $accessKey;

    // 服务账号SK
    /**
     * @var string
     */
    public $accessSecret;

    // 服务账号别名
    /**
     * @var string
     */
    public $alias;

    // 服务账号描述
    /**
     * @var string
     */
    public $description;

    // 服务账号ID
    /**
     * @var string
     */
    public $id;

    // 服务账号名称
    /**
     * @var string
     */
    public $name;

    // 服务账号所属租户
    /**
     * @var string
     */
    public $tenant;

}

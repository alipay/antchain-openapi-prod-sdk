<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class Accessor extends Model {
    protected $_name = [
        'accessKey' => 'access_key',
        'accessSecret' => 'access_secret',
        'account' => 'account',
        'createTime' => 'create_time',
        'id' => 'id',
        'type' => 'type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->accessSecret) {
            $res['access_secret'] = $this->accessSecret;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Accessor
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['access_key'])){
            $model->accessKey = $map['access_key'];
        }
        if(isset($map['access_secret'])){
            $model->accessSecret = $map['access_secret'];
        }
        if(isset($map['account'])){
            $model->account = $map['account'];
        }
        if(isset($map['create_time'])){
            $model->createTime = $map['create_time'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        return $model;
    }
    // Accessor关联的AccessKey
    /**
     * @example LTAIyqaeoWfELqMg
     * @var string
     */
    public $accessKey;

    // Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
    /**
     * @example 
     * @var string
     */
    public $accessSecret;

    // AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
    /**
     * @example 
     * @var string
     */
    public $account;

    // AccessKey创建时间，ISO8601格式
    /**
     * @example 
     * @var string
     */
    public $createTime;

    // Accessor唯一标识
    /**
     * @example 
     * @var string
     */
    public $id;

    // Accessor类型(RAM/ACCOUNT)
    /**
     * @example RAM
     * @var string
     */
    public $type;

}

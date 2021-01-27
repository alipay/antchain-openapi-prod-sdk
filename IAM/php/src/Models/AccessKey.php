<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class AccessKey extends Model {
    protected $_name = [
        'createTime' => 'create_time',
        'id' => 'id',
        'secret' => 'secret',
        'status' => 'status',
        'updateTime' => 'update_time',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->secret) {
            $res['secret'] = $this->secret;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AccessKey
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['create_time'])){
            $model->createTime = $map['create_time'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['secret'])){
            $model->secret = $map['secret'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['update_time'])){
            $model->updateTime = $map['update_time'];
        }
        return $model;
    }
    // AccessKey创建时间，ISO8601格式
    /**
     * @example 
     * @var string
     */
    public $createTime;

    // AccessKey唯一标识
    /**
     * @example LTAIyqaeoWfELqMg
     * @var string
     */
    public $id;

    // AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
    /**
     * @example 
     * @var string
     */
    public $secret;

    // 状态
    /**
     * @example ACTIVE
     * @var string
     */
    public $status;

    // AccessKey最近一次修改时间，ISO8601格式
    /**
     * @example 
     * @var string
     */
    public $updateTime;

}

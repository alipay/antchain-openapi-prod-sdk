<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class AuthGroup extends Model {
    protected $_name = [
        'creationTime' => 'creation_time',
        'id' => 'id',
        'name' => 'name',
        'updateTime' => 'update_time',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AuthGroup
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['update_time'])){
            $model->updateTime = $map['update_time'];
        }
        return $model;
    }
    // 创建时间，ISO8601格式
    /**
     * @example 
     * @var string
     */
    public $creationTime;

    // 授权组ID
    /**
     * @example 
     * @var string
     */
    public $id;

    // 授权组名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // 更新时间，ISO8601格式
    /**
     * @example 
     * @var string
     */
    public $updateTime;

}

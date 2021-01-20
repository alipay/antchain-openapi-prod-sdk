<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Techstack extends Model {
    protected $_name = [
        'description' => 'description',
        'extraInfo' => 'extra_info',
        'id' => 'id',
        'identity' => 'identity',
        'name' => 'name',
        'scope' => 'scope',
        'status' => 'status',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Techstack
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    // 描述信息
    /**
     * @example description
     * @var string
     */
    public $description;

    // extraInfo
    /**
     * @example extraInfo
     * @var string
     */
    public $extraInfo;

    // 技术栈ID
    /**
     * @example id
     * @var string
     */
    public $id;

    // 标识符
    /**
     * @example identity
     * @var string
     */
    public $identity;

    // 名称
    /**
     * @example name
     * @var string
     */
    public $name;

    // 作用域
    /**
     * @example scope
     * @var string
     */
    public $scope;

    // 技术栈状态
    /**
     * @example status
     * @var string
     */
    public $status;

}

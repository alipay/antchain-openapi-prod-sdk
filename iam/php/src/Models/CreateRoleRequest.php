<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class CreateRoleRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'name' => 'name',
        'description' => 'description',
        'actions' => 'actions',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->actions) {
            $res['actions'] = $this->actions;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateRoleRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['actions'])){
            if(!empty($map['actions'])){
                $model->actions = $map['actions'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 权限码列表
    /**
     * @var string[]
     */
    public $actions;

}

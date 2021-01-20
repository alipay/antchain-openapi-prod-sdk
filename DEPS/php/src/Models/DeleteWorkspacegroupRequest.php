<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeleteWorkspacegroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'name' => 'name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteWorkspacegroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组名称(唯一标识)。
    /**
     * @var string
     */
    public $name;

}

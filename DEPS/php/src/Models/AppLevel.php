<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AppLevel extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'ownerLoginName' => 'owner_login_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppLevel
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
        }
        return $model;
    }
    // 应用等级ID
    /**
     * @example 
     * @var string
     */
    public $id;

    // 应用等级名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // 应用等级负责人登录名
    /**
     * @example 
     * @var string
     */
    public $ownerLoginName;

}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class RoleDetailList extends Model {
    protected $_name = [
        'roleNo' => 'role_no',
        'name' => 'name',
        'description' => 'description',
    ];
    public function validate() {
        Model::validateRequired('roleNo', $this->roleNo, true);
        Model::validateRequired('name', $this->name, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->roleNo) {
            $res['role_no'] = $this->roleNo;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RoleDetailList
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['role_no'])){
            $model->roleNo = $map['role_no'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        return $model;
    }
    // 角色编码
    /**
     * @example xxxxxx
     * @var string
     */
    public $roleNo;

    // 角色名称
    /**
     * @example xxxxxx
     * @var string
     */
    public $name;

    // 角色描述
    /**
     * @example xxxxxx
     * @var string
     */
    public $description;

}

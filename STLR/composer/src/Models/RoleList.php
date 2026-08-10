<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class RoleList extends Model {
    protected $_name = [
        'roleNo' => 'role_no',
        'name' => 'name',
        'description' => 'description',
        'permissionList' => 'permission_list',
    ];
    public function validate() {
        Model::validateRequired('roleNo', $this->roleNo, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('permissionList', $this->permissionList, true);
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
        if (null !== $this->permissionList) {
            $res['permission_list'] = $this->permissionList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RoleList
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
        if(isset($map['permission_list'])){
            if(!empty($map['permission_list'])){
                $model->permissionList = $map['permission_list'];
            }
        }
        return $model;
    }
    // 角色编码
    /**
     * @example xxxxx
     * @var string
     */
    public $roleNo;

    // 角色名称
    /**
     * @example xxxxx
     * @var string
     */
    public $name;

    // 角色描述
    /**
     * @example xxxxx
     * @var string
     */
    public $description;

    // 角色权限编码
    /**
     * @example xxxxx
     * @var string[]
     */
    public $permissionList;

}

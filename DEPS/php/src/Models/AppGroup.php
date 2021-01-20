<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppDepend;

class AppGroup extends Model {
    protected $_name = [
        'appScheme' => 'app_scheme',
        'description' => 'description',
        'id' => 'id',
        'name' => 'name',
        'ownerLoginName' => 'owner_login_name',
        'parentId' => 'parent_id',
        'layer' => 'layer',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->appScheme) {
            $res['app_scheme'] = [];
            if(null !== $this->appScheme && is_array($this->appScheme)){
                $n = 0;
                foreach($this->appScheme as $item){
                    $res['app_scheme'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->layer) {
            $res['layer'] = $this->layer;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppGroup
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_scheme'])){
            if(!empty($map['app_scheme'])){
                $model->appScheme = [];
                $n = 0;
                foreach($map['app_scheme'] as $item) {
                    $model->appScheme[$n++] = null !== $item ? AppDepend::fromMap($item) : $item;
                }
            }
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
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
        }
        if(isset($map['parent_id'])){
            $model->parentId = $map['parent_id'];
        }
        if(isset($map['layer'])){
            $model->layer = $map['layer'];
        }
        return $model;
    }
    // 应用依赖规划
    /**
     * @example 
     * @var AppDepend[]
     */
    public $appScheme;

    // 应用分组描述
    /**
     * @example 我是一个应用分组
     * @var string
     */
    public $description;

    // 应用分组ID
    /**
     * @example 
     * @var string
     */
    public $id;

    // 应用分组名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // 应用分组负责人登录名
    /**
     * @example 
     * @var string
     */
    public $ownerLoginName;

    // 父应用分组ID
    /**
     * @example 
     * @var string
     */
    public $parentId;

    // 应用分组层级，从1开始，1代表一级分组，2代表二级分组
    /**
     * @example 
     * @var int
     */
    public $layer;

}

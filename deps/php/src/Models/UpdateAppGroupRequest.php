<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppDepend;

class UpdateAppGroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appScheme' => 'app_scheme',
        'description' => 'description',
        'name' => 'name',
        'parentId' => 'parent_id',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateAppGroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
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
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['parent_id'])){
            $model->parentId = $map['parent_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 应用依赖拓扑图
    /**
     * @var AppDepend[]
     */
    public $appScheme;

    // 应用分组描述
    /**
     * @var string
     */
    public $description;

    // 应用分组名称，支持中文
    /**
     * @var string
     */
    public $name;

    // 父应用分组 id
    /**
     * @var string
     */
    public $parentId;

}

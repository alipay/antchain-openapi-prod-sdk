<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppDepend;

class CreateAppGroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appScheme' => 'app_scheme',
        'description' => 'description',
        'name' => 'name',
        'ownerLoginName' => 'owner_login_name',
        'parentId' => 'parent_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
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
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateAppGroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
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
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
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

    // 应用依赖规划
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

    // 应用分组负责人登录名
    /**
     * @var string
     */
    public $ownerLoginName;

    // 父应用分组 id
    /**
     * @var string
     */
    public $parentId;

}

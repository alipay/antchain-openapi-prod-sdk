<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Tag;

class CreateAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appgroupName' => 'appgroup_name',
        'description' => 'description',
        'displayName' => 'display_name',
        'name' => 'name',
        'ownerLoginName' => 'owner_login_name',
        'stackId' => 'stack_id',
        'tags' => 'tags',
        'buildpackVersion' => 'buildpack_version',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appgroupName) {
            $res['appgroup_name'] = $this->appgroupName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->tags) {
            $res['tags'] = [];
            if(null !== $this->tags && is_array($this->tags)){
                $n = 0;
                foreach($this->tags as $item){
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['appgroup_name'])){
            $model->appgroupName = $map['appgroup_name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
        }
        if(isset($map['stack_id'])){
            $model->stackId = $map['stack_id'];
        }
        if(isset($map['tags'])){
            if(!empty($map['tags'])){
                $model->tags = [];
                $n = 0;
                foreach($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? Tag::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['buildpack_version'])){
            $model->buildpackVersion = $map['buildpack_version'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 应用所属分组，至于应用所属分组的级别需要后端根据分组名称计算出来
    /**
     * @var string
     */
    public $appgroupName;

    // 应用描述
    /**
     * @var string
     */
    public $description;

    // 显示名称
    /**
     * @var string
     */
    public $displayName;

    // 应用名称
    /**
     * @var string
     */
    public $name;

    // 用户登录名
    /**
     * @var string
     */
    public $ownerLoginName;

    // 技术栈 id
    /**
     * @var string
     */
    public $stackId;

    // 应用额外信息（应用标签）
    /**
     * @var Tag[]
     */
    public $tags;

    // 技术栈版本
    /**
     * @var string
     */
    public $buildpackVersion;

}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Tag;

class App extends Model {
    protected $_name = [
        'appGroupId' => 'app_group_id',
        'appGroupName' => 'app_group_name',
        'buildpackName' => 'buildpack_name',
        'buildpackVersion' => 'buildpack_version',
        'createdTime' => 'created_time',
        'defaultRoute' => 'default_route',
        'deployType' => 'deploy_type',
        'description' => 'description',
        'displayName' => 'display_name',
        'globalName' => 'global_name',
        'id' => 'id',
        'name' => 'name',
        'ownerDisplayName' => 'owner_display_name',
        'ownerLoginName' => 'owner_login_name',
        'stackId' => 'stack_id',
        'status' => 'status',
        'tags' => 'tags',
        'ownerId' => 'owner_id',
    ];
    public function validate() {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->appGroupId) {
            $res['app_group_id'] = $this->appGroupId;
        }
        if (null !== $this->appGroupName) {
            $res['app_group_name'] = $this->appGroupName;
        }
        if (null !== $this->buildpackName) {
            $res['buildpack_name'] = $this->buildpackName;
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->defaultRoute) {
            $res['default_route'] = $this->defaultRoute;
        }
        if (null !== $this->deployType) {
            $res['deploy_type'] = $this->deployType;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->globalName) {
            $res['global_name'] = $this->globalName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ownerDisplayName) {
            $res['owner_display_name'] = $this->ownerDisplayName;
        }
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
        if (null !== $this->ownerId) {
            $res['owner_id'] = $this->ownerId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return App
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_group_id'])){
            $model->appGroupId = $map['app_group_id'];
        }
        if(isset($map['app_group_name'])){
            $model->appGroupName = $map['app_group_name'];
        }
        if(isset($map['buildpack_name'])){
            $model->buildpackName = $map['buildpack_name'];
        }
        if(isset($map['buildpack_version'])){
            $model->buildpackVersion = $map['buildpack_version'];
        }
        if(isset($map['created_time'])){
            $model->createdTime = $map['created_time'];
        }
        if(isset($map['default_route'])){
            $model->defaultRoute = $map['default_route'];
        }
        if(isset($map['deploy_type'])){
            $model->deployType = $map['deploy_type'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['global_name'])){
            $model->globalName = $map['global_name'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['owner_display_name'])){
            $model->ownerDisplayName = $map['owner_display_name'];
        }
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
        }
        if(isset($map['stack_id'])){
            $model->stackId = $map['stack_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
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
        if(isset($map['owner_id'])){
            $model->ownerId = $map['owner_id'];
        }
        return $model;
    }
    // 应用所属分组 id
    /**
     * @example 00000000001
     * @var string
     */
    public $appGroupId;

    // 应用分组名称
    /**
     * @example 默认分组
     * @var string
     */
    public $appGroupName;

    // 技术栈名称
    /**
     * @example Spring Boot
     * @var string
     */
    public $buildpackName;

    // 技术栈版本
    /**
     * @example v1.0
     * @var string
     */
    public $buildpackVersion;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $createdTime;

    // 允许访问公网
    /**
     * @example true, false
     * @var bool
     */
    public $defaultRoute;

    // 应用发布模式，发布包，发布镜像，混合发布。
    // 默认为空 - 表示包发布模式
    /**
     * @example mixed,image,package
     * @var string
     */
    public $deployType;

    // 应用描述
    /**
     * @example description
     * @var string
     */
    public $description;

    // 显示名称
    /**
     * @example 应用容器服务
     * @var string
     */
    public $displayName;

    // 域内应用全局唯一名称
    /**
     * @example globalappname
     * @var string
     */
    public $globalName;

    // 应用 id
    /**
     * @example 001040301
     * @var string
     */
    public $id;

    // 应用名称
    /**
     * @example aks
     * @var string
     */
    public $name;

    // 应用负责人显示名称
    /**
     * @example 乐乐
     * @var string
     */
    public $ownerDisplayName;

    // 应用负责人登录名称
    /**
     * @example alipayAdmin@alipay.net
     * @var string
     */
    public $ownerLoginName;

    // 技术栈id
    /**
     * @example 12305
     * @var string
     */
    public $stackId;

    // 应用状态
    /**
     * @example status
     * @var string
     */
    public $status;

    // 应用额外信息（应用标签）
    /**
     * @example 
     * @var Tag[]
     */
    public $tags;

    // 应用负责人id
    /**
     * @example 100001
     * @var string
     */
    public $ownerId;

}

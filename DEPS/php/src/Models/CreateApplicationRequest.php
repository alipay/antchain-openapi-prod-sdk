<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateApplicationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'alias' => 'alias',
        'applicationName' => 'application_name',
        'buildpackArch' => 'buildpack_arch',
        'buildpackName' => 'buildpack_name',
        'buildpackVersion' => 'buildpack_version',
        'description' => 'description',
        'ownerLoginName' => 'owner_login_name',
        'deployType' => 'deploy_type',
        'defaultRoute' => 'default_route',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->buildpackArch) {
            $res['buildpack_arch'] = $this->buildpackArch;
        }
        if (null !== $this->buildpackName) {
            $res['buildpack_name'] = $this->buildpackName;
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->deployType) {
            $res['deploy_type'] = $this->deployType;
        }
        if (null !== $this->defaultRoute) {
            $res['default_route'] = $this->defaultRoute;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateApplicationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['alias'])){
            $model->alias = $map['alias'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['buildpack_arch'])){
            $model->buildpackArch = $map['buildpack_arch'];
        }
        if(isset($map['buildpack_name'])){
            $model->buildpackName = $map['buildpack_name'];
        }
        if(isset($map['buildpack_version'])){
            $model->buildpackVersion = $map['buildpack_version'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
        }
        if(isset($map['deploy_type'])){
            $model->deployType = $map['deploy_type'];
        }
        if(isset($map['default_route'])){
            $model->defaultRoute = $map['default_route'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 应用别称。最大60个UTF-8字符
    /**
     * @var string
     */
    public $alias;

    // 创建的应用名称。最大60个UTF-8字符
    /**
     * @var string
     */
    public $applicationName;

    // 技术栈架构版本，默认使用BUILDPACK_V1，取值列表：BUILDPACK_V1、BUILDPACK_V2
    /**
     * @var string
     */
    public $buildpackArch;

    // 应用使用的技术栈名称
    /**
     * @var string
     */
    public $buildpackName;

    // 应用使用的技术栈版本
    /**
     * @var string
     */
    public $buildpackVersion;

    // 应用描述。最大200个UTF-8字符
    /**
     * @var string
     */
    public $description;

    // 应用负责人登录名
    /**
     * @var string
     */
    public $ownerLoginName;

    // 应用发布类型，默认不填入表示包发布，支持 mixed,image,workload
    /**
     * @var string
     */
    public $deployType;

    // 是否允许公网访问
    /**
     * @var bool
     */
    public $defaultRoute;

}

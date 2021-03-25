<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateApplicationServiceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'applicationName' => 'application_name',
        'buildpackVersion' => 'buildpack_version',
        'cellIds' => 'cell_ids',
        'description' => 'description',
        'ownerLoginName' => 'owner_login_name',
        'serviceName' => 'service_name',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('applicationName', $this->applicationName, true);
        Model::validateRequired('buildpackVersion', $this->buildpackVersion, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }
        if (null !== $this->cellIds) {
            $res['cell_ids'] = $this->cellIds;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateApplicationServiceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['buildpack_version'])){
            $model->buildpackVersion = $map['buildpack_version'];
        }
        if(isset($map['cell_ids'])){
            if(!empty($map['cell_ids'])){
                $model->cellIds = $map['cell_ids'];
            }
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
        }
        if(isset($map['service_name'])){
            $model->serviceName = $map['service_name'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
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

    // 应用名称
    /**
     * @var string
     */
    public $applicationName;

    // 应用使用的技术栈版本
    /**
     * @var string
     */
    public $buildpackVersion;

    // 部署单元paas id列表
    /**
     * @var string[]
     */
    public $cellIds;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 负责人登录名
    /**
     * @var string
     */
    public $ownerLoginName;

    // 应用服务实例名称
    /**
     * @var string
     */
    public $serviceName;

    /**
     * @var string
     */
    public $workspace;

}

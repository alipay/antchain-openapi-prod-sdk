<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeleteApplicationServiceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'applicationName' => 'application_name',
        'serviceName' => 'service_name',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('applicationName', $this->applicationName, true);
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
     * @return DeleteApplicationServiceRequest
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

    // 待删除的服务实例的应用名称
    /**
     * @var string
     */
    public $applicationName;

    // 待删除服务实例名称
    /**
     * @var string
     */
    public $serviceName;

    // 待删除服务实例所在环境名称
    /**
     * @var string
     */
    public $workspace;

}

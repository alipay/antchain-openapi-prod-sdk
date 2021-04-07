<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateSlsConfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 日志配置详情
    /**
     * @var SLSConfig
     */
    public $config;

    // 日志项目名称
    /**
     * @var string
     */
    public $projectName;

    // 区域id
    /**
     * @var string
     */
    public $slsRegionId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'config'      => 'config',
        'projectName' => 'project_name',
        'slsRegionId' => 'sls_region_id',
        'tenantId'    => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('config', $this->config, true);
        Model::validateRequired('projectName', $this->projectName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->config) {
            $res['config'] = null !== $this->config ? $this->config->toMap() : null;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->slsRegionId) {
            $res['sls_region_id'] = $this->slsRegionId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSlsConfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['config'])) {
            $model->config = SLSConfig::fromMap($map['config']);
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['sls_region_id'])) {
            $model->slsRegionId = $map['sls_region_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListSlsLogstoreRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 用于请求的 Logstore 名称（支持部分匹配）。
    /**
     * @var string
     */
    public $logstoreName;

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
        'authToken'    => 'auth_token',
        'logstoreName' => 'logstore_name',
        'projectName'  => 'project_name',
        'slsRegionId'  => 'sls_region_id',
        'tenantId'     => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('projectName', $this->projectName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->logstoreName) {
            $res['logstore_name'] = $this->logstoreName;
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
     * @return ListSlsLogstoreRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['logstore_name'])) {
            $model->logstoreName = $map['logstore_name'];
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

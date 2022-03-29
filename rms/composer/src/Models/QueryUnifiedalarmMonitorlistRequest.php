<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmMonitorlistRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户名称
    /**
     * @var int
     */
    public $tenantId;

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 查询哪个技术栈下的告警指标。
    /**
     * @var int
     */
    public $stackId;
    protected $_name = [
        'authToken' => 'auth_token',
        'tenantId'  => 'tenant_id',
        'appName'   => 'app_name',
        'stackId'   => 'stack_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('stackId', $this->stackId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmMonitorlistRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['stack_id'])) {
            $model->stackId = $map['stack_id'];
        }

        return $model;
    }
}

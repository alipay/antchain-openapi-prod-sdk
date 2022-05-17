<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class GetAppportraitMonthusabilityRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间名称Id
    /**
     * @var string
     */
    public $workspaceId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 租户名称
    /**
     * @var string
     */
    public $tenantName;

    // app_id
    /**
     * @var string
     */
    public $appId;

    // 查询的月份
    /**
     * @var int
     */
    public $month;
    protected $_name = [
        'authToken'   => 'auth_token',
        'workspaceId' => 'workspace_id',
        'tenantId'    => 'tenant_id',
        'tenantName'  => 'tenant_name',
        'appId'       => 'app_id',
        'month'       => 'month',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('month', $this->month, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->month) {
            $res['month'] = $this->month;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAppportraitMonthusabilityRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['month'])) {
            $model->month = $map['month'];
        }

        return $model;
    }
}

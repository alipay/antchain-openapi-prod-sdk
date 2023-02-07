<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryAppportraitUsabilitytrendRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;

    // tenant_name
    /**
     * @var string
     */
    public $tenantName;

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // 查询开始时间utc毫秒
    /**
     * @var int
     */
    public $startTimestamp;

    // 查询结束时间utc毫秒
    /**
     * @var int
     */
    public $endTimestamp;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceName'  => 'workspace_name',
        'tenantName'     => 'tenant_name',
        'tenantId'       => 'tenant_id',
        'appName'        => 'app_name',
        'startTimestamp' => 'start_timestamp',
        'endTimestamp'   => 'end_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('startTimestamp', $this->startTimestamp, true);
        Model::validateRequired('endTimestamp', $this->endTimestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->startTimestamp) {
            $res['start_timestamp'] = $this->startTimestamp;
        }
        if (null !== $this->endTimestamp) {
            $res['end_timestamp'] = $this->endTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppportraitUsabilitytrendRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['start_timestamp'])) {
            $model->startTimestamp = $map['start_timestamp'];
        }
        if (isset($map['end_timestamp'])) {
            $model->endTimestamp = $map['end_timestamp'];
        }

        return $model;
    }
}

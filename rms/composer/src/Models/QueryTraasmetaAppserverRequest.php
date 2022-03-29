<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraasmetaAppserverRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // uuid
    /**
     * @var string
     */
    public $uuid;

    // hostname
    /**
     * @var string
     */
    public $hostname;

    // 是否是模糊搜索，默认为false
    /**
     * @var bool
     */
    public $search;

    // tenant_uuid
    /**
     * @var string
     */
    public $tenantUuid;

    // tenant_name
    /**
     * @var string
     */
    public $tenantName;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // ip
    /**
     * @var string
     */
    public $ip;
    protected $_name = [
        'authToken'     => 'auth_token',
        'uuid'          => 'uuid',
        'hostname'      => 'hostname',
        'search'        => 'search',
        'tenantUuid'    => 'tenant_uuid',
        'tenantName'    => 'tenant_name',
        'workspaceName' => 'workspace_name',
        'appName'       => 'app_name',
        'ip'            => 'ip',
    ];

    public function validate()
    {
        Model::validateRequired('search', $this->search, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->search) {
            $res['search'] = $this->search;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraasmetaAppserverRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['hostname'])) {
            $model->hostname = $map['hostname'];
        }
        if (isset($map['search'])) {
            $model->search = $map['search'];
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }

        return $model;
    }
}

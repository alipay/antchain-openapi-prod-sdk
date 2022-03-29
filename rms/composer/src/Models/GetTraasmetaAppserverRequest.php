<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetTraasmetaAppserverRequest extends Model
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

    // ip
    /**
     * @var string
     */
    public $ip;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'uuid'          => 'uuid',
        'tenantUuid'    => 'tenant_uuid',
        'tenantName'    => 'tenant_name',
        'ip'            => 'ip',
        'appName'       => 'app_name',
        'workspaceName' => 'workspace_name',
    ];

    public function validate()
    {
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
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetTraasmetaAppserverRequest
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
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}

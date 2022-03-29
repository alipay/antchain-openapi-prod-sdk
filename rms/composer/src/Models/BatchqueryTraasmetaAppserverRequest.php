<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryTraasmetaAppserverRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // uuids
    /**
     * @var string[]
     */
    public $uuids;

    // hostnames
    /**
     * @var string[]
     */
    public $hostnames;

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

    // ips
    /**
     * @var string[]
     */
    public $ips;

    // app_names
    /**
     * @var string[]
     */
    public $appNames;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'uuids'         => 'uuids',
        'hostnames'     => 'hostnames',
        'tenantUuid'    => 'tenant_uuid',
        'tenantName'    => 'tenant_name',
        'ips'           => 'ips',
        'appNames'      => 'app_names',
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
        if (null !== $this->uuids) {
            $res['uuids'] = $this->uuids;
        }
        if (null !== $this->hostnames) {
            $res['hostnames'] = $this->hostnames;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->ips) {
            $res['ips'] = $this->ips;
        }
        if (null !== $this->appNames) {
            $res['app_names'] = $this->appNames;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryTraasmetaAppserverRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['uuids'])) {
            if (!empty($map['uuids'])) {
                $model->uuids = $map['uuids'];
            }
        }
        if (isset($map['hostnames'])) {
            if (!empty($map['hostnames'])) {
                $model->hostnames = $map['hostnames'];
            }
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['ips'])) {
            if (!empty($map['ips'])) {
                $model->ips = $map['ips'];
            }
        }
        if (isset($map['app_names'])) {
            if (!empty($map['app_names'])) {
                $model->appNames = $map['app_names'];
            }
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}

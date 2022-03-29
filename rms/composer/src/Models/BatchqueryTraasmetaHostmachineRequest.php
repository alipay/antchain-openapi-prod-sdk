<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryTraasmetaHostmachineRequest extends Model
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

    // ips
    /**
     * @var string[]
     */
    public $ips;

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

    // workspace_uuid
    /**
     * @var string
     */
    public $workspaceUuid;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'uuids'         => 'uuids',
        'ips'           => 'ips',
        'tenantUuid'    => 'tenant_uuid',
        'tenantName'    => 'tenant_name',
        'workspaceUuid' => 'workspace_uuid',
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
        if (null !== $this->ips) {
            $res['ips'] = $this->ips;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->workspaceUuid) {
            $res['workspace_uuid'] = $this->workspaceUuid;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryTraasmetaHostmachineRequest
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
        if (isset($map['ips'])) {
            if (!empty($map['ips'])) {
                $model->ips = $map['ips'];
            }
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['workspace_uuid'])) {
            $model->workspaceUuid = $map['workspace_uuid'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryTraasmetaWorkspaceRequest extends Model
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

    // names
    /**
     * @var string[]
     */
    public $names;

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
    protected $_name = [
        'authToken'  => 'auth_token',
        'uuids'      => 'uuids',
        'names'      => 'names',
        'tenantUuid' => 'tenant_uuid',
        'tenantName' => 'tenant_name',
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
        if (null !== $this->names) {
            $res['names'] = $this->names;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryTraasmetaWorkspaceRequest
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
        if (isset($map['names'])) {
            if (!empty($map['names'])) {
                $model->names = $map['names'];
            }
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }

        return $model;
    }
}

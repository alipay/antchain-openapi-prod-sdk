<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryServiceSlbmountprogressRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // process_id
    /**
     * @var string
     */
    public $processId;

    // region_identity
    /**
     * @var string
     */
    public $regionIdentity;

    // service_id
    /**
     * @var string
     */
    public $serviceId;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'      => 'auth_token',
        'tenant'         => 'tenant',
        'processId'      => 'process_id',
        'regionIdentity' => 'region_identity',
        'serviceId'      => 'service_id',
        'workspace'      => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('processId', $this->processId, true);
        Model::validateRequired('regionIdentity', $this->regionIdentity, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->regionIdentity) {
            $res['region_identity'] = $this->regionIdentity;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryServiceSlbmountprogressRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['region_identity'])) {
            $model->regionIdentity = $map['region_identity'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}

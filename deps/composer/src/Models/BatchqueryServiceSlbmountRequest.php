<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryServiceSlbmountRequest extends Model
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

    // service_id
    /**
     * @var string
     */
    public $serviceId;

    // slb_ids
    /**
     * @var string[]
     */
    public $slbIds;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant'    => 'tenant',
        'serviceId' => 'service_id',
        'slbIds'    => 'slb_ids',
        'workspace' => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('slbIds', $this->slbIds, true);
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
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->slbIds) {
            $res['slb_ids'] = $this->slbIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryServiceSlbmountRequest
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
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['slb_ids'])) {
            if (!empty($map['slb_ids'])) {
                $model->slbIds = $map['slb_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}

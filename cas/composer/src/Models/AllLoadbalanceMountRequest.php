<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AllLoadbalanceMountRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // loadbalance_id
    /**
     * @var string
     */
    public $loadbalanceId;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'     => 'auth_token',
        'loadbalanceId' => 'loadbalance_id',
        'workspace'     => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('loadbalanceId', $this->loadbalanceId, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->loadbalanceId) {
            $res['loadbalance_id'] = $this->loadbalanceId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllLoadbalanceMountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['loadbalance_id'])) {
            $model->loadbalanceId = $map['loadbalance_id'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}

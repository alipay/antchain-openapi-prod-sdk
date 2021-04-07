<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryVpcVroutertableRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // vpc id
    /**
     * @var string
     */
    public $vpcId;

    // 路由器id
    /**
     * @var string
     */
    public $vRouterId;

    // workspace name
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken' => 'auth_token',
        'vpcId'     => 'vpc_id',
        'vRouterId' => 'v_router_id',
        'workspace' => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('vpcId', $this->vpcId, true);
        Model::validateRequired('vRouterId', $this->vRouterId, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->vRouterId) {
            $res['v_router_id'] = $this->vRouterId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryVpcVroutertableRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['v_router_id'])) {
            $model->vRouterId = $map['v_router_id'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}

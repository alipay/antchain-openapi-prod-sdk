<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteResourceVpcRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 要删除的VPC所在的地域identity
    /**
     * @var string
     */
    public $region;

    // 要删除的VPC ID
    /**
     * @var string
     */
    public $vpcId;

    // workspace id
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken' => 'auth_token',
        'region'    => 'region',
        'vpcId'     => 'vpc_id',
        'workspace' => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('vpcId', $this->vpcId, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteResourceVpcRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}

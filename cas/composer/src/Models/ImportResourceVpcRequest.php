<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ImportResourceVpcRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // region identity
    /**
     * @var string
     */
    public $region;

    // vpc iaas id
    /**
     * @var string
     */
    public $vpcId;

    // workspace identity
    /**
     * @var string
     */
    public $workspace;

    // vrouter id
    /**
     * @var string
     */
    public $vrouterId;

    // vpc name
    /**
     * @var string
     */
    public $vpcName;

    // cidr block
    /**
     * @var string
     */
    public $cidrBlock;
    protected $_name = [
        'authToken' => 'auth_token',
        'region'    => 'region',
        'vpcId'     => 'vpc_id',
        'workspace' => 'workspace',
        'vrouterId' => 'vrouter_id',
        'vpcName'   => 'vpc_name',
        'cidrBlock' => 'cidr_block',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('vpcId', $this->vpcId, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('vrouterId', $this->vrouterId, true);
        Model::validateRequired('vpcName', $this->vpcName, true);
        Model::validateRequired('cidrBlock', $this->cidrBlock, true);
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
        if (null !== $this->vrouterId) {
            $res['vrouter_id'] = $this->vrouterId;
        }
        if (null !== $this->vpcName) {
            $res['vpc_name'] = $this->vpcName;
        }
        if (null !== $this->cidrBlock) {
            $res['cidr_block'] = $this->cidrBlock;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportResourceVpcRequest
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
        if (isset($map['vrouter_id'])) {
            $model->vrouterId = $map['vrouter_id'];
        }
        if (isset($map['vpc_name'])) {
            $model->vpcName = $map['vpc_name'];
        }
        if (isset($map['cidr_block'])) {
            $model->cidrBlock = $map['cidr_block'];
        }

        return $model;
    }
}

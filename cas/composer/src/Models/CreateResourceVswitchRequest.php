<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateResourceVswitchRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 交换机的网段。交换机网段要求如下：
    //
    // 交换机的网段的掩码长度范围为16~29位。
    // 交换机的网段必须从属于所在VPC的网段。
    // 交换机的网段不能与所在VPC中路由条目的目标网段相同，但可以是目标网段的子集。
    /**
     * @var string
     */
    public $cidrBlock;

    // 描述信息
    /**
     * @var string
     */
    public $description;

    // 交换机的名称。
    //
    // 名称长度为2~128个字符，必须以字母或中文开头，但不能以http://或https://开头。
    /**
     * @var string
     */
    public $name;

    // 要创建的交换机的地域 identity
    /**
     * @var string
     */
    public $region;

    // 要创建的交换机所属的VPC ID。
    /**
     * @var string
     */
    public $vpcId;

    // workspace name
    /**
     * @var string
     */
    public $workspace;

    // 要创建的交换机所属的可用区 identity
    /**
     * @var string
     */
    public $zone;
    protected $_name = [
        'authToken'   => 'auth_token',
        'cidrBlock'   => 'cidr_block',
        'description' => 'description',
        'name'        => 'name',
        'region'      => 'region',
        'vpcId'       => 'vpc_id',
        'workspace'   => 'workspace',
        'zone'        => 'zone',
    ];

    public function validate()
    {
        Model::validateRequired('cidrBlock', $this->cidrBlock, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('vpcId', $this->vpcId, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('zone', $this->zone, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cidrBlock) {
            $res['cidr_block'] = $this->cidrBlock;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
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
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateResourceVswitchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cidr_block'])) {
            $model->cidrBlock = $map['cidr_block'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
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
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }

        return $model;
    }
}

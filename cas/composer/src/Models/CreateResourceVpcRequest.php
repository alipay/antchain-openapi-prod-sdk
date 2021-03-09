<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateResourceVpcRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // VPC的网段。您可以使用以下网段或其子集作为VPC的网段：
    //
    // 172.16.0.0/12（默认值）。
    // 10.0.0.0/8。
    // 192.168.0.0/16。
    /**
     * @var string
     */
    public $cidrBlock;

    // 描述信息
    /**
     * @var string
     */
    public $description;

    // VPC的名称
    /**
     * @var string
     */
    public $name;

    // VPC所在的地域
    /**
     * @var string
     */
    public $region;

    // 用户侧网络的网段
    /**
     * @var string
     */
    public $userCidr;

    // 所属工作空间 identity
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'   => 'auth_token',
        'cidrBlock'   => 'cidr_block',
        'description' => 'description',
        'name'        => 'name',
        'region'      => 'region',
        'userCidr'    => 'user_cidr',
        'workspace'   => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('workspace', $this->workspace, true);
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
        if (null !== $this->userCidr) {
            $res['user_cidr'] = $this->userCidr;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateResourceVpcRequest
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
        if (isset($map['user_cidr'])) {
            $model->userCidr = $map['user_cidr'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}

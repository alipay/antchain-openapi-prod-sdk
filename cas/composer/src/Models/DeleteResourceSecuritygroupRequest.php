<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteResourceSecuritygroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 地域identity
    /**
     * @var string
     */
    public $region;

    // 安全组ID。
    /**
     * @var string
     */
    public $securityGroupId;

    // 要删除的安全组所处专有网络的ID
    /**
     * @var string
     */
    public $vpcId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'region'          => 'region',
        'securityGroupId' => 'security_group_id',
        'vpcId'           => 'vpc_id',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('securityGroupId', $this->securityGroupId, true);
        Model::validateRequired('vpcId', $this->vpcId, true);
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
        if (null !== $this->securityGroupId) {
            $res['security_group_id'] = $this->securityGroupId;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteResourceSecuritygroupRequest
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
        if (isset($map['security_group_id'])) {
            $model->securityGroupId = $map['security_group_id'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }

        return $model;
    }
}

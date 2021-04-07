<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QuerySecuritygroupPermissionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // securityGroupId
    /**
     * @var string
     */
    public $securityGroupId;

    // autoRefresh
    /**
     * @var bool
     */
    public $autoRefresh;

    // nicType
    /**
     * @var string
     */
    public $nicType;

    // direction
    /**
     * @var string
     */
    public $direction;
    protected $_name = [
        'authToken'       => 'auth_token',
        'securityGroupId' => 'security_group_id',
        'autoRefresh'     => 'auto_refresh',
        'nicType'         => 'nic_type',
        'direction'       => 'direction',
    ];

    public function validate()
    {
        Model::validateRequired('securityGroupId', $this->securityGroupId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->securityGroupId) {
            $res['security_group_id'] = $this->securityGroupId;
        }
        if (null !== $this->autoRefresh) {
            $res['auto_refresh'] = $this->autoRefresh;
        }
        if (null !== $this->nicType) {
            $res['nic_type'] = $this->nicType;
        }
        if (null !== $this->direction) {
            $res['direction'] = $this->direction;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySecuritygroupPermissionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['security_group_id'])) {
            $model->securityGroupId = $map['security_group_id'];
        }
        if (isset($map['auto_refresh'])) {
            $model->autoRefresh = $map['auto_refresh'];
        }
        if (isset($map['nic_type'])) {
            $model->nicType = $map['nic_type'];
        }
        if (isset($map['direction'])) {
            $model->direction = $map['direction'];
        }

        return $model;
    }
}

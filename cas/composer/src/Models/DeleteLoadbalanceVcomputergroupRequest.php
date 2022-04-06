<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteLoadbalanceVcomputergroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 虚拟服务器ID，PAAS ID非IAAS ID
    /**
     * @var string
     */
    public $vComputerGroupId;
    protected $_name = [
        'authToken'        => 'auth_token',
        'vComputerGroupId' => 'v_computer_group_id',
    ];

    public function validate()
    {
        Model::validateRequired('vComputerGroupId', $this->vComputerGroupId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->vComputerGroupId) {
            $res['v_computer_group_id'] = $this->vComputerGroupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteLoadbalanceVcomputergroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['v_computer_group_id'])) {
            $model->vComputerGroupId = $map['v_computer_group_id'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryLoadbalanceVcomputergroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // load_balance_ids
    /**
     * @var string[]
     */
    public $loadBalanceIds;

    // name
    /**
     * @var string
     */
    public $name;

    // statuses
    /**
     * @var string[]
     */
    public $statuses;

    // workspace
    /**
     * @var string
     */
    public $workspace;

    // v_computer_group_ids
    /**
     * @var string[]
     */
    public $vComputerGroupIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'loadBalanceIds'    => 'load_balance_ids',
        'name'              => 'name',
        'statuses'          => 'statuses',
        'workspace'         => 'workspace',
        'vComputerGroupIds' => 'v_computer_group_ids',
    ];

    public function validate()
    {
        Model::validateRequired('loadBalanceIds', $this->loadBalanceIds, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->loadBalanceIds) {
            $res['load_balance_ids'] = $this->loadBalanceIds;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->vComputerGroupIds) {
            $res['v_computer_group_ids'] = $this->vComputerGroupIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLoadbalanceVcomputergroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['load_balance_ids'])) {
            if (!empty($map['load_balance_ids'])) {
                $model->loadBalanceIds = $map['load_balance_ids'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['statuses'])) {
            if (!empty($map['statuses'])) {
                $model->statuses = $map['statuses'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['v_computer_group_ids'])) {
            if (!empty($map['v_computer_group_ids'])) {
                $model->vComputerGroupIds = $map['v_computer_group_ids'];
            }
        }

        return $model;
    }
}

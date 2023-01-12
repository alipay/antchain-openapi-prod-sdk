<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateSingleworkspaceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // workspace 显示名称
    /**
     * @var string
     */
    public $displayName;

    // 可用区id列表
    /**
     * @var string[]
     */
    public $zones;

    // zone_ids
    /**
     * @var string[]
     */
    public $zoneIds;

    // labels
    /**
     * @var string
     */
    public $labels;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'tenant'      => 'tenant',
        'displayName' => 'display_name',
        'zones'       => 'zones',
        'zoneIds'     => 'zone_ids',
        'labels'      => 'labels',
        'workspaceId' => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->zones) {
            $res['zones'] = $this->zones;
        }
        if (null !== $this->zoneIds) {
            $res['zone_ids'] = $this->zoneIds;
        }
        if (null !== $this->labels) {
            $res['labels'] = $this->labels;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSingleworkspaceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['zones'])) {
            if (!empty($map['zones'])) {
                $model->zones = $map['zones'];
            }
        }
        if (isset($map['zone_ids'])) {
            if (!empty($map['zone_ids'])) {
                $model->zoneIds = $map['zone_ids'];
            }
        }
        if (isset($map['labels'])) {
            $model->labels = $map['labels'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}

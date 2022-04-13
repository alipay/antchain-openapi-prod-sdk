<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ZoneOfWorkspace extends Model
{
    // workspace id
    /**
     * @example ws-id
     *
     * @var string
     */
    public $workspaceId;

    // workspace name
    /**
     * @example wsName
     *
     * @var string
     */
    public $workspaceName;

    // zone list of workspace
    /**
     * @example
     *
     * @var ZoneInfo[]
     */
    public $zones;

    // region name
    /**
     * @example shanghai
     *
     * @var string
     */
    public $regionName;

    // region id
    /**
     * @example 00000001
     *
     * @var string
     */
    public $regionId;
    protected $_name = [
        'workspaceId'   => 'workspace_id',
        'workspaceName' => 'workspace_name',
        'zones'         => 'zones',
        'regionName'    => 'region_name',
        'regionId'      => 'region_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('zones', $this->zones, true);
        Model::validateRequired('regionName', $this->regionName, true);
        Model::validateRequired('regionId', $this->regionId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->zones) {
            $res['zones'] = [];
            if (null !== $this->zones && \is_array($this->zones)) {
                $n = 0;
                foreach ($this->zones as $item) {
                    $res['zones'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ZoneOfWorkspace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['zones'])) {
            if (!empty($map['zones'])) {
                $model->zones = [];
                $n            = 0;
                foreach ($map['zones'] as $item) {
                    $model->zones[$n++] = null !== $item ? ZoneInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['region_name'])) {
            $model->regionName = $map['region_name'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Workspace extends Model
{
    // 包含的单元（逻辑机房）
    /**
     * @example
     *
     * @var Cell[]
     */
    public $cells;

    // 显示的名字
    /**
     * @example 杭州生产
     *
     * @var string
     */
    public $displayName;

    // workspace的名字
    /**
     * @example mybk2--mybank--prod
     *
     * @var string
     */
    public $name;

    // 所属地域
    /**
     * @example
     *
     * @var Region
     */
    public $region;

    // 工作空间的id
    /**
     * @example 123456
     *
     * @var string
     */
    public $workspaceId;

    // 机房列表
    /**
     * @example
     *
     * @var Zone[]
     */
    public $zones;
    protected $_name = [
        'cells'       => 'cells',
        'displayName' => 'display_name',
        'name'        => 'name',
        'region'      => 'region',
        'workspaceId' => 'workspace_id',
        'zones'       => 'zones',
    ];

    public function validate()
    {
        Model::validateRequired('cells', $this->cells, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('zones', $this->zones, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cells) {
            $res['cells'] = [];
            if (null !== $this->cells && \is_array($this->cells)) {
                $n = 0;
                foreach ($this->cells as $item) {
                    $res['cells'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->region) {
            $res['region'] = null !== $this->region ? $this->region->toMap() : null;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Workspace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cells'])) {
            if (!empty($map['cells'])) {
                $model->cells = [];
                $n            = 0;
                foreach ($map['cells'] as $item) {
                    $model->cells[$n++] = null !== $item ? Cell::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region'])) {
            $model->region = Region::fromMap($map['region']);
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['zones'])) {
            if (!empty($map['zones'])) {
                $model->zones = [];
                $n            = 0;
                foreach ($map['zones'] as $item) {
                    $model->zones[$n++] = null !== $item ? Zone::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

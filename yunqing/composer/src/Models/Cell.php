<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Cell extends Model
{
    // LDC下cellGroup的ID
    /**
     * @example 123456
     *
     * @var string
     */
    public $cellGroupId;

    // 单元的id
    /**
     * @example 730420181212115238664800000
     *
     * @var string
     */
    public $cellId;

    // LDC的蓝绿着色
    /**
     * @example BLUE
     *
     * @var string
     */
    public $color;

    // LDC的默认权重
    /**
     * @example 50
     *
     * @var int
     */
    public $defaultWeight;

    // LDC下是否灰度
    /**
     * @example false
     *
     * @var bool
     */
    public $gray;

    // 单元的名字
    /**
     * @example mybk2--mybank-ws-prod--gzm0a
     *
     * @var string
     */
    public $name;

    // 所在地域的id
    /**
     * @example 123456
     *
     * @var string
     */
    public $regionId;

    // LDC的GRCZone类型
    /**
     * @example GZONE
     *
     * @var string
     */
    public $type;

    // 工作空间id
    /**
     * @example 123456
     *
     * @var string
     */
    public $workspaceId;

    // 所属机房的id
    /**
     * @example 123456
     *
     * @var string
     */
    public $zoneId;

    // 显示的名字
    /**
     * @example GZM0A
     *
     * @var string
     */
    public $displayName;
    protected $_name = [
        'cellGroupId'   => 'cell_group_id',
        'cellId'        => 'cell_id',
        'color'         => 'color',
        'defaultWeight' => 'default_weight',
        'gray'          => 'gray',
        'name'          => 'name',
        'regionId'      => 'region_id',
        'type'          => 'type',
        'workspaceId'   => 'workspace_id',
        'zoneId'        => 'zone_id',
        'displayName'   => 'display_name',
    ];

    public function validate()
    {
        Model::validateRequired('cellId', $this->cellId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
        Model::validateRequired('displayName', $this->displayName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellGroupId) {
            $res['cell_group_id'] = $this->cellGroupId;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->defaultWeight) {
            $res['default_weight'] = $this->defaultWeight;
        }
        if (null !== $this->gray) {
            $res['gray'] = $this->gray;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Cell
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_group_id'])) {
            $model->cellGroupId = $map['cell_group_id'];
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }
        if (isset($map['default_weight'])) {
            $model->defaultWeight = $map['default_weight'];
        }
        if (isset($map['gray'])) {
            $model->gray = $map['gray'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }

        return $model;
    }
}

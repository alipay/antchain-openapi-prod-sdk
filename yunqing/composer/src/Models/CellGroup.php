<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CellGroup extends Model
{
    // cellGroup的id
    /**
     * @example 123456
     *
     * @var string
     */
    public $cellGroupId;

    // 默认gzone cell的id
    /**
     * @example 123456
     *
     * @var string
     */
    public $defaultGzone;

    // 是否弹性
    /**
     * @example true, false
     *
     * @var bool
     */
    public $elastic;

    // cellGroup的名字
    /**
     * @example ldccs--antcloud--sit-cellgroup
     *
     * @var string
     */
    public $name;

    // 暂时不知道啥意思
    /**
     * @example unkown
     *
     * @var string
     */
    public $normalDrstat;

    // 暂时不知道啥意思
    /**
     * @example unkown
     *
     * @var string
     */
    public $pressDrstat;

    // LDC下cellGroup的类型
    /**
     * @example GZONE
     *
     * @var string
     */
    public $type;

    // 显示的名字
    /**
     * @example GZM0
     *
     * @var string
     */
    public $displayName;
    protected $_name = [
        'cellGroupId'  => 'cell_group_id',
        'defaultGzone' => 'default_gzone',
        'elastic'      => 'elastic',
        'name'         => 'name',
        'normalDrstat' => 'normal_drstat',
        'pressDrstat'  => 'press_drstat',
        'type'         => 'type',
        'displayName'  => 'display_name',
    ];

    public function validate()
    {
        Model::validateRequired('cellGroupId', $this->cellGroupId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('displayName', $this->displayName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellGroupId) {
            $res['cell_group_id'] = $this->cellGroupId;
        }
        if (null !== $this->defaultGzone) {
            $res['default_gzone'] = $this->defaultGzone;
        }
        if (null !== $this->elastic) {
            $res['elastic'] = $this->elastic;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->normalDrstat) {
            $res['normal_drstat'] = $this->normalDrstat;
        }
        if (null !== $this->pressDrstat) {
            $res['press_drstat'] = $this->pressDrstat;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_group_id'])) {
            $model->cellGroupId = $map['cell_group_id'];
        }
        if (isset($map['default_gzone'])) {
            $model->defaultGzone = $map['default_gzone'];
        }
        if (isset($map['elastic'])) {
            $model->elastic = $map['elastic'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['normal_drstat'])) {
            $model->normalDrstat = $map['normal_drstat'];
        }
        if (isset($map['press_drstat'])) {
            $model->pressDrstat = $map['press_drstat'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }

        return $model;
    }
}

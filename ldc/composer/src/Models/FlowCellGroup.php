<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FlowCellGroup extends Model
{
    // 单元组名称
    /**
     * @example RZ00
     *
     * @var string
     */
    public $name;

    // 单元组类型，枚举，GZG、RZG
    /**
     * @example GZG
     *
     * @var string
     */
    public $type;

    // 默认GZone，一般为 GZ00
    /**
     * @example GZ00
     *
     * @var string
     */
    public $defaultGzone;

    // 单元组是否有效
    /**
     * @example true, false
     *
     * @var bool
     */
    public $valid;

    // 单元组容灾状态，枚举，NORMAL（正常）、LOCAL（同城容灾）、REMOTE（异地容灾）
    /**
     * @example LOCAL
     *
     * @var string
     */
    public $disasterState;
    protected $_name = [
        'name'          => 'name',
        'type'          => 'type',
        'defaultGzone'  => 'default_gzone',
        'valid'         => 'valid',
        'disasterState' => 'disaster_state',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('valid', $this->valid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->defaultGzone) {
            $res['default_gzone'] = $this->defaultGzone;
        }
        if (null !== $this->valid) {
            $res['valid'] = $this->valid;
        }
        if (null !== $this->disasterState) {
            $res['disaster_state'] = $this->disasterState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FlowCellGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['default_gzone'])) {
            $model->defaultGzone = $map['default_gzone'];
        }
        if (isset($map['valid'])) {
            $model->valid = $map['valid'];
        }
        if (isset($map['disaster_state'])) {
            $model->disasterState = $map['disaster_state'];
        }

        return $model;
    }
}

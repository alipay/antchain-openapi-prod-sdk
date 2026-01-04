<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ThoughtChainDisplay extends Model
{
    // 思维链显示状态
    /**
     * @example 思维链显示状态
     *
     * @var string
     */
    public $status;

    // 思维链显示名称
    /**
     * @example 思维链显示名称
     *
     * @var string
     */
    public $name;

    // 思维链类型
    /**
     * @example 思维链类型
     *
     * @var string
     */
    public $subType;

    // 思维链图标
    /**
     * @example 思维链图标
     *
     * @var string
     */
    public $icon;

    // 思维链模块额外信息
    /**
     * @example 思维链模块额外信息
     *
     * @var string
     */
    public $resultMsg;
    protected $_name = [
        'status'    => 'status',
        'name'      => 'name',
        'subType'   => 'sub_type',
        'icon'      => 'icon',
        'resultMsg' => 'result_msg',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('subType', $this->subType, true);
        Model::validateRequired('icon', $this->icon, true);
        Model::validateRequired('resultMsg', $this->resultMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->subType) {
            $res['sub_type'] = $this->subType;
        }
        if (null !== $this->icon) {
            $res['icon'] = $this->icon;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ThoughtChainDisplay
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['sub_type'])) {
            $model->subType = $map['sub_type'];
        }
        if (isset($map['icon'])) {
            $model->icon = $map['icon'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }

        return $model;
    }
}

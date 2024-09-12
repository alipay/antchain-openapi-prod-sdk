<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER\Models;

use AlibabaCloud\Tea\Model;

class AuthAction extends Model
{
    // 权限点编码
    /**
     * @example NODE_MANAGE
     *
     * @var string
     */
    public $actionCode;

    // 权限点名称
    /**
     * @example 节点管理
     *
     * @var string
     */
    public $actionName;

    // 归属产品码
    /**
     * @example BAAS
     *
     * @var string
     */
    public $productCode;

    // 权限点级别
    /**
     * @example 1
     *
     * @var int
     */
    public $actionLevel;

    // 是否展示
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isShow;

    // 权限点描述信息
    /**
     * @example 权限点描述信息
     *
     * @var string
     */
    public $actionDescription;

    // 父权限点编码
    /**
     * @example NODE_MANAGE
     *
     * @var string
     */
    public $parentActionCode;
    protected $_name = [
        'actionCode'        => 'action_code',
        'actionName'        => 'action_name',
        'productCode'       => 'product_code',
        'actionLevel'       => 'action_level',
        'isShow'            => 'is_show',
        'actionDescription' => 'action_description',
        'parentActionCode'  => 'parent_action_code',
    ];

    public function validate()
    {
        Model::validateRequired('actionCode', $this->actionCode, true);
        Model::validateRequired('actionName', $this->actionName, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('actionLevel', $this->actionLevel, true);
        Model::validateRequired('isShow', $this->isShow, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->actionName) {
            $res['action_name'] = $this->actionName;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->actionLevel) {
            $res['action_level'] = $this->actionLevel;
        }
        if (null !== $this->isShow) {
            $res['is_show'] = $this->isShow;
        }
        if (null !== $this->actionDescription) {
            $res['action_description'] = $this->actionDescription;
        }
        if (null !== $this->parentActionCode) {
            $res['parent_action_code'] = $this->parentActionCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthAction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_code'])) {
            $model->actionCode = $map['action_code'];
        }
        if (isset($map['action_name'])) {
            $model->actionName = $map['action_name'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['action_level'])) {
            $model->actionLevel = $map['action_level'];
        }
        if (isset($map['is_show'])) {
            $model->isShow = $map['is_show'];
        }
        if (isset($map['action_description'])) {
            $model->actionDescription = $map['action_description'];
        }
        if (isset($map['parent_action_code'])) {
            $model->parentActionCode = $map['parent_action_code'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SofaGwControlVO extends Model
{
    // 要添加的授权的app_name列表
    /**
     * @example
     *
     * @var string[]
     */
    public $addItems;

    // 实例标识
    /**
     * @example abcdEFGH1234
     *
     * @var string
     */
    public $instanceId;

    // 授权的app_name列表
    /**
     * @example
     *
     * @var string[]
     */
    public $items;

    // 固定值：app
    /**
     * @example app
     *
     * @var string
     */
    public $match;

    // 要删除的授权的app_name列表
    /**
     * @example
     *
     * @var string[]
     */
    public $removeItems;

    // service name
    /**
     * @example demoservice
     *
     * @var string
     */
    public $serviceName;

    // 子类型，固定值：whitelist
    /**
     * @example whitelist
     *
     * @var string
     */
    public $subType;

    // 控制类型，固定值：access-control
    /**
     * @example access-control
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'addItems'    => 'add_items',
        'instanceId'  => 'instance_id',
        'items'       => 'items',
        'match'       => 'match',
        'removeItems' => 'remove_items',
        'serviceName' => 'service_name',
        'subType'     => 'sub_type',
        'type'        => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->addItems) {
            $res['add_items'] = $this->addItems;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->items) {
            $res['items'] = $this->items;
        }
        if (null !== $this->match) {
            $res['match'] = $this->match;
        }
        if (null !== $this->removeItems) {
            $res['remove_items'] = $this->removeItems;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->subType) {
            $res['sub_type'] = $this->subType;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SofaGwControlVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['add_items'])) {
            if (!empty($map['add_items'])) {
                $model->addItems = $map['add_items'];
            }
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['items'])) {
            if (!empty($map['items'])) {
                $model->items = $map['items'];
            }
        }
        if (isset($map['match'])) {
            $model->match = $map['match'];
        }
        if (isset($map['remove_items'])) {
            if (!empty($map['remove_items'])) {
                $model->removeItems = $map['remove_items'];
            }
        }
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['sub_type'])) {
            $model->subType = $map['sub_type'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}

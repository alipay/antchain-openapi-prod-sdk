<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ListSgFaulttoleranceappsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // app名称
    //
    /**
     * @var string
     */
    public $appName;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 规则名称
    /**
     * @var string
     */
    public $name;

    // 排序字段
    /**
     * @var string
     */
    public $orders;

    // 页的条数
    /**
     * @var int
     */
    public $pageSize;

    // 开始行
    /**
     * @var int
     */
    public $start;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'instanceId'        => 'instance_id',
        'name'              => 'name',
        'orders'            => 'orders',
        'pageSize'          => 'page_size',
        'start'             => 'start',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('start', $this->start, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSgFaulttoleranceappsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['orders'])) {
            $model->orders = $map['orders'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }

        return $model;
    }
}

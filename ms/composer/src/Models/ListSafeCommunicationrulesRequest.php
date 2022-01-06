<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ListSafeCommunicationrulesRequest extends Model
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

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 取值(0-客户端,1-服务端)
    /**
     * @var string
     */
    public $direction;

    // 模式(0-tls,1-mtls)
    /**
     * @var string
     */
    public $mode;

    // 策略(0-普通,1-国密)
    /**
     * @var string
     */
    public $strategy;

    // 排序字段,key枚举范围("operateTime","name", "direction", "mode", "strategy","enabled",
    // "scope")，dir枚举范围("DESC", "ASC")
    /**
     * @var string
     */
    public $orders;

    // 开始页
    /**
     * @var int
     */
    public $start;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'name'              => 'name',
        'appName'           => 'app_name',
        'direction'         => 'direction',
        'mode'              => 'mode',
        'strategy'          => 'strategy',
        'orders'            => 'orders',
        'start'             => 'start',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->direction) {
            $res['direction'] = $this->direction;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->strategy) {
            $res['strategy'] = $this->strategy;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSafeCommunicationrulesRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['direction'])) {
            $model->direction = $map['direction'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['strategy'])) {
            $model->strategy = $map['strategy'];
        }
        if (isset($map['orders'])) {
            $model->orders = $map['orders'];
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}

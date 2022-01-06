<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class GetSgCircuitbreakerrulesRequest extends Model
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

    // 应用名，数组形式
    /**
     * @var string
     */
    public $appNames;

    // 服务资源id
    /**
     * @var string
     */
    public $dataId;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 规则名
    /**
     * @var string
     */
    public $name;

    // 排序规则，JSON字符串,，数组形式
    /**
     * @var string
     */
    public $orders;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // 当前页
    /**
     * @var int
     */
    public $start;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appNames'          => 'app_names',
        'dataId'            => 'data_id',
        'instanceId'        => 'instance_id',
        'name'              => 'name',
        'orders'            => 'orders',
        'pageSize'          => 'page_size',
        'start'             => 'start',
    ];

    public function validate()
    {
        Model::validateRequired('appNames', $this->appNames, true);
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
        if (null !== $this->appNames) {
            $res['app_names'] = $this->appNames;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
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
     * @return GetSgCircuitbreakerrulesRequest
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
        if (isset($map['app_names'])) {
            $model->appNames = $map['app_names'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
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

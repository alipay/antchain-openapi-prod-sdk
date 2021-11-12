<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class GetProdinstanceAppserviceResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 应用名。
    /**
     * @var string
     */
    public $appName;

    // 应用版本。
    /**
     * @var string
     */
    public $appVersion;

    // 单元ID
    /**
     * @var string
     */
    public $cellId;

    // 容器列表。
    /**
     * @var Container[]
     */
    public $containers;

    // 部署单元。
    /**
     * @var string
     */
    public $deployUnit;

    // 部署域。
    /**
     * @var string
     */
    public $deployZone;

    // 环境唯一标识。
    /**
     * @var string
     */
    public $envId;

    // 负载均衡列表。
    /**
     * @var LoadBalancer[]
     */
    public $loadBalancers;

    // 产品码。
    /**
     * @var string
     */
    public $productCode;

    // 数据库列表。
    /**
     * @var Schema[]
     */
    public $schemas;

    // app service id，该openapi 的入参
    /**
     * @var string
     */
    public $id;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'appName'       => 'app_name',
        'appVersion'    => 'app_version',
        'cellId'        => 'cell_id',
        'containers'    => 'containers',
        'deployUnit'    => 'deploy_unit',
        'deployZone'    => 'deploy_zone',
        'envId'         => 'env_id',
        'loadBalancers' => 'load_balancers',
        'productCode'   => 'product_code',
        'schemas'       => 'schemas',
        'id'            => 'id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->containers) {
            $res['containers'] = [];
            if (null !== $this->containers && \is_array($this->containers)) {
                $n = 0;
                foreach ($this->containers as $item) {
                    $res['containers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deployUnit) {
            $res['deploy_unit'] = $this->deployUnit;
        }
        if (null !== $this->deployZone) {
            $res['deploy_zone'] = $this->deployZone;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->loadBalancers) {
            $res['load_balancers'] = [];
            if (null !== $this->loadBalancers && \is_array($this->loadBalancers)) {
                $n = 0;
                foreach ($this->loadBalancers as $item) {
                    $res['load_balancers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->schemas) {
            $res['schemas'] = [];
            if (null !== $this->schemas && \is_array($this->schemas)) {
                $n = 0;
                foreach ($this->schemas as $item) {
                    $res['schemas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetProdinstanceAppserviceResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }
        if (isset($map['containers'])) {
            if (!empty($map['containers'])) {
                $model->containers = [];
                $n                 = 0;
                foreach ($map['containers'] as $item) {
                    $model->containers[$n++] = null !== $item ? Container::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['deploy_unit'])) {
            $model->deployUnit = $map['deploy_unit'];
        }
        if (isset($map['deploy_zone'])) {
            $model->deployZone = $map['deploy_zone'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['load_balancers'])) {
            if (!empty($map['load_balancers'])) {
                $model->loadBalancers = [];
                $n                    = 0;
                foreach ($map['load_balancers'] as $item) {
                    $model->loadBalancers[$n++] = null !== $item ? LoadBalancer::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['schemas'])) {
            if (!empty($map['schemas'])) {
                $model->schemas = [];
                $n              = 0;
                foreach ($map['schemas'] as $item) {
                    $model->schemas[$n++] = null !== $item ? Schema::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class ScaleoutClustersRequest extends Model
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

    // 数据中心
    /**
     * @var string
     */
    public $dataCenter;

    // 生效 Domain
    /**
     * @var string
     */
    public $domain;

    // 生效 instanceId，如果是需要全局生效使用 ALL_INSTANCE_ID
    /**
     * @var string
     */
    public $instanceId;

    // 网络类型，无特殊需求填写 CLASSIC
    /**
     * @var string
     */
    public $networkType;

    // 产品名称
    /**
     * @var string
     */
    public $product;

    // 扩容 IP
    /**
     * @var string
     */
    public $serviceIp;

    // 生效端口
    /**
     * @var int
     */
    public $servicePort;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataCenter'        => 'data_center',
        'domain'            => 'domain',
        'instanceId'        => 'instance_id',
        'networkType'       => 'network_type',
        'product'           => 'product',
        'serviceIp'         => 'service_ip',
        'servicePort'       => 'service_port',
    ];

    public function validate()
    {
        Model::validateRequired('dataCenter', $this->dataCenter, true);
        Model::validateRequired('domain', $this->domain, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('networkType', $this->networkType, true);
        Model::validateRequired('product', $this->product, true);
        Model::validateRequired('serviceIp', $this->serviceIp, true);
        Model::validateRequired('servicePort', $this->servicePort, true);
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
        if (null !== $this->dataCenter) {
            $res['data_center'] = $this->dataCenter;
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->product) {
            $res['product'] = $this->product;
        }
        if (null !== $this->serviceIp) {
            $res['service_ip'] = $this->serviceIp;
        }
        if (null !== $this->servicePort) {
            $res['service_port'] = $this->servicePort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScaleoutClustersRequest
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
        if (isset($map['data_center'])) {
            $model->dataCenter = $map['data_center'];
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['product'])) {
            $model->product = $map['product'];
        }
        if (isset($map['service_ip'])) {
            $model->serviceIp = $map['service_ip'];
        }
        if (isset($map['service_port'])) {
            $model->servicePort = $map['service_port'];
        }

        return $model;
    }
}

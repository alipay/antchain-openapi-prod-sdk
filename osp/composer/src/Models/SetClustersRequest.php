<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class SetClustersRequest extends Model
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

    // 生效域名
    /**
     * @var string
     */
    public $domain;

    // 开启/关闭
    /**
     * @var bool
     */
    public $enable;

    // 生效实例 ID，如果全部则为 ALL_INSTANCE_ID
    /**
     * @var string
     */
    public $instanceId;

    // 作用 IP
    /**
     * @var string
     */
    public $serviceIp;

    // 网络类型，如果无特殊需求 CLASSIC
    /**
     * @var string
     */
    public $networkType;

    // 产品名称
    /**
     * @var string
     */
    public $product;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'domain'            => 'domain',
        'enable'            => 'enable',
        'instanceId'        => 'instance_id',
        'serviceIp'         => 'service_ip',
        'networkType'       => 'network_type',
        'product'           => 'product',
    ];

    public function validate()
    {
        Model::validateRequired('domain', $this->domain, true);
        Model::validateRequired('enable', $this->enable, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('serviceIp', $this->serviceIp, true);
        Model::validateRequired('networkType', $this->networkType, true);
        Model::validateRequired('product', $this->product, true);
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
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->serviceIp) {
            $res['service_ip'] = $this->serviceIp;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->product) {
            $res['product'] = $this->product;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetClustersRequest
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
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['service_ip'])) {
            $model->serviceIp = $map['service_ip'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['product'])) {
            $model->product = $map['product'];
        }

        return $model;
    }
}

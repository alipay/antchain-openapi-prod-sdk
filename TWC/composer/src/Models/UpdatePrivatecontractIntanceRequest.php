<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UpdatePrivatecontractIntanceRequest extends Model
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

    // 私有化服务地址
    /**
     * @var string
     */
    public $serviceUrl;

    // 实例ID
    /**
     * @var string
     */
    public $instanceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceUrl'        => 'service_url',
        'instanceId'        => 'instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('serviceUrl', $this->serviceUrl, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->serviceUrl) {
            $res['service_url'] = $this->serviceUrl;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdatePrivatecontractIntanceRequest
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
        if (isset($map['service_url'])) {
            $model->serviceUrl = $map['service_url'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }

        return $model;
    }
}

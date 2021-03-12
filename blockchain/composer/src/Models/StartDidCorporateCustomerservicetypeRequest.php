<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidCorporateCustomerservicetypeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 自定义的扩展服务类型
    /**
     * @var DidServiceType[]
     */
    public $serviceTypes;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceTypes'      => 'service_types',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('serviceTypes', $this->serviceTypes, true);
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
        if (null !== $this->serviceTypes) {
            $res['service_types'] = [];
            if (null !== $this->serviceTypes && \is_array($this->serviceTypes)) {
                $n = 0;
                foreach ($this->serviceTypes as $item) {
                    $res['service_types'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidCorporateCustomerservicetypeRequest
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
        if (isset($map['service_types'])) {
            if (!empty($map['service_types'])) {
                $model->serviceTypes = [];
                $n                   = 0;
                foreach ($map['service_types'] as $item) {
                    $model->serviceTypes[$n++] = null !== $item ? DidServiceType::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BindCaasApplicationManageRequest extends Model
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

    // 应用ID
    /**
     * @var string
     */
    public $applicationId;

    // 合约服务标识集合
    /**
     * @var string[]
     */
    public $serviceIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId'     => 'application_id',
        'serviceIds'        => 'service_ids',
    ];

    public function validate()
    {
        Model::validateRequired('applicationId', $this->applicationId, true);
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
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->serviceIds) {
            $res['service_ids'] = $this->serviceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindCaasApplicationManageRequest
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
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['service_ids'])) {
            if (!empty($map['service_ids'])) {
                $model->serviceIds = $map['service_ids'];
            }
        }

        return $model;
    }
}

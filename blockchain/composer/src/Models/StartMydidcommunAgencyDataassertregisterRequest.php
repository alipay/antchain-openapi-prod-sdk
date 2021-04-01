<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunAgencyDataassertregisterRequest extends Model
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

    // 审批流程节点
    /**
     * @var string[]
     */
    public $approvers;

    // 数据资产的Owner
    /**
     * @var string
     */
    public $did;

    // 数据资产id
    /**
     * @var string
     */
    public $serviceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'approvers'         => 'approvers',
        'did'               => 'did',
        'serviceId'         => 'service_id',
    ];

    public function validate()
    {
        Model::validateRequired('approvers', $this->approvers, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
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
        if (null !== $this->approvers) {
            $res['approvers'] = $this->approvers;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidcommunAgencyDataassertregisterRequest
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
        if (isset($map['approvers'])) {
            if (!empty($map['approvers'])) {
                $model->approvers = $map['approvers'];
            }
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }

        return $model;
    }
}

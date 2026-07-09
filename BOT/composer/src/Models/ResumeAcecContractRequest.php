<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ResumeAcecContractRequest extends Model
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

    // 服务接入码
    /**
     * @var string
     */
    public $accessCode;

    // 实例Id
    /**
     * @var string
     */
    public $instanceId;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 产品码，全局唯一
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accessCode'        => 'access_code',
        'instanceId'        => 'instance_id',
        'orderNo'           => 'order_no',
        'productCode'       => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('accessCode', $this->accessCode, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
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
        if (null !== $this->accessCode) {
            $res['access_code'] = $this->accessCode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResumeAcecContractRequest
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
        if (isset($map['access_code'])) {
            $model->accessCode = $map['access_code'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}

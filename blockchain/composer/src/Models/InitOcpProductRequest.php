<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InitOcpProductRequest extends Model
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

    // 加载业务的场景
    /**
     * @var string
     */
    public $businessAction;

    // 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
    /**
     * @var string
     */
    public $businessContext;

    // 流水号用于业务串联，以及幂等
    /**
     * @var string
     */
    public $orderNo;

    // 产品码 全局唯一
    /**
     * @var string
     */
    public $productCode;

    // 区域
    /**
     * @var string
     */
    public $region;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessAction'    => 'business_action',
        'businessContext'   => 'business_context',
        'orderNo'           => 'order_no',
        'productCode'       => 'product_code',
        'region'            => 'region',
    ];

    public function validate()
    {
        Model::validateRequired('businessAction', $this->businessAction, true);
        Model::validateRequired('businessContext', $this->businessContext, true);
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
        if (null !== $this->businessAction) {
            $res['business_action'] = $this->businessAction;
        }
        if (null !== $this->businessContext) {
            $res['business_context'] = $this->businessContext;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitOcpProductRequest
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
        if (isset($map['business_action'])) {
            $model->businessAction = $map['business_action'];
        }
        if (isset($map['business_context'])) {
            $model->businessContext = $map['business_context'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }

        return $model;
    }
}

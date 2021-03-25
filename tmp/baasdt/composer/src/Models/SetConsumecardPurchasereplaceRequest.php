<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetConsumecardPurchasereplaceRequest extends Model
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

    // 是否同意换货。true同意，false拒绝
    /**
     * @var bool
     */
    public $accept;

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 交易ID
    /**
     * @var string
     */
    public $orderId;

    // 附言
    /**
     * @var string
     */
    public $remark;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accept'            => 'accept',
        'baseRequest'       => 'base_request',
        'orderId'           => 'order_id',
        'remark'            => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('accept', $this->accept, true);
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('orderId', $this->orderId, true);
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
        if (null !== $this->accept) {
            $res['accept'] = $this->accept;
        }
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetConsumecardPurchasereplaceRequest
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
        if (isset($map['accept'])) {
            $model->accept = $map['accept'];
        }
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}

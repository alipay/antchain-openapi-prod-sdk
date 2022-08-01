<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetIpOrdermemoRequest extends Model
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

    // 基础请求参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 订单ID
    /**
     * @var string
     */
    public $ipOrderId;

    // 备注信息
    /**
     * @var string
     */
    public $memo;

    // 更新订单功能 0 基础功能，1 领用收藏，2持有流转等
    /**
     * @var int[]
     */
    public $features;

    // 订单ID列表-更新订单功能使用
    /**
     * @var string[]
     */
    public $orderIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'ipOrderId'         => 'ip_order_id',
        'memo'              => 'memo',
        'features'          => 'features',
        'orderIds'          => 'order_ids',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('memo', $this->memo, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->features) {
            $res['features'] = $this->features;
        }
        if (null !== $this->orderIds) {
            $res['order_ids'] = $this->orderIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetIpOrdermemoRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['features'])) {
            if (!empty($map['features'])) {
                $model->features = $map['features'];
            }
        }
        if (isset($map['order_ids'])) {
            if (!empty($map['order_ids'])) {
                $model->orderIds = $map['order_ids'];
            }
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class SendUserProjectordermsgRequest extends Model
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

    // 购买者
    /**
     * @var User
     */
    public $buyer;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 订单详情
    /**
     * @var Order
     */
    public $order;

    // 项目信息
    /**
     * @var Project
     */
    public $project;

    // 分享者
    /**
     * @var User
     */
    public $sharer;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'buyer'             => 'buyer',
        'chainId'           => 'chain_id',
        'order'             => 'order',
        'project'           => 'project',
        'sharer'            => 'sharer',
    ];

    public function validate()
    {
        Model::validateRequired('buyer', $this->buyer, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('order', $this->order, true);
        Model::validateRequired('project', $this->project, true);
        Model::validateRequired('sharer', $this->sharer, true);
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
        if (null !== $this->buyer) {
            $res['buyer'] = null !== $this->buyer ? $this->buyer->toMap() : null;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->order) {
            $res['order'] = null !== $this->order ? $this->order->toMap() : null;
        }
        if (null !== $this->project) {
            $res['project'] = null !== $this->project ? $this->project->toMap() : null;
        }
        if (null !== $this->sharer) {
            $res['sharer'] = null !== $this->sharer ? $this->sharer->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendUserProjectordermsgRequest
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
        if (isset($map['buyer'])) {
            $model->buyer = User::fromMap($map['buyer']);
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['order'])) {
            $model->order = Order::fromMap($map['order']);
        }
        if (isset($map['project'])) {
            $model->project = Project::fromMap($map['project']);
        }
        if (isset($map['sharer'])) {
            $model->sharer = User::fromMap($map['sharer']);
        }

        return $model;
    }
}

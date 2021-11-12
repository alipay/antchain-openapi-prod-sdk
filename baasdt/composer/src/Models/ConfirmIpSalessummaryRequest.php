<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ConfirmIpSalessummaryRequest extends Model
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

    // 基础请求信息
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 订单ID
    /**
     * @var string
     */
    public $ipOrderId;

    // 订单的数据ID，订单中每个数据ID唯一
    /**
     * @var string
     */
    public $salesBizId;

    // 商户确认则传商户的链上ID；版权方确认或者拒绝则传版权方的链上ID
    /**
     * @var string
     */
    public $accountId;

    // 确认或者拒绝，true确认，false拒绝
    /**
     * @var bool
     */
    public $accept;

    // 备注信息
    /**
     * @var string
     */
    public $memo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'ipOrderId'         => 'ip_order_id',
        'salesBizId'        => 'sales_biz_id',
        'accountId'         => 'account_id',
        'accept'            => 'accept',
        'memo'              => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('salesBizId', $this->salesBizId, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('accept', $this->accept, true);
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
        if (null !== $this->salesBizId) {
            $res['sales_biz_id'] = $this->salesBizId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->accept) {
            $res['accept'] = $this->accept;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmIpSalessummaryRequest
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
        if (isset($map['sales_biz_id'])) {
            $model->salesBizId = $map['sales_biz_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['accept'])) {
            $model->accept = $map['accept'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}

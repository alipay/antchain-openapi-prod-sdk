<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIpBillRequest extends Model
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

    // 账单状态，预留字段
    /**
     * @var int
     */
    public $billStatus;

    // 排序字段
    /**
     * @var string
     */
    public $orderBy;

    // 排序顺序：正序还是倒序
    /**
     * @var string
     */
    public $order;

    // 页码
    /**
     * @var int
     */
    public $pageNumber;

    // 每页数据量大小
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'ipOrderId'         => 'ip_order_id',
        'billStatus'        => 'bill_status',
        'orderBy'           => 'order_by',
        'order'             => 'order',
        'pageNumber'        => 'page_number',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('orderBy', $this->orderBy, true);
        Model::validateRequired('order', $this->order, true);
        Model::validateRequired('pageNumber', $this->pageNumber, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->billStatus) {
            $res['bill_status'] = $this->billStatus;
        }
        if (null !== $this->orderBy) {
            $res['order_by'] = $this->orderBy;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryIpBillRequest
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
        if (isset($map['bill_status'])) {
            $model->billStatus = $map['bill_status'];
        }
        if (isset($map['order_by'])) {
            $model->orderBy = $map['order_by'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}

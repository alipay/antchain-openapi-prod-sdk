<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIpSalessummaryRequest extends Model
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

    // 订单ID。订单ID和账单ID二选一传入。
    /**
     * @var string
     */
    public $ipOrderId;

    // 账单ID。订单ID和账单ID二选一传入。
    /**
     * @var string
     */
    public $ipBillId;

    // 销售数据状态：1初始化，2商户确认，3版权方确认，4账单生成，5商户已校正，6版权方拒绝
    /**
     * @var int
     */
    public $status;

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

    // 每页数据量大小。不大于100。
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'ipOrderId'         => 'ip_order_id',
        'ipBillId'          => 'ip_bill_id',
        'status'            => 'status',
        'orderBy'           => 'order_by',
        'order'             => 'order',
        'pageNumber'        => 'page_number',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
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
        if (null !== $this->ipBillId) {
            $res['ip_bill_id'] = $this->ipBillId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
     * @return PagequeryIpSalessummaryRequest
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
        if (isset($map['ip_bill_id'])) {
            $model->ipBillId = $map['ip_bill_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
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

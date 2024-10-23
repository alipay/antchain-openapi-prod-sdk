<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerOrderRequest extends Model
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

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 支付宝代扣协议号
    /**
     * @var string
     */
    public $agreementNo;

    // 订单创建时间开始
    /**
     * @var string
     */
    public $orderCreateTimeStart;

    // 订单创建时间结束
    /**
     * @var string
     */
    public $orderCreateTimeEnd;

    // 订单状态
    /**
     * @var string
     */
    public $orderStatus;

    // 分页
    /**
     * @var PageQuery
     */
    public $pageInfo;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'tenantId'             => 'tenant_id',
        'orderId'              => 'order_id',
        'agreementNo'          => 'agreement_no',
        'orderCreateTimeStart' => 'order_create_time_start',
        'orderCreateTimeEnd'   => 'order_create_time_end',
        'orderStatus'          => 'order_status',
        'pageInfo'             => 'page_info',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('pageInfo', $this->pageInfo, true);
        Model::validatePattern('orderCreateTimeStart', $this->orderCreateTimeStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('orderCreateTimeEnd', $this->orderCreateTimeEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->orderCreateTimeStart) {
            $res['order_create_time_start'] = $this->orderCreateTimeStart;
        }
        if (null !== $this->orderCreateTimeEnd) {
            $res['order_create_time_end'] = $this->orderCreateTimeEnd;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerOrderRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['order_create_time_start'])) {
            $model->orderCreateTimeStart = $map['order_create_time_start'];
        }
        if (isset($map['order_create_time_end'])) {
            $model->orderCreateTimeEnd = $map['order_create_time_end'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }

        return $model;
    }
}

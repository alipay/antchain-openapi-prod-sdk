<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class GetOrderCreateorderRequest extends Model
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

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;

    // 幂等id
    /**
     * @var string
     */
    public $requestId;

    // 发票信息
    /**
     * @var InvoiceInfo
     */
    public $invoiceInfo;

    // 订单明细列表
    /**
     * @var OrderItem[]
     */
    public $orderItem;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'clientToken'       => 'client_token',
        'requestId'         => 'request_id',
        'invoiceInfo'       => 'invoice_info',
        'orderItem'         => 'order_item',
    ];

    public function validate()
    {
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateRequired('requestId', $this->requestId, true);
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
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->invoiceInfo) {
            $res['invoice_info'] = null !== $this->invoiceInfo ? $this->invoiceInfo->toMap() : null;
        }
        if (null !== $this->orderItem) {
            $res['order_item'] = [];
            if (null !== $this->orderItem && \is_array($this->orderItem)) {
                $n = 0;
                foreach ($this->orderItem as $item) {
                    $res['order_item'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetOrderCreateorderRequest
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
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['invoice_info'])) {
            $model->invoiceInfo = InvoiceInfo::fromMap($map['invoice_info']);
        }
        if (isset($map['order_item'])) {
            if (!empty($map['order_item'])) {
                $model->orderItem = [];
                $n                = 0;
                foreach ($map['order_item'] as $item) {
                    $model->orderItem[$n++] = null !== $item ? OrderItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

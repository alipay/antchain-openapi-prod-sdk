<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseOrderproductResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 错误码
    /**
     * @var string
     */
    public $code;

    // 返回信息描述
    /**
     * @var string
     */
    public $message;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 订单商品信息的数组
    /**
     * @var LeaseOrderProductInfo[]
     */
    public $productInfos;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'code'         => 'code',
        'message'      => 'message',
        'orderId'      => 'order_id',
        'productInfos' => 'product_infos',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->productInfos) {
            $res['product_infos'] = [];
            if (null !== $this->productInfos && \is_array($this->productInfos)) {
                $n = 0;
                foreach ($this->productInfos as $item) {
                    $res['product_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseOrderproductResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['product_infos'])) {
            if (!empty($map['product_infos'])) {
                $model->productInfos = [];
                $n                   = 0;
                foreach ($map['product_infos'] as $item) {
                    $model->productInfos[$n++] = null !== $item ? LeaseOrderProductInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

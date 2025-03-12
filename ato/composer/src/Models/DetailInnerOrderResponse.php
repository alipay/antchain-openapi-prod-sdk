<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerOrderResponse extends Model
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

    // 商品总数量
    /**
     * @var int
     */
    public $productTotalCount;

    // 订单基础信息
    /**
     * @var OrderInfo
     */
    public $orderInfo;

    // 用户信息
    /**
     * @var OrderUserInfo
     */
    public $orderUserInfo;

    // 订单履约
    /**
     * @var OrderFulfillmentInfo[]
     */
    public $orderFulfillmentInfoList;

    // 订单还款承诺
    /**
     * @var OrderPromiseInfo
     */
    public $orderPromiseInfo;

    // 订单商品信息
    /**
     * @var OrderProductInfo[]
     */
    public $orderProductInfoList;

    // 经营分账信息
    /**
     * @var OperateDivideInfo[]
     */
    public $operateDivideInfoList;

    // 订单合同信息
    /**
     * @var OrderContractInfo[]
     */
    public $orderContractInfoList;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'orderId'                  => 'order_id',
        'agreementNo'              => 'agreement_no',
        'productTotalCount'        => 'product_total_count',
        'orderInfo'                => 'order_info',
        'orderUserInfo'            => 'order_user_info',
        'orderFulfillmentInfoList' => 'order_fulfillment_info_list',
        'orderPromiseInfo'         => 'order_promise_info',
        'orderProductInfoList'     => 'order_product_info_list',
        'operateDivideInfoList'    => 'operate_divide_info_list',
        'orderContractInfoList'    => 'order_contract_info_list',
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->productTotalCount) {
            $res['product_total_count'] = $this->productTotalCount;
        }
        if (null !== $this->orderInfo) {
            $res['order_info'] = null !== $this->orderInfo ? $this->orderInfo->toMap() : null;
        }
        if (null !== $this->orderUserInfo) {
            $res['order_user_info'] = null !== $this->orderUserInfo ? $this->orderUserInfo->toMap() : null;
        }
        if (null !== $this->orderFulfillmentInfoList) {
            $res['order_fulfillment_info_list'] = [];
            if (null !== $this->orderFulfillmentInfoList && \is_array($this->orderFulfillmentInfoList)) {
                $n = 0;
                foreach ($this->orderFulfillmentInfoList as $item) {
                    $res['order_fulfillment_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->orderPromiseInfo) {
            $res['order_promise_info'] = null !== $this->orderPromiseInfo ? $this->orderPromiseInfo->toMap() : null;
        }
        if (null !== $this->orderProductInfoList) {
            $res['order_product_info_list'] = [];
            if (null !== $this->orderProductInfoList && \is_array($this->orderProductInfoList)) {
                $n = 0;
                foreach ($this->orderProductInfoList as $item) {
                    $res['order_product_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->operateDivideInfoList) {
            $res['operate_divide_info_list'] = [];
            if (null !== $this->operateDivideInfoList && \is_array($this->operateDivideInfoList)) {
                $n = 0;
                foreach ($this->operateDivideInfoList as $item) {
                    $res['operate_divide_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->orderContractInfoList) {
            $res['order_contract_info_list'] = [];
            if (null !== $this->orderContractInfoList && \is_array($this->orderContractInfoList)) {
                $n = 0;
                foreach ($this->orderContractInfoList as $item) {
                    $res['order_contract_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInnerOrderResponse
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['product_total_count'])) {
            $model->productTotalCount = $map['product_total_count'];
        }
        if (isset($map['order_info'])) {
            $model->orderInfo = OrderInfo::fromMap($map['order_info']);
        }
        if (isset($map['order_user_info'])) {
            $model->orderUserInfo = OrderUserInfo::fromMap($map['order_user_info']);
        }
        if (isset($map['order_fulfillment_info_list'])) {
            if (!empty($map['order_fulfillment_info_list'])) {
                $model->orderFulfillmentInfoList = [];
                $n                               = 0;
                foreach ($map['order_fulfillment_info_list'] as $item) {
                    $model->orderFulfillmentInfoList[$n++] = null !== $item ? OrderFulfillmentInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['order_promise_info'])) {
            $model->orderPromiseInfo = OrderPromiseInfo::fromMap($map['order_promise_info']);
        }
        if (isset($map['order_product_info_list'])) {
            if (!empty($map['order_product_info_list'])) {
                $model->orderProductInfoList = [];
                $n                           = 0;
                foreach ($map['order_product_info_list'] as $item) {
                    $model->orderProductInfoList[$n++] = null !== $item ? OrderProductInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['operate_divide_info_list'])) {
            if (!empty($map['operate_divide_info_list'])) {
                $model->operateDivideInfoList = [];
                $n                            = 0;
                foreach ($map['operate_divide_info_list'] as $item) {
                    $model->operateDivideInfoList[$n++] = null !== $item ? OperateDivideInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['order_contract_info_list'])) {
            if (!empty($map['order_contract_info_list'])) {
                $model->orderContractInfoList = [];
                $n                            = 0;
                foreach ($map['order_contract_info_list'] as $item) {
                    $model->orderContractInfoList[$n++] = null !== $item ? OrderContractInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerFundmngorderResponse extends Model
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

    // 订单基础信息
    /**
     * @var OrderInfo
     */
    public $orderInfo;

    // 订单物流信息列表
    /**
     * @var OrderLogisticInfo[]
     */
    public $orderLogisticInfoList;

    // 订单用户信息
    /**
     * @var OrderUserInfo
     */
    public $orderUserInfo;

    // 订单融资信息
    /**
     * @var OrderFinanceInfo
     */
    public $orderFinanceInfo;

    // 订单履约信息
    /**
     * @var OrderFulfillmentInfo[]
     */
    public $orderFulfillmentInfoList;

    // 订单履约计划
    /**
     * @var OrderRepayStrategy[]
     */
    public $orderPromiseInfo;

    // 订单商品信息
    /**
     * @var OrderProductInfo[]
     */
    public $orderProductInfoList;

    // 订单合同文件信息
    /**
     * @var OrderContractInfo[]
     */
    public $orderContractInfoList;

    // 订单代扣协议信息
    /**
     * @var OrderWithholdContractInfo
     */
    public $orderWithholdContractInfo;

    // 订单资产凭证信息
    /**
     * @var InnerCreditInfo[]
     */
    public $orderCreditInfo;

    // 商家履约计划
    /**
     * @var MerchantOrderRepayStrategy[]
     */
    public $merchantOrderRepayStrategy;

    // 商户履约记录信息
    /**
     * @var MerchantOrderFulfillmentInfo[]
     */
    public $merchantOrderFulfillmentInfo;

    // 资方后台融资申请结果
    /**
     * @var FundMngLoanApplyResult
     */
    public $fundMngLoanApplayResult;
    protected $_name = [
        'reqMsgId'                     => 'req_msg_id',
        'resultCode'                   => 'result_code',
        'resultMsg'                    => 'result_msg',
        'orderId'                      => 'order_id',
        'orderInfo'                    => 'order_info',
        'orderLogisticInfoList'        => 'order_logistic_info_list',
        'orderUserInfo'                => 'order_user_info',
        'orderFinanceInfo'             => 'order_finance_info',
        'orderFulfillmentInfoList'     => 'order_fulfillment_info_list',
        'orderPromiseInfo'             => 'order_promise_info',
        'orderProductInfoList'         => 'order_product_info_list',
        'orderContractInfoList'        => 'order_contract_info_list',
        'orderWithholdContractInfo'    => 'order_withhold_contract_info',
        'orderCreditInfo'              => 'order_credit_info',
        'merchantOrderRepayStrategy'   => 'merchant_order_repay_strategy',
        'merchantOrderFulfillmentInfo' => 'merchant_order_fulfillment_info',
        'fundMngLoanApplayResult'      => 'fund_mng_loan_applay_result',
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
        if (null !== $this->orderInfo) {
            $res['order_info'] = null !== $this->orderInfo ? $this->orderInfo->toMap() : null;
        }
        if (null !== $this->orderLogisticInfoList) {
            $res['order_logistic_info_list'] = [];
            if (null !== $this->orderLogisticInfoList && \is_array($this->orderLogisticInfoList)) {
                $n = 0;
                foreach ($this->orderLogisticInfoList as $item) {
                    $res['order_logistic_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->orderUserInfo) {
            $res['order_user_info'] = null !== $this->orderUserInfo ? $this->orderUserInfo->toMap() : null;
        }
        if (null !== $this->orderFinanceInfo) {
            $res['order_finance_info'] = null !== $this->orderFinanceInfo ? $this->orderFinanceInfo->toMap() : null;
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
            $res['order_promise_info'] = [];
            if (null !== $this->orderPromiseInfo && \is_array($this->orderPromiseInfo)) {
                $n = 0;
                foreach ($this->orderPromiseInfo as $item) {
                    $res['order_promise_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->orderContractInfoList) {
            $res['order_contract_info_list'] = [];
            if (null !== $this->orderContractInfoList && \is_array($this->orderContractInfoList)) {
                $n = 0;
                foreach ($this->orderContractInfoList as $item) {
                    $res['order_contract_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->orderWithholdContractInfo) {
            $res['order_withhold_contract_info'] = null !== $this->orderWithholdContractInfo ? $this->orderWithholdContractInfo->toMap() : null;
        }
        if (null !== $this->orderCreditInfo) {
            $res['order_credit_info'] = [];
            if (null !== $this->orderCreditInfo && \is_array($this->orderCreditInfo)) {
                $n = 0;
                foreach ($this->orderCreditInfo as $item) {
                    $res['order_credit_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->merchantOrderRepayStrategy) {
            $res['merchant_order_repay_strategy'] = [];
            if (null !== $this->merchantOrderRepayStrategy && \is_array($this->merchantOrderRepayStrategy)) {
                $n = 0;
                foreach ($this->merchantOrderRepayStrategy as $item) {
                    $res['merchant_order_repay_strategy'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->merchantOrderFulfillmentInfo) {
            $res['merchant_order_fulfillment_info'] = [];
            if (null !== $this->merchantOrderFulfillmentInfo && \is_array($this->merchantOrderFulfillmentInfo)) {
                $n = 0;
                foreach ($this->merchantOrderFulfillmentInfo as $item) {
                    $res['merchant_order_fulfillment_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->fundMngLoanApplayResult) {
            $res['fund_mng_loan_applay_result'] = null !== $this->fundMngLoanApplayResult ? $this->fundMngLoanApplayResult->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInnerFundmngorderResponse
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
        if (isset($map['order_info'])) {
            $model->orderInfo = OrderInfo::fromMap($map['order_info']);
        }
        if (isset($map['order_logistic_info_list'])) {
            if (!empty($map['order_logistic_info_list'])) {
                $model->orderLogisticInfoList = [];
                $n                            = 0;
                foreach ($map['order_logistic_info_list'] as $item) {
                    $model->orderLogisticInfoList[$n++] = null !== $item ? OrderLogisticInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['order_user_info'])) {
            $model->orderUserInfo = OrderUserInfo::fromMap($map['order_user_info']);
        }
        if (isset($map['order_finance_info'])) {
            $model->orderFinanceInfo = OrderFinanceInfo::fromMap($map['order_finance_info']);
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
            if (!empty($map['order_promise_info'])) {
                $model->orderPromiseInfo = [];
                $n                       = 0;
                foreach ($map['order_promise_info'] as $item) {
                    $model->orderPromiseInfo[$n++] = null !== $item ? OrderRepayStrategy::fromMap($item) : $item;
                }
            }
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
        if (isset($map['order_contract_info_list'])) {
            if (!empty($map['order_contract_info_list'])) {
                $model->orderContractInfoList = [];
                $n                            = 0;
                foreach ($map['order_contract_info_list'] as $item) {
                    $model->orderContractInfoList[$n++] = null !== $item ? OrderContractInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['order_withhold_contract_info'])) {
            $model->orderWithholdContractInfo = OrderWithholdContractInfo::fromMap($map['order_withhold_contract_info']);
        }
        if (isset($map['order_credit_info'])) {
            if (!empty($map['order_credit_info'])) {
                $model->orderCreditInfo = [];
                $n                      = 0;
                foreach ($map['order_credit_info'] as $item) {
                    $model->orderCreditInfo[$n++] = null !== $item ? InnerCreditInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['merchant_order_repay_strategy'])) {
            if (!empty($map['merchant_order_repay_strategy'])) {
                $model->merchantOrderRepayStrategy = [];
                $n                                 = 0;
                foreach ($map['merchant_order_repay_strategy'] as $item) {
                    $model->merchantOrderRepayStrategy[$n++] = null !== $item ? MerchantOrderRepayStrategy::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['merchant_order_fulfillment_info'])) {
            if (!empty($map['merchant_order_fulfillment_info'])) {
                $model->merchantOrderFulfillmentInfo = [];
                $n                                   = 0;
                foreach ($map['merchant_order_fulfillment_info'] as $item) {
                    $model->merchantOrderFulfillmentInfo[$n++] = null !== $item ? MerchantOrderFulfillmentInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['fund_mng_loan_applay_result'])) {
            $model->fundMngLoanApplayResult = FundMngLoanApplyResult::fromMap($map['fund_mng_loan_applay_result']);
        }

        return $model;
    }
}

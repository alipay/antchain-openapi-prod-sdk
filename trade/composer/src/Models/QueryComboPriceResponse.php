<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class QueryComboPriceResponse extends Model
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

    // 套餐付款金额
    /**
     * @var string
     */
    public $comboPayAmount;

    // 套餐优惠金额
    /**
     * @var string
     */
    public $comboCouponAmount;

    // 套餐折扣金额
    /**
     * @var string
     */
    public $comboDiscountAmount;

    // 套餐原始金额
    /**
     * @var string
     */
    public $comboOriginalAmount;

    // 币种，元：CNY
    /**
     * @var string
     */
    public $currency;

    // 商品询价明细
    /**
     * @var CommodityEnquiryPrice[]
     */
    public $commodityEnquiryPrices;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'comboPayAmount'         => 'combo_pay_amount',
        'comboCouponAmount'      => 'combo_coupon_amount',
        'comboDiscountAmount'    => 'combo_discount_amount',
        'comboOriginalAmount'    => 'combo_original_amount',
        'currency'               => 'currency',
        'commodityEnquiryPrices' => 'commodity_enquiry_prices',
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
        if (null !== $this->comboPayAmount) {
            $res['combo_pay_amount'] = $this->comboPayAmount;
        }
        if (null !== $this->comboCouponAmount) {
            $res['combo_coupon_amount'] = $this->comboCouponAmount;
        }
        if (null !== $this->comboDiscountAmount) {
            $res['combo_discount_amount'] = $this->comboDiscountAmount;
        }
        if (null !== $this->comboOriginalAmount) {
            $res['combo_original_amount'] = $this->comboOriginalAmount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->commodityEnquiryPrices) {
            $res['commodity_enquiry_prices'] = [];
            if (null !== $this->commodityEnquiryPrices && \is_array($this->commodityEnquiryPrices)) {
                $n = 0;
                foreach ($this->commodityEnquiryPrices as $item) {
                    $res['commodity_enquiry_prices'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryComboPriceResponse
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
        if (isset($map['combo_pay_amount'])) {
            $model->comboPayAmount = $map['combo_pay_amount'];
        }
        if (isset($map['combo_coupon_amount'])) {
            $model->comboCouponAmount = $map['combo_coupon_amount'];
        }
        if (isset($map['combo_discount_amount'])) {
            $model->comboDiscountAmount = $map['combo_discount_amount'];
        }
        if (isset($map['combo_original_amount'])) {
            $model->comboOriginalAmount = $map['combo_original_amount'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['commodity_enquiry_prices'])) {
            if (!empty($map['commodity_enquiry_prices'])) {
                $model->commodityEnquiryPrices = [];
                $n                             = 0;
                foreach ($map['commodity_enquiry_prices'] as $item) {
                    $model->commodityEnquiryPrices[$n++] = null !== $item ? CommodityEnquiryPrice::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

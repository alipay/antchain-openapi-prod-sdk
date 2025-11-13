<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantPerformanceRedeemInfo extends Model
{
    // 是否展示“剩余账期提前回购”
    /**
     * @example true, false
     *
     * @var bool
     */
    public $supportRedeem;

    // 可选回购类型
    // TRANSFER("TRANSFER", "转账代偿"),
    // WITHHOLD("WITHHOLD", "代扣代偿"),
    /**
     * @example [TRANSFER,WITHHOLD]
     *
     * @var string[]
     */
    public $supportRedeemTypeList;

    // 商户履约赎回结果信息
    /**
     * @example
     *
     * @var MerchantPerformanceRedeemResultInfo
     */
    public $merchantPerformanceRedeemResultInfo;
    protected $_name = [
        'supportRedeem'                       => 'support_redeem',
        'supportRedeemTypeList'               => 'support_redeem_type_list',
        'merchantPerformanceRedeemResultInfo' => 'merchant_performance_redeem_result_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->supportRedeem) {
            $res['support_redeem'] = $this->supportRedeem;
        }
        if (null !== $this->supportRedeemTypeList) {
            $res['support_redeem_type_list'] = $this->supportRedeemTypeList;
        }
        if (null !== $this->merchantPerformanceRedeemResultInfo) {
            $res['merchant_performance_redeem_result_info'] = null !== $this->merchantPerformanceRedeemResultInfo ? $this->merchantPerformanceRedeemResultInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantPerformanceRedeemInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['support_redeem'])) {
            $model->supportRedeem = $map['support_redeem'];
        }
        if (isset($map['support_redeem_type_list'])) {
            if (!empty($map['support_redeem_type_list'])) {
                $model->supportRedeemTypeList = $map['support_redeem_type_list'];
            }
        }
        if (isset($map['merchant_performance_redeem_result_info'])) {
            $model->merchantPerformanceRedeemResultInfo = MerchantPerformanceRedeemResultInfo::fromMap($map['merchant_performance_redeem_result_info']);
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ORG\Models;

use AlibabaCloud\Tea\Model;

class VoucherConsultBusinessContext extends Model
{
    // 指定资产编码列表
    /**
     * @example ["COUPON"]
     *
     * @var string[]
     */
    public $assetTypeCodeList;

    // 订单金额
    /**
     * @example 120.05
     *
     * @var string
     */
    public $orderAmount;

    // 收款账号
    /**
     * @example 2088502492801939
     *
     * @var string
     */
    public $payeeUserId;

    // 业务上下文信息
    /**
     * @example {"tinyAppId":"2088","orgBenefitRepayBJBankTick":"Y"}
     *
     * @var string
     */
    public $bizContext;
    protected $_name = [
        'assetTypeCodeList' => 'asset_type_code_list',
        'orderAmount'       => 'order_amount',
        'payeeUserId'       => 'payee_user_id',
        'bizContext'        => 'biz_context',
    ];

    public function validate()
    {
        Model::validateRequired('assetTypeCodeList', $this->assetTypeCodeList, true);
        Model::validateRequired('orderAmount', $this->orderAmount, true);
        Model::validateRequired('payeeUserId', $this->payeeUserId, true);
        Model::validateRequired('bizContext', $this->bizContext, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assetTypeCodeList) {
            $res['asset_type_code_list'] = $this->assetTypeCodeList;
        }
        if (null !== $this->orderAmount) {
            $res['order_amount'] = $this->orderAmount;
        }
        if (null !== $this->payeeUserId) {
            $res['payee_user_id'] = $this->payeeUserId;
        }
        if (null !== $this->bizContext) {
            $res['biz_context'] = $this->bizContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VoucherConsultBusinessContext
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asset_type_code_list'])) {
            if (!empty($map['asset_type_code_list'])) {
                $model->assetTypeCodeList = $map['asset_type_code_list'];
            }
        }
        if (isset($map['order_amount'])) {
            $model->orderAmount = $map['order_amount'];
        }
        if (isset($map['payee_user_id'])) {
            $model->payeeUserId = $map['payee_user_id'];
        }
        if (isset($map['biz_context'])) {
            $model->bizContext = $map['biz_context'];
        }

        return $model;
    }
}

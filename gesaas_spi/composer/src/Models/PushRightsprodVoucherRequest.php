<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class PushRightsprodVoucherRequest extends Model
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

    // 权益编码
    /**
     * @var string
     */
    public $rightsCode;

    // 权益凭证编码/券码
    /**
     * @var string
     */
    public $voucherCode;

    // 业务类型
    // GRANT：发放
    // VERIFY：核销 GRANT_CANCEL：发放撤销 VERIFY_CANCEL：核销撤销 FREEZE：冻结
    // UNFREEZE：解冻
    /**
     * @var string
     */
    public $bizType;

    // GRANT_SUCCESS：发放成功
    // GRANT_FAIL：发放失败
    // VERIFY_FAIL：核销失败
    // VERIFY_SUCCESS：核销成功
    /**
     * @var string
     */
    public $status;

    // 外部订单号
    /**
     * @var string
     */
    public $outTradeOrderNo;

    // 失败信息
    /**
     * @var string
     */
    public $failMsg;

    // 外部发放调用时传入信息
    /**
     * @var string
     */
    public $grantInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'rightsCode'        => 'rights_code',
        'voucherCode'       => 'voucher_code',
        'bizType'           => 'biz_type',
        'status'            => 'status',
        'outTradeOrderNo'   => 'out_trade_order_no',
        'failMsg'           => 'fail_msg',
        'grantInfo'         => 'grant_info',
    ];

    public function validate()
    {
        Model::validateRequired('rightsCode', $this->rightsCode, true);
        Model::validateRequired('voucherCode', $this->voucherCode, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('status', $this->status, true);
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
        if (null !== $this->rightsCode) {
            $res['rights_code'] = $this->rightsCode;
        }
        if (null !== $this->voucherCode) {
            $res['voucher_code'] = $this->voucherCode;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->outTradeOrderNo) {
            $res['out_trade_order_no'] = $this->outTradeOrderNo;
        }
        if (null !== $this->failMsg) {
            $res['fail_msg'] = $this->failMsg;
        }
        if (null !== $this->grantInfo) {
            $res['grant_info'] = $this->grantInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRightsprodVoucherRequest
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
        if (isset($map['rights_code'])) {
            $model->rightsCode = $map['rights_code'];
        }
        if (isset($map['voucher_code'])) {
            $model->voucherCode = $map['voucher_code'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['out_trade_order_no'])) {
            $model->outTradeOrderNo = $map['out_trade_order_no'];
        }
        if (isset($map['fail_msg'])) {
            $model->failMsg = $map['fail_msg'];
        }
        if (isset($map['grant_info'])) {
            $model->grantInfo = $map['grant_info'];
        }

        return $model;
    }
}

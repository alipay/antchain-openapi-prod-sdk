<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeUsecreditStatusRequest extends Model
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

    // 请求网络流水号
    /**
     * @var string
     */
    public $orderNo;

    // 1：现金贷（默认）
    // 2：分期付
    /**
     * @var string
     */
    public $prodType;

    // 天枢系统用信申请的订单号
    /**
     * @var string
     */
    public $originalOrderNo;

    // 购物订单号，如二轮车/摩托车订单号
    /**
     * @var string
     */
    public $bizOrderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'prodType'          => 'prod_type',
        'originalOrderNo'   => 'original_order_no',
        'bizOrderNo'        => 'biz_order_no',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->prodType) {
            $res['prod_type'] = $this->prodType;
        }
        if (null !== $this->originalOrderNo) {
            $res['original_order_no'] = $this->originalOrderNo;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeUsecreditStatusRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['prod_type'])) {
            $model->prodType = $map['prod_type'];
        }
        if (isset($map['original_order_no'])) {
            $model->originalOrderNo = $map['original_order_no'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }

        return $model;
    }
}

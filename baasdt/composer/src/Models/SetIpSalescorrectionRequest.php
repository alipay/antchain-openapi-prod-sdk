<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetIpSalescorrectionRequest extends Model
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

    // 基础请求信息
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 订单ID
    /**
     * @var string
     */
    public $ipOrderId;

    // 订单的数据ID，订单中每个数据ID唯一
    /**
     * @var string
     */
    public $salesBizId;

    // 数量校正，负数表示减少本次销售数量，但减少后宗销售数量不能小于0。不校正数量则填0.
    /**
     * @var int
     */
    public $correctAmount;

    // 销售金额校正，单位元，负数表示减少本次销售金额，但减少后销售金额不能小于0。不校正数量则填0.00。
    /**
     * @var string
     */
    public $correctSales;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'ipOrderId'         => 'ip_order_id',
        'salesBizId'        => 'sales_biz_id',
        'correctAmount'     => 'correct_amount',
        'correctSales'      => 'correct_sales',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('salesBizId', $this->salesBizId, true);
        Model::validateRequired('correctAmount', $this->correctAmount, true);
        Model::validateRequired('correctSales', $this->correctSales, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->salesBizId) {
            $res['sales_biz_id'] = $this->salesBizId;
        }
        if (null !== $this->correctAmount) {
            $res['correct_amount'] = $this->correctAmount;
        }
        if (null !== $this->correctSales) {
            $res['correct_sales'] = $this->correctSales;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetIpSalescorrectionRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['sales_biz_id'])) {
            $model->salesBizId = $map['sales_biz_id'];
        }
        if (isset($map['correct_amount'])) {
            $model->correctAmount = $map['correct_amount'];
        }
        if (isset($map['correct_sales'])) {
            $model->correctSales = $map['correct_sales'];
        }

        return $model;
    }
}

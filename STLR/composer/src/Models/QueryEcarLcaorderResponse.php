<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryEcarLcaorderResponse extends Model
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

    // LCA订单单号
    /**
     * @var string
     */
    public $orderNo;

    // 来源于三方平台的订单编号
    /**
     * @var string
     */
    public $sourceOrderNo;

    // 三方平台客户ID，在三方平台唯一
    /**
     * @var string
     */
    public $customerId;

    // 碳账户编号，碳矩阵为客户分配的碳账户编号
    /**
     * @var string
     */
    public $carbonAccountNo;

    // Pending——待分配，Closed——已关闭，Allocated——已分配，Finished——已完成
    /**
     * @var string
     */
    public $orderStatus;

    // 产品概要信息
    /**
     * @var EnterpriseProductOutline
     */
    public $product;

    // 足迹计算信息
    /**
     * @var LcaCarbonDatum
     */
    public $lcaCarbonDatum;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'orderNo'         => 'order_no',
        'sourceOrderNo'   => 'source_order_no',
        'customerId'      => 'customer_id',
        'carbonAccountNo' => 'carbon_account_no',
        'orderStatus'     => 'order_status',
        'product'         => 'product',
        'lcaCarbonDatum'  => 'lca_carbon_datum',
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->sourceOrderNo) {
            $res['source_order_no'] = $this->sourceOrderNo;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->carbonAccountNo) {
            $res['carbon_account_no'] = $this->carbonAccountNo;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->product) {
            $res['product'] = null !== $this->product ? $this->product->toMap() : null;
        }
        if (null !== $this->lcaCarbonDatum) {
            $res['lca_carbon_datum'] = null !== $this->lcaCarbonDatum ? $this->lcaCarbonDatum->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEcarLcaorderResponse
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['source_order_no'])) {
            $model->sourceOrderNo = $map['source_order_no'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['carbon_account_no'])) {
            $model->carbonAccountNo = $map['carbon_account_no'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['product'])) {
            $model->product = EnterpriseProductOutline::fromMap($map['product']);
        }
        if (isset($map['lca_carbon_datum'])) {
            $model->lcaCarbonDatum = LcaCarbonDatum::fromMap($map['lca_carbon_datum']);
        }

        return $model;
    }
}

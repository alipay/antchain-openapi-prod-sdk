<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class ExecNftTransferRequest extends Model
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

    // 支付用户uid
    /**
     * @var string
     */
    public $alipayUid;

    // 在外部渠道的全局唯一id
    /**
     * @var string
     */
    public $projectId;

    // 外部订单号（阿里拍卖成功的订单号）
    /**
     * @var string
     */
    public $orderNo;

    // 拍品成交价（单位：分）
    /**
     * @var int
     */
    public $priceCent;

    // 订单成功时间
    /**
     * @var string
     */
    public $orderTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'alipayUid'         => 'alipay_uid',
        'projectId'         => 'project_id',
        'orderNo'           => 'order_no',
        'priceCent'         => 'price_cent',
        'orderTime'         => 'order_time',
    ];

    public function validate()
    {
        Model::validateRequired('alipayUid', $this->alipayUid, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('priceCent', $this->priceCent, true);
        Model::validateRequired('orderTime', $this->orderTime, true);
        Model::validatePattern('orderTime', $this->orderTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->priceCent) {
            $res['price_cent'] = $this->priceCent;
        }
        if (null !== $this->orderTime) {
            $res['order_time'] = $this->orderTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecNftTransferRequest
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
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['price_cent'])) {
            $model->priceCent = $map['price_cent'];
        }
        if (isset($map['order_time'])) {
            $model->orderTime = $map['order_time'];
        }

        return $model;
    }
}

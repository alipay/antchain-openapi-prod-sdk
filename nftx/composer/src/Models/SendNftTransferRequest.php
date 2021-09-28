<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class SendNftTransferRequest extends Model
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

    // NFT租户下唯一的项目编号
    /**
     * @var string
     */
    public $projectId;

    // 支付宝2088开头账号
    /**
     * @var string
     */
    public $toldNo;

    // 账号类型，当前只支持支付宝账号
    /**
     * @var string
     */
    public $toldType;

    // 购买NFT的金额，单位分
    /**
     * @var int
     */
    public $priceCent;

    // 交易NFT时租户的唯一订单号
    /**
     * @var string
     */
    public $orderNo;

    // 用户购买订单时间
    /**
     * @var string
     */
    public $orderTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectId'         => 'project_id',
        'toldNo'            => 'told_no',
        'toldType'          => 'told_type',
        'priceCent'         => 'price_cent',
        'orderNo'           => 'order_no',
        'orderTime'         => 'order_time',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('toldNo', $this->toldNo, true);
        Model::validateRequired('toldType', $this->toldType, true);
        Model::validateRequired('priceCent', $this->priceCent, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('orderTime', $this->orderTime, true);
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
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->toldNo) {
            $res['told_no'] = $this->toldNo;
        }
        if (null !== $this->toldType) {
            $res['told_type'] = $this->toldType;
        }
        if (null !== $this->priceCent) {
            $res['price_cent'] = $this->priceCent;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->orderTime) {
            $res['order_time'] = $this->orderTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendNftTransferRequest
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
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['told_no'])) {
            $model->toldNo = $map['told_no'];
        }
        if (isset($map['told_type'])) {
            $model->toldType = $map['told_type'];
        }
        if (isset($map['price_cent'])) {
            $model->priceCent = $map['price_cent'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['order_time'])) {
            $model->orderTime = $map['order_time'];
        }

        return $model;
    }
}

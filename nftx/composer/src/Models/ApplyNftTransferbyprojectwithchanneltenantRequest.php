<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class ApplyNftTransferbyprojectwithchanneltenantRequest extends Model
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
    public $toIdNo;

    // 账号类型，当前只支持支付宝账号
    /**
     * @var string
     */
    public $toIdType;

    // 交易NFT时租户的唯一订单号
    /**
     * @var string
     */
    public $orderNo;

    // 购买NFT的金额，单位分
    /**
     * @var int
     */
    public $priceCent;

    // 渠道租户
    /**
     * @var string
     */
    public $channelTenant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectId'         => 'project_id',
        'toIdNo'            => 'to_id_no',
        'toIdType'          => 'to_id_type',
        'orderNo'           => 'order_no',
        'priceCent'         => 'price_cent',
        'channelTenant'     => 'channel_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('toIdNo', $this->toIdNo, true);
        Model::validateRequired('toIdType', $this->toIdType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('channelTenant', $this->channelTenant, true);
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
        if (null !== $this->toIdNo) {
            $res['to_id_no'] = $this->toIdNo;
        }
        if (null !== $this->toIdType) {
            $res['to_id_type'] = $this->toIdType;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->priceCent) {
            $res['price_cent'] = $this->priceCent;
        }
        if (null !== $this->channelTenant) {
            $res['channel_tenant'] = $this->channelTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyNftTransferbyprojectwithchanneltenantRequest
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
        if (isset($map['to_id_no'])) {
            $model->toIdNo = $map['to_id_no'];
        }
        if (isset($map['to_id_type'])) {
            $model->toIdType = $map['to_id_type'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['price_cent'])) {
            $model->priceCent = $map['price_cent'];
        }
        if (isset($map['channel_tenant'])) {
            $model->channelTenant = $map['channel_tenant'];
        }

        return $model;
    }
}

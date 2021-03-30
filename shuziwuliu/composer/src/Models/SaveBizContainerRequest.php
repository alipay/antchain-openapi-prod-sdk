<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBizContainerRequest extends Model
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

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @var string
     */
    public $action;

    // 订舱单号
    //
    /**
     * @var string
     */
    public $bookingNo;

    // 集装箱ID
    /**
     * @var string
     */
    public $containerId;

    // 箱号 业务必填
    /**
     * @var string
     */
    public $containerNo;

    // 箱型  业务必填
    /**
     * @var string
     */
    public $containerType;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 货物列表
    /**
     * @var ContainerGoodsParam[]
     */
    public $goodsList;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 备注
    /**
     * @var string
     */
    public $remark;

    // 封铅号
    /**
     * @var string
     */
    public $sealNo;

    // 是否SOC
    /**
     * @var string
     */
    public $socFlag;

    // 特殊字段无要求非必填
    /**
     * @var string
     */
    public $source;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'action'            => 'action',
        'bookingNo'         => 'booking_no',
        'containerId'       => 'container_id',
        'containerNo'       => 'container_no',
        'containerType'     => 'container_type',
        'forwarderDid'      => 'forwarder_did',
        'goodsList'         => 'goods_list',
        'orderNo'           => 'order_no',
        'remark'            => 'remark',
        'sealNo'            => 'seal_no',
        'socFlag'           => 'soc_flag',
        'source'            => 'source',
    ];

    public function validate()
    {
        Model::validateRequired('bookingNo', $this->bookingNo, true);
        Model::validateRequired('containerId', $this->containerId, true);
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
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
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }
        if (null !== $this->containerNo) {
            $res['container_no'] = $this->containerNo;
        }
        if (null !== $this->containerType) {
            $res['container_type'] = $this->containerType;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->goodsList) {
            $res['goods_list'] = [];
            if (null !== $this->goodsList && \is_array($this->goodsList)) {
                $n = 0;
                foreach ($this->goodsList as $item) {
                    $res['goods_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->sealNo) {
            $res['seal_no'] = $this->sealNo;
        }
        if (null !== $this->socFlag) {
            $res['soc_flag'] = $this->socFlag;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBizContainerRequest
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
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['booking_no'])) {
            $model->bookingNo = $map['booking_no'];
        }
        if (isset($map['container_id'])) {
            $model->containerId = $map['container_id'];
        }
        if (isset($map['container_no'])) {
            $model->containerNo = $map['container_no'];
        }
        if (isset($map['container_type'])) {
            $model->containerType = $map['container_type'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['goods_list'])) {
            if (!empty($map['goods_list'])) {
                $model->goodsList = [];
                $n                = 0;
                foreach ($map['goods_list'] as $item) {
                    $model->goodsList[$n++] = null !== $item ? ContainerGoodsParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['seal_no'])) {
            $model->sealNo = $map['seal_no'];
        }
        if (isset($map['soc_flag'])) {
            $model->socFlag = $map['soc_flag'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}

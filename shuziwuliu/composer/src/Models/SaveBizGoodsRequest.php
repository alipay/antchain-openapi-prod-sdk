<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBizGoodsRequest extends Model
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

    // 预计备货时间 毫秒值单位
    /**
     * @var int
     */
    public $cargoReadyDate;

    // 危险品页号
    /**
     * @var string
     */
    public $dgPageNo;

    // 危险品级别
    /**
     * @var string
     */
    public $dgType;

    // 危险品闪点
    /**
     * @var string
     */
    public $flashPoint;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 货物 业务必填
    //
    /**
     * @var string
     */
    public $goods;

    // 中文品名
    /**
     * @var string
     */
    public $goodsCn;

    // 货物ID
    /**
     * @var string
     */
    public $goodsId;

    // 货物类型（业务必填）
    /**
     * @var string
     */
    public $goodsType;

    // HS CODE
    /**
     * @var string[]
     */
    public $hsCodes;

    // 唛头
    /**
     * @var string
     */
    public $marks;

    // 委托件数 业务必填
    //
    /**
     * @var string
     */
    public $number;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 包装类型
    /**
     * @var string
     */
    public $packageType;

    // 实际件数
    /**
     * @var string
     */
    public $realNumber;

    // 实际体积
    /**
     * @var string
     */
    public $realVolume;

    // 实际重量
    /**
     * @var string
     */
    public $realWeight;

    // 危险品联合国编号
    /**
     * @var string
     */
    public $unNo;

    // 委托体积（业务必填）
    /**
     * @var string
     */
    public $volume;

    // 委托重量（业务必填）
    /**
     * @var string
     */
    public $weight;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'action'            => 'action',
        'cargoReadyDate'    => 'cargo_ready_date',
        'dgPageNo'          => 'dg_page_no',
        'dgType'            => 'dg_type',
        'flashPoint'        => 'flash_point',
        'forwarderDid'      => 'forwarder_did',
        'goods'             => 'goods',
        'goodsCn'           => 'goods_cn',
        'goodsId'           => 'goods_id',
        'goodsType'         => 'goods_type',
        'hsCodes'           => 'hs_codes',
        'marks'             => 'marks',
        'number'            => 'number',
        'orderNo'           => 'order_no',
        'packageType'       => 'package_type',
        'realNumber'        => 'real_number',
        'realVolume'        => 'real_volume',
        'realWeight'        => 'real_weight',
        'unNo'              => 'un_no',
        'volume'            => 'volume',
        'weight'            => 'weight',
    ];

    public function validate()
    {
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
        Model::validateRequired('goodsId', $this->goodsId, true);
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
        if (null !== $this->cargoReadyDate) {
            $res['cargo_ready_date'] = $this->cargoReadyDate;
        }
        if (null !== $this->dgPageNo) {
            $res['dg_page_no'] = $this->dgPageNo;
        }
        if (null !== $this->dgType) {
            $res['dg_type'] = $this->dgType;
        }
        if (null !== $this->flashPoint) {
            $res['flash_point'] = $this->flashPoint;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->goods) {
            $res['goods'] = $this->goods;
        }
        if (null !== $this->goodsCn) {
            $res['goods_cn'] = $this->goodsCn;
        }
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->hsCodes) {
            $res['hs_codes'] = $this->hsCodes;
        }
        if (null !== $this->marks) {
            $res['marks'] = $this->marks;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->packageType) {
            $res['package_type'] = $this->packageType;
        }
        if (null !== $this->realNumber) {
            $res['real_number'] = $this->realNumber;
        }
        if (null !== $this->realVolume) {
            $res['real_volume'] = $this->realVolume;
        }
        if (null !== $this->realWeight) {
            $res['real_weight'] = $this->realWeight;
        }
        if (null !== $this->unNo) {
            $res['un_no'] = $this->unNo;
        }
        if (null !== $this->volume) {
            $res['volume'] = $this->volume;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBizGoodsRequest
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
        if (isset($map['cargo_ready_date'])) {
            $model->cargoReadyDate = $map['cargo_ready_date'];
        }
        if (isset($map['dg_page_no'])) {
            $model->dgPageNo = $map['dg_page_no'];
        }
        if (isset($map['dg_type'])) {
            $model->dgType = $map['dg_type'];
        }
        if (isset($map['flash_point'])) {
            $model->flashPoint = $map['flash_point'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['goods'])) {
            $model->goods = $map['goods'];
        }
        if (isset($map['goods_cn'])) {
            $model->goodsCn = $map['goods_cn'];
        }
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['hs_codes'])) {
            if (!empty($map['hs_codes'])) {
                $model->hsCodes = $map['hs_codes'];
            }
        }
        if (isset($map['marks'])) {
            $model->marks = $map['marks'];
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['package_type'])) {
            $model->packageType = $map['package_type'];
        }
        if (isset($map['real_number'])) {
            $model->realNumber = $map['real_number'];
        }
        if (isset($map['real_volume'])) {
            $model->realVolume = $map['real_volume'];
        }
        if (isset($map['real_weight'])) {
            $model->realWeight = $map['real_weight'];
        }
        if (isset($map['un_no'])) {
            $model->unNo = $map['un_no'];
        }
        if (isset($map['volume'])) {
            $model->volume = $map['volume'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}

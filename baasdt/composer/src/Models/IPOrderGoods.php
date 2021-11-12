<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPOrderGoods extends Model
{
    // 订单ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipOrderId;

    // 数据渠道类型：0 手动录入，1 淘宝开放平台
    /**
     * @example 0
     *
     * @var int
     */
    public $dataType;

    // ID类型
    /**
     * @example 0
     *
     * @var int
     */
    public $idType;

    // 商品ID
    /**
     * @example goodsId
     *
     * @var string
     */
    public $goodsId;

    // 商品名称
    /**
     * @example goodsName
     *
     * @var string
     */
    public $goodsName;

    // 商家昵称
    /**
     * @example 小浣熊官方旗舰店店主
     *
     * @var string
     */
    public $nick;
    protected $_name = [
        'ipOrderId' => 'ip_order_id',
        'dataType'  => 'data_type',
        'idType'    => 'id_type',
        'goodsId'   => 'goods_id',
        'goodsName' => 'goods_name',
        'nick'      => 'nick',
    ];

    public function validate()
    {
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('goodsId', $this->goodsId, true);
        Model::validateRequired('goodsName', $this->goodsName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->nick) {
            $res['nick'] = $this->nick;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPOrderGoods
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['nick'])) {
            $model->nick = $map['nick'];
        }

        return $model;
    }
}

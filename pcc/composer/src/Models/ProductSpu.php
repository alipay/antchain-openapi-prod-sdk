<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class ProductSpu extends Model
{
    // SPU编码
    /**
     * @example QYBBSPU00000001
     *
     * @var string
     */
    public $spuCode;

    // SPU名称
    /**
     * @example 积分兑换
     *
     * @var string
     */
    public $spuName;

    // spu描述
    /**
     * @example 积分兑换场景
     *
     * @var string
     */
    public $spuDesc;

    // 交付模式，ONLINE/OFFLINE
    /**
     * @example ONLINE
     *
     * @var string
     */
    public $deliveryMode;

    // 归属产品码
    /**
     * @example QYBB
     *
     * @var string
     */
    public $productCode;

    // 是否涉及一方化
    /**
     * @example true, false
     *
     * @var bool
     */
    public $involvedOneParty;

    // technical_product:技术产品，technical_service:技术服务，solution_se:标准解决方案，saas:标准化SaaS，saas+:SaaS +，trading_network:交易网络
    /**
     * @example solution_se
     *
     * @var string
     */
    public $segment;

    // sku数据
    /**
     * @example
     *
     * @var OfferMaster[]
     */
    public $offerMaster;
    protected $_name = [
        'spuCode'          => 'spu_code',
        'spuName'          => 'spu_name',
        'spuDesc'          => 'spu_desc',
        'deliveryMode'     => 'delivery_mode',
        'productCode'      => 'product_code',
        'involvedOneParty' => 'involved_one_party',
        'segment'          => 'segment',
        'offerMaster'      => 'offer_master',
    ];

    public function validate()
    {
        Model::validateRequired('spuCode', $this->spuCode, true);
        Model::validateRequired('spuName', $this->spuName, true);
        Model::validateRequired('spuDesc', $this->spuDesc, true);
        Model::validateRequired('deliveryMode', $this->deliveryMode, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('involvedOneParty', $this->involvedOneParty, true);
        Model::validateRequired('segment', $this->segment, true);
        Model::validateRequired('offerMaster', $this->offerMaster, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->spuCode) {
            $res['spu_code'] = $this->spuCode;
        }
        if (null !== $this->spuName) {
            $res['spu_name'] = $this->spuName;
        }
        if (null !== $this->spuDesc) {
            $res['spu_desc'] = $this->spuDesc;
        }
        if (null !== $this->deliveryMode) {
            $res['delivery_mode'] = $this->deliveryMode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->involvedOneParty) {
            $res['involved_one_party'] = $this->involvedOneParty;
        }
        if (null !== $this->segment) {
            $res['segment'] = $this->segment;
        }
        if (null !== $this->offerMaster) {
            $res['offer_master'] = [];
            if (null !== $this->offerMaster && \is_array($this->offerMaster)) {
                $n = 0;
                foreach ($this->offerMaster as $item) {
                    $res['offer_master'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductSpu
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spu_code'])) {
            $model->spuCode = $map['spu_code'];
        }
        if (isset($map['spu_name'])) {
            $model->spuName = $map['spu_name'];
        }
        if (isset($map['spu_desc'])) {
            $model->spuDesc = $map['spu_desc'];
        }
        if (isset($map['delivery_mode'])) {
            $model->deliveryMode = $map['delivery_mode'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['involved_one_party'])) {
            $model->involvedOneParty = $map['involved_one_party'];
        }
        if (isset($map['segment'])) {
            $model->segment = $map['segment'];
        }
        if (isset($map['offer_master'])) {
            if (!empty($map['offer_master'])) {
                $model->offerMaster = [];
                $n                  = 0;
                foreach ($map['offer_master'] as $item) {
                    $model->offerMaster[$n++] = null !== $item ? OfferMaster::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

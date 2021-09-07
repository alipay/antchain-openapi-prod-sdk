<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GoodsDTO extends Model
{
    // 商品id
    /**
     * @example 123098
     *
     * @var string
     */
    public $goodsId;

    // 商品模板id
    /**
     * @example 123098
     *
     * @var string
     */
    public $templateId;

    // 商品内容
    /**
     * @example {"品牌":"泡泡玛特","货号":"YUIU781","潮玩价格":"¥1286","限量":"95/100","尺寸":"80*69*200 mm","材质":"PVC","专属潮玩码":"TUEYENQKYIU2378H4"}
     *
     * @var string
     */
    public $content;

    // 二维码地址
    /**
     * @example alipays://platformapi/startapp?xxx
     *
     * @var string
     */
    public $qrCode;

    // 区块链信息
    /**
     * @example
     *
     * @var BlockchainInfoDTO
     */
    public $blockchainInfo;
    protected $_name = [
        'goodsId'        => 'goods_id',
        'templateId'     => 'template_id',
        'content'        => 'content',
        'qrCode'         => 'qr_code',
        'blockchainInfo' => 'blockchain_info',
    ];

    public function validate()
    {
        Model::validateRequired('goodsId', $this->goodsId, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('qrCode', $this->qrCode, true);
        Model::validateRequired('blockchainInfo', $this->blockchainInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->qrCode) {
            $res['qr_code'] = $this->qrCode;
        }
        if (null !== $this->blockchainInfo) {
            $res['blockchain_info'] = null !== $this->blockchainInfo ? $this->blockchainInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['qr_code'])) {
            $model->qrCode = $map['qr_code'];
        }
        if (isset($map['blockchain_info'])) {
            $model->blockchainInfo = BlockchainInfoDTO::fromMap($map['blockchain_info']);
        }

        return $model;
    }
}

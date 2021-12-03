<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class UserAsset extends Model
{
    // NFT商品的商品编码
    /**
     * @example 1234
     *
     * @var int
     */
    public $skuId;

    // NFT资产的唯一编码
    /**
     * @example AC1234#001/150
     *
     * @var string
     */
    public $nftId;

    // NFT商品的名称
    /**
     * @example 敦煌飞天九色鹿
     *
     * @var string
     */
    public $skuName;

    // NFT的创作者名称
    /**
     * @example 敦煌
     *
     * @var string
     */
    public $authorName;

    // NFT的发行方名称
    /**
     * @example 支付宝
     *
     * @var string
     */
    public $issuerName;

    // 缩略图url，带5分钟鉴权
    /**
     * @example http://www.abc.com
     *
     * @var string
     */
    public $miniImagePath;
    protected $_name = [
        'skuId'         => 'sku_id',
        'nftId'         => 'nft_id',
        'skuName'       => 'sku_name',
        'authorName'    => 'author_name',
        'issuerName'    => 'issuer_name',
        'miniImagePath' => 'mini_image_path',
    ];

    public function validate()
    {
        Model::validateRequired('skuId', $this->skuId, true);
        Model::validateRequired('nftId', $this->nftId, true);
        Model::validateRequired('skuName', $this->skuName, true);
        Model::validateRequired('authorName', $this->authorName, true);
        Model::validateRequired('issuerName', $this->issuerName, true);
        Model::validateRequired('miniImagePath', $this->miniImagePath, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->nftId) {
            $res['nft_id'] = $this->nftId;
        }
        if (null !== $this->skuName) {
            $res['sku_name'] = $this->skuName;
        }
        if (null !== $this->authorName) {
            $res['author_name'] = $this->authorName;
        }
        if (null !== $this->issuerName) {
            $res['issuer_name'] = $this->issuerName;
        }
        if (null !== $this->miniImagePath) {
            $res['mini_image_path'] = $this->miniImagePath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserAsset
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['nft_id'])) {
            $model->nftId = $map['nft_id'];
        }
        if (isset($map['sku_name'])) {
            $model->skuName = $map['sku_name'];
        }
        if (isset($map['author_name'])) {
            $model->authorName = $map['author_name'];
        }
        if (isset($map['issuer_name'])) {
            $model->issuerName = $map['issuer_name'];
        }
        if (isset($map['mini_image_path'])) {
            $model->miniImagePath = $map['mini_image_path'];
        }

        return $model;
    }
}

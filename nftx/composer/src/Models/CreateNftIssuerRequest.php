<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class CreateNftIssuerRequest extends Model
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

    // 租户发行NFT的唯一编号
    /**
     * @var string
     */
    public $projectId;

    // NFT商品的名称
    /**
     * @var string
     */
    public $skuName;

    // NFT资产类型, 含IMAGE、VIDEO、FILE、AUDIO、THREE_DIMENSIONS等
    /**
     * @var string
     */
    public $skuType;

    // 铸造数量，100起
    /**
     * @var int
     */
    public $quantity;

    // NFT创作者
    /**
     * @var string
     */
    public $author;

    // 发行方名称
    /**
     * @var string
     */
    public $issuerName;

    // NFT商品的描述
    /**
     * @var string
     */
    public $skuDescrption;

    // 跳转链接
    /**
     * @var string
     */
    public $jumpUrl;

    // 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，NFT_CUSTOMIZE（NFT定制）
    /**
     * @var string
     */
    public $bizType;

    // 素材文件结构
    /**
     * @var File[]
     */
    public $files;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectId'         => 'project_id',
        'skuName'           => 'sku_name',
        'skuType'           => 'sku_type',
        'quantity'          => 'quantity',
        'author'            => 'author',
        'issuerName'        => 'issuer_name',
        'skuDescrption'     => 'sku_descrption',
        'jumpUrl'           => 'jump_url',
        'bizType'           => 'biz_type',
        'files'             => 'files',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('skuName', $this->skuName, true);
        Model::validateRequired('skuType', $this->skuType, true);
        Model::validateRequired('quantity', $this->quantity, true);
        Model::validateRequired('author', $this->author, true);
        Model::validateRequired('issuerName', $this->issuerName, true);
        Model::validateRequired('skuDescrption', $this->skuDescrption, true);
        Model::validateRequired('files', $this->files, true);
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
        if (null !== $this->skuName) {
            $res['sku_name'] = $this->skuName;
        }
        if (null !== $this->skuType) {
            $res['sku_type'] = $this->skuType;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->author) {
            $res['author'] = $this->author;
        }
        if (null !== $this->issuerName) {
            $res['issuer_name'] = $this->issuerName;
        }
        if (null !== $this->skuDescrption) {
            $res['sku_descrption'] = $this->skuDescrption;
        }
        if (null !== $this->jumpUrl) {
            $res['jump_url'] = $this->jumpUrl;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->files) {
            $res['files'] = [];
            if (null !== $this->files && \is_array($this->files)) {
                $n = 0;
                foreach ($this->files as $item) {
                    $res['files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateNftIssuerRequest
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
        if (isset($map['sku_name'])) {
            $model->skuName = $map['sku_name'];
        }
        if (isset($map['sku_type'])) {
            $model->skuType = $map['sku_type'];
        }
        if (isset($map['quantity'])) {
            $model->quantity = $map['quantity'];
        }
        if (isset($map['author'])) {
            $model->author = $map['author'];
        }
        if (isset($map['issuer_name'])) {
            $model->issuerName = $map['issuer_name'];
        }
        if (isset($map['sku_descrption'])) {
            $model->skuDescrption = $map['sku_descrption'];
        }
        if (isset($map['jump_url'])) {
            $model->jumpUrl = $map['jump_url'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['files'])) {
            if (!empty($map['files'])) {
                $model->files = [];
                $n            = 0;
                foreach ($map['files'] as $item) {
                    $model->files[$n++] = null !== $item ? File::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

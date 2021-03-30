<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class AddGoodRequest extends Model
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

    // 商品一级分类
    /**
     * @var string
     */
    public $classification;

    // 幂等
    /**
     * @var string
     */
    public $clientToken;

    // 商品名称
    /**
     * @var string
     */
    public $goodName;

    // 权利内容id，权利申明获得
    /**
     * @var string
     */
    public $rightId;

    // 是否直接上架   Y 上架  N 不上架  默认：Y
    /**
     * @var string
     */
    public $selling;

    // 商品标签，英文逗号分割
    /**
     * @var string
     */
    public $tags;

    // 授权规格列表（数量1-3）
    /**
     * @var GoodSkuInfo[]
     */
    public $skuLists;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'classification'    => 'classification',
        'clientToken'       => 'client_token',
        'goodName'          => 'good_name',
        'rightId'           => 'right_id',
        'selling'           => 'selling',
        'tags'              => 'tags',
        'skuLists'          => 'sku_lists',
    ];

    public function validate()
    {
        Model::validateRequired('classification', $this->classification, true);
        Model::validateRequired('goodName', $this->goodName, true);
        Model::validateRequired('rightId', $this->rightId, true);
        Model::validateRequired('skuLists', $this->skuLists, true);
        Model::validateMaxLength('classification', $this->classification, 20);
        Model::validateMaxLength('goodName', $this->goodName, 200);
        Model::validateMaxLength('tags', $this->tags, 200);
        Model::validateMinLength('classification', $this->classification, 1);
        Model::validateMinLength('goodName', $this->goodName, 1);
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
        if (null !== $this->classification) {
            $res['classification'] = $this->classification;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->goodName) {
            $res['good_name'] = $this->goodName;
        }
        if (null !== $this->rightId) {
            $res['right_id'] = $this->rightId;
        }
        if (null !== $this->selling) {
            $res['selling'] = $this->selling;
        }
        if (null !== $this->tags) {
            $res['tags'] = $this->tags;
        }
        if (null !== $this->skuLists) {
            $res['sku_lists'] = [];
            if (null !== $this->skuLists && \is_array($this->skuLists)) {
                $n = 0;
                foreach ($this->skuLists as $item) {
                    $res['sku_lists'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddGoodRequest
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
        if (isset($map['classification'])) {
            $model->classification = $map['classification'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['good_name'])) {
            $model->goodName = $map['good_name'];
        }
        if (isset($map['right_id'])) {
            $model->rightId = $map['right_id'];
        }
        if (isset($map['selling'])) {
            $model->selling = $map['selling'];
        }
        if (isset($map['tags'])) {
            $model->tags = $map['tags'];
        }
        if (isset($map['sku_lists'])) {
            if (!empty($map['sku_lists'])) {
                $model->skuLists = [];
                $n               = 0;
                foreach ($map['sku_lists'] as $item) {
                    $model->skuLists[$n++] = null !== $item ? GoodSkuInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

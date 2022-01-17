<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class CreateNftPublishRequest extends Model
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

    // NFT资产类型, 含IMAGE(图片)、VIDEO(视频)、AUDIO(音频)、THREE_DIMENSIONS(3D模型)等
    /**
     * @var string
     */
    public $skuType;

    // 铸造数量，至少为1
    /**
     * @var int
     */
    public $quantity;

    // NFT创作者。中文或手机号和author_type对应
    /**
     * @var string
     */
    public $author;

    // 创作者类型。手机号或中文类型，和author对应
    /**
     * @var string
     */
    public $authorType;

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

    // 监制方。中文名或手机号，和producer_type对应
    /**
     * @var string
     */
    public $producer;

    // 监制方类型。手机号或中文类型，和producer对应
    /**
     * @var string
     */
    public $producerType;

    // 跳转链接
    /**
     * @var string
     */
    public $jumpUrl;

    // 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，
    /**
     * @var string
     */
    public $bizType;

    // 渠道租户
    /**
     * @var string
     */
    public $channelTenant;

    // 素材文件结构
    /**
     * @var File[]
     */
    public $files;

    // 备注信息
    /**
     * @var string
     */
    public $memo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectId'         => 'project_id',
        'skuName'           => 'sku_name',
        'skuType'           => 'sku_type',
        'quantity'          => 'quantity',
        'author'            => 'author',
        'authorType'        => 'author_type',
        'issuerName'        => 'issuer_name',
        'skuDescrption'     => 'sku_descrption',
        'producer'          => 'producer',
        'producerType'      => 'producer_type',
        'jumpUrl'           => 'jump_url',
        'bizType'           => 'biz_type',
        'channelTenant'     => 'channel_tenant',
        'files'             => 'files',
        'memo'              => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('skuName', $this->skuName, true);
        Model::validateRequired('skuType', $this->skuType, true);
        Model::validateRequired('quantity', $this->quantity, true);
        Model::validateRequired('author', $this->author, true);
        Model::validateRequired('authorType', $this->authorType, true);
        Model::validateRequired('issuerName', $this->issuerName, true);
        Model::validateRequired('skuDescrption', $this->skuDescrption, true);
        Model::validateRequired('producer', $this->producer, true);
        Model::validateRequired('producerType', $this->producerType, true);
        Model::validateRequired('channelTenant', $this->channelTenant, true);
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
        if (null !== $this->authorType) {
            $res['author_type'] = $this->authorType;
        }
        if (null !== $this->issuerName) {
            $res['issuer_name'] = $this->issuerName;
        }
        if (null !== $this->skuDescrption) {
            $res['sku_descrption'] = $this->skuDescrption;
        }
        if (null !== $this->producer) {
            $res['producer'] = $this->producer;
        }
        if (null !== $this->producerType) {
            $res['producer_type'] = $this->producerType;
        }
        if (null !== $this->jumpUrl) {
            $res['jump_url'] = $this->jumpUrl;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->channelTenant) {
            $res['channel_tenant'] = $this->channelTenant;
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
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateNftPublishRequest
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
        if (isset($map['author_type'])) {
            $model->authorType = $map['author_type'];
        }
        if (isset($map['issuer_name'])) {
            $model->issuerName = $map['issuer_name'];
        }
        if (isset($map['sku_descrption'])) {
            $model->skuDescrption = $map['sku_descrption'];
        }
        if (isset($map['producer'])) {
            $model->producer = $map['producer'];
        }
        if (isset($map['producer_type'])) {
            $model->producerType = $map['producer_type'];
        }
        if (isset($map['jump_url'])) {
            $model->jumpUrl = $map['jump_url'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['channel_tenant'])) {
            $model->channelTenant = $map['channel_tenant'];
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
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}

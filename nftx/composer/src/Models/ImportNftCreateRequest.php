<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class ImportNftCreateRequest extends Model
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

    // 对端自己的项目id；用作幂等字段
    /**
     * @var string
     */
    public $projectId;

    // NFT艺术品的名称
    /**
     * @var string
     */
    public $skuName;

    // IMAGE("IMAGE","图片"),
    // VIDEO("VIDEO","视频"),
    // ;
    /**
     * @var string
     */
    public $skuType;

    // 发行数量
    /**
     * @var int
     */
    public $quantity;

    // 艺术品作者
    /**
     * @var string
     */
    public $author;

    // 艺术品拥有者
    /**
     * @var string
     */
    public $owner;

    // 艺术品创作时间
    /**
     * @var string
     */
    public $creationTime;

    // 用于标识NFT资产来自特定的产品，用作特殊的交互跳转需求，非必填字段
    /**
     * @var string
     */
    public $bizType;

    // nft简介信息
    /**
     * @var string
     */
    public $description;

    // 跳转链接
    /**
     * @var string
     */
    public $jumpUrl;

    // nft发行的艺术品文件
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
        'owner'             => 'owner',
        'creationTime'      => 'creation_time',
        'bizType'           => 'biz_type',
        'description'       => 'description',
        'jumpUrl'           => 'jump_url',
        'files'             => 'files',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('skuName', $this->skuName, true);
        Model::validateRequired('skuType', $this->skuType, true);
        Model::validateRequired('quantity', $this->quantity, true);
        Model::validateRequired('author', $this->author, true);
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('creationTime', $this->creationTime, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('files', $this->files, true);
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->jumpUrl) {
            $res['jump_url'] = $this->jumpUrl;
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
     * @return ImportNftCreateRequest
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
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['jump_url'])) {
            $model->jumpUrl = $map['jump_url'];
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

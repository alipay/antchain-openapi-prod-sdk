<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class ImportNftMetaRequest extends Model
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

    // 在外部渠道的全局唯一id
    /**
     * @var string
     */
    public $projectId;

    // nft资产标题
    /**
     * @var string
     */
    public $title;

    // 缩略图OSS文件名
    /**
     * @var string
     */
    public $miniImageUrl;

    // 原图地址
    /**
     * @var string
     */
    public $originImageUrl;

    // 创作者
    /**
     * @var string
     */
    public $author;

    // 作品简介信息文字描述
    /**
     * @var string
     */
    public $description;

    // 商品详情页url
    /**
     * @var string
     */
    public $itemUrl;

    // 资产发行时间
    /**
     * @var string
     */
    public $publishTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectId'         => 'project_id',
        'title'             => 'title',
        'miniImageUrl'      => 'mini_image_url',
        'originImageUrl'    => 'origin_image_url',
        'author'            => 'author',
        'description'       => 'description',
        'itemUrl'           => 'item_url',
        'publishTime'       => 'publish_time',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('miniImageUrl', $this->miniImageUrl, true);
        Model::validateRequired('originImageUrl', $this->originImageUrl, true);
        Model::validateRequired('author', $this->author, true);
        Model::validateRequired('itemUrl', $this->itemUrl, true);
        Model::validateRequired('publishTime', $this->publishTime, true);
        Model::validatePattern('publishTime', $this->publishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->miniImageUrl) {
            $res['mini_image_url'] = $this->miniImageUrl;
        }
        if (null !== $this->originImageUrl) {
            $res['origin_image_url'] = $this->originImageUrl;
        }
        if (null !== $this->author) {
            $res['author'] = $this->author;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->itemUrl) {
            $res['item_url'] = $this->itemUrl;
        }
        if (null !== $this->publishTime) {
            $res['publish_time'] = $this->publishTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportNftMetaRequest
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
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['mini_image_url'])) {
            $model->miniImageUrl = $map['mini_image_url'];
        }
        if (isset($map['origin_image_url'])) {
            $model->originImageUrl = $map['origin_image_url'];
        }
        if (isset($map['author'])) {
            $model->author = $map['author'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['item_url'])) {
            $model->itemUrl = $map['item_url'];
        }
        if (isset($map['publish_time'])) {
            $model->publishTime = $map['publish_time'];
        }

        return $model;
    }
}

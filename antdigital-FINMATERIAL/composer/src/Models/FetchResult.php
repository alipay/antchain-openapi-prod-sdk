<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class FetchResult extends Model {
    protected $_name = [
        'id' => 'id',
        'contentId' => 'content_id',
        'url' => 'url',
        'title' => 'title',
        'siteName' => 'site_name',
        'description' => 'description',
        'content' => 'content',
        'publishTime' => 'publish_time',
        'author' => 'author',
        'logoUrl' => 'logo_url',
        'contentFormats' => 'content_formats',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('contentId', $this->contentId, true);
        Model::validateRequired('url', $this->url, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->siteName) {
            $res['site_name'] = $this->siteName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->publishTime) {
            $res['publish_time'] = $this->publishTime;
        }
        if (null !== $this->author) {
            $res['author'] = $this->author;
        }
        if (null !== $this->logoUrl) {
            $res['logo_url'] = $this->logoUrl;
        }
        if (null !== $this->contentFormats) {
            $res['content_formats'] = $this->contentFormats;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FetchResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['content_id'])){
            $model->contentId = $map['content_id'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['site_name'])){
            $model->siteName = $map['site_name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['publish_time'])){
            $model->publishTime = $map['publish_time'];
        }
        if(isset($map['author'])){
            $model->author = $map['author'];
        }
        if(isset($map['logo_url'])){
            $model->logoUrl = $map['logo_url'];
        }
        if(isset($map['content_formats'])){
            $model->contentFormats = $map['content_formats'];
        }
        return $model;
    }
    // 本次 Fetch 结果唯一标识
    /**
     * @example fetch_req_b24edf30205c491b97ef1500a405b961
     * @var string
     */
    public $id;

    // 内容唯一标识，用于内容去重与引用
    /**
     * @example compensatory_e81c1f5749545c5f7d247b3a100ffe62
     * @var string
     */
    public $contentId;

    // 原始网页链接
    /**
     * @example -
     * @var string
     */
    public $url;

    // 网页标题
    /**
     * @example -
     * @var string
     */
    public $title;

    // 来源站点名称
    /**
     * @example -
     * @var string
     */
    public $siteName;

    // 网页声明的内容描述；来源于页面公开元信息，不是模型生成摘要
    /**
     * @example -
     * @var string
     */
    public $description;

    // 清洗后的网页主要正文
    /**
     * @example -
     * @var string
     */
    public $content;

    // 内容发布时间，ISO 8601 格式
    /**
     * @example -
     * @var string
     */
    public $publishTime;

    // 作者或发布机构
    /**
     * @example -
     * @var string
     */
    public $author;

    // 来源站点 Logo 链接
    /**
     * @example -
     * @var string
     */
    public $logoUrl;

    // 正文实际输出格式：text 或 markdown
    /**
     * @example text
     * @var string
     */
    public $contentFormats;

}

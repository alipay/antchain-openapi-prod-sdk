<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class WebItem extends Model {
    protected $_name = [
        'id' => 'id',
        'contentId' => 'content_id',
        'sortId' => 'sort_id',
        'title' => 'title',
        'siteName' => 'site_name',
        'summary' => 'summary',
        'content' => 'content',
        'publishTime' => 'publish_time',
        'author' => 'author',
        'logoUrl' => 'logo_url',
        'contentFormats' => 'content_formats',
        'trustyLevel' => 'trusty_level',
        'url' => 'url',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('contentId', $this->contentId, true);
        Model::validateRequired('sortId', $this->sortId, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('trustyLevel', $this->trustyLevel, true);
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
        if (null !== $this->sortId) {
            $res['sort_id'] = $this->sortId;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->siteName) {
            $res['site_name'] = $this->siteName;
        }
        if (null !== $this->summary) {
            $res['summary'] = $this->summary;
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
        if (null !== $this->trustyLevel) {
            $res['trusty_level'] = $this->trustyLevel;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WebItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['content_id'])){
            $model->contentId = $map['content_id'];
        }
        if(isset($map['sort_id'])){
            $model->sortId = $map['sort_id'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['site_name'])){
            $model->siteName = $map['site_name'];
        }
        if(isset($map['summary'])){
            $model->summary = $map['summary'];
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
        if(isset($map['trusty_level'])){
            $model->trustyLevel = $map['trusty_level'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        return $model;
    }
    // 搜索结果唯一标识
    /**
     * @example -
     * @var string
     */
    public $id;

    // 内容唯一标识，用于内容去重与引用
    /**
     * @example -
     * @var string
     */
    public $contentId;

    // 结果排序位置，从 1 开始
    /**
     * @example 1
     * @var int
     */
    public $sortId;

    // 结果标题
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

    // 与 Query 相关的已有摘要，适合模型上下文。include_summary=true 且有可用摘要时返回；false 时省略，不触发在线摘要生成。
    /**
     * @example -
     * @var string
     */
    public $summary;

    // 清洗后的正文；include_content=true 且当前 mode 有可用正文时返回。standard 默认返回可用正文；fast 预设不返回，pro 预设按需返回。include_content=false 时省略，不改变检索、排序。
    /**
     * @example -
     * @var string
     */
    public $content;

    // 网页发布时间，ISO 8601 格式
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

    // 来源站点图标链接
    /**
     * @example -
     * @var string
     */
    public $logoUrl;

    // 仅在实际返回 Content 时返回正文格式，当前为 text；include_content=false 或无正文时省略。
    /**
     * @example -
     * @var string
     */
    public $contentFormats;

    // 可信等级，取值低/中/高
    /**
     * @example 中
     * @var string
     */
    public $trustyLevel;

    // 网页或 PDF 的原文链接，均必返。
    /**
     * @example -
     * @var string
     */
    public $url;

}

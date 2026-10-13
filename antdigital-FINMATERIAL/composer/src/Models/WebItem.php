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
        'url' => 'url',
        'summary' => 'summary',
        'content' => 'content',
        'publishTime' => 'publish_time',
        'author' => 'author',
        'logoUrl' => 'logo_url',
        'contentFormats' => 'content_formats',
        'trustyLevel' => 'trusty_level',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('contentId', $this->contentId, true);
        Model::validateRequired('sortId', $this->sortId, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('summary', $this->summary, true);
        Model::validateRequired('trustyLevel', $this->trustyLevel, true);
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
        if (null !== $this->url) {
            $res['url'] = $this->url;
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
        if(isset($map['url'])){
            $model->url = $map['url'];
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

    // 网页原文链接；PDF 等无原文链接的结果可能不返回该字段。filter.need_url 为预留参数，当前不生效
    /**
     * @example -
     * @var string
     */
    public $url;

    // 与 Query 相关的网页摘要，适合模型上下文
    /**
     * @example -
     * @var string
     */
    public $summary;

    // 清洗后的网页正文，按 mode 返回；auto 默认返回可用正文，fast 预设不返回，pro 预设按需返回
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

    // 随 Content 返回正文实际格式，当前为 text；未返回 Content 时省略
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

}

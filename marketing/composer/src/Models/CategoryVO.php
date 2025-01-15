<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class CategoryVO extends Model
{
    // 内部id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 内容库id
    /**
     * @example
     *
     * @var int
     */
    public $siteId;

    // 站点
    /**
     * @example ""
     *
     * @var string
     */
    public $site;

    // language
    /**
     * @example ""
     *
     * @var string
     */
    public $language;

    // title
    /**
     * @example ""
     *
     * @var string
     */
    public $title;

    // 类型
    /**
     * @example
     *
     * @var int
     */
    public $type;

    // 展示类型 1为左侧展示2为列表展示
    /**
     * @example
     *
     * @var int
     */
    public $showType;

    // 排序
    /**
     * @example
     *
     * @var int
     */
    public $sort;

    // 目录层级
    /**
     * @example
     *
     * @var int
     */
    public $level;

    // 外标id
    /**
     * @example ""
     *
     * @var string
     */
    public $extId;

    // 父id
    /**
     * @example ""
     *
     * @var string
     */
    public $parentId;

    // 来源类型
    /**
     * @example
     *
     * @var int
     */
    public $sourceType;

    // 版本
    /**
     * @example ""
     *
     * @var string
     */
    public $version;

    // 语雀目录有无数据判定
    /**
     * @example
     *
     * @var int
     */
    public $catalogueType;
    protected $_name = [
        'id'            => 'id',
        'siteId'        => 'site_id',
        'site'          => 'site',
        'language'      => 'language',
        'title'         => 'title',
        'type'          => 'type',
        'showType'      => 'show_type',
        'sort'          => 'sort',
        'level'         => 'level',
        'extId'         => 'ext_id',
        'parentId'      => 'parent_id',
        'sourceType'    => 'source_type',
        'version'       => 'version',
        'catalogueType' => 'catalogue_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->siteId) {
            $res['site_id'] = $this->siteId;
        }
        if (null !== $this->site) {
            $res['site'] = $this->site;
        }
        if (null !== $this->language) {
            $res['language'] = $this->language;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->showType) {
            $res['show_type'] = $this->showType;
        }
        if (null !== $this->sort) {
            $res['sort'] = $this->sort;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->extId) {
            $res['ext_id'] = $this->extId;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->catalogueType) {
            $res['catalogue_type'] = $this->catalogueType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CategoryVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['site_id'])) {
            $model->siteId = $map['site_id'];
        }
        if (isset($map['site'])) {
            $model->site = $map['site'];
        }
        if (isset($map['language'])) {
            $model->language = $map['language'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['show_type'])) {
            $model->showType = $map['show_type'];
        }
        if (isset($map['sort'])) {
            $model->sort = $map['sort'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['ext_id'])) {
            $model->extId = $map['ext_id'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['catalogue_type'])) {
            $model->catalogueType = $map['catalogue_type'];
        }

        return $model;
    }
}

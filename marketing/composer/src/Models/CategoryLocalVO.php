<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class CategoryLocalVO extends Model
{
    // id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // siteId
    /**
     * @example
     *
     * @var int
     */
    public $siteId;

    // title
    /**
     * @example ""
     *
     * @var string
     */
    public $title;

    // type
    /**
     * @example
     *
     * @var int
     */
    public $type;

    // sort
    /**
     * @example
     *
     * @var int
     */
    public $sort;

    // level
    /**
     * @example
     *
     * @var int
     */
    public $level;

    // parent_id
    /**
     * @example ""
     *
     * @var string
     */
    public $parentId;

    // sourceType
    /**
     * @example
     *
     * @var int
     */
    public $sourceType;

    // show_type
    /**
     * @example
     *
     * @var int
     */
    public $showType;

    // ext_id
    /**
     * @example ""
     *
     * @var string
     */
    public $extId;

    // shield
    /**
     * @example
     *
     * @var int
     */
    public $shieId;

    // status
    /**
     * @example
     *
     * @var int
     */
    public $status;

    // deleted
    /**
     * @example
     *
     * @var int
     */
    public $deleted;

    // tree
    /**
     * @example ""
     *
     * @var string
     */
    public $tree;

    // green
    /**
     * @example
     *
     * @var int
     */
    public $green;

    // site_code
    /**
     * @example ""
     *
     * @var string
     */
    public $siteCode;

    // created_time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // modified_time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;

    // isCatalogue
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isCatalogue;
    protected $_name = [
        'id'           => 'id',
        'siteId'       => 'site_id',
        'title'        => 'title',
        'type'         => 'type',
        'sort'         => 'sort',
        'level'        => 'level',
        'parentId'     => 'parent_id',
        'sourceType'   => 'source_type',
        'showType'     => 'show_type',
        'extId'        => 'ext_id',
        'shieId'       => 'shie_id',
        'status'       => 'status',
        'deleted'      => 'deleted',
        'tree'         => 'tree',
        'green'        => 'green',
        'siteCode'     => 'site_code',
        'createdTime'  => 'created_time',
        'modifiedTime' => 'modified_time',
        'isCatalogue'  => 'is_catalogue',
    ];

    public function validate()
    {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->sort) {
            $res['sort'] = $this->sort;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->showType) {
            $res['show_type'] = $this->showType;
        }
        if (null !== $this->extId) {
            $res['ext_id'] = $this->extId;
        }
        if (null !== $this->shieId) {
            $res['shie_id'] = $this->shieId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->deleted) {
            $res['deleted'] = $this->deleted;
        }
        if (null !== $this->tree) {
            $res['tree'] = $this->tree;
        }
        if (null !== $this->green) {
            $res['green'] = $this->green;
        }
        if (null !== $this->siteCode) {
            $res['site_code'] = $this->siteCode;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->isCatalogue) {
            $res['is_catalogue'] = $this->isCatalogue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CategoryLocalVO
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
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['sort'])) {
            $model->sort = $map['sort'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }
        if (isset($map['show_type'])) {
            $model->showType = $map['show_type'];
        }
        if (isset($map['ext_id'])) {
            $model->extId = $map['ext_id'];
        }
        if (isset($map['shie_id'])) {
            $model->shieId = $map['shie_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['deleted'])) {
            $model->deleted = $map['deleted'];
        }
        if (isset($map['tree'])) {
            $model->tree = $map['tree'];
        }
        if (isset($map['green'])) {
            $model->green = $map['green'];
        }
        if (isset($map['site_code'])) {
            $model->siteCode = $map['site_code'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }
        if (isset($map['is_catalogue'])) {
            $model->isCatalogue = $map['is_catalogue'];
        }

        return $model;
    }
}

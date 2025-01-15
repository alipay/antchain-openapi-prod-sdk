<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class QueryDocChildResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 内部id
    /**
     * @var int
     */
    public $id;

    // 内容库id
    /**
     * @var int
     */
    public $siteId;

    // 站点
    /**
     * @var string
     */
    public $site;

    // 语言code
    /**
     * @var string
     */
    public $language;

    // 名称
    /**
     * @var string
     */
    public $title;

    // 类型
    /**
     * @var int
     */
    public $type;

    // 展示类型 1为左侧展示2为列表展示
    /**
     * @var int
     */
    public $showType;

    // 排序
    /**
     * @var int
     */
    public $sort;

    // 目录层级
    /**
     * @var int
     */
    public $level;

    // 外标id
    /**
     * @var string
     */
    public $extId;

    // 父id
    /**
     * @var string
     */
    public $parentId;

    // 来源类型
    /**
     * @var int
     */
    public $sourceType;

    // 版本
    /**
     * @var string
     */
    public $version;

    // 语雀目录有无数据判定
    /**
     * @var int
     */
    public $catalogueType;

    // children
    /**
     * @var CategoryVO[]
     */
    public $children;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
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
        'children'      => 'children',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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
        if (null !== $this->children) {
            $res['children'] = [];
            if (null !== $this->children && \is_array($this->children)) {
                $n = 0;
                foreach ($this->children as $item) {
                    $res['children'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDocChildResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
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
        if (isset($map['children'])) {
            if (!empty($map['children'])) {
                $model->children = [];
                $n               = 0;
                foreach ($map['children'] as $item) {
                    $model->children[$n++] = null !== $item ? CategoryVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

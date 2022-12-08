<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class Project extends Model
{
    // 项目名字
    /**
     * @example 项目A
     *
     * @var string
     */
    public $name;

    // 作者名称
    /**
     * @example ["a","b"]
     *
     * @var string[]
     */
    public $authorNameList;

    // 关键词
    /**
     * @example ["key"]
     *
     * @var string[]
     */
    public $posKeywordList;

    // 标题包含词列表
    /**
     * @example ["key"]
     *
     * @var string[]
     */
    public $posKeywordListInTitle;

    // 排除关键词标签列表
    /**
     * @example ["key"]
     *
     * @var string
     */
    public $excludeKeywordTagIds;

    // 修改人uid
    /**
     * @example 2088XX
     *
     * @var string
     */
    public $uidModified;

    // 提级用户名，如@xxx
    /**
     * @example ["小黄"]
     *
     * @var string[]
     */
    public $atAuthorNameList;

    // 排除词
    /**
     * @example ["排除"]
     *
     * @var string[]
     */
    public $excludeKeywordList;

    // 项目的分析页面id，关联hbase中的自定义页面表
    /**
     * @example 1
     *
     * @var int
     */
    public $analyseCpId;

    // 关键词标签列表
    /**
     * @example ["tag"]
     *
     * @var string[]
     */
    public $keywordTagIds;

    // 搭配词
    /**
     * @example ["key"]
     *
     * @var string[]
     */
    public $assKeywordList;

    // 项目ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 默认搜索模板id
    /**
     * @example 1
     *
     * @var int
     */
    public $defaultFilterId;

    // 创建人名称
    /**
     * @example 小黄
     *
     * @var string
     */
    public $unameCreate;

    // 父项目id
    /**
     * @example 1
     *
     * @var int
     */
    public $parentId;

    // 创建时间
    /**
     * @example 1668081173781
     *
     * @var int
     */
    public $gmtCreate;

    // 修改人名称
    /**
     * @example 小黄
     *
     * @var string
     */
    public $unameModified;

    // 修改时间
    /**
     * @example 1668081173780
     *
     * @var int
     */
    public $gmtModified;

    // 项目分组id
    /**
     * @example 1
     *
     * @var int
     */
    public $projectGroupId;

    // 父文章id
    /**
     * @example 1
     *
     * @var int
     */
    public $parentDocId;

    // 文章id列表
    /**
     * @example ["1"]
     *
     * @var string[]
     */
    public $docIdList;

    // 话题词列表
    /**
     * @example ["key"]
     *
     * @var string[]
     */
    public $topicList;

    // 创建人UID
    /**
     * @example 2088XX
     *
     * @var string
     */
    public $uidCreate;
    protected $_name = [
        'name'                  => 'name',
        'authorNameList'        => 'author_name_list',
        'posKeywordList'        => 'pos_keyword_list',
        'posKeywordListInTitle' => 'pos_keyword_list_in_title',
        'excludeKeywordTagIds'  => 'exclude_keyword_tag_ids',
        'uidModified'           => 'uid_modified',
        'atAuthorNameList'      => 'at_author_name_list',
        'excludeKeywordList'    => 'exclude_keyword_list',
        'analyseCpId'           => 'analyse_cp_id',
        'keywordTagIds'         => 'keyword_tag_ids',
        'assKeywordList'        => 'ass_keyword_list',
        'id'                    => 'id',
        'defaultFilterId'       => 'default_filter_id',
        'unameCreate'           => 'uname_create',
        'parentId'              => 'parent_id',
        'gmtCreate'             => 'gmt_create',
        'unameModified'         => 'uname_modified',
        'gmtModified'           => 'gmt_modified',
        'projectGroupId'        => 'project_group_id',
        'parentDocId'           => 'parent_doc_id',
        'docIdList'             => 'doc_id_list',
        'topicList'             => 'topic_list',
        'uidCreate'             => 'uid_create',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('posKeywordList', $this->posKeywordList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->authorNameList) {
            $res['author_name_list'] = $this->authorNameList;
        }
        if (null !== $this->posKeywordList) {
            $res['pos_keyword_list'] = $this->posKeywordList;
        }
        if (null !== $this->posKeywordListInTitle) {
            $res['pos_keyword_list_in_title'] = $this->posKeywordListInTitle;
        }
        if (null !== $this->excludeKeywordTagIds) {
            $res['exclude_keyword_tag_ids'] = $this->excludeKeywordTagIds;
        }
        if (null !== $this->uidModified) {
            $res['uid_modified'] = $this->uidModified;
        }
        if (null !== $this->atAuthorNameList) {
            $res['at_author_name_list'] = $this->atAuthorNameList;
        }
        if (null !== $this->excludeKeywordList) {
            $res['exclude_keyword_list'] = $this->excludeKeywordList;
        }
        if (null !== $this->analyseCpId) {
            $res['analyse_cp_id'] = $this->analyseCpId;
        }
        if (null !== $this->keywordTagIds) {
            $res['keyword_tag_ids'] = $this->keywordTagIds;
        }
        if (null !== $this->assKeywordList) {
            $res['ass_keyword_list'] = $this->assKeywordList;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->defaultFilterId) {
            $res['default_filter_id'] = $this->defaultFilterId;
        }
        if (null !== $this->unameCreate) {
            $res['uname_create'] = $this->unameCreate;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->unameModified) {
            $res['uname_modified'] = $this->unameModified;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->projectGroupId) {
            $res['project_group_id'] = $this->projectGroupId;
        }
        if (null !== $this->parentDocId) {
            $res['parent_doc_id'] = $this->parentDocId;
        }
        if (null !== $this->docIdList) {
            $res['doc_id_list'] = $this->docIdList;
        }
        if (null !== $this->topicList) {
            $res['topic_list'] = $this->topicList;
        }
        if (null !== $this->uidCreate) {
            $res['uid_create'] = $this->uidCreate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Project
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['author_name_list'])) {
            if (!empty($map['author_name_list'])) {
                $model->authorNameList = $map['author_name_list'];
            }
        }
        if (isset($map['pos_keyword_list'])) {
            if (!empty($map['pos_keyword_list'])) {
                $model->posKeywordList = $map['pos_keyword_list'];
            }
        }
        if (isset($map['pos_keyword_list_in_title'])) {
            if (!empty($map['pos_keyword_list_in_title'])) {
                $model->posKeywordListInTitle = $map['pos_keyword_list_in_title'];
            }
        }
        if (isset($map['exclude_keyword_tag_ids'])) {
            $model->excludeKeywordTagIds = $map['exclude_keyword_tag_ids'];
        }
        if (isset($map['uid_modified'])) {
            $model->uidModified = $map['uid_modified'];
        }
        if (isset($map['at_author_name_list'])) {
            if (!empty($map['at_author_name_list'])) {
                $model->atAuthorNameList = $map['at_author_name_list'];
            }
        }
        if (isset($map['exclude_keyword_list'])) {
            if (!empty($map['exclude_keyword_list'])) {
                $model->excludeKeywordList = $map['exclude_keyword_list'];
            }
        }
        if (isset($map['analyse_cp_id'])) {
            $model->analyseCpId = $map['analyse_cp_id'];
        }
        if (isset($map['keyword_tag_ids'])) {
            if (!empty($map['keyword_tag_ids'])) {
                $model->keywordTagIds = $map['keyword_tag_ids'];
            }
        }
        if (isset($map['ass_keyword_list'])) {
            if (!empty($map['ass_keyword_list'])) {
                $model->assKeywordList = $map['ass_keyword_list'];
            }
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['default_filter_id'])) {
            $model->defaultFilterId = $map['default_filter_id'];
        }
        if (isset($map['uname_create'])) {
            $model->unameCreate = $map['uname_create'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['uname_modified'])) {
            $model->unameModified = $map['uname_modified'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['project_group_id'])) {
            $model->projectGroupId = $map['project_group_id'];
        }
        if (isset($map['parent_doc_id'])) {
            $model->parentDocId = $map['parent_doc_id'];
        }
        if (isset($map['doc_id_list'])) {
            if (!empty($map['doc_id_list'])) {
                $model->docIdList = $map['doc_id_list'];
            }
        }
        if (isset($map['topic_list'])) {
            if (!empty($map['topic_list'])) {
                $model->topicList = $map['topic_list'];
            }
        }
        if (isset($map['uid_create'])) {
            $model->uidCreate = $map['uid_create'];
        }

        return $model;
    }
}

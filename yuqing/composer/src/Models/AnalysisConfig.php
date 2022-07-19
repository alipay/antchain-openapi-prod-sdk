<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class AnalysisConfig extends Model
{
    // 文章ID
    /**
     * @example 1
     *
     * @var string
     */
    public $docId;

    // 文章URL
    /**
     * @example http://XXX
     *
     * @var string
     */
    public $url;

    // 项目ID
    /**
     * @example 1
     *
     * @var int
     */
    public $projectId;

    // 模板ID
    /**
     * @example
     *
     * @var int
     */
    public $filterId;

    // 关键词列表
    /**
     * @example
     *
     * @var string[]
     */
    public $posKeywordList;

    // 开始时间
    /**
     * @example
     *
     * @var int
     */
    public $publishTimeStart;

    // 结束时间
    /**
     * @example
     *
     * @var int
     */
    public $publishTimeEnd;

    // URL列表
    /**
     * @example
     *
     * @var string[]
     */
    public $urlList;
    protected $_name = [
        'docId'            => 'doc_id',
        'url'              => 'url',
        'projectId'        => 'project_id',
        'filterId'         => 'filter_id',
        'posKeywordList'   => 'pos_keyword_list',
        'publishTimeStart' => 'publish_time_start',
        'publishTimeEnd'   => 'publish_time_end',
        'urlList'          => 'url_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->filterId) {
            $res['filter_id'] = $this->filterId;
        }
        if (null !== $this->posKeywordList) {
            $res['pos_keyword_list'] = $this->posKeywordList;
        }
        if (null !== $this->publishTimeStart) {
            $res['publish_time_start'] = $this->publishTimeStart;
        }
        if (null !== $this->publishTimeEnd) {
            $res['publish_time_end'] = $this->publishTimeEnd;
        }
        if (null !== $this->urlList) {
            $res['url_list'] = $this->urlList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AnalysisConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['doc_id'])) {
            $model->docId = $map['doc_id'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['filter_id'])) {
            $model->filterId = $map['filter_id'];
        }
        if (isset($map['pos_keyword_list'])) {
            if (!empty($map['pos_keyword_list'])) {
                $model->posKeywordList = $map['pos_keyword_list'];
            }
        }
        if (isset($map['publish_time_start'])) {
            $model->publishTimeStart = $map['publish_time_start'];
        }
        if (isset($map['publish_time_end'])) {
            $model->publishTimeEnd = $map['publish_time_end'];
        }
        if (isset($map['url_list'])) {
            if (!empty($map['url_list'])) {
                $model->urlList = $map['url_list'];
            }
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class SearchContext extends Model {
    protected $_name = [
        'originQuery' => 'origin_query',
        'searchType' => 'search_type',
        'mode' => 'mode',
    ];
    public function validate() {
        Model::validateRequired('originQuery', $this->originQuery, true);
        Model::validateRequired('searchType', $this->searchType, true);
        Model::validateRequired('mode', $this->mode, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->originQuery) {
            $res['origin_query'] = $this->originQuery;
        }
        if (null !== $this->searchType) {
            $res['search_type'] = $this->searchType;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SearchContext
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['origin_query'])){
            $model->originQuery = $map['origin_query'];
        }
        if(isset($map['search_type'])){
            $model->searchType = $map['search_type'];
        }
        if(isset($map['mode'])){
            $model->mode = $map['mode'];
        }
        return $model;
    }
    // 原始搜索内容
    /**
     * @example -
     * @var string
     */
    public $originQuery;

    // 实际执行的搜索类型，当前为 web
    /**
     * @example web
     * @var string
     */
    public $searchType;

    // 实际执行的 AI 上下文档位；当前为 auto，后续可返回 fast 或 pro
    /**
     * @example auto
     * @var string
     */
    public $mode;

}

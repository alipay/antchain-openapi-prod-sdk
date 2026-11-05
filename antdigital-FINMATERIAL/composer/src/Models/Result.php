<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\FINMATERIAL\Models\WebItem;
use AntChain\FINMATERIAL\Models\SearchContext;
use AntChain\FINMATERIAL\Models\IndustryDataItem;

class Result extends Model {
    protected $_name = [
        'resultCount' => 'result_count',
        'webResults' => 'web_results',
        'searchContext' => 'search_context',
        'industryData' => 'industry_data',
    ];
    public function validate() {
        Model::validateRequired('resultCount', $this->resultCount, true);
        Model::validateRequired('webResults', $this->webResults, true);
        Model::validateRequired('searchContext', $this->searchContext, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->resultCount) {
            $res['result_count'] = $this->resultCount;
        }
        if (null !== $this->webResults) {
            $res['web_results'] = [];
            if(null !== $this->webResults && is_array($this->webResults)){
                $n = 0;
                foreach($this->webResults as $item){
                    $res['web_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->searchContext) {
            $res['search_context'] = null !== $this->searchContext ? $this->searchContext->toMap() : null;
        }
        if (null !== $this->industryData) {
            $res['industry_data'] = [];
            if(null !== $this->industryData && is_array($this->industryData)){
                $n = 0;
                foreach($this->industryData as $item){
                    $res['industry_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Result
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['result_count'])){
            $model->resultCount = $map['result_count'];
        }
        if(isset($map['web_results'])){
            if(!empty($map['web_results'])){
                $model->webResults = [];
                $n = 0;
                foreach($map['web_results'] as $item) {
                    $model->webResults[$n++] = null !== $item ? WebItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['search_context'])){
            $model->searchContext = SearchContext::fromMap($map['search_context']);
        }
        if(isset($map['industry_data'])){
            if(!empty($map['industry_data'])){
                $model->industryData = [];
                $n = 0;
                foreach($map['industry_data'] as $item) {
                    $model->industryData[$n++] = null !== $item ? IndustryDataItem::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // WebResults 实际返回的网页结果数量
    /**
     * @example 10
     * @var int
     */
    public $resultCount;

    // 网页搜索结果列表，对应请求中的 search_type=web
    /**
     * @example undefined
     * @var WebItem[]
     */
    public $webResults;

    // 本次搜索的上下文信息
    /**
     * @example undefined
     * @var SearchContext
     */
    public $searchContext;

    // 行业数据检索结果列表。仅在 filter_enable_industry_data_search=true 且命中时返回，支持多个结果，一般仅 1 个；开关关闭时不调用垂类接口且省略此字段。
    /**
     * @example -
     * @var IndustryDataItem[]
     */
    public $industryData;

}

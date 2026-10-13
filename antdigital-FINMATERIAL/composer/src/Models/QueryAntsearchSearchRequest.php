<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryAntsearchSearchRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'query' => 'query',
        'mode' => 'mode',
        'searchType' => 'search_type',
        'count' => 'count',
        'contentFormat' => 'content_format',
        'filterIncludeDomains' => 'filter_include_domains',
        'filterExcludeDomains' => 'filter_exclude_domains',
        'filterTimeRange' => 'filter_time_range',
        'filterNeedUrl' => 'filter_need_url',
        'filterIndustry' => 'filter_industry',
        'filterEnableIndustryDataSearch' => 'filter_enable_industry_data_search',
    ];
    public function validate() {
        Model::validateRequired('query', $this->query, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->searchType) {
            $res['search_type'] = $this->searchType;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->contentFormat) {
            $res['content_format'] = $this->contentFormat;
        }
        if (null !== $this->filterIncludeDomains) {
            $res['filter_include_domains'] = $this->filterIncludeDomains;
        }
        if (null !== $this->filterExcludeDomains) {
            $res['filter_exclude_domains'] = $this->filterExcludeDomains;
        }
        if (null !== $this->filterTimeRange) {
            $res['filter_time_range'] = $this->filterTimeRange;
        }
        if (null !== $this->filterNeedUrl) {
            $res['filter_need_url'] = $this->filterNeedUrl;
        }
        if (null !== $this->filterIndustry) {
            $res['filter_industry'] = $this->filterIndustry;
        }
        if (null !== $this->filterEnableIndustryDataSearch) {
            $res['filter_enable_industry_data_search'] = $this->filterEnableIndustryDataSearch;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntsearchSearchRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['query'])){
            $model->query = $map['query'];
        }
        if(isset($map['mode'])){
            $model->mode = $map['mode'];
        }
        if(isset($map['search_type'])){
            $model->searchType = $map['search_type'];
        }
        if(isset($map['count'])){
            $model->count = $map['count'];
        }
        if(isset($map['content_format'])){
            $model->contentFormat = $map['content_format'];
        }
        if(isset($map['filter_include_domains'])){
            $model->filterIncludeDomains = $map['filter_include_domains'];
        }
        if(isset($map['filter_exclude_domains'])){
            $model->filterExcludeDomains = $map['filter_exclude_domains'];
        }
        if(isset($map['filter_time_range'])){
            $model->filterTimeRange = $map['filter_time_range'];
        }
        if(isset($map['filter_need_url'])){
            $model->filterNeedUrl = $map['filter_need_url'];
        }
        if(isset($map['filter_industry'])){
            $model->filterIndustry = $map['filter_industry'];
        }
        if(isset($map['filter_enable_industry_data_search'])){
            $model->filterEnableIndustryDataSearch = $map['filter_enable_industry_data_search'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 搜索内容，不能为空；建议不超过 200 个字符
    /**
     * @var string
     */
    public $query;

    // AI 上下文档位，协议预设 fast、auto、pro，用于控制检索深度、内容密度和 Token 规模；当前仅支持 auto，传入其他值将返回参数错误
    /**
     * @var string
     */
    public $mode;

    // 搜索类型，当前仅支持 web；后续可扩展 image
    /**
     * @var string
     */
    public $searchType;

    // 网页结果最大返回数量，取值范围 1～30；不包含 IndustryData
    /**
     * @var int
     */
    public $count;

    // 正文格式。当前支持 text；markdown 为预留值，暂不支持
    /**
     * @var string
     */
    public $contentFormat;

    // 仅搜索指定网站。例如gov.cn表示只返回该域名下的内容；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
    /**
     * @var string
     */
    public $filterIncludeDomains;

    // 排除指定网站；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
    /**
     * @var string
     */
    public $filterExcludeDomains;

    // 预留。计划用于按发布时间筛选，当前不生效
    /**
     * @var string
     */
    public $filterTimeRange;

    // 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
    /**
     * @var bool
     */
    public $filterNeedUrl;

    // 预留。计划支持 news 等网页搜索领域，当前不生效
    /**
     * @var string
     */
    public $filterIndustry;

    // 是否返回 IndustryData
    /**
     * @var bool
     */
    public $filterEnableIndustryDataSearch;

}

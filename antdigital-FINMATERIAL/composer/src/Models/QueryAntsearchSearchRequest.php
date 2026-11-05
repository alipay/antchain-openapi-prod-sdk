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
        'filterIncludeSites' => 'filter_include_sites',
        'filterExcludeSites' => 'filter_exclude_sites',
        'filterTimeRange' => 'filter_time_range',
        'filterIndustry' => 'filter_industry',
        'filterEnableIndustryDataSearch' => 'filter_enable_industry_data_search',
        'includeContent' => 'include_content',
        'includeSummary' => 'include_summary',
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
        if (null !== $this->filterIncludeSites) {
            $res['filter_include_sites'] = $this->filterIncludeSites;
        }
        if (null !== $this->filterExcludeSites) {
            $res['filter_exclude_sites'] = $this->filterExcludeSites;
        }
        if (null !== $this->filterTimeRange) {
            $res['filter_time_range'] = $this->filterTimeRange;
        }
        if (null !== $this->filterIndustry) {
            $res['filter_industry'] = $this->filterIndustry;
        }
        if (null !== $this->filterEnableIndustryDataSearch) {
            $res['filter_enable_industry_data_search'] = $this->filterEnableIndustryDataSearch;
        }
        if (null !== $this->includeContent) {
            $res['include_content'] = $this->includeContent;
        }
        if (null !== $this->includeSummary) {
            $res['include_summary'] = $this->includeSummary;
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
        if(isset($map['filter_include_sites'])){
            $model->filterIncludeSites = $map['filter_include_sites'];
        }
        if(isset($map['filter_exclude_sites'])){
            $model->filterExcludeSites = $map['filter_exclude_sites'];
        }
        if(isset($map['filter_time_range'])){
            $model->filterTimeRange = $map['filter_time_range'];
        }
        if(isset($map['filter_industry'])){
            $model->filterIndustry = $map['filter_industry'];
        }
        if(isset($map['filter_enable_industry_data_search'])){
            $model->filterEnableIndustryDataSearch = $map['filter_enable_industry_data_search'];
        }
        if(isset($map['include_content'])){
            $model->includeContent = $map['include_content'];
        }
        if(isset($map['include_summary'])){
            $model->includeSummary = $map['include_summary'];
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

    // 正文格式，当前支持 text；markdown 为预留值，暂不支持。仅在实际返回 Content 时生效；include_content=false 时不影响输出。
    /**
     * @var string
     */
    public $contentFormat;

    // 仅返回指定域名及其子域名的结果；最多 5 个，填写域名，不接受协议和路径。多个域名之间使用英文逗号(,)隔开。与排除名单重叠时，排除优先。
    /**
     * @var string
     */
    public $filterIncludeSites;

    // 排除指定域名及其子域名的结果；最多 5 个，填写域名，不接受协议和路径。与包含名单重叠时，排除优先，不因重叠拒绝请求。多个域名之间使用英文逗号(,)隔开。
    /**
     * @var string
     */
    public $filterExcludeSites;

    // 按发布时间筛选：d 最近一天、w 最近一周、m 最近一月、y 最近一年；不传则不限制。开启后过滤发布时间缺失或无法解析的结果。
    /**
     * @var string
     */
    public $filterTimeRange;

    // 预留。计划支持 news 等网页搜索领域，当前不生效
    /**
     * @var string
     */
    public $filterIndustry;

    // 是否查询行业垂类数据接口。false 时不调用垂类接口，也不返回 Result.IndustryData；true 时按查询需要执行，命中才返回。不会关闭普通网页、新闻网页或 PDF 搜索。
    /**
     * @var bool
     */
    public $filterEnableIndustryDataSearch;

    // 是否返回当前 mode 下已有的可用正文；false 时省略 Content 和 ContentFormats，不影响内部检索、排序，也不强制生成正文。
    /**
     * @var bool
     */
    public $includeContent;

    // 是否返回已有摘要；false 时省略 Summary。仅控制输出，不触发在线摘要生成。
    /**
     * @var bool
     */
    public $includeSummary;

}

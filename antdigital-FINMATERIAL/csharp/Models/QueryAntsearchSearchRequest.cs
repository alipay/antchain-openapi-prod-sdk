// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    public class QueryAntsearchSearchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 搜索内容，不能为空；建议不超过 200 个字符
        [NameInMap("query")]
        [Validation(Required=true)]
        public string Query { get; set; }

        // AI 上下文档位，协议预设 fast、auto、pro，用于控制检索深度、内容密度和 Token 规模；当前仅支持 auto，传入其他值将返回参数错误
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 搜索类型，当前仅支持 web；后续可扩展 image
        [NameInMap("search_type")]
        [Validation(Required=false)]
        public string SearchType { get; set; }

        // 网页结果最大返回数量，取值范围 1～30；不包含 IndustryData
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // 正文格式，当前支持 text；markdown 为预留值，暂不支持。仅在实际返回 Content 时生效；include_content=false 时不影响输出。
        [NameInMap("content_format")]
        [Validation(Required=false)]
        public string ContentFormat { get; set; }

        // 仅返回指定域名及其子域名的结果；最多 5 个，填写域名，不接受协议和路径。多个域名之间使用英文逗号(,)隔开。与排除名单重叠时，排除优先。
        [NameInMap("filter_include_sites")]
        [Validation(Required=false)]
        public string FilterIncludeSites { get; set; }

        // 排除指定域名及其子域名的结果；最多 5 个，填写域名，不接受协议和路径。与包含名单重叠时，排除优先，不因重叠拒绝请求。多个域名之间使用英文逗号(,)隔开。
        [NameInMap("filter_exclude_sites")]
        [Validation(Required=false)]
        public string FilterExcludeSites { get; set; }

        // 按发布时间筛选：d 最近一天、w 最近一周、m 最近一月、y 最近一年；不传则不限制。开启后过滤发布时间缺失或无法解析的结果。
        [NameInMap("filter_time_range")]
        [Validation(Required=false)]
        public string FilterTimeRange { get; set; }

        // 预留。计划支持 news 等网页搜索领域，当前不生效
        [NameInMap("filter_industry")]
        [Validation(Required=false)]
        public string FilterIndustry { get; set; }

        // 是否查询行业垂类数据接口。false 时不调用垂类接口，也不返回 Result.IndustryData；true 时按查询需要执行，命中才返回。不会关闭普通网页、新闻网页或 PDF 搜索。
        [NameInMap("filter_enable_industry_data_search")]
        [Validation(Required=false)]
        public bool? FilterEnableIndustryDataSearch { get; set; }

        // 是否返回当前 mode 下已有的可用正文；false 时省略 Content 和 ContentFormats，不影响内部检索、排序，也不强制生成正文。
        [NameInMap("include_content")]
        [Validation(Required=false)]
        public bool? IncludeContent { get; set; }

        // 是否返回已有摘要；false 时省略 Summary。仅控制输出，不触发在线摘要生成。
        [NameInMap("include_summary")]
        [Validation(Required=false)]
        public bool? IncludeSummary { get; set; }

    }

}

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

        // 正文格式。当前支持 text；markdown 为预留值，暂不支持
        [NameInMap("content_format")]
        [Validation(Required=false)]
        public string ContentFormat { get; set; }

        // 仅搜索指定网站。例如gov.cn表示只返回该域名下的内容；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
        [NameInMap("filter_include_domains")]
        [Validation(Required=false)]
        public string FilterIncludeDomains { get; set; }

        // 排除指定网站；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
        [NameInMap("filter_exclude_domains")]
        [Validation(Required=false)]
        public string FilterExcludeDomains { get; set; }

        // 预留。计划用于按发布时间筛选，当前不生效
        [NameInMap("filter_time_range")]
        [Validation(Required=false)]
        public string FilterTimeRange { get; set; }

        // 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
        [NameInMap("filter_need_url")]
        [Validation(Required=false)]
        public bool? FilterNeedUrl { get; set; }

        // 预留。计划支持 news 等网页搜索领域，当前不生效
        [NameInMap("filter_industry")]
        [Validation(Required=false)]
        public string FilterIndustry { get; set; }

        // 是否返回 IndustryData
        [NameInMap("filter_enable_industry_data_search")]
        [Validation(Required=false)]
        public bool? FilterEnableIndustryDataSearch { get; set; }

    }

}

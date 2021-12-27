// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCompanyListRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 活跃地区
        [NameInMap("active_areas")]
        [Validation(Required=false)]
        public List<string> ActiveAreas { get; set; }

        // 企业类型
        [NameInMap("categories")]
        [Validation(Required=false)]
        public List<string> Categories { get; set; }

        // 企业状态
        [NameInMap("company_states")]
        [Validation(Required=false)]
        public List<string> CompanyStates { get; set; }

        // 反馈
        [NameInMap("feedback")]
        [Validation(Required=false)]
        public List<string> Feedback { get; set; }

        // 风险指数最大值
        [NameInMap("max_risk_score")]
        [Validation(Required=false)]
        public long? MaxRiskScore { get; set; }

        // 指数周波动最大值
        [NameInMap("max_risk_score_weekly_float")]
        [Validation(Required=false)]
        public string MaxRiskScoreWeeklyFloat { get; set; }

        // 传播人次最大值
        [NameInMap("max_spread_number")]
        [Validation(Required=false)]
        public long? MaxSpreadNumber { get; set; }

        // 风险指数最小值
        [NameInMap("min_risk_score")]
        [Validation(Required=false)]
        public long? MinRiskScore { get; set; }

        // 指数周波动最小值
        [NameInMap("min_risk_score_weekly_float")]
        [Validation(Required=false)]
        public string MinRiskScoreWeeklyFloat { get; set; }

        // 传播人次最小值
        [NameInMap("min_spread_number")]
        [Validation(Required=false)]
        public long? MinSpreadNumber { get; set; }

        // 正常营运状态
        [NameInMap("normal_operation")]
        [Validation(Required=false)]
        public bool? NormalOperation { get; set; }

        // 经营地区
        [NameInMap("operate_areas")]
        [Validation(Required=false)]
        public List<string> OperateAreas { get; set; }

        // 当前是第几页
        [NameInMap("page_no")]
        [Validation(Required=true)]
        public long? PageNo { get; set; }

        // 每一页的记录条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 平台状态
        [NameInMap("platform_states")]
        [Validation(Required=false)]
        public List<string> PlatformStates { get; set; }

        // 注册地区
        [NameInMap("register_areas")]
        [Validation(Required=false)]
        public List<string> RegisterAreas { get; set; }

        // 高风险维度
        [NameInMap("risky_dimensions")]
        [Validation(Required=false)]
        public List<string> RiskyDimensions { get; set; }

        // 风险标签
        [NameInMap("risk_tags")]
        [Validation(Required=false)]
        public List<string> RiskTags { get; set; }

        // 风险定性
        [NameInMap("risk_types")]
        [Validation(Required=false)]
        public List<string> RiskTypes { get; set; }

        // 排序字段
        [NameInMap("sort_field")]
        [Validation(Required=false)]
        public string SortField { get; set; }

        // 排序类型
        [NameInMap("sort_type")]
        [Validation(Required=false)]
        public string SortType { get; set; }

        // 用户属地
        [NameInMap("user_place")]
        [Validation(Required=true)]
        public string UserPlace { get; set; }

        // 用户所在地类型
        [NameInMap("user_place_type")]
        [Validation(Required=true)]
        public string UserPlaceType { get; set; }

    }

}

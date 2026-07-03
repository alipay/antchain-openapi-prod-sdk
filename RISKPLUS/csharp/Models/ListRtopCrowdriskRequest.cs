// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ListRtopCrowdriskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 活跃地筛选
        [NameInMap("active_places")]
        [Validation(Required=false)]
        public List<string> ActivePlaces { get; set; }

        // 风险等级
        [NameInMap("crowd_risk_levels")]
        [Validation(Required=false)]
        public List<string> CrowdRiskLevels { get; set; }

        // 风险类型
        [NameInMap("crowd_risk_types")]
        [Validation(Required=false)]
        public List<string> CrowdRiskTypes { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 所在地的名称
        [NameInMap("place_name")]
        [Validation(Required=false)]
        public string PlaceName { get; set; }

        // 地区类型
        [NameInMap("place_type")]
        [Validation(Required=false)]
        public string PlaceType { get; set; }

        // 注册地筛选
        [NameInMap("reg_places")]
        [Validation(Required=false)]
        public List<string> RegPlaces { get; set; }

        // 排序字段
        [NameInMap("sort_by")]
        [Validation(Required=false)]
        public string SortBy { get; set; }

        // 排序方式
        [NameInMap("sort_type")]
        [Validation(Required=false)]
        public string SortType { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

    }

}

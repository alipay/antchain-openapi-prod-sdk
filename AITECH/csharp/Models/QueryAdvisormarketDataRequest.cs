// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QueryAdvisormarketDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询类型STATION_LIST、STATION_DETAIL、REACHABLE_ROADS、VEHICLE_TYPE_DISTRIBUTION、ENTRY_FLOW、FRONT_FLOW、SURROUNDING_FLOW、NEW_ENTRY_VEHICLES、FREQUENT_ENTRY、INFREQUENT_ENTRY
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 行政区名称，如“浙江省”、“杭州市”；type=STATION_LIST时必填
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 品牌清单筛选，如 ["中石油", "中石化"]；不传则返回所有品牌；仅 type=STATION_LIST 时生效
        [NameInMap("brands")]
        [Validation(Required=false)]
        public List<string> Brands { get; set; }

        // 站点名称列表，支持批量查询；type 非 STATION_LIST 时必填
        [NameInMap("names")]
        [Validation(Required=false)]
        public List<string> Names { get; set; }

        // 起始日期，yyyy-MM-dd；时间类查询时必填
        [NameInMap("startdate")]
        [Validation(Required=false)]
        public string Startdate { get; set; }

        // 结束日期，yyyy-MM-dd；时间类查询时必填
        [NameInMap("enddate")]
        [Validation(Required=false)]
        public string Enddate { get; set; }

        // 最低进站次数阈值，默认 3；仅 type=FREQUENT_ENTRY 时生效
        [NameInMap("mintimes")]
        [Validation(Required=false)]
        public string Mintimes { get; set; }

        // 最高进站次数阈值（不含），默认 3；仅 type=INFREQUENT_ENTRY 时生效
        [NameInMap("maxtimes")]
        [Validation(Required=false)]
        public string Maxtimes { get; set; }

    }

}

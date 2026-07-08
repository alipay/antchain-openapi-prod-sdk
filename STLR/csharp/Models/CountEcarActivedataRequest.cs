// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class CountEcarActivedataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 盘查排放项编码
        [NameInMap("inventory_item_no")]
        [Validation(Required=true)]
        public string InventoryItemNo { get; set; }

        // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss，将统计起始时间之后的活动数据
        [NameInMap("occurrence_start_time")]
        [Validation(Required=true)]
        public string OccurrenceStartTime { get; set; }

        // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss，将统计结束时间之前、起始时间之后的活动数据
        [NameInMap("occurrence_end_time")]
        [Validation(Required=true)]
        public string OccurrenceEndTime { get; set; }

        // 活动数据附加要素信息，将统计满足相关要素值的活动数据
        [NameInMap("emission_source_element_list")]
        [Validation(Required=false)]
        public List<AnyKeywordItem> EmissionSourceElementList { get; set; }

        // 活动数据扩展信息，将统计满足相关要素值的活动数据
        [NameInMap("extension_value_list")]
        [Validation(Required=false)]
        public List<AnyKeywordItem> ExtensionValueList { get; set; }

        // 附加的扩展统计条目，条目K为统计数据结果编码，V为统计计算公式，
        // 公式可用参数：dataEntryCount(统计排放数据条数)、totalEmissions(总碳排放量)、activeDataAmounts.{活动数据编码}（活动数据量）
        // 比如马士基计算百公里排放量公式：totalEmissions/(activeDataAmounts.AD1+activeDataAmounts.AD3)*100
        [NameInMap("extra_statistic_item_list")]
        [Validation(Required=false)]
        public List<AnyKeywordItem> ExtraStatisticItemList { get; set; }

    }

}

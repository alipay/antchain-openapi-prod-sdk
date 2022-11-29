// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class DetailEcarAvitivedataResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 企业排放数据录入明细编码
        [NameInMap("emission_data_entry_item_no")]
        [Validation(Required=false)]
        public string EmissionDataEntryItemNo { get; set; }

        // 企业业务单号
        [NameInMap("enterprise_biz_no")]
        [Validation(Required=false)]
        public string EnterpriseBizNo { get; set; }

        // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
        [NameInMap("occurrence_start_time")]
        [Validation(Required=false)]
        public string OccurrenceStartTime { get; set; }

        // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
        [NameInMap("occurrence_end_time")]
        [Validation(Required=false)]
        public string OccurrenceEndTime { get; set; }

        // 链上交易Hash
        [NameInMap("carbon_chain_trade_hash")]
        [Validation(Required=false)]
        public string CarbonChainTradeHash { get; set; }

        // 总的碳排放用量，按字符串输出，最多保留6位小数
        [NameInMap("emission_statistical_amount")]
        [Validation(Required=false)]
        public string EmissionStatisticalAmount { get; set; }

        // 排放源编码
        [NameInMap("emission_source_no")]
        [Validation(Required=false)]
        public string EmissionSourceNo { get; set; }

        // 排放源名称
        [NameInMap("emission_source_name")]
        [Validation(Required=false)]
        public string EmissionSourceName { get; set; }

        // 排放单元编码
        [NameInMap("enterprise_location_no")]
        [Validation(Required=false)]
        public string EnterpriseLocationNo { get; set; }

        // 排放单元名称
        [NameInMap("enterprise_location_name")]
        [Validation(Required=false)]
        public string EnterpriseLocationName { get; set; }

    }

}

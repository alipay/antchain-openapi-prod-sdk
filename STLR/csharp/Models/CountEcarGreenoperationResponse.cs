// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class CountEcarGreenoperationResponse : TeaModel {
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

        // 绿色行为产生的绿色能量总量
        [NameInMap("green_energy_total")]
        [Validation(Required=false)]
        public long? GreenEnergyTotal { get; set; }

        // 绿色能量单位，默认为g
        [NameInMap("green_energy_unit")]
        [Validation(Required=false)]
        public string GreenEnergyUnit { get; set; }

        // 绿色行为记录数据
        [NameInMap("green_operation_records")]
        [Validation(Required=false)]
        public long? GreenOperationRecords { get; set; }

        // 按频率统计的绿色行为数据列表
        [NameInMap("statistics_by_frequence_list")]
        [Validation(Required=false)]
        public List<GreenOperationStatisticsByFrequence> StatisticsByFrequenceList { get; set; }

        // 按绿色行为类型统计的绿色行为数据列表
        [NameInMap("statistics_by_type_list")]
        [Validation(Required=false)]
        public List<GreenOperationStatisticsByType> StatisticsByTypeList { get; set; }

    }

}

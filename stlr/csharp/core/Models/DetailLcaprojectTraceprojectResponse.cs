// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class DetailLcaprojectTraceprojectResponse : TeaModel {
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

        // 原材料运输排放量
        [NameInMap("transport_emission_amount")]
        [Validation(Required=false)]
        public string TransportEmissionAmount { get; set; }

        // 碳足迹总排放量
        [NameInMap("emission_amount")]
        [Validation(Required=false)]
        public string EmissionAmount { get; set; }

        // 废弃物运输排放量
        [NameInMap("waste_transport_emission_amount")]
        [Validation(Required=false)]
        public string WasteTransportEmissionAmount { get; set; }

        // 碳足迹排放单位
        [NameInMap("emission_unit")]
        [Validation(Required=false)]
        public string EmissionUnit { get; set; }

        // 废弃物处置排放量
        [NameInMap("waste_disposal_emission_amount")]
        [Validation(Required=false)]
        public string WasteDisposalEmissionAmount { get; set; }

        // 原材料制造排放量
        [NameInMap("manufacture_emission_amount")]
        [Validation(Required=false)]
        public string ManufactureEmissionAmount { get; set; }

        // 能耗使用排放量
        [NameInMap("energy_emission_amount")]
        [Validation(Required=false)]
        public string EnergyEmissionAmount { get; set; }

        // 环境排放排放量
        [NameInMap("environment_emission_amount")]
        [Validation(Required=false)]
        public string EnvironmentEmissionAmount { get; set; }

    }

}

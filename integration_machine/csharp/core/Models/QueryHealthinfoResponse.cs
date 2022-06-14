// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    public class QueryHealthinfoResponse : TeaModel {
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

        // 健康信息
        [NameInMap("health_info")]
        [Validation(Required=false)]
        public HealthInfo HealthInfo { get; set; }

        // 核酸信息
        [NameInMap("nucleic_acid_info")]
        [Validation(Required=false)]
        public NucleicAcidInfo NucleicAcidInfo { get; set; }

        // 行程信息
        // 
        [NameInMap("travel_info")]
        [Validation(Required=false)]
        public TravelInfo TravelInfo { get; set; }

        // 疫苗接种信息
        [NameInMap("vaccination_info")]
        [Validation(Required=false)]
        public VaccinationInfo VaccinationInfo { get; set; }

        // 抗原信息
        [NameInMap("antigen_info")]
        [Validation(Required=false)]
        public AntigenInfo AntigenInfo { get; set; }

        // 场所信息
        [NameInMap("scene_info")]
        [Validation(Required=false)]
        public SceneInfo SceneInfo { get; set; }

        // 通行记录ID
        [NameInMap("pass_id")]
        [Validation(Required=false)]
        public string PassId { get; set; }

    }

}

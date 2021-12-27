// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ExecSecurityRiskdataserviceResponse : TeaModel {
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

        // 反欺诈风险数据服务申请成功时返回的查询凭证（申请请求时存在）
        [NameInMap("risk_data_service_apply_id")]
        [Validation(Required=false)]
        public string RiskDataServiceApplyId { get; set; }

        // 反欺诈风险数据服务查询请求结果中风险详细信息字段（查询请求时存在）
        [NameInMap("risk_infos")]
        [Validation(Required=false)]
        public List<RiskInfo> RiskInfos { get; set; }

        // 请求响应业务唯一id
        [NameInMap("security_id")]
        [Validation(Required=false)]
        public string SecurityId { get; set; }

        // 反欺诈风险数据服务查询成功时得到风险建议结果信息（查询请求时存在）
        [NameInMap("security_result_infos")]
        [Validation(Required=false)]
        public SecurityResultInfos SecurityResultInfos { get; set; }

        // 请求是否成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}

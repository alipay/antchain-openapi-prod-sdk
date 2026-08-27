// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SumbitInnerMermngcontractauditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 业务单元Id列表
        [NameInMap("bu_id_list")]
        [Validation(Required=true)]
        public List<string> BuIdList { get; set; }

        // 合同类型
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public string ContractType { get; set; }

        // 待审核合同信息
        [NameInMap("contract_file")]
        [Validation(Required=true)]
        public FileInfo ContractFile { get; set; }

        // 审核立场
        [NameInMap("stance")]
        [Validation(Required=true)]
        public string Stance { get; set; }

        // 业务目标
        [NameInMap("business_goals")]
        [Validation(Required=false)]
        public string BusinessGoals { get; set; }

        // 是否开启 AI 基准线审核,默认 false
        [NameInMap("ai_baseline_flag")]
        [Validation(Required=true)]
        public bool? AiBaselineFlag { get; set; }

    }

}

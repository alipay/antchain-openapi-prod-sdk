// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    public class QueryAntchainAioOutboundTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 外呼流程id
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public long? FlowId { get; set; }

        // 环境区分
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 与env对应
        [NameInMap("ldc_name")]
        [Validation(Required=true)]
        public string LdcName { get; set; }

        // 根据状态过滤数据
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 租户id
        [NameInMap("tnt_inst_id")]
        [Validation(Required=true)]
        public string TntInstId { get; set; }

        // 业务id
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 当前页码
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // 每页数据个数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}

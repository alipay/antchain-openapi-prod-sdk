// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    public class SubmitAmlcloudCheckcaseresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID，业务的唯一标识，用于追踪业务。
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 客户的租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 任务来源。取值如下：
        // ● REALTIME：来源于扫描信息接口。
        // ● BATCH：来源于数据仓库。
        // ● ALL：包含以上所有的任务来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 任务类型。取值如下：
        // ● PEP：政治高风险人物。
        // ● SANCTION：制裁名单。
        // ● NEGATIVE_NEWS：负面新闻。
        // ● INTERNAL_LIST：自定义名单。
        // ● EDD：加强尽职调查。
        // ● ALL：包含以上所有的任务类型。
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}

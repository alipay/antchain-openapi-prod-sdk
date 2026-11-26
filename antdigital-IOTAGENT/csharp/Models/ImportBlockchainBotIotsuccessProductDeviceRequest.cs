// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class ImportBlockchainBotIotsuccessProductDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前租户业务产品标识
        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        // 设备MAC列表；沿已有校验、去重与数量限制
        [NameInMap("uid_list")]
        [Validation(Required=true)]
        public List<string> UidList { get; set; }

        // 可选产品模板标识，适配为已有templateAgentId
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

    }

}

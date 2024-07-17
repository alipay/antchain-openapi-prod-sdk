// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    public class QueryAntchainAioOutboundDialogflowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 租户id
        [NameInMap("tnt_inst_id")]
        [Validation(Required=true)]
        public string TntInstId { get; set; }

        // 业务id
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

    }

}

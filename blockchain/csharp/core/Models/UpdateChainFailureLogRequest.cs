// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateChainFailureLogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链id
        [NameInMap("ant_chain_id")]
        [Validation(Required=true)]
        public string AntChainId { get; set; }

        // 联盟id
        [NameInMap("consortium_id")]
        [Validation(Required=true)]
        public string ConsortiumId { get; set; }

        // 日志名称
        [NameInMap("trigger_name")]
        [Validation(Required=false)]
        public string TriggerName { get; set; }

        // 日志状态
        [NameInMap("status_action")]
        [Validation(Required=false)]
        public string StatusAction { get; set; }

        // 日志id
        [NameInMap("log_id")]
        [Validation(Required=false)]
        public string LogId { get; set; }

    }

}

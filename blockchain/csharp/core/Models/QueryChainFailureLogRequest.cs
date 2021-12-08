// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryChainFailureLogRequest : TeaModel {
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

        // ""
        [NameInMap("trigger_name")]
        [Validation(Required=true)]
        public string TriggerName { get; set; }

        // ""
        [NameInMap("status_action")]
        [Validation(Required=false)]
        public string StatusAction { get; set; }

        // 当前页码
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public string PageNo { get; set; }

        // 页面规格
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public string PageSize { get; set; }

    }

}

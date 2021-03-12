// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云CloudIde的配置
    public class ALiYunChainCloudIdeConfig : TeaModel {
        // bizid
        [NameInMap("bizid")]
        [Validation(Required=false)]
        public string Bizid { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // trial_account
        [NameInMap("trial_account")]
        [Validation(Required=false)]
        public string TrialAccount { get; set; }

        // trial_account_private_key
        [NameInMap("trial_account_private_key")]
        [Validation(Required=false)]
        public string TrialAccountPrivateKey { get; set; }

        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // ant_chain_name
        [NameInMap("ant_chain_name")]
        [Validation(Required=false)]
        public string AntChainName { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}

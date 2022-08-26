// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6f72e7df0c87441c84120631f5b37b12.Models
{
    // 阿里云蚂蚁区块链证书信息
    public class ALiYunCertificateApplication : TeaModel {
        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // bid
        [NameInMap("bid")]
        [Validation(Required=false)]
        public string Bid { get; set; }

        // createtime
        [NameInMap("createtime")]
        [Validation(Required=false)]
        public long? Createtime { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // updatetime
        [NameInMap("updatetime")]
        [Validation(Required=false)]
        public long? Updatetime { get; set; }

        // username
        [NameInMap("username")]
        [Validation(Required=false)]
        public string Username { get; set; }

    }

}

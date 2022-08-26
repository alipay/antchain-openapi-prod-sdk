// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    // 区块链基本信息
    public class BlockchainBasicInfo : TeaModel {
        // 链id
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 链域名
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // 创建时间，13位时间戳
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 根据type会返回不通的json格式，表示不同类型的链配置； mychain: { "bizid": "", "tlsCert": "", "tlsCaCert": "", "account": "", "anchoredBlockHeight": 19876, "anchoredBlockHash": "" } fabric: { "channel": "", "userMspId": "", "userCert": "" }
        [NameInMap("info")]
        [Validation(Required=false)]
        public string Info { get; set; }

        // 注册状态
        // 
        [NameInMap("reg_status")]
        [Validation(Required=false)]
        public string RegStatus { get; set; }

        // 链类型
        // 
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}

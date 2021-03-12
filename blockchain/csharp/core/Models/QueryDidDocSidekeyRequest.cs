// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDidDocSidekeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 是否需要分页返回
        [NameInMap("need_page")]
        [Validation(Required=false)]
        public bool? NeedPage { get; set; }

        // 按分页查询
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 前缀+z40_uid
        [NameInMap("side_key")]
        [Validation(Required=true)]
        public string SideKey { get; set; }

        // 通过外键查询did，需要以下条件之一：
        // 1. 查询者为外键前缀对应的did；
        // 2. 查询者能够提供外键前缀对应的did的授权vc。
        [NameInMap("verifiable_claim")]
        [Validation(Required=false)]
        public string VerifiableClaim { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}

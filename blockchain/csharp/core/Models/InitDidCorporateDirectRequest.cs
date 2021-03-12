// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitDidCorporateDirectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 扩展字段
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // owner名
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 租户自有用户的唯1号，每个owner_uid只能申请一个did
        [NameInMap("owner_uid")]
        [Validation(Required=true)]
        public string OwnerUid { get; set; }

        // 公钥
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // did doc service信息列表
        [NameInMap("services")]
        [Validation(Required=false)]
        public List<DisServicesInfo> Services { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}

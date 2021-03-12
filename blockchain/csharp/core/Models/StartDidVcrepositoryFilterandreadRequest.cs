// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidVcrepositoryFilterandreadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求读取数据的did。
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 配合owner_did字段一起使用，指定查询目标VC时的过滤字段（可是标准VC内容的字段），指定此字段后，配合需指定filter_value字段。
        [NameInMap("filter_field")]
        [Validation(Required=true)]
        public string FilterField { get; set; }

        // ["VerifiableCredential","DelegateVCRepository","LocationInfo"]
        [NameInMap("filter_value")]
        [Validation(Required=true)]
        public string FilterValue { get; set; }

        // 保留字段，请求读的did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 目标VC的subject字段，参与过滤条件。
        [NameInMap("subject_did")]
        [Validation(Required=true)]
        public string SubjectDid { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}

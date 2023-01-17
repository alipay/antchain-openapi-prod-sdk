// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CancelDataflowAuthorizeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 目标租户ID
        [NameInMap("target_tenant")]
        [Validation(Required=true)]
        public string TargetTenant { get; set; }

        // 授权类型： 1. PUBKEY_UPLOAD：上传信封公钥 2. GET_NOTARY：查询存证原文 3. CHECK_NOTARY：核验存证信息
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 授权范围，授权类型为GET_NOTARY或者CHECK_NOTARY时必填，取值为： 1. TXHASH：交易哈希维度授权 2. ACCOUNT：账号维度授权
        [NameInMap("auth_scope")]
        [Validation(Required=false)]
        public string AuthScope { get; set; }

        // 授权的目标存证地址，当授权类型为GET_NOTARY或者CHECK_NOTARY，且授权范围为TXHASH时必填，最多20个
        [NameInMap("tx_hash_list")]
        [Validation(Required=false)]
        public List<string> TxHashList { get; set; }

    }

}

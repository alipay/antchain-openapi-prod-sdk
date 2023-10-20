// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryRiskGeneralRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // x
        [NameInMap("data_code")]
        [Validation(Required=true)]
        public string DataCode { get; set; }

        // AES加密使用的随机数，对该随机数使用RaaS数据服务的公钥进行加密，随后传入；
        [NameInMap("encrypted_nonce")]
        [Validation(Required=true)]
        public string EncryptedNonce { get; set; }

        // ISV的终端客户编码、征信机构的终端客户编码、公司内部部门ID，可以定制数据输出。
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 业务请求入参，兼容批量调用
        [NameInMap("biz_query_params")]
        [Validation(Required=true)]
        public List<BizQueryParam> BizQueryParams { get; set; }

        // 拓展输入字段,
        [NameInMap("ext_data")]
        [Validation(Required=false)]
        public string ExtData { get; set; }

        // 用于标记是否获得用户授权。
        // 1:获得授权（默认）
        // 0:未获得授权
        [NameInMap("user_authorization")]
        [Validation(Required=true)]
        public string UserAuthorization { get; set; }

        // 默认AES128，后续可选SM2等国密
        [NameInMap("encrypt_method")]
        [Validation(Required=false)]
        public string EncryptMethod { get; set; }

        // 整个包体加密，二选一
        [NameInMap("encrypted_body")]
        [Validation(Required=false)]
        public string EncryptedBody { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicChainmodelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作类型
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 操作人id
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 参数签名校验
        [NameInMap("param_sign")]
        [Validation(Required=true)]
        public string ParamSign { get; set; }

        // 所属业务
        [NameInMap("business")]
        [Validation(Required=true)]
        public string Business { get; set; }

        // 资产数据类型
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 资产ID-key
        [NameInMap("assets_id_key")]
        [Validation(Required=true)]
        public string AssetsIdKey { get; set; }

        // 资产ID-类型
        [NameInMap("assets_id_type")]
        [Validation(Required=true)]
        public string AssetsIdType { get; set; }

        // 签名验证方式
        [NameInMap("signature_check_type")]
        [Validation(Required=true)]
        public string SignatureCheckType { get; set; }

    }

}

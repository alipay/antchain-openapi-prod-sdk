// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryApiSimpleauthasyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 纳税人识别号
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 用于幂等控制
        [NameInMap("biz_request_id")]
        [Validation(Required=true)]
        public string BizRequestId { get; set; }

        // 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 行方生成的授权编号
        // 
        [NameInMap("auth_code")]
        [Validation(Required=false)]
        public string AuthCode { get; set; }

        // 机构id
        [NameInMap("institute_id")]
        [Validation(Required=false)]
        public string InstituteId { get; set; }

    }

}

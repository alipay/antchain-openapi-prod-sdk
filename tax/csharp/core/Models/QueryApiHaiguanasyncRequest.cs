// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryApiHaiguanasyncRequest : TeaModel {
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

        // 产品类型，海关数据: ZX500
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 身份id，企业税号
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 用于幂等控制
        [NameInMap("biz_request_id")]
        [Validation(Required=true)]
        public string BizRequestId { get; set; }

        // 行方生成的授权编号
        [NameInMap("auth_code")]
        [Validation(Required=true)]
        public string AuthCode { get; set; }

        // 公网可访问的地址，PDF格式
        [NameInMap("auth_url")]
        [Validation(Required=true)]
        public string AuthUrl { get; set; }

        // 格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("auth_start_time")]
        [Validation(Required=true)]
        public string AuthStartTime { get; set; }

        // 格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("auth_end_time")]
        [Validation(Required=true)]
        public string AuthEndTime { get; set; }

        // 企业名称
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

    }

}

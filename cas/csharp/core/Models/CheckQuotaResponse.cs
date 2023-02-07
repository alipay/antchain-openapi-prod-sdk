// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CheckQuotaResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 是够超额
        [NameInMap("quota_exceed")]
        [Validation(Required=false)]
        public bool? QuotaExceed { get; set; }

        // quota实例ID
        [NameInMap("quota_ins_id")]
        [Validation(Required=false)]
        public string QuotaInsId { get; set; }

        // dim_identity
        [NameInMap("dim_identity")]
        [Validation(Required=false)]
        public string DimIdentity { get; set; }

        // 维度值
        [NameInMap("dim_ins_value")]
        [Validation(Required=false)]
        public string DimInsValue { get; set; }

        // resource
        [NameInMap("resource")]
        [Validation(Required=false)]
        public string Resource { get; set; }

        // 申请的资源的数量
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // 当前剩余的量
        [NameInMap("remain")]
        [Validation(Required=false)]
        public long? Remain { get; set; }

    }

}

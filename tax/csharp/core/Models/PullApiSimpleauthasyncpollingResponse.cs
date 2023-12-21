// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class PullApiSimpleauthasyncpollingResponse : TeaModel {
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

        // 租户号
        [NameInMap("inst_code")]
        [Validation(Required=false)]
        public string InstCode { get; set; }

        // 纳税人识别号
        [NameInMap("identity_id")]
        [Validation(Required=false)]
        public string IdentityId { get; set; }

        // 和查询的biz_request_id相同
        [NameInMap("biz_request_id")]
        [Validation(Required=false)]
        public string BizRequestId { get; set; }

        // 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
        [NameInMap("auth_type")]
        [Validation(Required=false)]
        public string AuthType { get; set; }

        // 行方生成的授权编号
        [NameInMap("auth_code")]
        [Validation(Required=false)]
        public string AuthCode { get; set; }

        // 时间戳
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public string Timestamp { get; set; }

        // 极简授权文件地址列表
        [NameInMap("file_list")]
        [Validation(Required=false)]
        public List<string> FileList { get; set; }

        // 秘钥
        [NameInMap("secret")]
        [Validation(Required=false)]
        public string Secret { get; set; }

        // 0：不含进项发票。  1：包含进项发票。
        [NameInMap("proceeds_invoice")]
        [Validation(Required=false)]
        public string ProceedsInvoice { get; set; }

    }

}

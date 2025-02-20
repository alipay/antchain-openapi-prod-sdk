// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class OperateLeasePetcomparepetidResponse : TeaModel {
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

        // 用于追踪业务调用流程
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // 取值范围0~1，值越大代表本次校验结果越可信
        [NameInMap("confidence")]
        [Validation(Required=false)]
        public string Confidence { get; set; }

        // 比对结果：1通过，0不通过
        [NameInMap("is_same_pet")]
        [Validation(Required=false)]
        public string IsSamePet { get; set; }

        // 鼻纹相似度
        [NameInMap("nose_similarity")]
        [Validation(Required=false)]
        public string NoseSimilarity { get; set; }

        // 正脸相似度
        [NameInMap("face_similarity")]
        [Validation(Required=false)]
        public string FaceSimilarity { get; set; }

    }

}

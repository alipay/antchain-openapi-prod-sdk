// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QMBRAIN.Models
{
    public class ExecOperationagentSsechatResponse : TeaModel {
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

        // 结果响应
        [NameInMap("choices")]
        [Validation(Required=false)]
        public ChoiceData Choices { get; set; }

        // 请求时间
        [NameInMap("created")]
        [Validation(Required=false)]
        public bool? Created { get; set; }

        // 请求信息
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 模型类型
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 请求方式
        [NameInMap("object")]
        [Validation(Required=false)]
        public string Object { get; set; }

        // token消耗情况
        [NameInMap("usage")]
        [Validation(Required=false)]
        public UsageData Usage { get; set; }

    }

}

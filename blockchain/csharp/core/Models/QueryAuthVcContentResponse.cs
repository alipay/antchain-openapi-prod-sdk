// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthVcContentResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 目标查询的可验证声明的完整内容，如果有权限则返回明文内容，否则获取失败，此内容为空。
        [NameInMap("vc_content")]
        [Validation(Required=false)]
        public string VcContent { get; set; }

        // 目标可验证声明的唯一ID
        [NameInMap("vc_id")]
        [Validation(Required=false)]
        public string VcId { get; set; }

        // 当前声明的状态说明： 0：未授权 1：授权成功，-1：已吊销
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}

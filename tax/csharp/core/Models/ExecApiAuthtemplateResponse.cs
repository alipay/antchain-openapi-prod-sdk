// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class ExecApiAuthtemplateResponse : TeaModel {
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

        // 返回的下一层节点集合
        [NameInMap("nodes")]
        [Validation(Required=false)]
        public List<TreeNode> Nodes { get; set; }

        // 树id
        [NameInMap("tree_template_id")]
        [Validation(Required=false)]
        public string TreeTemplateId { get; set; }

        // 授权状态,提交接口此字段为空
        // 1、正在处理中
        // 2、登陆成功
        [NameInMap("auth_state")]
        [Validation(Required=false)]
        public string AuthState { get; set; }

        // 请求是否成功
        // true 成功
        // false 失败
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}

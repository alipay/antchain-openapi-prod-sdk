// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetDepartmentResponse : TeaModel {
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

        // 部门唯一代码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 部门名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 部门描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 父部门 code
        [NameInMap("parent_code")]
        [Validation(Required=false)]
        public string ParentCode { get; set; }

        // 企业 id
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 是否为叶子结点
        [NameInMap("is_leaf")]
        [Validation(Required=false)]
        public bool? IsLeaf { get; set; }

        // 创建时间，ISO8601格式
        [NameInMap("creation_time")]
        [Validation(Required=false)]
        public string CreationTime { get; set; }

        // 更新时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}

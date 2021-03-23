// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class CreateUnionFormRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 上链账户
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 联盟ID
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public long? UnionId { get; set; }

        // Channel名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 业务单据号
        [NameInMap("form_id")]
        [Validation(Required=true)]
        public string FormId { get; set; }

        // 业务单据类型
        [NameInMap("form_type")]
        [Validation(Required=true)]
        public string FormType { get; set; }

        // 原生单据json字符串
        [NameInMap("form_body")]
        [Validation(Required=true)]
        public string FormBody { get; set; }

        // 用户自定义的图ID，开启图功能时传入
        [NameInMap("graph_id")]
        [Validation(Required=false)]
        public string GraphId { get; set; }

        // 用户自定义的LineNode名称
        [NameInMap("line_node")]
        [Validation(Required=false)]
        public string LineNode { get; set; }

        // 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // 表单的直接上游节点formId
        [NameInMap("parent_form_id_list")]
        [Validation(Required=false)]
        public List<string> ParentFormIdList { get; set; }

        // 表单的直接下游节点formId
        [NameInMap("child_form_id_list")]
        [Validation(Required=false)]
        public List<string> ChildFormIdList { get; set; }

    }

}

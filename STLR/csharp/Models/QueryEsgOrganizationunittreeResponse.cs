// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryEsgOrganizationunittreeResponse : TeaModel {
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

        // 组织单元编码
        [NameInMap("organization_no")]
        [Validation(Required=false)]
        public string OrganizationNo { get; set; }

        // 组织单元名称
        [NameInMap("organization_name")]
        [Validation(Required=false)]
        public string OrganizationName { get; set; }

        // 从根到直接父级的组织编码链
        [NameInMap("parent_organization_no_list")]
        [Validation(Required=false)]
        public List<string> ParentOrganizationNoList { get; set; }

        // 直接父级组织名称；根节点为空
        [NameInMap("parent_organization_name")]
        [Validation(Required=false)]
        public string ParentOrganizationName { get; set; }

        // 最后更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // 重复结构体
        [NameInMap("children")]
        [Validation(Required=false)]
        public List<OrganizationUnitTree> Children { get; set; }

    }

}

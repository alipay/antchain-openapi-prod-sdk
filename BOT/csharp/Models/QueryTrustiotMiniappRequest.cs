// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryTrustiotMiniappRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 跳转流水号，全局唯一
        [NameInMap("trace_no")]
        [Validation(Required=true)]
        public string TraceNo { get; set; }

        // 链接渠道：H5 或 MINIAPP，缺省按 MINIAPP
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 客户自定义的 C 端用户唯一标识，H5 必传、MINIAPP 禁传
        [NameInMap("visit_user_id")]
        [Validation(Required=false)]
        public string VisitUserId { get; set; }

        // 访问类型：0 主体访问（按主体人解析其可访问设备）、1 设备清单访问（显式传入范围）
        [NameInMap("access_type")]
        [Validation(Required=true)]
        public string AccessType { get; set; }

        // 场景码。主体访问必填（按场景解析该主体的可访问设备）；清单访问不使用顶层 scene，以 access_scope 各项内的场景为准
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 主体访问的范围口径，与 subject_id 联合解析：0 产权人 / 1 运营人 / 2 科技主体
        [NameInMap("subject_role")]
        [Validation(Required=false)]
        public string SubjectRole { get; set; }

        // 主体访问的主键标识：主体人 ID 或统一社会信用代码等唯一标识
        [NameInMap("subject_id")]
        [Validation(Required=false)]
        public string SubjectId { get; set; }

        // 设备清单访问（access_type=1 或缺省）的访问范围项集合。每项声明一个场景及该场景下的访问目标（设备清单），多项并集生效、顺序不影响结果。类型1 必填；主体访问不使用本字段
        [NameInMap("access_scope")]
        [Validation(Required=false)]
        public List<AccessScopeItem> AccessScope { get; set; }

    }

}

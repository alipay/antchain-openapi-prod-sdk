// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class UpdateMeiyouItagrelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 更新关系信息
        [NameInMap("relation_info_list")]
        [Validation(Required=false)]
        public List<UpdateMeiyouItagRelationWebInfo> RelationInfoList { get; set; }

        // 是否更新审核记录信息
        [NameInMap("update_audit_flag")]
        [Validation(Required=true)]
        public bool? UpdateAuditFlag { get; set; }

        // 数据来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

    }

}

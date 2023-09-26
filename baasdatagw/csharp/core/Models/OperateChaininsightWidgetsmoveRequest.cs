// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class OperateChaininsightWidgetsmoveRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟ID
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public string UnionId { get; set; }

        // 看板ID
        [NameInMap("widget_id")]
        [Validation(Required=true)]
        public string WidgetId { get; set; }

        // 移动类型， 向上移动（MoveUp） / 向下移动（MoveDown）
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 租户ID，留空
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}

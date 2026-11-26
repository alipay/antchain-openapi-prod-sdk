// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UnbindIotsuccessProductPluginRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        [NameInMap("plugin_id")]
        [Validation(Required=true)]
        public string PluginId { get; set; }

        // 类型正确后由业务守卫判断；缺失或false返回CONFIRM_REQUIRED，只有true执行解绑
        [NameInMap("confirm")]
        [Validation(Required=false)]
        public bool? Confirm { get; set; }

    }

}

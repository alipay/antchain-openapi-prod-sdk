// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 卡片模板动态参数信息
    public class SmartTemplateDyncParam : TeaModel {
        // 可以用该字段关联短链的发送目标
        [NameInMap("cust_flag")]
        [Validation(Required=true)]
        public string CustFlag { get; set; }

        // json字符串
        // {"param1":"123","param2":"100"}
        [NameInMap("dync_params")]
        [Validation(Required=false)]
        public string DyncParams { get; set; }

    }

}

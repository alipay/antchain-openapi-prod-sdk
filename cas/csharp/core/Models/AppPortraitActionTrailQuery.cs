// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用画像操作记录查询
    public class AppPortraitActionTrailQuery : TeaModel {
        // 操作时间
        [NameInMap("actiontrail_timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ActiontrailTimestamp { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 发布单id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 应用服务
        [NameInMap("app_service")]
        [Validation(Required=true)]
        public string AppService { get; set; }

        // 操作内容
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public string OperateType { get; set; }

        // 执行人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

    }

}

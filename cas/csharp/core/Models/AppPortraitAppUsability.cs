// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用画像可用性结构体
    public class AppPortraitAppUsability : TeaModel {
        // 应用id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用可用性
        [NameInMap("app_usability")]
        [Validation(Required=false)]
        public long? AppUsability { get; set; }

        // 年同比
        [NameInMap("y2y")]
        [Validation(Required=false)]
        public string Y2y { get; set; }

        // 原因列表
        [NameInMap("reason_list")]
        [Validation(Required=false)]
        public List<string> ReasonList { get; set; }

    }

}

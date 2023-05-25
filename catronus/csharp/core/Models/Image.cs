// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 镜像
    public class Image : TeaModel {
        // 镜像Ref
        [NameInMap("image_ref")]
        [Validation(Required=true)]
        public string ImageRef { get; set; }

        // 镜像标签
        [NameInMap("image_tag")]
        [Validation(Required=true)]
        public string ImageTag { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 扫描状态
        [NameInMap("scan_status")]
        [Validation(Required=true)]
        public string ScanStatus { get; set; }

        // 镜像漏洞
        [NameInMap("image_vul")]
        [Validation(Required=true)]
        public long? ImageVul { get; set; }

        // 镜像风险漏洞
        [NameInMap("image_risk_vul")]
        [Validation(Required=true)]
        public long? ImageRiskVul { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

    }

}

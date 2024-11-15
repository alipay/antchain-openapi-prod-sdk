// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // sdk打包结果
    public class MultiSdkItem : TeaModel {
        // 任务id
        [NameInMap("task_unique_id")]
        [Validation(Required=true)]
        public string TaskUniqueId { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // sdk版本
        [NameInMap("saassdk_version")]
        [Validation(Required=true)]
        public string SaassdkVersion { get; set; }

        // sdk语言
        [NameInMap("lang")]
        [Validation(Required=true)]
        public string Lang { get; set; }

        // 发布仓库
        [NameInMap("repo")]
        [Validation(Required=true)]
        public string Repo { get; set; }

        // 发布地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 开始时间
        [NameInMap("start_tme")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTme { get; set; }

        // 花费时间
        [NameInMap("cost")]
        [Validation(Required=true)]
        public long? Cost { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 打包状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 查看链接
        [NameInMap("preview_link")]
        [Validation(Required=false)]
        public string PreviewLink { get; set; }

        // 依赖
        [NameInMap("dependency")]
        [Validation(Required=false)]
        public string Dependency { get; set; }

    }

}

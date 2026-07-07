// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 类型对应供应商
    public class MonitorProviderType : TeaModel {
        // 监测文件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>txt</para>
        /// </summary>
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 提交类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>FILE</para>
        /// </summary>
        [NameInMap("submit_type")]
        [Validation(Required=true)]
        public string SubmitType { get; set; }

        // 文件格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>jpg</para>
        /// </summary>
        [NameInMap("file_format")]
        [Validation(Required=false)]
        public string FileFormat { get; set; }

        // 支持的服务商列表，已排序
        [NameInMap("monitor_providers")]
        [Validation(Required=true)]
        public List<MonitorProviderCapability> MonitorProviders { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 定向监测结果
    public class DirectMonitorResult : TeaModel {
        // 监测结果id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xyz</para>
        /// </summary>
        [NameInMap("monitor_result_id")]
        [Validation(Required=true)]
        public string MonitorResultId { get; set; }

        // 相似的资源链接
        /// <summary>
        /// <b>Example:</b>
        /// <para>xyz</para>
        /// </summary>
        [NameInMap("similar_resource_url")]
        [Validation(Required=true)]
        public string SimilarResourceUrl { get; set; }

        // 相似资源所在的网址链接
        /// <summary>
        /// <b>Example:</b>
        /// <para>xyz</para>
        /// </summary>
        [NameInMap("similar_web_url")]
        [Validation(Required=true)]
        public string SimilarWebUrl { get; set; }

        // 资源标题
        /// <summary>
        /// <b>Example:</b>
        /// <para>xyz</para>
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 资源作者
        /// <summary>
        /// <b>Example:</b>
        /// <para>xyz</para>
        /// </summary>
        [NameInMap("author")]
        [Validation(Required=false)]
        public string Author { get; set; }

        // 资源上传时间，格式yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-01-01 10:10:10</para>
        /// </summary>
        [NameInMap("upload_time")]
        [Validation(Required=false)]
        public string UploadTime { get; set; }

    }

}

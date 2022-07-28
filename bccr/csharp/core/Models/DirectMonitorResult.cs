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
        [NameInMap("monitor_result_id")]
        [Validation(Required=true)]
        public string MonitorResultId { get; set; }

        // 相似的资源链接
        [NameInMap("similar_resource_url")]
        [Validation(Required=true)]
        public string SimilarResourceUrl { get; set; }

        // 相似资源所在的网址链接
        [NameInMap("similar_web_url")]
        [Validation(Required=true)]
        public string SimilarWebUrl { get; set; }

        // 资源标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 资源作者
        [NameInMap("author")]
        [Validation(Required=false)]
        public string Author { get; set; }

        // 资源上传时间，格式yyyy-MM-dd HH:mm:ss
        [NameInMap("upload_time")]
        [Validation(Required=false)]
        public string UploadTime { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateMonitorTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // submitType是url就传 url地址 submitType 是file就传 oss fileId
        [NameInMap("submit_content")]
        [Validation(Required=true)]
        public string SubmitContent { get; set; }

        // 提交任务的类型:FILE/URL
        // 不填为FILE
        // FILE表示文件上传素材，URL表示上传URL
        [NameInMap("submit_type")]
        [Validation(Required=false)]
        public string SubmitType { get; set; }

        // 文件类别
        // 
        // IMAGE
        // 
        // TEXT
        // 
        // VIDEO
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 任务名称(不超过100字符)
        [NameInMap("task_name")]
        [Validation(Required=true)]
        public string TaskName { get; set; }

        // 监测任务标题(不超过100字符)
        [NameInMap("content_title")]
        [Validation(Required=true)]
        public string ContentTitle { get; set; }

        // 关键词(不超过200字符)
        [NameInMap("keywords")]
        [Validation(Required=true)]
        public List<string> Keywords { get; set; }

        // 内容表述(不超过1000字符)
        [NameInMap("content_desc")]
        [Validation(Required=false)]
        public string ContentDesc { get; set; }

        // 监测供应商id
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // 监测范围 默认全部：ALL；PC网站：SITE；APP应用：APP
        [NameInMap("scopes")]
        [Validation(Required=false)]
        public List<string> Scopes { get; set; }

        // 任务开始时间，如当前时间戳，不传则取服务器当前时间戳，单位毫秒
        [NameInMap("task_start")]
        [Validation(Required=false)]
        public long? TaskStart { get; set; }

        // 任务持续时间，单位天，默认90天
        // 
        // 一次性监测：0
        [NameInMap("task_duration")]
        [Validation(Required=false)]
        public long? TaskDuration { get; set; }

        // 代理信息
        [NameInMap("proxy_info")]
        [Validation(Required=false)]
        public ProxyData ProxyInfo { get; set; }

        // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}

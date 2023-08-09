// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    public class QueryBusinessProductResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 商业产品sdk客户端的maven依赖信息
        [NameInMap("sdk_maven_dependency_info")]
        [Validation(Required=false)]
        public SdkMavenDependencyInfo SdkMavenDependencyInfo { get; set; }

        // 商业产品最新api信息列表，可能与当前版本jar包内api不一致，若发现不一致请在opm商业sdk管理中重新进行打包
        [NameInMap("api_info_models")]
        [Validation(Required=false)]
        public List<ApiInfoModel> ApiInfoModels { get; set; }

        // 已发布中央仓库的版本
        [NameInMap("publish_version")]
        [Validation(Required=false)]
        public string PublishVersion { get; set; }

        // 是否存在运行中的任务，商业产品一次发布中央仓库打包任务，会执行三个子打包任务，上传线下仓库，上传蚂蚁链sdk包至中央仓库，上传金融云sdk包至中央仓库
        [NameInMap("task_running")]
        [Validation(Required=false)]
        public bool? TaskRunning { get; set; }

        // 最新一次打包任务运行状态RUNNING/SUCCESS/FAILED
        [NameInMap("task_status")]
        [Validation(Required=false)]
        public string TaskStatus { get; set; }

        // 能力sla看板url
        [NameInMap("sla_url")]
        [Validation(Required=false)]
        public string SlaUrl { get; set; }

    }

}

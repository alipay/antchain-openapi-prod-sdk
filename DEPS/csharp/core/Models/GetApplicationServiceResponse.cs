// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetApplicationServiceResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 应用名称
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 技术栈版本
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // 关联的部署单元
        [NameInMap("cell_ids")]
        [Validation(Required=false)]
        public List<string> CellIds { get; set; }

        // 服务实例描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 用户自定义的扩展属性
        [NameInMap("extra_infos")]
        [Validation(Required=false)]
        public string ExtraInfos { get; set; }

        // 最近一次执行的运维操作单号
        [NameInMap("latest_operation_id")]
        [Validation(Required=false)]
        public string LatestOperationId { get; set; }

        // 最近一次执行的运维操作类型。取值列表：
        //                             DEPLOYMENT：部署操作
        //                         
        [NameInMap("latest_operation_type")]
        [Validation(Required=false)]
        public string LatestOperationType { get; set; }

        // 最近成功部署的版本号
        [NameInMap("latest_version_no")]
        [Validation(Required=false)]
        public string LatestVersionNo { get; set; }

        // 服务实例名称
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        // 环境名称
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}

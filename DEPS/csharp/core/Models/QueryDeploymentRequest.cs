// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryDeploymentRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 部署单包含的应用（服务）名称
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 部署单创建日期，采用UTC时间，按照ISO8601标准表示，格式为：YYYY-MM-DDThh:mm:ssZ
        [NameInMap("creation_time")]
        [Validation(Required=false)]
        public string CreationTime { get; set; }

        // 部署单id
        [NameInMap("operation_id")]
        [Validation(Required=false)]
        public string OperationId { get; set; }

        // 当前页码，默认为1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public int? PageNum { get; set; }

        // 分页大小，默认10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public int? PageSize { get; set; }

        // 
        // 部署单状态。取值列表：
        // INITING：初始化中；
        // INIT_FAILED：初始化失败；
        // INITED：初始化完成；
        // EXECUTING：执行中；
        // SUCCESS：执行成功；
        // FAILED：执行失败；
        // CANCELING：取消中；
        // CANCELED：已取消
        //                             
        //                         
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // 精确部署单标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

    }

}

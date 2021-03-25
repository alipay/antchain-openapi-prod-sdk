// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 发布单信息
    public class OpsDeployment : TeaModel {
        // 此部署操作中所有被操作的应用（服务）详情，以操作链的形式体现
        [NameInMap("application_chains")]
        [Validation(Required=false)]
        public List<OpsApplicationChain> ApplicationChains { get; set; }

        // 部署操作执行者
        [NameInMap("executor")]
        [Validation(Required=false)]
        public string Executor { get; set; }

        // 部署单id
        [NameInMap("operation_id")]
        [Validation(Required=false)]
        public string OperationId { get; set; }

        // 
        //                     
        //     部署单状态。取值列表：
        //     INITING：初始化中；
        //     INIT_FAILED：初始化失败；
        //     INITED：初始化完成；
        //     EXECUTING：执行中；
        //     SUCCESS：执行成功；
        //     FAILED：执行失败；
        //     CANCELING：取消中；
        //     CANCELED：已取消
        //                     
        //                 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 部署单标题。长度不超过50个UTF-8字符
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

    }

}

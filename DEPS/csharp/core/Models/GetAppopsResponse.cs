// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetAppopsResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 此运维操作中所有被操作的应用详情，以操作链的形式体现
        [NameInMap("application_chains")]
        [Validation(Required=false)]
        public List<OpsApplicationChain> ApplicationChains { get; set; }

        // 运维操作执行者
        [NameInMap("executor")]
        [Validation(Required=false)]
        public string Executor { get; set; }

        // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源
        [NameInMap("ops_action")]
        [Validation(Required=false)]
        public string OpsAction { get; set; }

        // 应用运维的维度，有三种取值：APPLICATION、APP_SERVICE和MACHINE。设置为APPLICATION，表示在非应用服务环境下整个应用都执行该应用运维操作；设置为APP_SERVICE，表示在应用服务环境下对应用服务执行运维操作;设置为MACHINE，表示应用下的一台或多台机器执行改应用运维操作。
        [NameInMap("ops_dimension")]
        [Validation(Required=false)]
        public string OpsDimension { get; set; }

        // 
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
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 应用运维单标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

    }

}

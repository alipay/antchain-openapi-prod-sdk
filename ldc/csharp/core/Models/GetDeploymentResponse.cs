// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetDeploymentResponse : TeaModel {
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

        // 操作执行者
        [NameInMap("executor")]
        [Validation(Required=true)]
        public string Executor { get; set; }

        // 
        //                   发布单状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败；CANCELING：取消中；CANCELED：已取消
        //                 
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 此发布部署操作中所有被操作的应用详情，以操作链的形式体现
        [NameInMap("application_chains")]
        [Validation(Required=true)]
        public List<OpsApplicationChain> ApplicationChains { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ApplyInnerAntesignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户信息
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 业务线
        [NameInMap("business_line_code")]
        [Validation(Required=true)]
        public string BusinessLineCode { get; set; }

        // 场景值
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 业务流水号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 业务名称
        [NameInMap("biz_name")]
        [Validation(Required=true)]
        public string BizName { get; set; }

        // 业务类型
        // 1.CONTRACT：合同（默认推荐）
        // 2.FILE：文件
        // 3.OTHER：其它
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 签署任务类型 默认传：MICKLE_SEAL_CA
        [NameInMap("esign_type")]
        [Validation(Required=true)]
        public string EsignType { get; set; }

        // zappinfo应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 法务电子签签署任务信息
        [NameInMap("ant_sign_task_request_list")]
        [Validation(Required=true)]
        public List<AntSignTaskRequest> AntSignTaskRequestList { get; set; }

        // 签署业务原地址跳转链接
        [NameInMap("source_url")]
        [Validation(Required=false)]
        public string SourceUrl { get; set; }

        // 业务描述
        [NameInMap("biz_desc")]
        [Validation(Required=false)]
        public string BizDesc { get; set; }

        // 回调通知地址 默认不填
        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

        // 默认不填
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public string ExpireDate { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ApplyDataauthorizationAuthorizationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申请人ID
        [NameInMap("applicant_id")]
        [Validation(Required=true)]
        public string ApplicantId { get; set; }

        // 1592877833149
        [NameInMap("applicant_time")]
        [Validation(Required=true)]
        public long? ApplicantTime { get; set; }

        // 申请ID，业务系统唯一
        [NameInMap("biz_uid")]
        [Validation(Required=true)]
        public string BizUid { get; set; }

        // 申请原因
        [NameInMap("comment")]
        [Validation(Required=true)]
        public string Comment { get; set; }

        // 数据ID
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 扩展参数
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class RefuseRcpNingboRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求时间，是以long类型的字符串
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

        // 业务号
        [NameInMap("ywh")]
        [Validation(Required=true)]
        public string Ywh { get; set; }

        // 状态：1—审核通过（开始受理），2—驳回
        // 
        [NameInMap("zt")]
        [Validation(Required=true)]
        public string Zt { get; set; }

        // 备注，驳回原因
        [NameInMap("bz")]
        [Validation(Required=true)]
        public string Bz { get; set; }

        // 操作人
        [NameInMap("czr")]
        [Validation(Required=true)]
        public string Czr { get; set; }

        // 操作时间 yyyy-MM-dd HH:mm:ss
        [NameInMap("czsj")]
        [Validation(Required=true)]
        public string Czsj { get; set; }

    }

}

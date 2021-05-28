// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class PushIcmInvoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批次号
        [NameInMap("pch")]
        [Validation(Required=true)]
        public string Pch { get; set; }

        // 发票信息（json格式）
        [NameInMap("fpxx")]
        [Validation(Required=true)]
        public string Fpxx { get; set; }

        // 发票类型
        // 01：增值税专用发票
        // 04：增值税普通发票
        // 10：增值税电子普通发票
        [NameInMap("fplx")]
        [Validation(Required=true)]
        public string Fplx { get; set; }

        // 是否是历史数据推送
        [NameInMap("islsp")]
        [Validation(Required=true)]
        public bool? Islsp { get; set; }

    }

}

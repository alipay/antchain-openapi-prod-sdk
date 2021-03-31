// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBizPayinvoicefileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除，INSERT为新增
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 发票文件hash [业务必填]
        [NameInMap("file_hash")]
        [Validation(Required=false)]
        public string FileHash { get; set; }

        // 发票文件ID [业务必填]
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 货代DID
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 应付发票code
        [NameInMap("invoice_code")]
        [Validation(Required=true)]
        public string InvoiceCode { get; set; }

    }

}

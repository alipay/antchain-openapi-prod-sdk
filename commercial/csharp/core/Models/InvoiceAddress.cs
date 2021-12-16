// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 发票寄送地址
    public class InvoiceAddress : TeaModel {
        // 主键id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 收件人
        [NameInMap("addressee")]
        [Validation(Required=true)]
        public string Addressee { get; set; }

        // 地区
        [NameInMap("area")]
        [Validation(Required=true)]
        public string Area { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 电话
        [NameInMap("telephone")]
        [Validation(Required=true)]
        public string Telephone { get; set; }

        // 邮编
        [NameInMap("post_code")]
        [Validation(Required=true)]
        public string PostCode { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 唯一id
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

    }

}

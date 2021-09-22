// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // sdk信息
    public class SdkModel : TeaModel {
        // 主键id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 设备SDK公钥
        [NameInMap("verify_key")]
        [Validation(Required=true)]
        public string VerifyKey { get; set; }

        // SDK版本号
        [NameInMap("sdk_version_str")]
        [Validation(Required=false)]
        public string SdkVersionStr { get; set; }

        // sdk模型
        [NameInMap("meta_model")]
        [Validation(Required=false)]
        public string MetaModel { get; set; }

        // 平台
        [NameInMap("platform")]
        [Validation(Required=false)]
        public string Platform { get; set; }

        // 公司名称
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetCourtFilenotaryResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 业务类型标识
        [NameInMap("business_type")]
        [Validation(Required=false)]
        public string BusinessType { get; set; }

        // 数据类型标识
        [NameInMap("data_type")]
        [Validation(Required=false)]
        public string DataType { get; set; }

        // 文件哈希
        [NameInMap("file_hash")]
        [Validation(Required=false)]
        public string FileHash { get; set; }

        // 文件名
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 可信时间戳
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public TsrResponse Tsr { get; set; }

        // 对应的法院编号
        [NameInMap("agency_code")]
        [Validation(Required=false)]
        public string AgencyCode { get; set; }

        // 对应的法院应用ID
        [NameInMap("application_code")]
        [Validation(Required=false)]
        public string ApplicationCode { get; set; }

    }

}

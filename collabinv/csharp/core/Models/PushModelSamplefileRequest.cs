// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class PushModelSamplefileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户编码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 开始日期：示例 YYYYMMDD
        [NameInMap("begin_date")]
        [Validation(Required=true)]
        public string BeginDate { get; set; }

        // 样本内采样日期截止日：YYYYMMDD
        [NameInMap("end_date")]
        [Validation(Required=true)]
        public string EndDate { get; set; }

        // 样本数据量
        [NameInMap("org_nums")]
        [Validation(Required=true)]
        public long? OrgNums { get; set; }

        // 样本批次号，唯一，建议：租户code+时间戳
        [NameInMap("sample_code")]
        [Validation(Required=true)]
        public string SampleCode { get; set; }

        // 文件路径，bucket 下路径
        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

        // 文件名,以.csv结尾，分隔符为  ","号
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

    }

}

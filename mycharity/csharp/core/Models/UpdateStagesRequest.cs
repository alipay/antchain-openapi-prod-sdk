// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class UpdateStagesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 分期id
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=50)]
        public string Id { get; set; }

        // 计划开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 计划结束时间
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 目标捐赠金额
        [NameInMap("target_money")]
        [Validation(Required=false)]
        public long? TargetMoney { get; set; }

        // 目标捐赠人数
        [NameInMap("target_num")]
        [Validation(Required=false)]
        public long? TargetNum { get; set; }

        // 说明
        [NameInMap("note")]
        [Validation(Required=false, MaxLength=1000)]
        public string Note { get; set; }

        // 公开募捐编号
        [NameInMap("public_fundraising_no")]
        [Validation(Required=false, MaxLength=50)]
        public string PublicFundraisingNo { get; set; }

        // 静态文件地址‘,’分割
        [NameInMap("cover_url")]
        [Validation(Required=false, MaxLength=450)]
        public string CoverUrl { get; set; }

        // 管理费用金额(单位：分)
        [NameInMap("administrative_rate")]
        [Validation(Required=false)]
        public long? AdministrativeRate { get; set; }

        // 项目状态，0进行中（默认），1已结项
        [NameInMap("state")]
        [Validation(Required=false)]
        public long? State { get; set; }

        // 签约id,关联签约表
        [NameInMap("sign_id")]
        [Validation(Required=false, MaxLength=50)]
        public string SignId { get; set; }

    }

}

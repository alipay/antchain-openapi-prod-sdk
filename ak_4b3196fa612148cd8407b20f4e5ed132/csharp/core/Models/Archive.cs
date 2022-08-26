// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b3196fa612148cd8407b20f4e5ed132.Models
{
    // 附件材料
    public class Archive : TeaModel {
        // 附件内容的Hash值
        [NameInMap("archive_hash")]
        [Validation(Required=false)]
        public string ArchiveHash { get; set; }

        // 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
        [NameInMap("archive_type")]
        [Validation(Required=false)]
        public string ArchiveType { get; set; }

        // 移动后到银行目录下的oss存储路径
        [NameInMap("bank_oss_key")]
        [Validation(Required=false)]
        public string BankOssKey { get; set; }

        // 附件KEY，也是oss的存储路径，原始保存路径
        [NameInMap("oss_key")]
        [Validation(Required=false)]
        public string OssKey { get; set; }

        // 附件来源外部业务单号
        [NameInMap("out_biz_no")]
        [Validation(Required=false)]
        public string OutBizNo { get; set; }

        // 机构编号
        [NameInMap("owner_no")]
        [Validation(Required=false)]
        public string OwnerNo { get; set; }

        // 附件材料归属机构类型，比如：BANK=银行
        [NameInMap("owner_type")]
        [Validation(Required=false)]
        public string OwnerType { get; set; }

        // 移动到不动产中心目录下的oss存储路径
        [NameInMap("rtc_oss_key")]
        [Validation(Required=false)]
        public string RtcOssKey { get; set; }

        // 材料附件来源场景，比如：ASS_BK_APPLY=银行申请抵押提交
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 房产链平台的存储路径
        [NameInMap("rcp_oss_key")]
        [Validation(Required=false)]
        public string RcpOssKey { get; set; }

        // 助贷平台的访问路径
        [NameInMap("loan_assist_platform_oss_key")]
        [Validation(Required=false)]
        public string LoanAssistPlatformOssKey { get; set; }

    }

}

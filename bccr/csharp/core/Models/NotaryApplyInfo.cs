// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 公证出证申请信息
    public class NotaryApplyInfo : TeaModel {
        // 公证处ID
        [NameInMap("org_id")]
        [Validation(Required=true)]
        public string OrgId { get; set; }

        // 取证人和取证信息列表
        [NameInMap("evid_infos")]
        [Validation(Required=true)]
        public List<EvidInfo> EvidInfos { get; set; }

        // 申办事由
        [NameInMap("bid_reason")]
        [Validation(Required=true)]
        public BidReason BidReason { get; set; }

        // 申请人信息
        [NameInMap("applicant_infos")]
        [Validation(Required=true)]
        public List<NotaryUser> ApplicantInfos { get; set; }

        // 经办人信息
        [NameInMap("operator_info")]
        [Validation(Required=true)]
        public NotaryUser OperatorInfo { get; set; }

        // 授权书
        [NameInMap("warrant_file_list")]
        [Validation(Required=true)]
        public List<string> WarrantFileList { get; set; }

        // 权利证明材料
        [NameInMap("testify_file_list")]
        [Validation(Required=true)]
        public List<string> TestifyFileList { get; set; }

        // 保全内容
        [NameInMap("preservation_content")]
        [Validation(Required=true)]
        public string PreservationContent { get; set; }

        // 用户申办备注
        [NameInMap("comments")]
        [Validation(Required=false)]
        public string Comments { get; set; }

    }

}

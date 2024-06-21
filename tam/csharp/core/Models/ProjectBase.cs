// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    // 商务中心项目基础结构
    public class ProjectBase : TeaModel {
        // 项目记录ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 项目可读编码
        [NameInMap("project_code")]
        [Validation(Required=false)]
        public string ProjectCode { get; set; }

        // 项目名称
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 项目来源：蚂蚁、阿里云、合作伙伴 ProjectSource.getKey() ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"), PARTNER("PARTNER", "合作伙伴");
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 签约方（总包方）。蚂蚁、阿里云 ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"),
        [NameInMap("contractor")]
        [Validation(Required=false)]
        public string Contractor { get; set; }

        // 项目所在阶段
        [NameInMap("stage")]
        [Validation(Required=false)]
        public string Stage { get; set; }

        // 项目状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 预计签约日期
        [NameInMap("expect_con_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpectConDate { get; set; }

        // 预估签约金额
        [NameInMap("expect_con_amt")]
        [Validation(Required=false)]
        public string ExpectConAmt { get; set; }

        // 是否需要交付。1需要，0不需要
        [NameInMap("need_pm")]
        [Validation(Required=false)]
        public string NeedPm { get; set; }

        // 是否需要提前”进场“。1需要，0不需要。
        [NameInMap("need_ad_entry")]
        [Validation(Required=false)]
        public string NeedAdEntry { get; set; }

        // 合作伙伴Id
        [NameInMap("partner_id")]
        [Validation(Required=false)]
        public string PartnerId { get; set; }

        // partnerName
        [NameInMap("partner_name")]
        [Validation(Required=false)]
        public string PartnerName { get; set; }

        // 阿里云Bpid
        [NameInMap("aliyun_bpid")]
        [Validation(Required=false)]
        public string AliyunBpid { get; set; }

        // 客户ID
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 客户名称
        [NameInMap("customer_name")]
        [Validation(Required=false)]
        public string CustomerName { get; set; }

        // BD
        [NameInMap("bd_work_no")]
        [Validation(Required=false)]
        public string BdWorkNo { get; set; }

        // PM
        [NameInMap("pm_work_nos")]
        [Validation(Required=false)]
        public List<string> PmWorkNos { get; set; }

        //  
        [NameInMap("tam_list")]
        [Validation(Required=false)]
        public List<string> TamList { get; set; }

        //  
        [NameInMap("bd_list")]
        [Validation(Required=false)]
        public List<string> BdList { get; set; }

        //  
        [NameInMap("tm_list")]
        [Validation(Required=false)]
        public List<string> TmList { get; set; }

        //  
        [NameInMap("pm_list")]
        [Validation(Required=false)]
        public List<string> PmList { get; set; }

    }

}

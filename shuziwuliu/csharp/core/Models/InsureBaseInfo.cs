// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 投保基本信息
    public class InsureBaseInfo : TeaModel {
        // 投保人姓名
        [NameInMap("tbr_name")]
        [Validation(Required=true)]
        public string TbrName { get; set; }

        // 投保人证件号
        [NameInMap("tbr_id_no")]
        [Validation(Required=true)]
        public string TbrIdNo { get; set; }

        // 投保人证件类型
        [NameInMap("tbr_id_type")]
        [Validation(Required=true)]
        public string TbrIdType { get; set; }

        // 投保人联系电话
        [NameInMap("tbr_tel")]
        [Validation(Required=true)]
        public string TbrTel { get; set; }

        // 投保人地址
        [NameInMap("tbr_addr")]
        [Validation(Required=false)]
        public string TbrAddr { get; set; }

        // 投保人邮箱
        [NameInMap("tbr_email")]
        [Validation(Required=true)]
        public string TbrEmail { get; set; }

        // 被保险人姓名
        [NameInMap("bbr_name")]
        [Validation(Required=true)]
        public string BbrName { get; set; }

        // 被保险人证件类型
        [NameInMap("bbr_id_type")]
        [Validation(Required=true)]
        public string BbrIdType { get; set; }

        // 被保险人证件号码
        [NameInMap("bbr_id_no")]
        [Validation(Required=true)]
        public string BbrIdNo { get; set; }

        // 被保险人联系电话
        [NameInMap("bbr_tel")]
        [Validation(Required=true)]
        public string BbrTel { get; set; }

        // 被保险人地址
        [NameInMap("bbr_addr")]
        [Validation(Required=false)]
        public string BbrAddr { get; set; }

        // 含税保费(元)，小数点两位
        [NameInMap("pre_mium")]
        [Validation(Required=true)]
        public string PreMium { get; set; }

        // 保险起期
        [NameInMap("eff_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EffDate { get; set; }

        // 保险止期
        [NameInMap("term_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TermDate { get; set; }

        // 投保人证件类型有效起期
        [NameInMap("idenrify_period_start")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string IdenrifyPeriodStart { get; set; }

        // 投保人证件类型有效止期
        [NameInMap("identify_period_end")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string IdentifyPeriodEnd { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 发票明细
    public class InvoiceItem : TeaModel {
        // 税收分类编码	
        [NameInMap("spbm")]
        [Validation(Required=true)]
        public string Spbm { get; set; }

        // 项目名称, 如果为折扣行，商品名称须与被折扣行的商品名称相同，不能多行折扣。
        [NameInMap("mc")]
        [Validation(Required=true)]
        public string Mc { get; set; }

        // 单位
        [NameInMap("jldw")]
        [Validation(Required=false)]
        public string Jldw { get; set; }

        // 数量
        [NameInMap("shul")]
        [Validation(Required=false)]
        public string Shul { get; set; }

        // 含税金额,2位小数
        [NameInMap("je")]
        [Validation(Required=true)]
        public string Je { get; set; }

        // 税率,当fplx!=51or53时，必填,3位小数，例1%为0.010；
        [NameInMap("sl")]
        [Validation(Required=false)]
        public string Sl { get; set; }

        // 税额,当fplx!=51or53时，必填
        [NameInMap("se")]
        [Validation(Required=false)]
        public string Se { get; set; }

        // 明细序号,从1开始递增
        [NameInMap("mxxh")]
        [Validation(Required=true)]
        public string Mxxh { get; set; }

        // 单价
        [NameInMap("dj")]
        [Validation(Required=true)]
        public string Dj { get; set; }

        // 规格型号
        [NameInMap("ggxh")]
        [Validation(Required=false)]
        public string Ggxh { get; set; }

    }

}

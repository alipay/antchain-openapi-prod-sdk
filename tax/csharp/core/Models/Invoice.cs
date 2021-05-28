// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 发票标准模型
    public class Invoice : TeaModel {
        // 备注
        [NameInMap("bz")]
        [Validation(Required=false)]
        public string Bz { get; set; }

        // 复核人
        [NameInMap("fhr")]
        [Validation(Required=false)]
        public string Fhr { get; set; }

        // 发票代码, 发票代码+发票号码唯一
        [NameInMap("fpdm")]
        [Validation(Required=true)]
        public string Fpdm { get; set; }

        // 发票号码,发票代码+发票号码唯一
        [NameInMap("fphm")]
        [Validation(Required=true)]
        public string Fphm { get; set; }

        // 发票类型代码,
        // 默认填:20:广东电子普通发票
        // 01：增值税专用发票
        // 04：增值税普通发票
        // 10：增值税电子普通发票
        // 51：重庆通用机打一联发票76
        // 53：重庆通用机打三联发票210
        // 90：重庆通用机打三联发票190
        [NameInMap("fplx")]
        [Validation(Required=true)]
        public string Fplx { get; set; }

        // 发票明细集合
        [NameInMap("fpxxmxs")]
        [Validation(Required=false)]
        public List<InvoiceItem> Fpxxmxs { get; set; }

        // 发票状态代码,0 正常 1 失控 2 作废 3 红字 4 异常票
        [NameInMap("fpztdm")]
        [Validation(Required=true)]
        public string Fpztdm { get; set; }

        // 购买方地址、电话
        [NameInMap("gfdzdh")]
        [Validation(Required=false)]
        public string Gfdzdh { get; set; }

        // 购买方名称
        [NameInMap("gfmc")]
        [Validation(Required=true)]
        public string Gfmc { get; set; }

        // 购买方纳税人识别号
        [NameInMap("gfsh")]
        [Validation(Required=false)]
        public string Gfsh { get; set; }

        // 购买方银行账号
        [NameInMap("gfyhzh")]
        [Validation(Required=false)]
        public string Gfyhzh { get; set; }

        // 购买方类型,1企业 2个人 3其他
        [NameInMap("gmflx")]
        [Validation(Required=false)]
        public string Gmflx { get; set; }

        // 金额
        [NameInMap("je")]
        [Validation(Required=true)]
        public string Je { get; set; }

        // 价税合计	， 单位：元（2 位小数）
        [NameInMap("jshj")]
        [Validation(Required=true)]
        public string Jshj { get; set; }

        // 开票类型,0-蓝字发票；1-红字发票；
        [NameInMap("kplx")]
        [Validation(Required=true)]
        public string Kplx { get; set; }

        // 开票人
        [NameInMap("kpr")]
        [Validation(Required=true)]
        public string Kpr { get; set; }

        // 开票日期
        [NameInMap("kprq")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Kprq { get; set; }

        // 清单标志,00:无清单 01:有清单
        [NameInMap("qdbz")]
        [Validation(Required=false)]
        public string Qdbz { get; set; }

        // 认证状态
        [NameInMap("rzdklbdjgdm")]
        [Validation(Required=false)]
        public string Rzdklbdjgdm { get; set; }

        // 认证日期
        [NameInMap("rzdklbdrq")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Rzdklbdrq { get; set; }

        // 税额,当发票类型代码	 fplx!=51or fplx!=53时，必填
        [NameInMap("se")]
        [Validation(Required=false)]
        public string Se { get; set; }

        // 收款人
        [NameInMap("skr")]
        [Validation(Required=false)]
        public string Skr { get; set; }

        // 税率标识,0不含税税率；1含税税率
        [NameInMap("slbz")]
        [Validation(Required=true)]
        public string Slbz { get; set; }

        // 所属税务机关代码:
        // 山东省343
        // 重庆市350
        // 广东省347
        [NameInMap("ssdq")]
        [Validation(Required=true)]
        public string Ssdq { get; set; }

        // 销售方地址、电话
        [NameInMap("xfdzdh")]
        [Validation(Required=false)]
        public string Xfdzdh { get; set; }

        // 销售方名称
        [NameInMap("xfmc")]
        [Validation(Required=true)]
        public string Xfmc { get; set; }

        // 销售方纳税人识别号
        [NameInMap("xfsh")]
        [Validation(Required=true)]
        public string Xfsh { get; set; }

        // 销售方银行账号
        [NameInMap("xfyhzh")]
        [Validation(Required=false)]
        public string Xfyhzh { get; set; }

        // 原发票代码, kplx开票类型为1时必填
        [NameInMap("yfpdm")]
        [Validation(Required=false)]
        public string Yfpdm { get; set; }

        // 原发票号码,kplx开票类型为1时必填
        [NameInMap("yfphm")]
        [Validation(Required=false)]
        public string Yfphm { get; set; }

        // 作废标志,0:未作废，1作废
        [NameInMap("zfbz")]
        [Validation(Required=true)]
        public string Zfbz { get; set; }

        // 作废时间
        [NameInMap("zfsj")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Zfsj { get; set; }

        // 扩展字段
        [NameInMap("ext_filed")]
        [Validation(Required=true)]
        public string ExtFiled { get; set; }

    }

}

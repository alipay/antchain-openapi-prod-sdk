// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class FinishRcpNingboRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务号，银行抵押登记申请接口中生成并传递给不动产的业务号
        [NameInMap("ywh")]
        [Validation(Required=true)]
        public string Ywh { get; set; }

        // 不动产单元号，如14-2-1802
        [NameInMap("bdcdyh")]
        [Validation(Required=true)]
        public string Bdcdyh { get; set; }

        // 不动产登记证明号
        [NameInMap("bdcdjzmh")]
        [Validation(Required=true)]
        public string Bdcdjzmh { get; set; }

        // 证明权利或事项
        [NameInMap("zmqlhsx")]
        [Validation(Required=true)]
        public string Zmqlhsx { get; set; }

        // 权利人
        [NameInMap("qlr")]
        [Validation(Required=true)]
        public string Qlr { get; set; }

        // 义务人
        [NameInMap("ywr")]
        [Validation(Required=true)]
        public string Ywr { get; set; }

        // 坐落
        [NameInMap("zl")]
        [Validation(Required=true)]
        public string Zl { get; set; }

        // 其他
        [NameInMap("qt")]
        [Validation(Required=false)]
        public string Qt { get; set; }

        // 附记
        [NameInMap("fj")]
        [Validation(Required=true)]
        public string Fj { get; set; }

        // 发证工本号
        [NameInMap("fzgbh")]
        [Validation(Required=true)]
        public string Fzgbh { get; set; }

        // 缮证人
        [NameInMap("szr")]
        [Validation(Required=true)]
        public string Szr { get; set; }

        // 缮证时间
        [NameInMap("szsj")]
        [Validation(Required=true)]
        public string Szsj { get; set; }

        // 发证人
        [NameInMap("fzr")]
        [Validation(Required=true)]
        public string Fzr { get; set; }

        // 发证时间
        [NameInMap("fzsj")]
        [Validation(Required=true)]
        public string Fzsj { get; set; }

        // 发证机关
        [NameInMap("fzjg")]
        [Validation(Required=true)]
        public string Fzjg { get; set; }

        // 区县代码
        [NameInMap("qxdm")]
        [Validation(Required=true)]
        public long? Qxdm { get; set; }

        // 省编号
        [NameInMap("sbh")]
        [Validation(Required=true)]
        public string Sbh { get; set; }

        // 登记证明种类
        [NameInMap("djzmzl")]
        [Validation(Required=true)]
        public string Djzmzl { get; set; }

        // 电子版文件字符串
        [NameInMap("djzmfile")]
        [Validation(Required=true)]
        public string Djzmfile { get; set; }

        // 债权数额，单位:万元
        [NameInMap("zqse")]
        [Validation(Required=true)]
        public string Zqse { get; set; }

        // 抵押权起始日期，格式：“yyyy-MM-dd”
        [NameInMap("qlqssj")]
        [Validation(Required=true)]
        public string Qlqssj { get; set; }

        // 抵押权结束日期，格式：“yyyy-MM-dd”
        [NameInMap("qljssj")]
        [Validation(Required=true)]
        public string Qljssj { get; set; }

        // 抵押方式
        [NameInMap("dyfs")]
        [Validation(Required=true)]
        public string Dyfs { get; set; }

    }

}

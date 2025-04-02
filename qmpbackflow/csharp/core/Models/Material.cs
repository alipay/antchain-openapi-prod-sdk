// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢系统专用Material结构体
    public class Material : TeaModel {
        // 资料类型0-风控报告1-合同2-图片3-附件
        [NameInMap("m_type")]
        [Validation(Required=true)]
        public string MType { get; set; }

        // 大类编码00-风控报告10-合同20身份证图片26人脸图片30-附件
        [NameInMap("big_code")]
        [Validation(Required=true)]
        public string BigCode { get; set; }

        // 小类编码
        // 201-身份证人脸面202身份证国徽面212-活体人脸图片
        [NameInMap("small_code")]
        [Validation(Required=true)]
        public string SmallCode { get; set; }

        // 资料名称
        [NameInMap("meterial_name")]
        [Validation(Required=true)]
        public string MeterialName { get; set; }

        // 文件地址
        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

    }

}

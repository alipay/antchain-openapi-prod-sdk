// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_1f51f68dfc5d438387dbbaa76f5997f4.Models
{
    // 环节项
    public class PhaseItem : TeaModel {
        // 标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 类型
        // TEXT: 文本，
        // IMAGE： 图片,
        // VIDEO:  视频,
        // LONGTEXT: 长文本,
        // MAP: 地图,
        // BANNER: 广告位,
        // PDF: pdf文件,
        // CERTIFICATE: 认证信息
        // NESTED： 嵌套类型
        // CUSTOMIZE： 自定义类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

    }

}

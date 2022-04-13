// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 弹性扩缩容规则策略
    public class HPAScalePolicy : TeaModel {
        // 枚举型：
        // - pods：按pod个数扩缩容；
        // - percent：基于当前副本数的百分比扩缩容。
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 当type为percent时，value值为增长副本数的百分比，900%表示在原先副本数的基础上增加9倍（单位：%）；当type为pods时，value值为增加的副本数目（单位：个）。
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 每次扩缩容动作间隔时间：600表示每10分钟操作一次
        [NameInMap("period_seconds")]
        [Validation(Required=false)]
        public long? PeriodSeconds { get; set; }

    }

}

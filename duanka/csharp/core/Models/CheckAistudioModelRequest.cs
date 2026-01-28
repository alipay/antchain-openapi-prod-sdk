// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class CheckAistudioModelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 业务唯一码（可填model_id）
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 业务类型（TDI平台填TDI）
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 模型类型（1：离线模型，2：在线模型，3：既是离线也是在线）
        [NameInMap("model_type")]
        [Validation(Required=true)]
        public long? ModelType { get; set; }

        // 所需要验收服务的list
        // 1. PRESSURE
        // 2. RUNTIMUE
        // 3. SAFETY
        [NameInMap("service_selector")]
        [Validation(Required=true)]
        public string ServiceSelector { get; set; }

        // 离线模型oss路径
        [NameInMap("offline_model_path")]
        [Validation(Required=false)]
        public string OfflineModelPath { get; set; }

        // 在线模型oss路径
        [NameInMap("online_model_path")]
        [Validation(Required=false)]
        public string OnlineModelPath { get; set; }

        // 模型脚本oss路径
        [NameInMap("script_path")]
        [Validation(Required=true)]
        public string ScriptPath { get; set; }

        // 验证样本（csv格式，包括保留列、特征列和分数）的OSS路径
        [NameInMap("sample_path")]
        [Validation(Required=true)]
        public string SamplePath { get; set; }

        // 验证样本保留列的list
        [NameInMap("remain_list")]
        [Validation(Required=true)]
        public string RemainList { get; set; }

        // 验证样本特征列的list
        [NameInMap("feature_list")]
        [Validation(Required=true)]
        public string FeatureList { get; set; }

        // 验证样本分数列
        [NameInMap("score_col")]
        [Validation(Required=true)]
        public string ScoreCol { get; set; }

        // aistudio docker镜像指定，若未指定，则默认为
        // reg.docker.alibaba-inc.com/aii/aistudio:aistudio-108521006-1633157052-1690290565806
        [NameInMap("docker_image")]
        [Validation(Required=false)]
        public string DockerImage { get; set; }

        // 在线模型压测核数，默认为1
        [NameInMap("pm_core")]
        [Validation(Required=false)]
        public long? PmCore { get; set; }

        // 在线模型压测内存大小（GB），默认为2
        [NameInMap("pm_mem")]
        [Validation(Required=false)]
        public long? PmMem { get; set; }

        // 离线模型批次大小，默认2000
        [NameInMap("batch_size")]
        [Validation(Required=false)]
        public long? BatchSize { get; set; }

        // 验证所用样本数，默认50000
        [NameInMap("verification_num")]
        [Validation(Required=false)]
        public long? VerificationNum { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsAgentloglocateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // batch_ip_files
        [NameInMap("batch_ip_files")]
        [Validation(Required=true)]
        public List<IpFileOs> BatchIpFiles { get; set; }

        // charset_str
        [NameInMap("charset_str")]
        [Validation(Required=true)]
        public string CharsetStr { get; set; }

        // error_msg
        [NameInMap("error_msg")]
        [Validation(Required=true)]
        public string ErrorMsg { get; set; }

        // ips
        [NameInMap("ips")]
        [Validation(Required=true)]
        public List<string> Ips { get; set; }

        // ip_file
        [NameInMap("ip_file")]
        [Validation(Required=true)]
        public IpFileOs IpFile { get; set; }

        // is_batch
        [NameInMap("is_batch")]
        [Validation(Required=true)]
        public bool? IsBatch { get; set; }

        // log_path
        [NameInMap("log_path")]
        [Validation(Required=true)]
        public string LogPath { get; set; }

        // log_paths
        [NameInMap("log_paths")]
        [Validation(Required=true)]
        public List<string> LogPaths { get; set; }

        // time
        [NameInMap("time")]
        [Validation(Required=true)]
        public long? Time { get; set; }

    }

}

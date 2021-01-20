// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsAgentloglocateRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // batch_ip_files
        [NameInMap("batch_ip_files")]
        [Validation(Required=false)]
        public List<IpFileOs> BatchIpFiles { get; set; }

        // charset_str
        [NameInMap("charset_str")]
        [Validation(Required=false)]
        public string CharsetStr { get; set; }

        // error_msg
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // ips
        [NameInMap("ips")]
        [Validation(Required=false)]
        public List<string> Ips { get; set; }

        // ip_file
        [NameInMap("ip_file")]
        [Validation(Required=false)]
        public IpFileOs IpFile { get; set; }

        // is_batch
        [NameInMap("is_batch")]
        [Validation(Required=false)]
        public bool? IsBatch { get; set; }

        // log_path
        [NameInMap("log_path")]
        [Validation(Required=false)]
        public string LogPath { get; set; }

        // log_paths
        [NameInMap("log_paths")]
        [Validation(Required=false)]
        public List<string> LogPaths { get; set; }

        // time
        [NameInMap("time")]
        [Validation(Required=false)]
        public long? Time { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class JudicialFileInfo extends TeaModel {
    // 文件全名, 包含后缀
    @NameInMap("file_name")
    public String fileName;

    // 文件key
    @NameInMap("file_key")
    public String fileKey;

    // 文件下载地址
    @NameInMap("download_url")
    public String downloadUrl;

    // 司法纠纷平台文件类型
    @NameInMap("judicial_file_type")
    public String judicialFileType;

    public static JudicialFileInfo build(java.util.Map<String, ?> map) throws Exception {
        JudicialFileInfo self = new JudicialFileInfo();
        return TeaModel.build(map, self);
    }

    public JudicialFileInfo setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public JudicialFileInfo setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public JudicialFileInfo setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public JudicialFileInfo setJudicialFileType(String judicialFileType) {
        this.judicialFileType = judicialFileType;
        return this;
    }
    public String getJudicialFileType() {
        return this.judicialFileType;
    }

}

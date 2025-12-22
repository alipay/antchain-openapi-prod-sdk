// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class JudicialFileInfo extends TeaModel {
    // 文件全名, 包含后缀
    /**
     * <strong>example:</strong>
     * <p>文件全名.pdf</p>
     */
    @NameInMap("file_name")
    public String fileName;

    // 文件key
    /**
     * <strong>example:</strong>
     * <p>c3h2g1f3jf12g3123lhfs</p>
     */
    @NameInMap("file_key")
    public String fileKey;

    // 文件下载地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.testfile.net/products/TWC/file/downloadurl">http://www.testfile.net/products/TWC/file/downloadurl</a></p>
     */
    @NameInMap("download_url")
    public String downloadUrl;

    // 司法纠纷平台文件类型
    /**
     * <strong>example:</strong>
     * <p>文件类型</p>
     */
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

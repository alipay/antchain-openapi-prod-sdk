// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class UploaderInfo extends TeaModel {
    // 上传者证书hash
    @NameInMap("cert_hash")
    @Validation(required = true)
    public String certHash;

    // 上传者身份证明
    @NameInMap("uploader")
    @Validation(required = true)
    public String uploader;

    // 上传时间
    @NameInMap("upload_time")
    @Validation(required = true)
    public Long uploadTime;

    // 经度
    @NameInMap("longitude")
    public String longitude;

    // 纬度
    @NameInMap("latitude")
    public String latitude;

    public static UploaderInfo build(java.util.Map<String, ?> map) throws Exception {
        UploaderInfo self = new UploaderInfo();
        return TeaModel.build(map, self);
    }

    public UploaderInfo setCertHash(String certHash) {
        this.certHash = certHash;
        return this;
    }
    public String getCertHash() {
        return this.certHash;
    }

    public UploaderInfo setUploader(String uploader) {
        this.uploader = uploader;
        return this;
    }
    public String getUploader() {
        return this.uploader;
    }

    public UploaderInfo setUploadTime(Long uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }
    public Long getUploadTime() {
        return this.uploadTime;
    }

    public UploaderInfo setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public UploaderInfo setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPGalleryInstruction extends TeaModel {
    // 下载时间
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 授权订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // IP链上ID
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // 图库链接
    @NameInMap("ip_gallery_url")
    @Validation(required = true)
    public String ipGalleryUrl;

    // 图库下载链接，默认过期时间2小时
    @NameInMap("ip_gallery_temporary_url")
    @Validation(required = true)
    public String ipGalleryTemporaryUrl;

    // 图库版本
    @NameInMap("ip_gallery_version")
    @Validation(required = true)
    public Long ipGalleryVersion;

    // IP当前图库状态：0 生效中，1 已失效
    @NameInMap("ip_gallery_status")
    @Validation(required = true)
    public Long ipGalleryStatus;

    // 备注信息
    @NameInMap("ext_info")
    public String extInfo;

    public static IPGalleryInstruction build(java.util.Map<String, ?> map) throws Exception {
        IPGalleryInstruction self = new IPGalleryInstruction();
        return TeaModel.build(map, self);
    }

    public IPGalleryInstruction setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public IPGalleryInstruction setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public IPGalleryInstruction setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public IPGalleryInstruction setIpGalleryUrl(String ipGalleryUrl) {
        this.ipGalleryUrl = ipGalleryUrl;
        return this;
    }
    public String getIpGalleryUrl() {
        return this.ipGalleryUrl;
    }

    public IPGalleryInstruction setIpGalleryTemporaryUrl(String ipGalleryTemporaryUrl) {
        this.ipGalleryTemporaryUrl = ipGalleryTemporaryUrl;
        return this;
    }
    public String getIpGalleryTemporaryUrl() {
        return this.ipGalleryTemporaryUrl;
    }

    public IPGalleryInstruction setIpGalleryVersion(Long ipGalleryVersion) {
        this.ipGalleryVersion = ipGalleryVersion;
        return this;
    }
    public Long getIpGalleryVersion() {
        return this.ipGalleryVersion;
    }

    public IPGalleryInstruction setIpGalleryStatus(Long ipGalleryStatus) {
        this.ipGalleryStatus = ipGalleryStatus;
        return this;
    }
    public Long getIpGalleryStatus() {
        return this.ipGalleryStatus;
    }

    public IPGalleryInstruction setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}

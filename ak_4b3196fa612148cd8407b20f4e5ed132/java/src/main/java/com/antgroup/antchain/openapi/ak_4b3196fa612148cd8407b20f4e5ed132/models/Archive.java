// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b3196fa612148cd8407b20f4e5ed132.models;

import com.aliyun.tea.*;

public class Archive extends TeaModel {
    // 附件内容的Hash值
    @NameInMap("archive_hash")
    public String archiveHash;

    // 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
    @NameInMap("archive_type")
    public String archiveType;

    // 移动后到银行目录下的oss存储路径
    @NameInMap("bank_oss_key")
    public String bankOssKey;

    // 附件KEY，也是oss的存储路径，原始保存路径
    @NameInMap("oss_key")
    public String ossKey;

    // 附件来源外部业务单号
    @NameInMap("out_biz_no")
    public String outBizNo;

    // 机构编号
    @NameInMap("owner_no")
    public String ownerNo;

    // 附件材料归属机构类型，比如：BANK=银行
    @NameInMap("owner_type")
    public String ownerType;

    // 移动到不动产中心目录下的oss存储路径
    @NameInMap("rtc_oss_key")
    public String rtcOssKey;

    // 材料附件来源场景，比如：ASS_BK_APPLY=银行申请抵押提交
    @NameInMap("scene")
    public String scene;

    // 房产链平台的存储路径
    @NameInMap("rcp_oss_key")
    public String rcpOssKey;

    // 助贷平台的访问路径
    @NameInMap("loan_assist_platform_oss_key")
    public String loanAssistPlatformOssKey;

    public static Archive build(java.util.Map<String, ?> map) throws Exception {
        Archive self = new Archive();
        return TeaModel.build(map, self);
    }

    public Archive setArchiveHash(String archiveHash) {
        this.archiveHash = archiveHash;
        return this;
    }
    public String getArchiveHash() {
        return this.archiveHash;
    }

    public Archive setArchiveType(String archiveType) {
        this.archiveType = archiveType;
        return this;
    }
    public String getArchiveType() {
        return this.archiveType;
    }

    public Archive setBankOssKey(String bankOssKey) {
        this.bankOssKey = bankOssKey;
        return this;
    }
    public String getBankOssKey() {
        return this.bankOssKey;
    }

    public Archive setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public Archive setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public Archive setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
        return this;
    }
    public String getOwnerNo() {
        return this.ownerNo;
    }

    public Archive setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public Archive setRtcOssKey(String rtcOssKey) {
        this.rtcOssKey = rtcOssKey;
        return this;
    }
    public String getRtcOssKey() {
        return this.rtcOssKey;
    }

    public Archive setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public Archive setRcpOssKey(String rcpOssKey) {
        this.rcpOssKey = rcpOssKey;
        return this;
    }
    public String getRcpOssKey() {
        return this.rcpOssKey;
    }

    public Archive setLoanAssistPlatformOssKey(String loanAssistPlatformOssKey) {
        this.loanAssistPlatformOssKey = loanAssistPlatformOssKey;
        return this;
    }
    public String getLoanAssistPlatformOssKey() {
        return this.loanAssistPlatformOssKey;
    }

}

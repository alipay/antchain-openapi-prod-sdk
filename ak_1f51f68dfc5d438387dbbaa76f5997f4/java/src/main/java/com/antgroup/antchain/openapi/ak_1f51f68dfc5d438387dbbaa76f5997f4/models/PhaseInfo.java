// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1f51f68dfc5d438387dbbaa76f5997f4.models;

import com.aliyun.tea.*;

public class PhaseInfo extends TeaModel {
    // 环节名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 环节项
    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<PhaseItem> items;

    // 上传者信息
    @NameInMap("upload_info")
    @Validation(required = true)
    public UploaderInfo uploadInfo;

    // 区块信息
    @NameInMap("block_info")
    @Validation(required = true)
    public BlockInfo blockInfo;

    public static PhaseInfo build(java.util.Map<String, ?> map) throws Exception {
        PhaseInfo self = new PhaseInfo();
        return TeaModel.build(map, self);
    }

    public PhaseInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PhaseInfo setItems(java.util.List<PhaseItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<PhaseItem> getItems() {
        return this.items;
    }

    public PhaseInfo setUploadInfo(UploaderInfo uploadInfo) {
        this.uploadInfo = uploadInfo;
        return this;
    }
    public UploaderInfo getUploadInfo() {
        return this.uploadInfo;
    }

    public PhaseInfo setBlockInfo(BlockInfo blockInfo) {
        this.blockInfo = blockInfo;
        return this;
    }
    public BlockInfo getBlockInfo() {
        return this.blockInfo;
    }

}

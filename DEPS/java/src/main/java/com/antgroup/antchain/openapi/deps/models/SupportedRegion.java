// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SupportedRegion extends TeaModel {
    // file_size
    @NameInMap("file_size")
    public Long fileSize;

    // file_status
    @NameInMap("file_status")
    public String fileStatus;

    // original_file_name
    @NameInMap("original_file_name")
    public String originalFileName;

    // region_id
    @NameInMap("region_num")
    public String regionNum;

    public static SupportedRegion build(java.util.Map<String, ?> map) throws Exception {
        SupportedRegion self = new SupportedRegion();
        return TeaModel.build(map, self);
    }

    public SupportedRegion setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public SupportedRegion setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
        return this;
    }
    public String getFileStatus() {
        return this.fileStatus;
    }

    public SupportedRegion setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
        return this;
    }
    public String getOriginalFileName() {
        return this.originalFileName;
    }

    public SupportedRegion setRegionNum(String regionNum) {
        this.regionNum = regionNum;
        return this;
    }
    public String getRegionNum() {
        return this.regionNum;
    }

}

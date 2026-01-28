// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class PartitionObject extends TeaModel {
    // tableGuid
    /**
     * <strong>example:</strong>
     * <p>tableGuid</p>
     */
    @NameInMap("table_guid")
    @Validation(required = true)
    public String tableGuid;

    // name
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // create_time
    /**
     * <strong>example:</strong>
     * <p>create_time</p>
     */
    @NameInMap("create_time")
    @Validation(required = true)
    public String createTime;

    // last_modify_time
    /**
     * <strong>example:</strong>
     * <p>last_modify_time</p>
     */
    @NameInMap("last_modify_time")
    @Validation(required = true)
    public String lastModifyTime;

    // panguFileSize
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pangu_file_size")
    @Validation(required = true)
    public Long panguFileSize;

    // recordCnt 记录数目
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("record_cnt")
    @Validation(required = true)
    public Long recordCnt;

    public static PartitionObject build(java.util.Map<String, ?> map) throws Exception {
        PartitionObject self = new PartitionObject();
        return TeaModel.build(map, self);
    }

    public PartitionObject setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public PartitionObject setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PartitionObject setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public PartitionObject setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    public PartitionObject setPanguFileSize(Long panguFileSize) {
        this.panguFileSize = panguFileSize;
        return this;
    }
    public Long getPanguFileSize() {
        return this.panguFileSize;
    }

    public PartitionObject setRecordCnt(Long recordCnt) {
        this.recordCnt = recordCnt;
        return this;
    }
    public Long getRecordCnt() {
        return this.recordCnt;
    }

}

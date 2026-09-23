// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class Transcript extends TeaModel {
    // 说话角色
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("role")
    @Validation(required = true)
    public String role;

    // 说话内容
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 开始时间，ISO 8601 格式
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 结束时间，ISO 8601 格式
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    public static Transcript build(java.util.Map<String, ?> map) throws Exception {
        Transcript self = new Transcript();
        return TeaModel.build(map, self);
    }

    public Transcript setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public Transcript setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Transcript setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public Transcript setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}

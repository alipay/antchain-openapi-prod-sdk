// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class DirectMonitorResult extends TeaModel {
    // 监测结果id
    /**
     * <strong>example:</strong>
     * <p>xyz</p>
     */
    @NameInMap("monitor_result_id")
    @Validation(required = true)
    public String monitorResultId;

    // 相似的资源链接
    /**
     * <strong>example:</strong>
     * <p>xyz</p>
     */
    @NameInMap("similar_resource_url")
    @Validation(required = true)
    public String similarResourceUrl;

    // 相似资源所在的网址链接
    /**
     * <strong>example:</strong>
     * <p>xyz</p>
     */
    @NameInMap("similar_web_url")
    @Validation(required = true)
    public String similarWebUrl;

    // 资源标题
    /**
     * <strong>example:</strong>
     * <p>xyz</p>
     */
    @NameInMap("title")
    public String title;

    // 资源作者
    /**
     * <strong>example:</strong>
     * <p>xyz</p>
     */
    @NameInMap("author")
    public String author;

    // 资源上传时间，格式yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2022-01-01 10:10:10</p>
     */
    @NameInMap("upload_time")
    public String uploadTime;

    public static DirectMonitorResult build(java.util.Map<String, ?> map) throws Exception {
        DirectMonitorResult self = new DirectMonitorResult();
        return TeaModel.build(map, self);
    }

    public DirectMonitorResult setMonitorResultId(String monitorResultId) {
        this.monitorResultId = monitorResultId;
        return this;
    }
    public String getMonitorResultId() {
        return this.monitorResultId;
    }

    public DirectMonitorResult setSimilarResourceUrl(String similarResourceUrl) {
        this.similarResourceUrl = similarResourceUrl;
        return this;
    }
    public String getSimilarResourceUrl() {
        return this.similarResourceUrl;
    }

    public DirectMonitorResult setSimilarWebUrl(String similarWebUrl) {
        this.similarWebUrl = similarWebUrl;
        return this;
    }
    public String getSimilarWebUrl() {
        return this.similarWebUrl;
    }

    public DirectMonitorResult setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DirectMonitorResult setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public DirectMonitorResult setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }
    public String getUploadTime() {
        return this.uploadTime;
    }

}

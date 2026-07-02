// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InnerCreditInfo extends TeaModel {
    // 凭证内容id
    /**
     * <strong>example:</strong>
     * <p>10000009000001811659604036991910</p>
     */
    @NameInMap("content_id")
    public String contentId;

    // 资产凭证的类型，可支持：FILE(文件)、TEXT(文本)、JSON_TEXT(JSON文本)
    /**
     * <strong>example:</strong>
     * <p>TEXT</p>
     */
    @NameInMap("content_type")
    public String contentType;

    // 资产凭证名称
    /**
     * <strong>example:</strong>
     * <p>凭证材料001</p>
     */
    @NameInMap("credit_name")
    public String creditName;

    // 凭证文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx.com/xxx.pdf">https://xxxx.com/xxx.pdf</a></p>
     */
    @NameInMap("credit_file_url")
    public String creditFileUrl;

    // 上传的文本内容
    /**
     * <strong>example:</strong>
     * <p>{&quot;内容:&quot;文本文本文本&quot;}</p>
     */
    @NameInMap("credit_content")
    public String creditContent;

    // 凭证创建时间(yyyy-MM-dd HH:mm:ss)
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("create_time")
    public String createTime;

    public static InnerCreditInfo build(java.util.Map<String, ?> map) throws Exception {
        InnerCreditInfo self = new InnerCreditInfo();
        return TeaModel.build(map, self);
    }

    public InnerCreditInfo setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public InnerCreditInfo setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public InnerCreditInfo setCreditName(String creditName) {
        this.creditName = creditName;
        return this;
    }
    public String getCreditName() {
        return this.creditName;
    }

    public InnerCreditInfo setCreditFileUrl(String creditFileUrl) {
        this.creditFileUrl = creditFileUrl;
        return this;
    }
    public String getCreditFileUrl() {
        return this.creditFileUrl;
    }

    public InnerCreditInfo setCreditContent(String creditContent) {
        this.creditContent = creditContent;
        return this;
    }
    public String getCreditContent() {
        return this.creditContent;
    }

    public InnerCreditInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetContractFileuploadurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 所属账号id，即个人账号id或机构账号id，如不传，则默认属于对接平台
    @NameInMap("account_id")
    public String accountId;

    // 先计算文件md5值，在对该md5值进行base64编码
    @NameInMap("content_md5")
    @Validation(required = true)
    public String contentMd5;

    // 目标文件的MIME类型
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 是否转换成pdf文档，默认false，代表不做转换。转换是异步行为，如果指定要转换，需要调用查询文件信息接口查询状态，转换完成后才可使用。
    @NameInMap("convert_2_pdf")
    @Validation(required = true)
    public String convert2Pdf;

    // 文件大小，单位byte
    @NameInMap("file_size")
    @Validation(required = true)
    public Long fileSize;

    // 文件名称（必须带上文件扩展名，不然会导致后续发起流程校验过不去 示例：合同.pdf ）
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    public static GetContractFileuploadurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContractFileuploadurlRequest self = new GetContractFileuploadurlRequest();
        return TeaModel.build(map, self);
    }

    public GetContractFileuploadurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetContractFileuploadurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetContractFileuploadurlRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetContractFileuploadurlRequest setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    public String getContentMd5() {
        return this.contentMd5;
    }

    public GetContractFileuploadurlRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public GetContractFileuploadurlRequest setConvert2Pdf(String convert2Pdf) {
        this.convert2Pdf = convert2Pdf;
        return this;
    }
    public String getConvert2Pdf() {
        return this.convert2Pdf;
    }

    public GetContractFileuploadurlRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public GetContractFileuploadurlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}

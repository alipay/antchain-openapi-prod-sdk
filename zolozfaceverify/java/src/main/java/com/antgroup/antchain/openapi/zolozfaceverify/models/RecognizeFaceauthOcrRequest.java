// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class RecognizeFaceauthOcrRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据内容
    @NameInMap("data_context")
    @Validation(required = true)
    public String dataContext;

    // 数据类型：OSS_ADDR/BASE64_JPG
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 扩展字段
    @NameInMap("extern_param")
    public String externParam;

    // face: 身份证正面 back: 身份证反面 缺省值是：face
    // 
    @NameInMap("side")
    @Validation(required = true)
    public String side;

    // zimid
    @NameInMap("zim_id")
    @Validation(required = true)
    public String zimId;

    public static RecognizeFaceauthOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceauthOcrRequest self = new RecognizeFaceauthOcrRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceauthOcrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RecognizeFaceauthOcrRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RecognizeFaceauthOcrRequest setDataContext(String dataContext) {
        this.dataContext = dataContext;
        return this;
    }
    public String getDataContext() {
        return this.dataContext;
    }

    public RecognizeFaceauthOcrRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public RecognizeFaceauthOcrRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public RecognizeFaceauthOcrRequest setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

    public RecognizeFaceauthOcrRequest setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

}

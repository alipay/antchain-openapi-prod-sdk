<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDidPersonFacevrfnewocpRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 场景码，通常针对性特别支持，或者防止多调用方使用相同租户身份的情况下用bizCode做区分。
    /**
     * @var string
     */
    public $bizCode;

    // 请求的唯一标识，通常为32字符宽度的字符串内容，也可以只用UUID，此参数通常用来支持幂等，或者排查问题，调用方可以使用业务流水号。
    /**
     * @var string
     */
    public $bizId;

    // 姓名字段，真实姓名，不可包含空格等特殊字符。
    /**
     * @var string
     */
    public $certName;

    // 证件号码，要求带有字母的情况使用大写字母。
    /**
     * @var string
     */
    public $certNo;

    // 份信息来源类型，当前仅支持证件（CERT_INFO）
    /**
     * @var string
     */
    public $identityType;

    // 证件类型，当前仅支持身份证（IDENTITY_CARD）
    /**
     * @var string
     */
    public $certType;

    // metainfo 环境参数，需要通过客户端 SDK 获取
    /**
     * @var string
     */
    public $metaInfo;

    // OCR 能力对两个扩展参数，map的json格式：tradeParam_needOcr=true tradeParam_verifyStageCheckUsable=true
    /**
     * @var string
     */
    public $externParam;

    // DID未来创建锚定的用户身份唯一关联，如果不设置此参数则使用二要素拼接后的哈希值 SHA256("张三"+"210282*****X") 来进行关联创建DID，并且支持幂等。
    /**
     * @var string
     */
    public $uid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'bizId'             => 'biz_id',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'identityType'      => 'identity_type',
        'certType'          => 'cert_type',
        'metaInfo'          => 'meta_info',
        'externParam'       => 'extern_param',
        'uid'               => 'uid',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('identityType', $this->identityType, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('metaInfo', $this->metaInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->identityType) {
            $res['identity_type'] = $this->identityType;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->metaInfo) {
            $res['meta_info'] = $this->metaInfo;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDidPersonFacevrfnewocpRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['identity_type'])) {
            $model->identityType = $map['identity_type'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['meta_info'])) {
            $model->metaInfo = $map['meta_info'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }

        return $model;
    }
}

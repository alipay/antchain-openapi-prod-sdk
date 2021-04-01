<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PushAuthUserVcRequest extends Model
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

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪。
    /**
     * @var string
     */
    public $bizId;

    // 具体的业务类型，长度不超过32字符，具体需要与DIS小组业务对接商定新增的业务类型。
    /**
     * @var string
     */
    public $bizType;

    // 推送的业务方自己所属的did，也就是颁发此声明的 issuer
    /**
     * @var string
     */
    public $did;

    // 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则：
    // 1. Map<String,String> params 的key按照字典序排序
    // 2. 拼接为 key1=value1&key2=value2&key3=value3 ...
    // 3. 计算sha256(第2步结果)得到hash
    // 4. 使用hash 和 签名的did请求DIS的签名接口进行签名：baas.account.signature.start，https://apdevcenter.cloud.alipay.com/console/openapi/product/BLOCKCHAIN/apis/baas.account.signature.start/versions/1.0/document?
    /**
     * @var string
     */
    public $signature;

    // 通过DIS颁发的声明详细信息，其中content的claim字段是和业务相关的实际声明内容。
    /**
     * @var string
     */
    public $vcContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizType'           => 'biz_type',
        'did'               => 'did',
        'signature'         => 'signature',
        'vcContent'         => 'vc_content',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('vcContent', $this->vcContent, true);
        Model::validateMaxLength('bizId', $this->bizId, 64);
        Model::validateMaxLength('bizType', $this->bizType, 32);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->vcContent) {
            $res['vc_content'] = $this->vcContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushAuthUserVcRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['vc_content'])) {
            $model->vcContent = $map['vc_content'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MPAASFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class UploadOcrServermodeRequest extends Model
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

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    /**
     * @var string
     */
    public $bizId;

    // 操作类型
    /**
     * @var string
     */
    public $operationType;

    // 预留扩展业务参数
    /**
     * @var string
     */
    public $externParam;

    // 对称密钥加密的ocr内容
    /**
     * @var string
     */
    public $content;

    // 非对称密钥加密后的对称密钥
    /**
     * @var string
     */
    public $contentSig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'operationType'     => 'operation_type',
        'externParam'       => 'extern_param',
        'content'           => 'content',
        'contentSig'        => 'content_sig',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('contentSig', $this->contentSig, true);
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
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->contentSig) {
            $res['content_sig'] = $this->contentSig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadOcrServermodeRequest
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
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['content_sig'])) {
            $model->contentSig = $map['content_sig'];
        }

        return $model;
    }
}

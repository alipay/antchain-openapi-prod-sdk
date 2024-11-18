<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class RecognizeModelRequest extends Model
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

    // 外部业务唯一标识id
    /**
     * @var string
     */
    public $bizId;

    // 业务域
    /**
     * @var string
     */
    public $domainCode;

    // 模型状态
    /**
     * @var string
     */
    public $status;

    // 待计算的模型uuid
    /**
     * @var string
     */
    public $modelUuid;

    // map的映射的json字符串
    /**
     * @var string
     */
    public $inputContext;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'domainCode'        => 'domain_code',
        'status'            => 'status',
        'modelUuid'         => 'model_uuid',
        'inputContext'      => 'input_context',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('domainCode', $this->domainCode, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('modelUuid', $this->modelUuid, true);
        Model::validateRequired('inputContext', $this->inputContext, true);
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
        if (null !== $this->domainCode) {
            $res['domain_code'] = $this->domainCode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->modelUuid) {
            $res['model_uuid'] = $this->modelUuid;
        }
        if (null !== $this->inputContext) {
            $res['input_context'] = $this->inputContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizeModelRequest
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
        if (isset($map['domain_code'])) {
            $model->domainCode = $map['domain_code'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['model_uuid'])) {
            $model->modelUuid = $map['model_uuid'];
        }
        if (isset($map['input_context'])) {
            $model->inputContext = $map['input_context'];
        }

        return $model;
    }
}

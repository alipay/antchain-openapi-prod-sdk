<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreateBaicorpInternalevaluationasyncRequest extends Model
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

    // 场景ID
    /**
     * @var string
     */
    public $bizId;

    // 内部的业务代码
    /**
     * @var BizInfo
     */
    public $bizInfo;

    // 回调地址。由于存在异步调用，部分结果通过回调返回数据。例如图片和视频。
    /**
     * @var string
     */
    public $callback;

    // 回调参数
    /**
     * @var string
     */
    public $callbackParam;

    // 业务自定义id，便于识别返回数据对应关系
    /**
     * @var string
     */
    public $customId;

    // 待检测内容RAW数据，目前仅用于text类型，entity_url和entity_data不可同时存在
    /**
     * @var string
     */
    public $entityData;

    // 待评估内容类型
    /**
     * @var string
     */
    public $entityType;

    // 检测内容url，支持HTTPS, entity_url和entity_data不可同时存在
    /**
     * @var string
     */
    public $entityUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizInfo'           => 'biz_info',
        'callback'          => 'callback',
        'callbackParam'     => 'callback_param',
        'customId'          => 'custom_id',
        'entityData'        => 'entity_data',
        'entityType'        => 'entity_type',
        'entityUrl'         => 'entity_url',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizInfo', $this->bizInfo, true);
        Model::validateRequired('customId', $this->customId, true);
        Model::validateRequired('entityType', $this->entityType, true);
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
        if (null !== $this->bizInfo) {
            $res['biz_info'] = null !== $this->bizInfo ? $this->bizInfo->toMap() : null;
        }
        if (null !== $this->callback) {
            $res['callback'] = $this->callback;
        }
        if (null !== $this->callbackParam) {
            $res['callback_param'] = $this->callbackParam;
        }
        if (null !== $this->customId) {
            $res['custom_id'] = $this->customId;
        }
        if (null !== $this->entityData) {
            $res['entity_data'] = $this->entityData;
        }
        if (null !== $this->entityType) {
            $res['entity_type'] = $this->entityType;
        }
        if (null !== $this->entityUrl) {
            $res['entity_url'] = $this->entityUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBaicorpInternalevaluationasyncRequest
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
        if (isset($map['biz_info'])) {
            $model->bizInfo = BizInfo::fromMap($map['biz_info']);
        }
        if (isset($map['callback'])) {
            $model->callback = $map['callback'];
        }
        if (isset($map['callback_param'])) {
            $model->callbackParam = $map['callback_param'];
        }
        if (isset($map['custom_id'])) {
            $model->customId = $map['custom_id'];
        }
        if (isset($map['entity_data'])) {
            $model->entityData = $map['entity_data'];
        }
        if (isset($map['entity_type'])) {
            $model->entityType = $map['entity_type'];
        }
        if (isset($map['entity_url'])) {
            $model->entityUrl = $map['entity_url'];
        }

        return $model;
    }
}

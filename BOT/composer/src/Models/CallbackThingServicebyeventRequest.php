<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CallbackThingServicebyeventRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 业务类型，同一个scene下可以有不同的业务类型，此字段用于区分业务类型
    /**
     * @var string
     */
    public $bizType;

    // 回复日期
    /**
     * @var string
     */
    public $submitDate;

    // 物模型服务回复数据的模型ID
    /**
     * @var string
     */
    public $dataModelId;

    // 物模型服务回复数据的内容，格式遵循dataModelId约定的格式
    /**
     * @var string
     */
    public $content;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'bizType'           => 'biz_type',
        'submitDate'        => 'submit_date',
        'dataModelId'       => 'data_model_id',
        'content'           => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('dataModelId', $this->dataModelId, true);
        Model::validateRequired('content', $this->content, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->submitDate) {
            $res['submit_date'] = $this->submitDate;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackThingServicebyeventRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['submit_date'])) {
            $model->submitDate = $map['submit_date'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}

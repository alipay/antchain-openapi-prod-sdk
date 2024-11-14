<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class SubmitUniversalsaasDigitalhumanOrderRequest extends Model
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

    // 渠道类型
    /**
     * @var string
     */
    public $source;

    // 操作类型
    /**
     * @var string
     */
    public $actionType;

    // 业务类型
    /**
     * @var string
     */
    public $bizType;

    // 业务id
    /**
     * @var string
     */
    public $bizId;

    // 业务自定义信息
    /**
     * @var string
     */
    public $bizData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'source'            => 'source',
        'actionType'        => 'action_type',
        'bizType'           => 'biz_type',
        'bizId'             => 'biz_id',
        'bizData'           => 'biz_data',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('actionType', $this->actionType, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizData', $this->bizData, true);
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
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->actionType) {
            $res['action_type'] = $this->actionType;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizData) {
            $res['biz_data'] = $this->bizData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitUniversalsaasDigitalhumanOrderRequest
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
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['action_type'])) {
            $model->actionType = $map['action_type'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_data'])) {
            $model->bizData = $map['biz_data'];
        }

        return $model;
    }
}

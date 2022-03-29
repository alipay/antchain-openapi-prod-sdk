<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class LoadConnectorjobSloviewRequest extends Model
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

    // source类型
    /**
     * @var string
     */
    public $sourceType;

    // 触发类型
    /**
     * @var string
     */
    public $triggerType;

    // cron表达式的值
    /**
     * @var string
     */
    public $triggerValue;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sourceType'        => 'source_type',
        'triggerType'       => 'trigger_type',
        'triggerValue'      => 'trigger_value',
    ];

    public function validate()
    {
        Model::validateRequired('sourceType', $this->sourceType, true);
        Model::validateRequired('triggerType', $this->triggerType, true);
        Model::validateRequired('triggerValue', $this->triggerValue, true);
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
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->triggerType) {
            $res['trigger_type'] = $this->triggerType;
        }
        if (null !== $this->triggerValue) {
            $res['trigger_value'] = $this->triggerValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadConnectorjobSloviewRequest
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
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }
        if (isset($map['trigger_type'])) {
            $model->triggerType = $map['trigger_type'];
        }
        if (isset($map['trigger_value'])) {
            $model->triggerValue = $map['trigger_value'];
        }

        return $model;
    }
}

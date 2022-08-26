<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models;

use AlibabaCloud\Tea\Model;

class UpdateBaasChainDataexportTaskRequest extends Model
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

    // 联盟id
    /**
     * @var string
     */
    public $consortiumId;

    // 链id
    /**
     * @var string
     */
    public $antChainId;

    // 任务名称
    /**
     * @var string
     */
    public $triggerName;

    // 导出任务接口体
    /**
     * @var TriggerDTOStructBody
     */
    public $trigger;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'consortiumId'      => 'consortium_id',
        'antChainId'        => 'ant_chain_id',
        'triggerName'       => 'trigger_name',
        'trigger'           => 'trigger',
    ];

    public function validate()
    {
        Model::validateRequired('consortiumId', $this->consortiumId, true);
        Model::validateRequired('antChainId', $this->antChainId, true);
        Model::validateRequired('triggerName', $this->triggerName, true);
        Model::validateRequired('trigger', $this->trigger, true);
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
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->triggerName) {
            $res['trigger_name'] = $this->triggerName;
        }
        if (null !== $this->trigger) {
            $res['trigger'] = null !== $this->trigger ? $this->trigger->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateBaasChainDataexportTaskRequest
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
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['trigger_name'])) {
            $model->triggerName = $map['trigger_name'];
        }
        if (isset($map['trigger'])) {
            $model->trigger = TriggerDTOStructBody::fromMap($map['trigger']);
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateChainFailureLogRequest extends Model
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

    // 链id
    /**
     * @var string
     */
    public $antChainId;

    // 联盟id
    /**
     * @var string
     */
    public $consortiumId;

    // 日志名称
    /**
     * @var string
     */
    public $triggerName;

    // 日志状态
    /**
     * @var string
     */
    public $statusAction;

    // 日志id
    /**
     * @var string
     */
    public $logId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'antChainId'        => 'ant_chain_id',
        'consortiumId'      => 'consortium_id',
        'triggerName'       => 'trigger_name',
        'statusAction'      => 'status_action',
        'logId'             => 'log_id',
    ];

    public function validate()
    {
        Model::validateRequired('antChainId', $this->antChainId, true);
        Model::validateRequired('consortiumId', $this->consortiumId, true);
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
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->triggerName) {
            $res['trigger_name'] = $this->triggerName;
        }
        if (null !== $this->statusAction) {
            $res['status_action'] = $this->statusAction;
        }
        if (null !== $this->logId) {
            $res['log_id'] = $this->logId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateChainFailureLogRequest
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
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['trigger_name'])) {
            $model->triggerName = $map['trigger_name'];
        }
        if (isset($map['status_action'])) {
            $model->statusAction = $map['status_action'];
        }
        if (isset($map['log_id'])) {
            $model->logId = $map['log_id'];
        }

        return $model;
    }
}

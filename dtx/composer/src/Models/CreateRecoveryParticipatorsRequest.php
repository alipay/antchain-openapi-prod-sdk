<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class CreateRecoveryParticipatorsRequest extends Model
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

    // 批量新增action
    /**
     * @var Participator[]
     */
    public $actions;

    // biz_type
    /**
     * @var string
     */
    public $bizType;

    // 默认TCC
    /**
     * @var int
     */
    public $actionMode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'actions'           => 'actions',
        'bizType'           => 'biz_type',
        'actionMode'        => 'action_mode',
    ];

    public function validate()
    {
        Model::validateRequired('actions', $this->actions, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('actionMode', $this->actionMode, true);
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
        if (null !== $this->actions) {
            $res['actions'] = [];
            if (null !== $this->actions && \is_array($this->actions)) {
                $n = 0;
                foreach ($this->actions as $item) {
                    $res['actions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->actionMode) {
            $res['action_mode'] = $this->actionMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateRecoveryParticipatorsRequest
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
        if (isset($map['actions'])) {
            if (!empty($map['actions'])) {
                $model->actions = [];
                $n              = 0;
                foreach ($map['actions'] as $item) {
                    $model->actions[$n++] = null !== $item ? Participator::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['action_mode'])) {
            $model->actionMode = $map['action_mode'];
        }

        return $model;
    }
}

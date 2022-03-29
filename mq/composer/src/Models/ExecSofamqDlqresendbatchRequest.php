<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ExecSofamqDlqresendbatchRequest extends Model
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

    // 需要查询的单元
    /**
     * @var string
     */
    public $cell;

    // 需查询的消费端 Group ID
    /**
     * @var string
     */
    public $groupId;

    // 需查询消息所对应的实例 ID。
    /**
     * @var string
     */
    public $instanceId;

    // 需重发的消息的 ID，即 Message ID，多个消息使用英文逗号分隔
    /**
     * @var string
     */
    public $msgIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cell'              => 'cell',
        'groupId'           => 'group_id',
        'instanceId'        => 'instance_id',
        'msgIds'            => 'msg_ids',
    ];

    public function validate()
    {
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('msgIds', $this->msgIds, true);
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
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->msgIds) {
            $res['msg_ids'] = $this->msgIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecSofamqDlqresendbatchRequest
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
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['msg_ids'])) {
            $model->msgIds = $map['msg_ids'];
        }

        return $model;
    }
}

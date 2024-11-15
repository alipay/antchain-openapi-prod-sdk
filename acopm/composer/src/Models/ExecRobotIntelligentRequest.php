<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class ExecRobotIntelligentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求id
    /**
     * @var string
     */
    public $targetReqMsgId;

    // 通知人
    /**
     * @var string
     */
    public $senderStaffId;

    // 回调通知接口
    /**
     * @var string
     */
    public $callUrl;

    // token
    /**
     * @var string
     */
    public $robotToken;
    protected $_name = [
        'authToken'      => 'auth_token',
        'targetReqMsgId' => 'target_req_msg_id',
        'senderStaffId'  => 'sender_staff_id',
        'callUrl'        => 'call_url',
        'robotToken'     => 'robot_token',
    ];

    public function validate()
    {
        Model::validateRequired('targetReqMsgId', $this->targetReqMsgId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->targetReqMsgId) {
            $res['target_req_msg_id'] = $this->targetReqMsgId;
        }
        if (null !== $this->senderStaffId) {
            $res['sender_staff_id'] = $this->senderStaffId;
        }
        if (null !== $this->callUrl) {
            $res['call_url'] = $this->callUrl;
        }
        if (null !== $this->robotToken) {
            $res['robot_token'] = $this->robotToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecRobotIntelligentRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['target_req_msg_id'])) {
            $model->targetReqMsgId = $map['target_req_msg_id'];
        }
        if (isset($map['sender_staff_id'])) {
            $model->senderStaffId = $map['sender_staff_id'];
        }
        if (isset($map['call_url'])) {
            $model->callUrl = $map['call_url'];
        }
        if (isset($map['robot_token'])) {
            $model->robotToken = $map['robot_token'];
        }

        return $model;
    }
}

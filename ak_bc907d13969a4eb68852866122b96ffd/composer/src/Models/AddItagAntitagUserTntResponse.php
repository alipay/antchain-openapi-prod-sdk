<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class AddItagAntitagUserTntResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // TntInstId
    /**
     * @var string
     */
    public $tntinstid;

    // 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
    /**
     * @var string
     */
    public $role;

    // 用户信息
    /**
     * @var User
     */
    public $result;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'tntinstid'  => 'tntinstid',
        'role'       => 'role',
        'result'     => 'result',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->tntinstid) {
            $res['tntinstid'] = $this->tntinstid;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddItagAntitagUserTntResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['tntinstid'])) {
            $model->tntinstid = $map['tntinstid'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['result'])) {
            $model->result = User::fromMap($map['result']);
        }

        return $model;
    }
}

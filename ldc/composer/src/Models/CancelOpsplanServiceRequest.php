<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CancelOpsplanServiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 发布单下应用服务对应的发布id
    /**
     * @var string
     */
    public $id;

    // 取消原因
    /**
     * @var string
     */
    public $reason;

    // 操作人账号，lks1.23.0才支持
    /**
     * @var string
     */
    public $operator;

    // [huanyu场景使用]huanyu变更单唯一id
    /**
     * @var string
     */
    public $huanyuExecNo;
    protected $_name = [
        'authToken'    => 'auth_token',
        'id'           => 'id',
        'reason'       => 'reason',
        'operator'     => 'operator',
        'huanyuExecNo' => 'huanyu_exec_no',
    ];

    public function validate()
    {
        Model::validateRequired('reason', $this->reason, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->huanyuExecNo) {
            $res['huanyu_exec_no'] = $this->huanyuExecNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelOpsplanServiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['huanyu_exec_no'])) {
            $model->huanyuExecNo = $map['huanyu_exec_no'];
        }

        return $model;
    }
}

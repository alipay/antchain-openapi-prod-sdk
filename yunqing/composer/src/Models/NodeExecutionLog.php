<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class NodeExecutionLog extends Model
{
    // 当前节点的动作
    /**
     * @example T_LB_CREATE
     *
     * @var string
     */
    public $nodeAction;

    // 当前节点的执行日志信息
    /**
     * @example [] 创建Lb资源请求发送成功, instanceId:886e94908769d6bb21d76debb83d038a69e5ec614cfff5d9b860b8222f1b5de5
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'nodeAction' => 'node_action',
        'message'    => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('nodeAction', $this->nodeAction, true);
        Model::validateRequired('message', $this->message, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeAction) {
            $res['node_action'] = $this->nodeAction;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeExecutionLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_action'])) {
            $model->nodeAction = $map['node_action'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}

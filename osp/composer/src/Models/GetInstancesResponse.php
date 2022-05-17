<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class GetInstancesResponse extends Model
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

    // instance id
    /**
     * @var string
     */
    public $instanceId;

    // 之所以不叫tenant是为了防止和openapi内置的tenant字段冲突.
    /**
     * @var string
     */
    public $middlewareTenant;

    // 之所以不叫workspace是为了防止和openapi内置的workspace字段冲突.
    /**
     * @var string
     */
    public $middlewareWorkspace;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'instanceId'          => 'instance_id',
        'middlewareTenant'    => 'middleware_tenant',
        'middlewareWorkspace' => 'middleware_workspace',
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->middlewareTenant) {
            $res['middleware_tenant'] = $this->middlewareTenant;
        }
        if (null !== $this->middlewareWorkspace) {
            $res['middleware_workspace'] = $this->middlewareWorkspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetInstancesResponse
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['middleware_tenant'])) {
            $model->middlewareTenant = $map['middleware_tenant'];
        }
        if (isset($map['middleware_workspace'])) {
            $model->middlewareWorkspace = $map['middleware_workspace'];
        }

        return $model;
    }
}

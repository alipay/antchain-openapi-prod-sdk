<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryBusinessInstancestatusResponse extends Model
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

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 实例对应的租户id
    /**
     * @var string
     */
    public $instanceTenant;

    // STARTED---运行中
    // STOPPED--已停服
    // RELEASED--已释放
    /**
     * @var string
     */
    public $instanceStatus;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'instanceId'     => 'instance_id',
        'instanceTenant' => 'instance_tenant',
        'instanceStatus' => 'instance_status',
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
        if (null !== $this->instanceTenant) {
            $res['instance_tenant'] = $this->instanceTenant;
        }
        if (null !== $this->instanceStatus) {
            $res['instance_status'] = $this->instanceStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBusinessInstancestatusResponse
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
        if (isset($map['instance_tenant'])) {
            $model->instanceTenant = $map['instance_tenant'];
        }
        if (isset($map['instance_status'])) {
            $model->instanceStatus = $map['instance_status'];
        }

        return $model;
    }
}

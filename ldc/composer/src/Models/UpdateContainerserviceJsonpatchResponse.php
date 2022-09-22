<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateContainerserviceJsonpatchResponse extends Model
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

    // 新的应用服务版本
    /**
     * @var string
     */
    public $revision;

    // 部署单id
    /**
     * @var string
     */
    public $operationId;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'revision'    => 'revision',
        'operationId' => 'operation_id',
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
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateContainerserviceJsonpatchResponse
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
        if (isset($map['revision'])) {
            $model->revision = $map['revision'];
        }
        if (isset($map['operation_id'])) {
            $model->operationId = $map['operation_id'];
        }

        return $model;
    }
}

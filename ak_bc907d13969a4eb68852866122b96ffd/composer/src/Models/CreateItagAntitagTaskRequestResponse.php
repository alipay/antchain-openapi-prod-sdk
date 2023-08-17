<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class CreateItagAntitagTaskRequestResponse extends Model
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

    // taskId
    /**
     * @var string
     */
    public $taskid;

    // flowrunid
    /**
     * @var string
     */
    public $flowrunid;

    // msgid
    /**
     * @var string
     */
    public $msgid;

    // slavemsgid
    /**
     * @var string
     */
    public $slavemsgid;

    // reftaskid
    /**
     * @var string
     */
    public $reftaskid;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'taskid'     => 'taskid',
        'flowrunid'  => 'flowrunid',
        'msgid'      => 'msgid',
        'slavemsgid' => 'slavemsgid',
        'reftaskid'  => 'reftaskid',
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
        if (null !== $this->taskid) {
            $res['taskid'] = $this->taskid;
        }
        if (null !== $this->flowrunid) {
            $res['flowrunid'] = $this->flowrunid;
        }
        if (null !== $this->msgid) {
            $res['msgid'] = $this->msgid;
        }
        if (null !== $this->slavemsgid) {
            $res['slavemsgid'] = $this->slavemsgid;
        }
        if (null !== $this->reftaskid) {
            $res['reftaskid'] = $this->reftaskid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateItagAntitagTaskRequestResponse
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
        if (isset($map['taskid'])) {
            $model->taskid = $map['taskid'];
        }
        if (isset($map['flowrunid'])) {
            $model->flowrunid = $map['flowrunid'];
        }
        if (isset($map['msgid'])) {
            $model->msgid = $map['msgid'];
        }
        if (isset($map['slavemsgid'])) {
            $model->slavemsgid = $map['slavemsgid'];
        }
        if (isset($map['reftaskid'])) {
            $model->reftaskid = $map['reftaskid'];
        }

        return $model;
    }
}

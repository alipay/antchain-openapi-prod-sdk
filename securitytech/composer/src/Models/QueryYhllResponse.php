<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryYhllResponse extends Model
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

    // total
    /**
     * @var int
     */
    public $total;

    // open_task_result_list
    /**
     * @var string
     */
    public $openTaskResultList;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'total'              => 'total',
        'openTaskResultList' => 'open_task_result_list',
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
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->openTaskResultList) {
            $res['open_task_result_list'] = $this->openTaskResultList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryYhllResponse
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
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['open_task_result_list'])) {
            $model->openTaskResultList = $map['open_task_result_list'];
        }

        return $model;
    }
}

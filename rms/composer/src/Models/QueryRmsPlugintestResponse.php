<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsPlugintestResponse extends Model
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

    // data
    /**
     * @var Threshold
     */
    public $data;

    // error_code
    /**
     * @var string
     */
    public $errorCode;

    // rid
    /**
     * @var string
     */
    public $rid;

    // success
    /**
     * @var bool
     */
    public $success;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'data'       => 'data',
        'errorCode'  => 'error_code',
        'rid'        => 'rid',
        'success'    => 'success',
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
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->rid) {
            $res['rid'] = $this->rid;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRmsPlugintestResponse
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
        if (isset($map['data'])) {
            $model->data = Threshold::fromMap($map['data']);
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['rid'])) {
            $model->rid = $map['rid'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}

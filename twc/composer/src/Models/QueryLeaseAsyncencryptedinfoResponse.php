<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseAsyncencryptedinfoResponse extends Model
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

    // 结果码，OK表示成功
    /**
     * @var string
     */
    public $code;

    // 结果描述
    /**
     * @var string
     */
    public $message;

    // 对应的加密后的具体信息（只有当query_status状态为SUCCESS时才返回此数据）
    /**
     * @var string
     */
    public $responseData;

    // 链上查询状态枚举
    // TOBE_CHAIN 待上链查询
    // CHAINING 查询中
    // SUCCESS 查询成功
    // FAIL 查询失败
    /**
     * @var string
     */
    public $queryStatus;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'code'         => 'code',
        'message'      => 'message',
        'responseData' => 'response_data',
        'queryStatus'  => 'query_status',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->responseData) {
            $res['response_data'] = $this->responseData;
        }
        if (null !== $this->queryStatus) {
            $res['query_status'] = $this->queryStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseAsyncencryptedinfoResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['response_data'])) {
            $model->responseData = $map['response_data'];
        }
        if (isset($map['query_status'])) {
            $model->queryStatus = $map['query_status'];
        }

        return $model;
    }
}

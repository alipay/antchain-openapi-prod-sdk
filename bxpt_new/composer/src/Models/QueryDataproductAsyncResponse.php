<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BXPT_NEW\Models;

use AlibabaCloud\Tea\Model;

class QueryDataproductAsyncResponse extends Model
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

    // 执行状态
    // INIT：请求已受理
    // RUNNING：执行中
    // SUCCESS：成功
    // FAIL：失败
    /**
     * @var string
     */
    public $execStatus;

    // 业务返回值
    //
    /**
     * @var string
     */
    public $bizResult;

    // 是否计费标识 Y 表示计费，N 表示不计费
    //
    /**
     * @var string
     */
    public $chargeFlag;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'execStatus' => 'exec_status',
        'bizResult'  => 'biz_result',
        'chargeFlag' => 'charge_flag',
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
        if (null !== $this->execStatus) {
            $res['exec_status'] = $this->execStatus;
        }
        if (null !== $this->bizResult) {
            $res['biz_result'] = $this->bizResult;
        }
        if (null !== $this->chargeFlag) {
            $res['charge_flag'] = $this->chargeFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDataproductAsyncResponse
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
        if (isset($map['exec_status'])) {
            $model->execStatus = $map['exec_status'];
        }
        if (isset($map['biz_result'])) {
            $model->bizResult = $map['biz_result'];
        }
        if (isset($map['charge_flag'])) {
            $model->chargeFlag = $map['charge_flag'];
        }

        return $model;
    }
}

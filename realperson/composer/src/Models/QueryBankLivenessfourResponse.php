<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryBankLivenessfourResponse extends Model
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

    // 银行活跃度详情，可解析为JSONArray。
    /**
     * @var string
     */
    public $livenessInfo;

    // 扩展信息，预留字段
    /**
     * @var string
     */
    public $externInfo;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'livenessInfo' => 'liveness_info',
        'externInfo'   => 'extern_info',
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
        if (null !== $this->livenessInfo) {
            $res['liveness_info'] = $this->livenessInfo;
        }
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBankLivenessfourResponse
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
        if (isset($map['liveness_info'])) {
            $model->livenessInfo = $map['liveness_info'];
        }
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ID_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class GetAshieldFiletokenResponse extends Model
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

    // -
    /**
     * @var string
     */
    public $requestId;

    // res_success
    /**
     * @var bool
     */
    public $resSuccess;

    // res_code
    /**
     * @var string
     */
    public $resCode;

    // res_message
    /**
     * @var string
     */
    public $resMessage;

    // res_data
    /**
     * @var FileTokenForUpload
     */
    public $resData;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'requestId'  => 'request_id',
        'resSuccess' => 'res_success',
        'resCode'    => 'res_code',
        'resMessage' => 'res_message',
        'resData'    => 'res_data',
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->resSuccess) {
            $res['res_success'] = $this->resSuccess;
        }
        if (null !== $this->resCode) {
            $res['res_code'] = $this->resCode;
        }
        if (null !== $this->resMessage) {
            $res['res_message'] = $this->resMessage;
        }
        if (null !== $this->resData) {
            $res['res_data'] = null !== $this->resData ? $this->resData->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAshieldFiletokenResponse
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['res_success'])) {
            $model->resSuccess = $map['res_success'];
        }
        if (isset($map['res_code'])) {
            $model->resCode = $map['res_code'];
        }
        if (isset($map['res_message'])) {
            $model->resMessage = $map['res_message'];
        }
        if (isset($map['res_data'])) {
            $model->resData = FileTokenForUpload::fromMap($map['res_data']);
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasDidPersonWiththreemetaResponse extends Model
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

    // 生成的did字符串
    /**
     * @var string
     */
    public $did;

    // 颁发的vcId
    /**
     * @var string
     */
    public $vcId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'did'        => 'did',
        'vcId'       => 'vc_id',
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBaasDidPersonWiththreemetaResponse
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class RecognizeAntiQrcodeacResponse extends Model
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

    // 解码结果,0:失败,1:成功，如果解码成功，可忽略detectState字段返回结果
    /**
     * @var string
     */
    public $code;

    // 识别状态
    /**
     * @var string
     */
    public $detectState;

    // 识别状态描述
    /**
     * @var string
     */
    public $detectDesc;

    // 加密数据
    /**
     * @var string
     */
    public $encryptData;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'code'        => 'code',
        'detectState' => 'detect_state',
        'detectDesc'  => 'detect_desc',
        'encryptData' => 'encrypt_data',
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
        if (null !== $this->detectState) {
            $res['detect_state'] = $this->detectState;
        }
        if (null !== $this->detectDesc) {
            $res['detect_desc'] = $this->detectDesc;
        }
        if (null !== $this->encryptData) {
            $res['encrypt_data'] = $this->encryptData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizeAntiQrcodeacResponse
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
        if (isset($map['detect_state'])) {
            $model->detectState = $map['detect_state'];
        }
        if (isset($map['detect_desc'])) {
            $model->detectDesc = $map['detect_desc'];
        }
        if (isset($map['encrypt_data'])) {
            $model->encryptData = $map['encrypt_data'];
        }

        return $model;
    }
}

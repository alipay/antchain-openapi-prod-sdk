<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models;

use AlibabaCloud\Tea\Model;

class InitAntchainEkycSingleZimResponse extends Model
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

    // 预留扩展结果
    /**
     * @var string
     */
    public $extParams;

    // 协议
    /**
     * @var string
     */
    public $protocol;

    // 返回码
    /**
     * @var string
     */
    public $retCode;

    // 明细返回码
    /**
     * @var string
     */
    public $retCodeSub;

    // 明细返回码对应的文案
    /**
     * @var string
     */
    public $retMessageSub;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'extParams'     => 'ext_params',
        'protocol'      => 'protocol',
        'retCode'       => 'ret_code',
        'retCodeSub'    => 'ret_code_sub',
        'retMessageSub' => 'ret_message_sub',
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
        if (null !== $this->extParams) {
            $res['ext_params'] = $this->extParams;
        }
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->retCode) {
            $res['ret_code'] = $this->retCode;
        }
        if (null !== $this->retCodeSub) {
            $res['ret_code_sub'] = $this->retCodeSub;
        }
        if (null !== $this->retMessageSub) {
            $res['ret_message_sub'] = $this->retMessageSub;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitAntchainEkycSingleZimResponse
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
        if (isset($map['ext_params'])) {
            $model->extParams = $map['ext_params'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['ret_code'])) {
            $model->retCode = $map['ret_code'];
        }
        if (isset($map['ret_code_sub'])) {
            $model->retCodeSub = $map['ret_code_sub'];
        }
        if (isset($map['ret_message_sub'])) {
            $model->retMessageSub = $map['ret_message_sub'];
        }

        return $model;
    }
}

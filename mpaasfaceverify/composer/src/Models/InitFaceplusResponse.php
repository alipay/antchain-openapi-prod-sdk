<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MPAASFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class InitFaceplusResponse extends Model
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

    // 认证会话唯一标识
    /**
     * @var string
     */
    public $zimId;

    // 结果码
    /**
     * @var string
     */
    public $resultCodeSub;

    // 结果信息
    //
    /**
     * @var string
     */
    public $resultMsgSub;

    // 外部参数
    /**
     * @var string
     */
    public $externInfo;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'zimId'         => 'zim_id',
        'resultCodeSub' => 'result_code_sub',
        'resultMsgSub'  => 'result_msg_sub',
        'externInfo'    => 'extern_info',
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
        if (null !== $this->zimId) {
            $res['zim_id'] = $this->zimId;
        }
        if (null !== $this->resultCodeSub) {
            $res['result_code_sub'] = $this->resultCodeSub;
        }
        if (null !== $this->resultMsgSub) {
            $res['result_msg_sub'] = $this->resultMsgSub;
        }
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitFaceplusResponse
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
        if (isset($map['zim_id'])) {
            $model->zimId = $map['zim_id'];
        }
        if (isset($map['result_code_sub'])) {
            $model->resultCodeSub = $map['result_code_sub'];
        }
        if (isset($map['result_msg_sub'])) {
            $model->resultMsgSub = $map['result_msg_sub'];
        }
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }

        return $model;
    }
}

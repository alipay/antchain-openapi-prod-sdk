<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractSignauthResponse extends Model
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

    // 授权生效时间（时间是unix时间戳（毫秒）格式）
    /**
     * @var int
     */
    public $authStartTime;

    // 授权失效时间（时间是unix时间戳（毫秒）格式）
    /**
     * @var int
     */
    public $authEndTime;

    // true:在有效期, false:不在有效期
    /**
     * @var bool
     */
    public $effective;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'authStartTime' => 'auth_start_time',
        'authEndTime'   => 'auth_end_time',
        'effective'     => 'effective',
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
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->effective) {
            $res['effective'] = $this->effective;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractSignauthResponse
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
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['effective'])) {
            $model->effective = $map['effective'];
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class DetailFacevrfServerResponse extends Model
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

    // PASS：认证通过
    // FAIL：认证不通过
    // NO_RECODE：无认证记录
    // PROCESSING：认证中
    /**
     * @var string
     */
    public $state;

    // 认证人信息，包括姓名和身份证号，不加密
    // state为PASS/FAIL/PROCESSING时为JSON字符串，为NO_RECORD时为空
    /**
     * @var string
     */
    public $identityInfo;

    // 预留扩展结果
    /**
     * @var string
     */
    public $externInfo;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'state'        => 'state',
        'identityInfo' => 'identity_info',
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
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->identityInfo) {
            $res['identity_info'] = $this->identityInfo;
        }
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailFacevrfServerResponse
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
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['identity_info'])) {
            $model->identityInfo = $map['identity_info'];
        }
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }

        return $model;
    }
}

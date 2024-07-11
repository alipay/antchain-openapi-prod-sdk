<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainAtoRealpersonFacevrfResponse extends Model
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

    // 实人认证结果
    // PROCESSING（初始化）
    // SUCCESS（认证通过）FAIL（认证不通过）
    /**
     * @var string
     */
    public $certifyState;

    // 【solution_type=H5 | APP 返回】
    // 本次认证是否存在安全风险
    // true(检测到安全风险)
    // false(未检测到安全风险)
    /**
     * @var string
     */
    public $attackFlag;

    // 【solution_type=H5 | APP 返回】
    // base64过后的二值化图片
    /**
     * @var string
     */
    public $alivePhoto;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'certifyState' => 'certify_state',
        'attackFlag'   => 'attack_flag',
        'alivePhoto'   => 'alive_photo',
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
        if (null !== $this->certifyState) {
            $res['certify_state'] = $this->certifyState;
        }
        if (null !== $this->attackFlag) {
            $res['attack_flag'] = $this->attackFlag;
        }
        if (null !== $this->alivePhoto) {
            $res['alive_photo'] = $this->alivePhoto;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainAtoRealpersonFacevrfResponse
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
        if (isset($map['certify_state'])) {
            $model->certifyState = $map['certify_state'];
        }
        if (isset($map['attack_flag'])) {
            $model->attackFlag = $map['attack_flag'];
        }
        if (isset($map['alive_photo'])) {
            $model->alivePhoto = $map['alive_photo'];
        }

        return $model;
    }
}

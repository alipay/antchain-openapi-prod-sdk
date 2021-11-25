<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class VerifyFirmResponse extends Model
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

    // 企业分布式did
    /**
     * @var string
     */
    public $did;

    // 法人认证信息
    /**
     * @var CertifyLPDTO
     */
    public $certifyLpDto;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'did'          => 'did',
        'certifyLpDto' => 'certify_lp_dto',
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
        if (null !== $this->certifyLpDto) {
            $res['certify_lp_dto'] = null !== $this->certifyLpDto ? $this->certifyLpDto->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyFirmResponse
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
        if (isset($map['certify_lp_dto'])) {
            $model->certifyLpDto = CertifyLPDTO::fromMap($map['certify_lp_dto']);
        }

        return $model;
    }
}

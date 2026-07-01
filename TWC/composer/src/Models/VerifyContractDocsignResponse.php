<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class VerifyContractDocsignResponse extends Model
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

    // 结果码
    /**
     * @var int
     */
    public $code;

    // 结果信息
    /**
     * @var string
     */
    public $message;

    // 文件签署信息
    /**
     * @var ContractDocSignVerifyInfo[]
     */
    public $signInfos;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'code'       => 'code',
        'message'    => 'message',
        'signInfos'  => 'sign_infos',
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
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->signInfos) {
            $res['sign_infos'] = [];
            if (null !== $this->signInfos && \is_array($this->signInfos)) {
                $n = 0;
                foreach ($this->signInfos as $item) {
                    $res['sign_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyContractDocsignResponse
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
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['sign_infos'])) {
            if (!empty($map['sign_infos'])) {
                $model->signInfos = [];
                $n                = 0;
                foreach ($map['sign_infos'] as $item) {
                    $model->signInfos[$n++] = null !== $item ? ContractDocSignVerifyInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

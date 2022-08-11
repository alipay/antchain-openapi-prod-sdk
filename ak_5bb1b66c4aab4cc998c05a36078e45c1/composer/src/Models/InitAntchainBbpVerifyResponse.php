<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class InitAntchainBbpVerifyResponse extends Model
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

    // 核身id
    /**
     * @var string
     */
    public $verifyId;

    // 核身请求地址url
    /**
     * @var string
     */
    public $verifyUrl;

    // 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
    /**
     * @var string
     */
    public $verifyStatus;

    // 可用产品集合
    /**
     * @var GwValidateProduct[]
     */
    public $validProd;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'verifyId'     => 'verify_id',
        'verifyUrl'    => 'verify_url',
        'verifyStatus' => 'verify_status',
        'validProd'    => 'valid_prod',
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
        if (null !== $this->verifyId) {
            $res['verify_id'] = $this->verifyId;
        }
        if (null !== $this->verifyUrl) {
            $res['verify_url'] = $this->verifyUrl;
        }
        if (null !== $this->verifyStatus) {
            $res['verify_status'] = $this->verifyStatus;
        }
        if (null !== $this->validProd) {
            $res['valid_prod'] = [];
            if (null !== $this->validProd && \is_array($this->validProd)) {
                $n = 0;
                foreach ($this->validProd as $item) {
                    $res['valid_prod'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitAntchainBbpVerifyResponse
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
        if (isset($map['verify_id'])) {
            $model->verifyId = $map['verify_id'];
        }
        if (isset($map['verify_url'])) {
            $model->verifyUrl = $map['verify_url'];
        }
        if (isset($map['verify_status'])) {
            $model->verifyStatus = $map['verify_status'];
        }
        if (isset($map['valid_prod'])) {
            if (!empty($map['valid_prod'])) {
                $model->validProd = [];
                $n                = 0;
                foreach ($map['valid_prod'] as $item) {
                    $model->validProd[$n++] = null !== $item ? GwValidateProduct::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

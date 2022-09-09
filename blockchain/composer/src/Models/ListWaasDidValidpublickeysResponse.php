<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListWaasDidValidpublickeysResponse extends Model
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

    // 用户数字身份ID
    /**
     * @var string
     */
    public $did;

    // 公钥信息列表
    /**
     * @var PublicKeyInfo[]
     */
    public $validPubKeys;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'did'          => 'did',
        'validPubKeys' => 'valid_pub_keys',
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
        if (null !== $this->validPubKeys) {
            $res['valid_pub_keys'] = [];
            if (null !== $this->validPubKeys && \is_array($this->validPubKeys)) {
                $n = 0;
                foreach ($this->validPubKeys as $item) {
                    $res['valid_pub_keys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListWaasDidValidpublickeysResponse
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
        if (isset($map['valid_pub_keys'])) {
            if (!empty($map['valid_pub_keys'])) {
                $model->validPubKeys = [];
                $n                   = 0;
                foreach ($map['valid_pub_keys'] as $item) {
                    $model->validPubKeys[$n++] = null !== $item ? PublicKeyInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

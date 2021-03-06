<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListAkdfUserbizkeyResponse extends Model
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

    // 区块链id
    /**
     * @var string
     */
    public $bizid;

    // 用户密钥信息
    /**
     * @var UserBizKeyInfo[]
     */
    public $userBizKeyInfo;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'bizid'          => 'bizid',
        'userBizKeyInfo' => 'user_biz_key_info',
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->userBizKeyInfo) {
            $res['user_biz_key_info'] = [];
            if (null !== $this->userBizKeyInfo && \is_array($this->userBizKeyInfo)) {
                $n = 0;
                foreach ($this->userBizKeyInfo as $item) {
                    $res['user_biz_key_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAkdfUserbizkeyResponse
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['user_biz_key_info'])) {
            if (!empty($map['user_biz_key_info'])) {
                $model->userBizKeyInfo = [];
                $n                     = 0;
                foreach ($map['user_biz_key_info'] as $item) {
                    $model->userBizKeyInfo[$n++] = null !== $item ? UserBizKeyInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

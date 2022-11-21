<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models;

use AlibabaCloud\Tea\Model;

class InitDemoGatewayRoadResponse extends Model
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

    // 返回desc
    /**
     * @var string
     */
    public $initDesc;

    // 组合返回请求结果
    /**
     * @var InitPack
     */
    public $initPack;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'initDesc'   => 'init_desc',
        'initPack'   => 'init_pack',
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
        if (null !== $this->initDesc) {
            $res['init_desc'] = $this->initDesc;
        }
        if (null !== $this->initPack) {
            $res['init_pack'] = null !== $this->initPack ? $this->initPack->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitDemoGatewayRoadResponse
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
        if (isset($map['init_desc'])) {
            $model->initDesc = $map['init_desc'];
        }
        if (isset($map['init_pack'])) {
            $model->initPack = InitPack::fromMap($map['init_pack']);
        }

        return $model;
    }
}

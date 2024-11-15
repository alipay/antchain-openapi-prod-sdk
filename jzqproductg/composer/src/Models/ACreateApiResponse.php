<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\JZQPRODUCTG\Models;

use AlibabaCloud\Tea\Model;

class ACreateApiResponse extends Model
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

    // 返回描述
    /**
     * @var string
     */
    public $initdesc;

    // 结构体组合返回
    /**
     * @var InitParkDemo
     */
    public $initPark;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'initdesc'   => 'initdesc',
        'initPark'   => 'init_park',
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
        if (null !== $this->initdesc) {
            $res['initdesc'] = $this->initdesc;
        }
        if (null !== $this->initPark) {
            $res['init_park'] = null !== $this->initPark ? $this->initPark->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ACreateApiResponse
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
        if (isset($map['initdesc'])) {
            $model->initdesc = $map['initdesc'];
        }
        if (isset($map['init_park'])) {
            $model->initPark = InitParkDemo::fromMap($map['init_park']);
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ABC\Models;

use AlibabaCloud\Tea\Model;

class APreCreateApiResponse extends Model
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

    // 跟新后的info
    /**
     * @var string
     */
    public $updInfo;

    // 组合返回请求结果
    /**
     * @var InitParks
     */
    public $updPark;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'updInfo'    => 'upd_info',
        'updPark'    => 'upd_park',
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
        if (null !== $this->updInfo) {
            $res['upd_info'] = $this->updInfo;
        }
        if (null !== $this->updPark) {
            $res['upd_park'] = null !== $this->updPark ? $this->updPark->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return APreCreateApiResponse
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
        if (isset($map['upd_info'])) {
            $model->updInfo = $map['upd_info'];
        }
        if (isset($map['upd_park'])) {
            $model->updPark = InitParks::fromMap($map['upd_park']);
        }

        return $model;
    }
}

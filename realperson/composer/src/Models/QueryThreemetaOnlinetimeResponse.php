<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryThreemetaOnlinetimeResponse extends Model
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

    // 在网时长标准码，规则：
    // 1: [0,3)表示在⽹时⻓是 0~3 个⽉
    // 2: [3,6)表示在⽹时⻓是 3~6 个⽉
    // 3: [6,12)表示在⽹时⻓是 6~12 个⽉
    // 4: [12,24)表示在⽹时⻓是 12~24 ⽉
    // 5: [24,+)表示在⽹时⻓是 24个⽉及以上
    /**
     * @var string
     */
    public $lengthCode;

    // CHINA_TELECOM：中国电信
    // CHINA_MOBILE：中国移动
    // CHINA_UNICOM：中国联通
    /**
     * @var string
     */
    public $carrier;

    // 扩展信息，json格式
    /**
     * @var string
     */
    public $externInfo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'lengthCode' => 'length_code',
        'carrier'    => 'carrier',
        'externInfo' => 'extern_info',
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
        if (null !== $this->lengthCode) {
            $res['length_code'] = $this->lengthCode;
        }
        if (null !== $this->carrier) {
            $res['carrier'] = $this->carrier;
        }
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryThreemetaOnlinetimeResponse
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
        if (isset($map['length_code'])) {
            $model->lengthCode = $map['length_code'];
        }
        if (isset($map['carrier'])) {
            $model->carrier = $map['carrier'];
        }
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }

        return $model;
    }
}

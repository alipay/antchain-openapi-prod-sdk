<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MDPAPI\Models;

use AlibabaCloud\Tea\Model;

class QuerybyappidAntdigitalMdpResponse extends Model
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

    // appid
    /**
     * @var string
     */
    public $appid;

    // 手机号或者设备号md5
    /**
     * @var string
     */
    public $userid;

    // 分数列表
    /**
     * @var AppIdQualityScoresDONew[]
     */
    public $scores;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'appid'      => 'appid',
        'userid'     => 'userid',
        'scores'     => 'scores',
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
        if (null !== $this->appid) {
            $res['appid'] = $this->appid;
        }
        if (null !== $this->userid) {
            $res['userid'] = $this->userid;
        }
        if (null !== $this->scores) {
            $res['scores'] = [];
            if (null !== $this->scores && \is_array($this->scores)) {
                $n = 0;
                foreach ($this->scores as $item) {
                    $res['scores'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerybyappidAntdigitalMdpResponse
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
        if (isset($map['appid'])) {
            $model->appid = $map['appid'];
        }
        if (isset($map['userid'])) {
            $model->userid = $map['userid'];
        }
        if (isset($map['scores'])) {
            if (!empty($map['scores'])) {
                $model->scores = [];
                $n             = 0;
                foreach ($map['scores'] as $item) {
                    $model->scores[$n++] = null !== $item ? AppIdQualityScoresDONew::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDomesticTrademarkResponse extends Model
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

    // 商标信息列表
    /**
     * @var DomesticTmInfo[]
     */
    public $tmInfos;

    // 商标总数
    /**
     * @var int
     */
    public $tmTotal;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'tmInfos'    => 'tm_infos',
        'tmTotal'    => 'tm_total',
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
        if (null !== $this->tmInfos) {
            $res['tm_infos'] = [];
            if (null !== $this->tmInfos && \is_array($this->tmInfos)) {
                $n = 0;
                foreach ($this->tmInfos as $item) {
                    $res['tm_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tmTotal) {
            $res['tm_total'] = $this->tmTotal;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDomesticTrademarkResponse
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
        if (isset($map['tm_infos'])) {
            if (!empty($map['tm_infos'])) {
                $model->tmInfos = [];
                $n              = 0;
                foreach ($map['tm_infos'] as $item) {
                    $model->tmInfos[$n++] = null !== $item ? DomesticTmInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tm_total'])) {
            $model->tmTotal = $map['tm_total'];
        }

        return $model;
    }
}

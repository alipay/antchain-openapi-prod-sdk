<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class QueryTenantRatelimitResponse extends Model
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

    // 限流信息
    /**
     * @var RateLimitDetail[]
     */
    public $rateLimitDetailList;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'rateLimitDetailList' => 'rate_limit_detail_list',
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
        if (null !== $this->rateLimitDetailList) {
            $res['rate_limit_detail_list'] = [];
            if (null !== $this->rateLimitDetailList && \is_array($this->rateLimitDetailList)) {
                $n = 0;
                foreach ($this->rateLimitDetailList as $item) {
                    $res['rate_limit_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTenantRatelimitResponse
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
        if (isset($map['rate_limit_detail_list'])) {
            if (!empty($map['rate_limit_detail_list'])) {
                $model->rateLimitDetailList = [];
                $n                          = 0;
                foreach ($map['rate_limit_detail_list'] as $item) {
                    $model->rateLimitDetailList[$n++] = null !== $item ? RateLimitDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

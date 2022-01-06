<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QuerySgServiceratelimitrulesResponse extends Model
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

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // 服务限流规则列表
    /**
     * @var ServiceRateLimitRule[]
     */
    public $serviceRateLimitRules;

    // 起始索引
    /**
     * @var int
     */
    public $startIndex;

    // 总条数
    /**
     * @var int
     */
    public $totalSize;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'currentPage'           => 'current_page',
        'pageSize'              => 'page_size',
        'serviceRateLimitRules' => 'service_rate_limit_rules',
        'startIndex'            => 'start_index',
        'totalSize'             => 'total_size',
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
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->serviceRateLimitRules) {
            $res['service_rate_limit_rules'] = [];
            if (null !== $this->serviceRateLimitRules && \is_array($this->serviceRateLimitRules)) {
                $n = 0;
                foreach ($this->serviceRateLimitRules as $item) {
                    $res['service_rate_limit_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->startIndex) {
            $res['start_index'] = $this->startIndex;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySgServiceratelimitrulesResponse
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
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['service_rate_limit_rules'])) {
            if (!empty($map['service_rate_limit_rules'])) {
                $model->serviceRateLimitRules = [];
                $n                            = 0;
                foreach ($map['service_rate_limit_rules'] as $item) {
                    $model->serviceRateLimitRules[$n++] = null !== $item ? ServiceRateLimitRule::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['start_index'])) {
            $model->startIndex = $map['start_index'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }

        return $model;
    }
}

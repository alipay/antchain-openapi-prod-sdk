<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryOpsCheckResponse extends Model
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

    // ops_check_results
    /**
     * @var OpsCheckResult[]
     */
    public $opsCheckResults;

    // total_count
    /**
     * @var int
     */
    public $totalCount;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'opsCheckResults' => 'ops_check_results',
        'totalCount'      => 'total_count',
        'currentPage'     => 'current_page',
        'pageSize'        => 'page_size',
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
        if (null !== $this->opsCheckResults) {
            $res['ops_check_results'] = [];
            if (null !== $this->opsCheckResults && \is_array($this->opsCheckResults)) {
                $n = 0;
                foreach ($this->opsCheckResults as $item) {
                    $res['ops_check_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOpsCheckResponse
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
        if (isset($map['ops_check_results'])) {
            if (!empty($map['ops_check_results'])) {
                $model->opsCheckResults = [];
                $n                      = 0;
                foreach ($map['ops_check_results'] as $item) {
                    $model->opsCheckResults[$n++] = null !== $item ? OpsCheckResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}

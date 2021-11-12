<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class QuerySolutioninstanceResponse extends Model
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

    // 解决方案
    /**
     * @var SolutionInstance[]
     */
    public $solutionInstances;

    // 当前页码。
    //
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小。
    //
    /**
     * @var int
     */
    public $pageSize;

    // 服务实例总数。
    //
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'solutionInstances' => 'solution_instances',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'totalCount'        => 'total_count',
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
        if (null !== $this->solutionInstances) {
            $res['solution_instances'] = [];
            if (null !== $this->solutionInstances && \is_array($this->solutionInstances)) {
                $n = 0;
                foreach ($this->solutionInstances as $item) {
                    $res['solution_instances'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySolutioninstanceResponse
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
        if (isset($map['solution_instances'])) {
            if (!empty($map['solution_instances'])) {
                $model->solutionInstances = [];
                $n                        = 0;
                foreach ($map['solution_instances'] as $item) {
                    $model->solutionInstances[$n++] = null !== $item ? SolutionInstance::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}

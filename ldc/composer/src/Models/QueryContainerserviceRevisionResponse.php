<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryContainerserviceRevisionResponse extends Model
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

    // 版本列表的页码。
    /**
     * @var int
     */
    public $pageNumber;

    // 输入时设置的每页行数。
    /**
     * @var int
     */
    public $pageSize;

    // 容器服务版本列表。
    /**
     * @var ContainerServiceRevision[]
     */
    public $revisionList;

    // 查询到的容器应用版本总数。
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'pageNumber'   => 'page_number',
        'pageSize'     => 'page_size',
        'revisionList' => 'revision_list',
        'totalCount'   => 'total_count',
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
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->revisionList) {
            $res['revision_list'] = [];
            if (null !== $this->revisionList && \is_array($this->revisionList)) {
                $n = 0;
                foreach ($this->revisionList as $item) {
                    $res['revision_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContainerserviceRevisionResponse
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
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['revision_list'])) {
            if (!empty($map['revision_list'])) {
                $model->revisionList = [];
                $n                   = 0;
                foreach ($map['revision_list'] as $item) {
                    $model->revisionList[$n++] = null !== $item ? ContainerServiceRevision::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}

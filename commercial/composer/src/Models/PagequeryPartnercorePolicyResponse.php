<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PagequeryPartnercorePolicyResponse extends Model
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

    // 政策信息扩展
    /**
     * @var PolicyDTO[]
     */
    public $data;

    // 当前页码
    /**
     * @var int
     */
    public $current;

    // 每页记录数
    /**
     * @var int
     */
    public $pageSize;

    // 总记录数
    /**
     * @var int
     */
    public $total;

    // 总页数
    /**
     * @var int
     */
    public $totalPages;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'data'       => 'data',
        'current'    => 'current',
        'pageSize'   => 'page_size',
        'total'      => 'total',
        'totalPages' => 'total_pages',
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
        if (null !== $this->data) {
            $res['data'] = [];
            if (null !== $this->data && \is_array($this->data)) {
                $n = 0;
                foreach ($this->data as $item) {
                    $res['data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->totalPages) {
            $res['total_pages'] = $this->totalPages;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryPartnercorePolicyResponse
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
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = [];
                $n           = 0;
                foreach ($map['data'] as $item) {
                    $model->data[$n++] = null !== $item ? PolicyDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['total_pages'])) {
            $model->totalPages = $map['total_pages'];
        }

        return $model;
    }
}

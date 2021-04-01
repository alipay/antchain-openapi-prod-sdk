<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListDataauthorizationAuthorizationPageResponse extends Model
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

    // 授权明细列表
    /**
     * @var AuthorizationDetail[]
     */
    public $data;

    // 是否有下
    /**
     * @var bool
     */
    public $hasNextPage;

    // 是否有上一页
    /**
     * @var bool
     */
    public $hasPreviousPage;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;

    // 数据总量
    /**
     * @var int
     */
    public $total;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'data'            => 'data',
        'hasNextPage'     => 'has_next_page',
        'hasPreviousPage' => 'has_previous_page',
        'pageNum'         => 'page_num',
        'pageSize'        => 'page_size',
        'total'           => 'total',
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
        if (null !== $this->hasNextPage) {
            $res['has_next_page'] = $this->hasNextPage;
        }
        if (null !== $this->hasPreviousPage) {
            $res['has_previous_page'] = $this->hasPreviousPage;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDataauthorizationAuthorizationPageResponse
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
                    $model->data[$n++] = null !== $item ? AuthorizationDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['has_next_page'])) {
            $model->hasNextPage = $map['has_next_page'];
        }
        if (isset($map['has_previous_page'])) {
            $model->hasPreviousPage = $map['has_previous_page'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}

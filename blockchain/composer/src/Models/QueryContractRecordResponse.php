<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryContractRecordResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 当前页元素列表
    /**
     * @var ContractRecord[]
     */
    public $content;

    // 当前页号
    /**
     * @var string
     */
    public $number;

    // 当前页大小
    /**
     * @var string
     */
    public $size;

    // 元素总个数
    /**
     * @var int
     */
    public $totalElements;

    // 总页数
    /**
     * @var int
     */
    public $totalPages;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'content'       => 'content',
        'number'        => 'number',
        'size'          => 'size',
        'totalElements' => 'total_elements',
        'totalPages'    => 'total_pages',
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
        if (null !== $this->content) {
            $res['content'] = [];
            if (null !== $this->content && \is_array($this->content)) {
                $n = 0;
                foreach ($this->content as $item) {
                    $res['content'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->totalElements) {
            $res['total_elements'] = $this->totalElements;
        }
        if (null !== $this->totalPages) {
            $res['total_pages'] = $this->totalPages;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractRecordResponse
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
        if (isset($map['content'])) {
            if (!empty($map['content'])) {
                $model->content = [];
                $n              = 0;
                foreach ($map['content'] as $item) {
                    $model->content[$n++] = null !== $item ? ContractRecord::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['total_elements'])) {
            $model->totalElements = $map['total_elements'];
        }
        if (isset($map['total_pages'])) {
            $model->totalPages = $map['total_pages'];
        }

        return $model;
    }
}

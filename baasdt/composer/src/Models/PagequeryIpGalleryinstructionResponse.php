<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIpGalleryinstructionResponse extends Model
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

    // 页码
    /**
     * @var int
     */
    public $pageNumber;

    // 每页数据量大小
    /**
     * @var int
     */
    public $pageSize;

    // 符合条件的数据总数
    /**
     * @var int
     */
    public $totalCount;

    // 图库系在记录信息
    /**
     * @var IPGalleryInstruction[]
     */
    public $galleryInstructionList;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'pageNumber'             => 'page_number',
        'pageSize'               => 'page_size',
        'totalCount'             => 'total_count',
        'galleryInstructionList' => 'gallery_instruction_list',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->galleryInstructionList) {
            $res['gallery_instruction_list'] = [];
            if (null !== $this->galleryInstructionList && \is_array($this->galleryInstructionList)) {
                $n = 0;
                foreach ($this->galleryInstructionList as $item) {
                    $res['gallery_instruction_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryIpGalleryinstructionResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['gallery_instruction_list'])) {
            if (!empty($map['gallery_instruction_list'])) {
                $model->galleryInstructionList = [];
                $n                             = 0;
                foreach ($map['gallery_instruction_list'] as $item) {
                    $model->galleryInstructionList[$n++] = null !== $item ? IPGalleryInstruction::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
